package typings.fibjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** module Or Internal Object */
/**
	* @brief 并发控制模块
	* @detail 引用方法：,```JavaScript,var coroutine = require('coroutine');,```
	*/
@JSImport("coroutine", JSImport.Namespace)
@js.native
object coroutineMod extends js.Object {
  @js.native
  class Condition () extends Class_Condition
  
  @js.native
  class Event () extends Class_Event
  
  @js.native
  class Lock () extends Class_Lock
  
  @js.native
  class Semaphore () extends Class_Semaphore
  
  @js.native
  class Worker () extends Class_Worker
  
  val fibers: js.Array[js.Any] = js.native
  val loglevel: Double = js.native
  val spareFibers: Double = js.native
  val vmid: Double = js.native
  def current(): Class_Fiber = js.native
  def parallel(datas: js.Array[_], func: js.Function): js.Array[_] = js.native
  def parallel(datas: js.Array[_], func: js.Function, fibers: Double): js.Array[_] = js.native
  def parallel(func: js.Function, num: Double): js.Array[_] = js.native
  def parallel(func: js.Function, num: Double, fibers: Double): js.Array[_] = js.native
  def parallel(funcs: js.Any*): js.Array[_] = js.native
  def parallel(funcs: js.Array[_]): js.Array[_] = js.native
  def parallel(funcs: js.Array[_], fibers: Double): js.Array[_] = js.native
  def sleep(): Unit = js.native
  def sleep(ms: Double): Unit = js.native
  def start(func: js.Function, args: js.Any*): Class_Fiber = js.native
}

