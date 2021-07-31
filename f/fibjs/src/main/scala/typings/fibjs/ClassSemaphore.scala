package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassSemaphore
  extends StObject
     with ClassLock {
  
  /**
    * 
    * @brief 释放一个信号量，等同于 release()
    * 
    * 
    */
  def post(): Unit = js.native
  
  /**
    * 
    * @brief 尝试获取一个信号，如不能获取，则立即返回并返回 false，等同于 acquire(false)
    * @return 获取成功则返回 true
    * 
    * 
    * 
    */
  def trywait(): Boolean = js.native
}
