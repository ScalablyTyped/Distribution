package typings.eventIterator

import typings.eventIterator.anon.PartialEventIteratorOptio
import typings.std.AsyncIterable
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventIteratorMod {
  
  @JSImport("event-iterator/lib/event-iterator", JSImport.Default)
  @js.native
  class default[T] protected () extends EventIterator[T] {
    def this(listen: ListenHandler[T]) = this()
    def this(listen: ListenHandler[T], hasHighWaterMarkLowWaterMark: PartialEventIteratorOptio) = this()
  }
  
  @JSImport("event-iterator/lib/event-iterator", "EventIterator")
  @js.native
  class EventIterator[T] protected ()
    extends StObject
       with AsyncIterable[T] {
    def this(listen: ListenHandler[T]) = this()
    def this(listen: ListenHandler[T], hasHighWaterMarkLowWaterMark: PartialEventIteratorOptio) = this()
  }
  
  trait EventHandlers extends StObject {
    
    def highWater(): Unit
    
    def lowWater(): Unit
  }
  object EventHandlers {
    
    @scala.inline
    def apply(highWater: () => Unit, lowWater: () => Unit): EventHandlers = {
      val __obj = js.Dynamic.literal(highWater = js.Any.fromFunction0(highWater), lowWater = js.Any.fromFunction0(lowWater))
      __obj.asInstanceOf[EventHandlers]
    }
    
    @scala.inline
    implicit class EventHandlersMutableBuilder[Self <: EventHandlers] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHighWater(value: () => Unit): Self = StObject.set(x, "highWater", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLowWater(value: () => Unit): Self = StObject.set(x, "lowWater", js.Any.fromFunction0(value))
    }
  }
  
  trait EventIteratorOptions extends StObject {
    
    var highWaterMark: js.UndefOr[Double] = js.undefined
    
    var lowWaterMark: js.UndefOr[Double] = js.undefined
  }
  object EventIteratorOptions {
    
    @scala.inline
    def apply(): EventIteratorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventIteratorOptions]
    }
    
    @scala.inline
    implicit class EventIteratorOptionsMutableBuilder[Self <: EventIteratorOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
      
      @scala.inline
      def setLowWaterMark(value: Double): Self = StObject.set(x, "lowWaterMark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLowWaterMarkUndefined: Self = StObject.set(x, "lowWaterMark", js.undefined)
    }
  }
  
  type ListenHandler[T] = js.Function1[/* queue */ Queue[T], Unit | RemoveHandler]
  
  trait Queue[T] extends StObject {
    
    def fail(error: Error): Unit
    
    def on[E /* <: QueueEvent */](
      event: E,
      fn: /* import warning: importer.ImportType#apply Failed type conversion: event-iterator.event-iterator/lib/event-iterator.EventHandlers[E] */ js.Any
    ): Unit
    
    def push(value: T): Unit
    
    def stop(): Unit
  }
  object Queue {
    
    @scala.inline
    def apply[T](
      fail: Error => Unit,
      on: (js.Any, /* import warning: importer.ImportType#apply Failed type conversion: event-iterator.event-iterator/lib/event-iterator.EventHandlers[E] */ js.Any) => Unit,
      push: T => Unit,
      stop: () => Unit
    ): Queue[T] = {
      val __obj = js.Dynamic.literal(fail = js.Any.fromFunction1(fail), on = js.Any.fromFunction2(on), push = js.Any.fromFunction1(push), stop = js.Any.fromFunction0(stop))
      __obj.asInstanceOf[Queue[T]]
    }
    
    @scala.inline
    implicit class QueueMutableBuilder[Self <: Queue[?], T] (val x: Self & Queue[T]) extends AnyVal {
      
      @scala.inline
      def setFail(value: Error => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOn(
        value: (js.Any, /* import warning: importer.ImportType#apply Failed type conversion: event-iterator.event-iterator/lib/event-iterator.EventHandlers[E] */ js.Any) => Unit
      ): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPush(value: T => Unit): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    }
  }
  
  /* keyof event-iterator.event-iterator/lib/event-iterator.EventHandlers */ /* Rewritten from type alias, can be one of: 
    - typings.eventIterator.eventIteratorStrings.highWater
    - typings.eventIterator.eventIteratorStrings.lowWater
  */
  trait QueueEvent extends StObject
  
  type RemoveHandler = js.Function0[Unit]
}
