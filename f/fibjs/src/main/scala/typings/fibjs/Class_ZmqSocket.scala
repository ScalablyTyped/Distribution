package typings.fibjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** module Or Internal Object */
/**
	* @brief ZeroMQ 套接口对象
	* @detail 
	*/
@JSGlobal("Class_ZmqSocket")
@js.native
/**
	 * 
	 * @brief ZmqSocket 对象构造函数
	 * @param type 指定 socket 类型，缺省为 zmq.PAIR
	 * 
	 * 
	 * 
	 */
class Class_ZmqSocket () extends Class__object {
  def this(`type`: Double) = this()
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 查询当前 socket 类型
  	 * 
  	 * @readonly
  	 * @type Integer
  	 */
  var `type`: Double = js.native
  /**
  	 * 
  	 * @brief 绑定指定地址和端口
  	 * @param addr 指定绑定的地址，如："tcp:// *:3000"
  	 * 
  	 * 
  	 * 
  	 */
  def bind(addr: String): Unit = js.native
  /**
  	 * 
  	 * @brief 关闭当前 socket
  	 * 
  	 * 
  	 */
  def close(): Unit = js.native
  /**
  	 * 
  	 * @brief 连接到指定地址的服务器
  	 * @param addr 指定连接的地址，如："tcp:// *:3000"
  	 * 
  	 * 
  	 * 
  	 */
  def connect(addr: String): Unit = js.native
  /**
  	 * 
  	 * @brief 接收一个数据包
  	 * @return 返回接收到的数据包
  	 * 
  	 * 
  	 * @async
  	 */
  def recv(): Class_Buffer = js.native
  /**
  	 * 
  	 * @brief 发送一个数据包
  	 * @param data 指定发送的数据包
  	 * 
  	 * 
  	 * 
  	 */
  def send(data: Class_Buffer): Unit = js.native
}

