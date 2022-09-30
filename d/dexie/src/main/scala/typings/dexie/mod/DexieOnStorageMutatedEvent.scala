package typings.dexie.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DexieOnStorageMutatedEvent extends StObject {
  
  def fire(parts: ObservabilitySet): Any
  
  def subscribe(fn: js.Function1[/* parts */ ObservabilitySet, Any]): Unit
  
  def unsubscribe(fn: js.Function1[/* parts */ ObservabilitySet, Any]): Unit
}
object DexieOnStorageMutatedEvent {
  
  inline def apply(
    fire: ObservabilitySet => Any,
    subscribe: js.Function1[/* parts */ ObservabilitySet, Any] => Unit,
    unsubscribe: js.Function1[/* parts */ ObservabilitySet, Any] => Unit
  ): DexieOnStorageMutatedEvent = {
    val __obj = js.Dynamic.literal(fire = js.Any.fromFunction1(fire), subscribe = js.Any.fromFunction1(subscribe), unsubscribe = js.Any.fromFunction1(unsubscribe))
    __obj.asInstanceOf[DexieOnStorageMutatedEvent]
  }
  
  extension [Self <: DexieOnStorageMutatedEvent](x: Self) {
    
    inline def setFire(value: ObservabilitySet => Any): Self = StObject.set(x, "fire", js.Any.fromFunction1(value))
    
    inline def setSubscribe(value: js.Function1[/* parts */ ObservabilitySet, Any] => Unit): Self = StObject.set(x, "subscribe", js.Any.fromFunction1(value))
    
    inline def setUnsubscribe(value: js.Function1[/* parts */ ObservabilitySet, Any] => Unit): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction1(value))
  }
}
