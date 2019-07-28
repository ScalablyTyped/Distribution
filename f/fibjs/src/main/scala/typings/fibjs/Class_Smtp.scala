package typings.fibjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** module Or Internal Object */
/**
	* @brief Smtp对象
	* @detail 
	*/
@JSGlobal("Class_Smtp")
@js.native
/**
	 * 
	 * @brief Smtp 对象构造函数
	 * 
	 * 
	 */
class Class_Smtp () extends Class__object {
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 查询 Smtp 对象当前连接的 Socket
  	 * 
  	 * @readonly
  	 * @type Stream
  	 */
  var socket: Class_Stream = js.native
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 查询和设置超时时间 单位毫秒
  	 * 
  	 * 
  	 * @type Integer
  	 */
  var timeout: Double = js.native
  /**
  	 * 
  	 * @brief 发送指定命令，并返回响应，服务器报错则抛出错误
  	 * @param cmd 命令名
  	 * @param arg 参数
  	 * @return 如果成功，返回服务器响应
  	 * 
  	 * 
  	 * @async
  	 */
  def command(cmd: String, arg: String): String = js.native
  /**
  	 * 
  	 * @brief 建立到指定的服务器
  	 * @param url 指定连接的协议，可以是：tcp://host:port 或者 ssl://host:port
  	 * 
  	 * 
  	 * @async
  	 */
  def connect(url: String): Unit = js.native
  /**
  	 * 
  	 * @brief 发送文本到收件人，服务器报错则抛出错误
  	 * @param txt 要发送的文本
  	 * 
  	 * 
  	 * @async
  	 */
  def data(txt: String): Unit = js.native
  /**
  	 * 
  	 * @brief 指定发件人信箱，服务器报错则抛出错误
  	 * @param address 发件人信箱
  	 * 
  	 * 
  	 * @async
  	 */
  def from(address: String): Unit = js.native
  /**
  	 * 
  	 * @brief 发送 HELO 命令，服务器报错则抛出错误
  	 * @param hostname 主机名，缺省为“localhost”
  	 * 
  	 * 
  	 * @async
  	 */
  def hello(): Unit = js.native
  def hello(hostname: String): Unit = js.native
  /**
  	 * 
  	 * @brief 用指定的用户及密码登录服务器，服务器报错则抛出错误
  	 * @param username 用户名
  	 * @param password 密码
  	 * 
  	 * 
  	 * @async
  	 */
  def login(username: String, password: String): Unit = js.native
  /**
  	 * 
  	 * @brief 退出并关闭连接，服务器报错则抛出错误
  	 * 
  	 * @async
  	 */
  def quit(): Unit = js.native
  /**
  	 * 
  	 * @brief 指定收件人信箱，服务器报错则抛出错误
  	 * @param address 收件人信箱
  	 * 
  	 * 
  	 * @async
  	 */
  def to(address: String): Unit = js.native
}

