package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief 并发控制模块
  * @detail 引用方法：,```JavaScript,var coroutine = require('coroutine');,```
  */
object coroutineMod {
  
  @JSImport("coroutine", "Condition")
  @js.native
  class Condition () extends ClassCondition
  
  @JSImport("coroutine", "Event")
  @js.native
  class Event () extends ClassEvent
  
  @JSImport("coroutine", "Lock")
  @js.native
  class Lock () extends ClassLock
  
  @JSImport("coroutine", "Semaphore")
  @js.native
  class Semaphore () extends ClassSemaphore
  
  @JSImport("coroutine", "Worker")
  @js.native
  class Worker () extends ClassWorker
  
  @JSImport("coroutine", "current")
  @js.native
  def current(): ClassFiber = js.native
  
  @JSImport("coroutine", "fibers")
  @js.native
  val fibers: js.Array[js.Any] = js.native
  
  @JSImport("coroutine", "loglevel")
  @js.native
  val loglevel: Double = js.native
  
  @JSImport("coroutine", "parallel")
  @js.native
  def parallel(datas: js.Array[_], func: js.Function): js.Array[_] = js.native
  @JSImport("coroutine", "parallel")
  @js.native
  def parallel(datas: js.Array[_], func: js.Function, fibers: Double): js.Array[_] = js.native
  @JSImport("coroutine", "parallel")
  @js.native
  def parallel(func: js.Function, num: Double): js.Array[_] = js.native
  @JSImport("coroutine", "parallel")
  @js.native
  def parallel(func: js.Function, num: Double, fibers: Double): js.Array[_] = js.native
  @JSImport("coroutine", "parallel")
  @js.native
  def parallel(funcs: js.Any*): js.Array[_] = js.native
  @JSImport("coroutine", "parallel")
  @js.native
  def parallel(funcs: js.Array[_]): js.Array[_] = js.native
  @JSImport("coroutine", "parallel")
  @js.native
  def parallel(funcs: js.Array[_], fibers: Double): js.Array[_] = js.native
  
  @JSImport("coroutine", "sleep")
  @js.native
  def sleep(): Unit = js.native
  @JSImport("coroutine", "sleep")
  @js.native
  def sleep(ms: Double): Unit = js.native
  
  @JSImport("coroutine", "spareFibers")
  @js.native
  val spareFibers: Double = js.native
  
  @JSImport("coroutine", "start")
  @js.native
  def start(func: js.Function, args: js.Any*): ClassFiber = js.native
  
  @JSImport("coroutine", "vmid")
  @js.native
  val vmid: Double = js.native
}
