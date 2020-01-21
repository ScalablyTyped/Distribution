package typings.fibjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Class_Event")
@js.native
/**
	 * 
	 * @brief 事件对象构造函数
	 * @param value 指定是否等待，为 true 时等待，缺省为 false
	 * 
	 * 
	 * 
	 */
class ClassEvent () extends ClassLock {
  def this(value: Boolean) = this()
  /**
  	 * 
  	 * @brief 重置事件（将事件状态改为false）
  	 * 
  	 * 
  	 */
  def clear(): Unit = js.native
  /**
  	 * 
  	 * @brief 判断事件对象是否为真
  	 * @return 如果事件为真，返回 true
  	 * 
  	 * 
  	 * 
  	 */
  def isSet(): Boolean = js.native
  /**
  	 * 
  	 * @brief 激活等待该事件的所有纤程
  	 * 
  	 * 
  	 */
  def pulse(): Unit = js.native
  /**
  	 * 
  	 * @brief 激活事件（将事件状态改为true），并调用pulse()
  	 * 
  	 * 
  	 */
  def set(): Unit = js.native
}

