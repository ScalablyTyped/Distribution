package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassEvent extends ClassLock {
  
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
