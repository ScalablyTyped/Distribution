package typings.dexie.mod

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DexieCloseEvent extends StObject {
  
  def fire(event: Event): Any
  
  def subscribe(fn: js.Function1[/* event */ Event, Any]): Unit
  
  def unsubscribe(fn: js.Function1[/* event */ Event, Any]): Unit
}
object DexieCloseEvent {
  
  inline def apply(
    fire: Event => Any,
    subscribe: js.Function1[/* event */ Event, Any] => Unit,
    unsubscribe: js.Function1[/* event */ Event, Any] => Unit
  ): DexieCloseEvent = {
    val __obj = js.Dynamic.literal(fire = js.Any.fromFunction1(fire), subscribe = js.Any.fromFunction1(subscribe), unsubscribe = js.Any.fromFunction1(unsubscribe))
    __obj.asInstanceOf[DexieCloseEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DexieCloseEvent] (val x: Self) extends AnyVal {
    
    inline def setFire(value: Event => Any): Self = StObject.set(x, "fire", js.Any.fromFunction1(value))
    
    inline def setSubscribe(value: js.Function1[/* event */ Event, Any] => Unit): Self = StObject.set(x, "subscribe", js.Any.fromFunction1(value))
    
    inline def setUnsubscribe(value: js.Function1[/* event */ Event, Any] => Unit): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction1(value))
  }
}
