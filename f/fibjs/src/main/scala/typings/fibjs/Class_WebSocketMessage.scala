package typings.fibjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Class_WebSocketMessage")
@js.native
/**
	 * 
	 * @brief 包处理消息对象构造函数
	 * @param type websocket 消息类型，缺省为 websocket.BINARY
	 * @param masked websocket 消息掩码，缺省为 true
	 * @param compress 标记消息是否压缩，缺省为 false
	 * @param maxSize 最大包尺寸，以 MB 为单位，缺省为 67108864(64M)
	 * 
	 * 
	 * 
	 */
class Class_WebSocketMessage () extends Class_Message {
  def this(`type`: Double) = this()
  def this(`type`: Double, masked: Boolean) = this()
  def this(`type`: Double, masked: Boolean, compress: Boolean) = this()
  def this(`type`: Double, masked: Boolean, compress: Boolean, maxSize: Double) = this()
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 查询和读取 websocket 压缩状态，缺省为 false
  	 * 
  	 * 
  	 * @type Boolean
  	 */
  var compress: Boolean = js.native
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 查询和读取 websocket 掩码标记，缺省为 true
  	 * 
  	 * 
  	 * @type Boolean
  	 */
  var masked: Boolean = js.native
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 查询和设置最大包尺寸，以字节为单位，缺省为 67108864(64M)
  	 * 
  	 * 
  	 * @type Integer
  	 */
  var maxSize: Double = js.native
}

