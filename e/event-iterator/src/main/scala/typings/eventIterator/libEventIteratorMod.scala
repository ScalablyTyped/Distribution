package typings.eventIterator

import typings.eventIterator.anon.PartialEventIteratorOptio
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEventIteratorMod {
  
  @JSImport("event-iterator/lib/event-iterator", JSImport.Default)
  @js.native
  open class default[T] protected () extends EventIterator[T] {
    def this(listen: ListenHandler[T]) = this()
    def this(listen: ListenHandler[T], param1: PartialEventIteratorOptio) = this()
  }
  
  @JSImport("event-iterator/lib/event-iterator", "EventIterator")
  @js.native
  open class EventIterator[T] protected ()
    extends StObject
       with AsyncIterable[T] {
    def this(listen: ListenHandler[T]) = this()
    def this(listen: ListenHandler[T], param1: PartialEventIteratorOptio) = this()
  }
  
  trait EventHandlers extends StObject {
    
    def highWater(): Unit
    
    def lowWater(): Unit
  }
  object EventHandlers {
    
    inline def apply(highWater: () => Unit, lowWater: () => Unit): EventHandlers = {
      val __obj = js.Dynamic.literal(highWater = js.Any.fromFunction0(highWater), lowWater = js.Any.fromFunction0(lowWater))
      __obj.asInstanceOf[EventHandlers]
    }
    
    extension [Self <: EventHandlers](x: Self) {
      
      inline def setHighWater(value: () => Unit): Self = StObject.set(x, "highWater", js.Any.fromFunction0(value))
      
      inline def setLowWater(value: () => Unit): Self = StObject.set(x, "lowWater", js.Any.fromFunction0(value))
    }
  }
  
  trait EventIteratorOptions extends StObject {
    
    var highWaterMark: js.UndefOr[Double] = js.undefined
    
    var lowWaterMark: js.UndefOr[Double] = js.undefined
  }
  object EventIteratorOptions {
    
    inline def apply(): EventIteratorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventIteratorOptions]
    }
    
    extension [Self <: EventIteratorOptions](x: Self) {
      
      inline def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
      
      inline def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
      
      inline def setLowWaterMark(value: Double): Self = StObject.set(x, "lowWaterMark", value.asInstanceOf[js.Any])
      
      inline def setLowWaterMarkUndefined: Self = StObject.set(x, "lowWaterMark", js.undefined)
    }
  }
  
  type ListenHandler[T] = js.Function1[/* queue */ Queue[T], Unit | RemoveHandler]
  
  trait Queue[T] extends StObject {
    
    def fail(error: js.Error): Unit
    
    def on[E /* <: QueueEvent */](
      event: E,
      fn: /* import warning: importer.ImportType#apply Failed type conversion: event-iterator.event-iterator/lib/event-iterator.EventHandlers[E] */ js.Any
    ): Unit
    
    def push(value: T): Unit
    
    def stop(): Unit
  }
  object Queue {
    
    inline def apply[T](
      fail: js.Error => Unit,
      on: (Any, /* import warning: importer.ImportType#apply Failed type conversion: event-iterator.event-iterator/lib/event-iterator.EventHandlers[E] */ js.Any) => Unit,
      push: T => Unit,
      stop: () => Unit
    ): Queue[T] = {
      val __obj = js.Dynamic.literal(fail = js.Any.fromFunction1(fail), on = js.Any.fromFunction2(on), push = js.Any.fromFunction1(push), stop = js.Any.fromFunction0(stop))
      __obj.asInstanceOf[Queue[T]]
    }
    
    extension [Self <: Queue[?], T](x: Self & Queue[T]) {
      
      inline def setFail(value: js.Error => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
      
      inline def setOn(
        value: (Any, /* import warning: importer.ImportType#apply Failed type conversion: event-iterator.event-iterator/lib/event-iterator.EventHandlers[E] */ js.Any) => Unit
      ): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
      
      inline def setPush(value: T => Unit): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
      
      inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    }
  }
  
  /* keyof event-iterator.event-iterator/lib/event-iterator.EventHandlers */ /* Rewritten from type alias, can be one of: 
    - typings.eventIterator.eventIteratorStrings.highWater
    - typings.eventIterator.eventIteratorStrings.lowWater
  */
  trait QueueEvent extends StObject
  
  type RemoveHandler = js.Function0[Unit]
}
