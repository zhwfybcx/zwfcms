/**
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.zwf.cms.exception;

/**
 * 
 * 系统配置Key获得的Value为空
 * 
 * @author Herbert
 * 
 */
public class ValidateException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ValidateException(String msg) {
		super(msg);
	}
}
