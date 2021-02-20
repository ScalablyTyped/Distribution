package typings.fastq

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fastq", JSImport.Namespace)
  @js.native
  def apply[C, T, R](context: C, worker: worker[C, T, R], concurrency: Double): queue[T, R] = js.native
  @JSImport("fastq", JSImport.Namespace)
  @js.native
  def apply[C, T, R](worker: worker[C, T, R], concurrency: Double): queue[T, R] = js.native
  
  type done[R] = js.Function2[/* err */ Error | Null, /* result */ js.UndefOr[R], Unit]
  
  type errorHandler[T] = js.Function2[/* err */ Error, /* task */ T, Unit]
  
  @js.native
  trait queue[T, R] extends StObject {
    
    var concurrency: Double = js.native
    
    def drain(): js.Any = js.native
    
    def empty(): Unit = js.native
    
    def error(handler: errorHandler[_]): Unit = js.native
    
    def getQueue(): js.Array[T] = js.native
    
    def idle(): Boolean = js.native
    
    def kill(): js.Any = js.native
    
    def killAndDrain(): js.Any = js.native
    
    def length(): Double = js.native
    
    def pause(): js.Any = js.native
    
    def push(task: T, done: done[R]): Unit = js.native
    
    def resume(): js.Any = js.native
    
    def saturated(): Unit = js.native
    
    def unshift(task: T, done: done[R]): Unit = js.native
  }
  object queue {
    
    @scala.inline
    def apply[T, R](
      concurrency: Double,
      drain: () => js.Any,
      empty: () => Unit,
      error: errorHandler[_] => Unit,
      getQueue: () => js.Array[T],
      idle: () => Boolean,
      kill: () => js.Any,
      killAndDrain: () => js.Any,
      length: () => Double,
      pause: () => js.Any,
      push: (T, done[R]) => Unit,
      resume: () => js.Any,
      saturated: () => Unit,
      unshift: (T, done[R]) => Unit
    ): queue[T, R] = {
      val __obj = js.Dynamic.literal(concurrency = concurrency.asInstanceOf[js.Any], drain = js.Any.fromFunction0(drain), empty = js.Any.fromFunction0(empty), error = js.Any.fromFunction1(error), getQueue = js.Any.fromFunction0(getQueue), idle = js.Any.fromFunction0(idle), kill = js.Any.fromFunction0(kill), killAndDrain = js.Any.fromFunction0(killAndDrain), length = js.Any.fromFunction0(length), pause = js.Any.fromFunction0(pause), push = js.Any.fromFunction2(push), resume = js.Any.fromFunction0(resume), saturated = js.Any.fromFunction0(saturated), unshift = js.Any.fromFunction2(unshift))
      __obj.asInstanceOf[queue[T, R]]
    }
    
    @scala.inline
    implicit class queueMutableBuilder[Self <: queue[_, _], T, R] (val x: Self with (queue[T, R])) extends AnyVal {
      
      @scala.inline
      def setConcurrency(value: Double): Self = StObject.set(x, "concurrency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrain(value: () => js.Any): Self = StObject.set(x, "drain", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEmpty(value: () => Unit): Self = StObject.set(x, "empty", js.Any.fromFunction0(value))
      
      @scala.inline
      def setError(value: errorHandler[_] => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetQueue(value: () => js.Array[T]): Self = StObject.set(x, "getQueue", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIdle(value: () => Boolean): Self = StObject.set(x, "idle", js.Any.fromFunction0(value))
      
      @scala.inline
      def setKill(value: () => js.Any): Self = StObject.set(x, "kill", js.Any.fromFunction0(value))
      
      @scala.inline
      def setKillAndDrain(value: () => js.Any): Self = StObject.set(x, "killAndDrain", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLength(value: () => Double): Self = StObject.set(x, "length", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPause(value: () => js.Any): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPush(value: (T, done[R]) => Unit): Self = StObject.set(x, "push", js.Any.fromFunction2(value))
      
      @scala.inline
      def setResume(value: () => js.Any): Self = StObject.set(x, "resume", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSaturated(value: () => Unit): Self = StObject.set(x, "saturated", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUnshift(value: (T, done[R]) => Unit): Self = StObject.set(x, "unshift", js.Any.fromFunction2(value))
    }
  }
  
  type worker[C, T, R] = js.ThisFunction2[/* this */ C, /* task */ T, /* cb */ done[R], Unit]
}
