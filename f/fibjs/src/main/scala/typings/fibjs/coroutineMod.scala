package typings.fibjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief 并发控制模块
  * @detail 引用方法：,```JavaScript,var coroutine = require('coroutine');,```
  */
@JSImport("coroutine", JSImport.Namespace)
@js.native
object coroutineMod extends js.Object {
  
  def current(): ClassFiber = js.native
  
  val fibers: js.Array[js.Any] = js.native
  
  val loglevel: Double = js.native
  
  def parallel(datas: js.Array[_], func: js.Function): js.Array[_] = js.native
  def parallel(datas: js.Array[_], func: js.Function, fibers: Double): js.Array[_] = js.native
  def parallel(func: js.Function, num: Double): js.Array[_] = js.native
  def parallel(func: js.Function, num: Double, fibers: Double): js.Array[_] = js.native
  def parallel(funcs: js.Any*): js.Array[_] = js.native
  def parallel(funcs: js.Array[_]): js.Array[_] = js.native
  def parallel(funcs: js.Array[_], fibers: Double): js.Array[_] = js.native
  
  def sleep(): Unit = js.native
  def sleep(ms: Double): Unit = js.native
  
  val spareFibers: Double = js.native
  
  def start(func: js.Function, args: js.Any*): ClassFiber = js.native
  
  val vmid: Double = js.native
  
  @js.native
  class Condition () extends ClassCondition
  
  @js.native
  class Event () extends ClassEvent
  
  @js.native
  class Lock () extends ClassLock
  
  @js.native
  class Semaphore () extends ClassSemaphore
  
  @js.native
  class Worker () extends ClassWorker
}
