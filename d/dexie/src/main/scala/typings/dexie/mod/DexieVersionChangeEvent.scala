package typings.dexie.mod

import typings.std.IDBVersionChangeEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DexieVersionChangeEvent extends StObject {
  
  def fire(event: IDBVersionChangeEvent): Any
  
  def subscribe(fn: js.Function1[/* event */ IDBVersionChangeEvent, Any]): Unit
  
  def unsubscribe(fn: js.Function1[/* event */ IDBVersionChangeEvent, Any]): Unit
}
object DexieVersionChangeEvent {
  
  inline def apply(
    fire: IDBVersionChangeEvent => Any,
    subscribe: js.Function1[/* event */ IDBVersionChangeEvent, Any] => Unit,
    unsubscribe: js.Function1[/* event */ IDBVersionChangeEvent, Any] => Unit
  ): DexieVersionChangeEvent = {
    val __obj = js.Dynamic.literal(fire = js.Any.fromFunction1(fire), subscribe = js.Any.fromFunction1(subscribe), unsubscribe = js.Any.fromFunction1(unsubscribe))
    __obj.asInstanceOf[DexieVersionChangeEvent]
  }
  
  extension [Self <: DexieVersionChangeEvent](x: Self) {
    
    inline def setFire(value: IDBVersionChangeEvent => Any): Self = StObject.set(x, "fire", js.Any.fromFunction1(value))
    
    inline def setSubscribe(value: js.Function1[/* event */ IDBVersionChangeEvent, Any] => Unit): Self = StObject.set(x, "subscribe", js.Any.fromFunction1(value))
    
    inline def setUnsubscribe(value: js.Function1[/* event */ IDBVersionChangeEvent, Any] => Unit): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction1(value))
  }
}
