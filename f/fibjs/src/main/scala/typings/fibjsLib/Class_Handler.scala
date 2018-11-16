package typings
package fibjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** module Or Internal Object */
/**
	* @brief 消息处理器接口
	* @detail 
	*/

@JSGlobal("Class_Handler")
@js.native
class Class_Handler protected () extends Class__object {
  /**
  	 * 
  	 * @brief 创建一个 JavaSvript 消息处理器
  	 * @param hdlr JavaScript 处理器函数
  	 * 
  	 * 
  	 * 
  	 */
  def this(hdlr: js.Function) = this()
  /**
  	 * 
  	 * @brief 构造一个消息处理器链处理对象
  	 * @param hdlrs 处理器数组
  	 * 
  	 * 
  	 * 
  	 */
  def this(hdlrs: js.Array[_]) = this()
  /**
  	 * 
  	 * @brief 创建一个消息处理器路由对象
  	 * @param map 初始化路由参数
  	 * 
  	 * 
  	 * 
  	 */
  def this(map: js.Object) = this()
  /**
  	 * 
  	 * @brief 处理一个消息或对象
  	 * @param v 指定处理的消息或对象
  	 * @return 返回下一步的处理器
  	 * 
  	 * 
  	 * @async
  	 */
  def invoke(v: Class__object): Class_Handler = js.native
}

