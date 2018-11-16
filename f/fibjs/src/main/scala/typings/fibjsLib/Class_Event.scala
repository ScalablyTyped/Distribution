package typings
package fibjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Class_Event")
@js.native
class Class_Event () extends Class_Lock {
  /**
  	 * 
  	 * @brief 事件对象构造函数
  	 * @param value 指定是否等待，为 true 时等待，缺省为 false
  	 * 
  	 * 
  	 * 
  	 */
  def this(value: scala.Boolean) = this()
  /**
  	 * 
  	 * @brief 重置事件（将事件状态改为false）
  	 * 
  	 * 
  	 */
  def clear(): scala.Unit = js.native
  /**
  	 * 
  	 * @brief 判断事件对象是否为真
  	 * @return 如果事件为真，返回 true
  	 * 
  	 * 
  	 * 
  	 */
  def isSet(): scala.Boolean = js.native
  /**
  	 * 
  	 * @brief 激活等待该事件的所有纤程
  	 * 
  	 * 
  	 */
  def pulse(): scala.Unit = js.native
  /**
  	 * 
  	 * @brief 激活事件（将事件状态改为true），并调用pulse()
  	 * 
  	 * 
  	 */
  def set(): scala.Unit = js.native
}

