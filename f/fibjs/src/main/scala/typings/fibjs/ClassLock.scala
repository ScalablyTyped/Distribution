package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief 纤程锁对象
  * @detail 不同于操作系统的锁，纤程锁是纯逻辑实现，加锁与解锁负荷很小,```JavaScript,var l = new coroutine.Lock();,l.acquire();,.....,l.release();,```
  */
@js.native
trait ClassLock
  extends StObject
     with ClassObject {
  
  /**
    * 
    * @brief 获取锁的拥有权
    * 
    * acquire 方法用于获取锁的拥有权，当锁处于可获取状态时，此方法立即返回 true。
    * 
    * 当锁不可获取，且 blocking 为 true，则当前纤程进入休眠，当其他纤程释放锁后，此方法返回 true。
    * 
    * 当锁不可获取，且 blocking 为 false，则方法返回 false。
    * @param blocking 指定是否等待，为 true 时等待，缺省为真
    * @return 返回是否成功获取锁，为 true 表示成功获取
    * 
    * 
    * 
    */
  def acquire(): Boolean = js.native
  def acquire(blocking: Boolean): Boolean = js.native
  
  /**
    * 
    * @brief 查询当前等待任务数
    * @return 返回任务数
    * 
    * 
    * 
    */
  def count(): Double = js.native
  
  /**
    * 
    * @brief 释放锁的拥有权
    * 
    * 此方法将释放对锁的拥有权，如果当前纤程未拥有锁，此方法将抛出错误。
    * 
    * 
    * 
    */
  def release(): Unit = js.native
}
