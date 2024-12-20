package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.ShangjiaEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 商家
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("shangjia")
public class ShangjiaView extends ShangjiaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 区域的值
	*/
	@ColumnInfo(comment="区域的字典表值",type="varchar(200)")
	private String quyuValue;
	/**
	* 商家信用类型的值
	*/
	@ColumnInfo(comment="商家信用类型的字典表值",type="varchar(200)")
	private String shangjiaXingjiValue;
	/**
	* 账户状态的值
	*/
	@ColumnInfo(comment="账户状态的字典表值",type="varchar(200)")
	private String jinyongValue;
	/**
	* 申请状态的值
	*/
	@ColumnInfo(comment="申请状态的字典表值",type="varchar(200)")
	private String shangjiaYesnoValue;




	public ShangjiaView() {

	}

	public ShangjiaView(ShangjiaEntity shangjiaEntity) {
		try {
			BeanUtils.copyProperties(this, shangjiaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 区域的值
	*/
	public String getQuyuValue() {
		return quyuValue;
	}
	/**
	* 设置： 区域的值
	*/
	public void setQuyuValue(String quyuValue) {
		this.quyuValue = quyuValue;
	}
	//当前表的
	/**
	* 获取： 商家信用类型的值
	*/
	public String getShangjiaXingjiValue() {
		return shangjiaXingjiValue;
	}
	/**
	* 设置： 商家信用类型的值
	*/
	public void setShangjiaXingjiValue(String shangjiaXingjiValue) {
		this.shangjiaXingjiValue = shangjiaXingjiValue;
	}
	//当前表的
	/**
	* 获取： 账户状态的值
	*/
	public String getJinyongValue() {
		return jinyongValue;
	}
	/**
	* 设置： 账户状态的值
	*/
	public void setJinyongValue(String jinyongValue) {
		this.jinyongValue = jinyongValue;
	}
	//当前表的
	/**
	* 获取： 申请状态的值
	*/
	public String getShangjiaYesnoValue() {
		return shangjiaYesnoValue;
	}
	/**
	* 设置： 申请状态的值
	*/
	public void setShangjiaYesnoValue(String shangjiaYesnoValue) {
		this.shangjiaYesnoValue = shangjiaYesnoValue;
	}




	@Override
	public String toString() {
		return "ShangjiaView{" +
			", quyuValue=" + quyuValue +
			", shangjiaXingjiValue=" + shangjiaXingjiValue +
			", jinyongValue=" + jinyongValue +
			", shangjiaYesnoValue=" + shangjiaYesnoValue +
			"} " + super.toString();
	}
}
