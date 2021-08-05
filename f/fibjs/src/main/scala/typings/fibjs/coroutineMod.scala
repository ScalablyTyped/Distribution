package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief 并发控制模块
  * @detail 引用方法：,```JavaScript,var coroutine = require('coroutine');,```
  */
object coroutineMod {
  
  @JSImport("coroutine", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("coroutine", "Condition")
  @js.native
  class Condition ()
    extends StObject
       with ClassCondition
  
  @JSImport("coroutine", "Event")
  @js.native
  class Event ()
    extends StObject
       with ClassEvent
  
  @JSImport("coroutine", "Lock")
  @js.native
  class Lock ()
    extends StObject
       with ClassLock
  
  @JSImport("coroutine", "Semaphore")
  @js.native
  class Semaphore ()
    extends StObject
       with ClassSemaphore
  
  @JSImport("coroutine", "Worker")
  @js.native
  class Worker ()
    extends StObject
       with ClassWorker
  
  inline def current(): ClassFiber = ^.asInstanceOf[js.Dynamic].applyDynamic("current")().asInstanceOf[ClassFiber]
  
  @JSImport("coroutine", "fibers")
  @js.native
  val fibers: js.Array[js.Any] = js.native
  
  @JSImport("coroutine", "loglevel")
  @js.native
  val loglevel: Double = js.native
  
  inline def parallel(datas: js.Array[js.Any], func: js.Function): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("parallel")(datas.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  inline def parallel(datas: js.Array[js.Any], func: js.Function, fibers: Double): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("parallel")(datas.asInstanceOf[js.Any], func.asInstanceOf[js.Any], fibers.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  inline def parallel(func: js.Function, num: Double): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("parallel")(func.asInstanceOf[js.Any], num.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  inline def parallel(func: js.Function, num: Double, fibers: Double): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("parallel")(func.asInstanceOf[js.Any], num.asInstanceOf[js.Any], fibers.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  inline def parallel(funcs: js.Any*): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("parallel")(funcs.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
  inline def parallel(funcs: js.Array[js.Any]): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("parallel")(funcs.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
  inline def parallel(funcs: js.Array[js.Any], fibers: Double): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("parallel")(funcs.asInstanceOf[js.Any], fibers.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  
  inline def sleep(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sleep")().asInstanceOf[Unit]
  inline def sleep(ms: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sleep")(ms.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("coroutine", "spareFibers")
  @js.native
  val spareFibers: Double = js.native
  
  inline def start(func: js.Function, args: js.Any*): ClassFiber = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(func.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ClassFiber]
  
  @JSImport("coroutine", "vmid")
  @js.native
  val vmid: Double = js.native
}
