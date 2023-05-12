package typings.fastq

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[C, T, R](context: C, worker: worker[C, T, R], concurrency: Double): queue[T, R] = (^.asInstanceOf[js.Dynamic].apply(context.asInstanceOf[js.Any], worker.asInstanceOf[js.Any], concurrency.asInstanceOf[js.Any])).asInstanceOf[queue[T, R]]
  inline def apply[C, T, R](worker: worker[C, T, R], concurrency: Double): queue[T, R] = (^.asInstanceOf[js.Dynamic].apply(worker.asInstanceOf[js.Any], concurrency.asInstanceOf[js.Any])).asInstanceOf[queue[T, R]]
  
  @JSImport("fastq", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def promise[C, T, R](context: C, worker: asyncWorker[C, T, R], concurrency: Double): queueAsPromised[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("promise")(context.asInstanceOf[js.Any], worker.asInstanceOf[js.Any], concurrency.asInstanceOf[js.Any])).asInstanceOf[queueAsPromised[T, R]]
  inline def promise[C, T, R](worker: asyncWorker[C, T, R], concurrency: Double): queueAsPromised[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("promise")(worker.asInstanceOf[js.Any], concurrency.asInstanceOf[js.Any])).asInstanceOf[queueAsPromised[T, R]]
  
  type asyncWorker[C, T, R] = js.ThisFunction1[/* this */ C, /* task */ T, js.Promise[R]]
  
  type done[R] = js.Function2[/* err */ js.Error | Null, /* result */ js.UndefOr[R], Unit]
  
  type errorHandler[T] = js.Function2[/* err */ js.Error, /* task */ T, Unit]
  
  @js.native
  trait queue[T, R] extends StObject {
    
    var concurrency: Double = js.native
    
    def drain(): Any = js.native
    
    def empty(): Unit = js.native
    
    def error(handler: errorHandler[T]): Unit = js.native
    
    def getQueue(): js.Array[T] = js.native
    
    def idle(): Boolean = js.native
    
    def kill(): Any = js.native
    
    def killAndDrain(): Any = js.native
    
    def length(): Double = js.native
    
    def pause(): Any = js.native
    
    def push(task: T): Unit = js.native
    def push(task: T, done: done[R]): Unit = js.native
    
    def resume(): Any = js.native
    
    def saturated(): Unit = js.native
    
    def unshift(task: T): Unit = js.native
    def unshift(task: T, done: done[R]): Unit = js.native
  }
  
  @js.native
  trait queueAsPromised[T, R]
    extends StObject
       with queue[T, R] {
    
    def drained(): js.Promise[Unit] = js.native
  }
  
  type worker[C, T, R] = js.ThisFunction2[/* this */ C, /* task */ T, /* cb */ done[R], Unit]
}
