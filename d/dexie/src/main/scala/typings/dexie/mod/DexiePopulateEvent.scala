package typings.dexie.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DexiePopulateEvent extends StObject {
  
  def fire(trans: Transaction): Any
  
  def subscribe(fn: js.Function1[/* trans */ Transaction, Any]): Unit
  
  def unsubscribe(fn: js.Function1[/* trans */ Transaction, Any]): Unit
}
object DexiePopulateEvent {
  
  inline def apply(
    fire: Transaction => Any,
    subscribe: js.Function1[/* trans */ Transaction, Any] => Unit,
    unsubscribe: js.Function1[/* trans */ Transaction, Any] => Unit
  ): DexiePopulateEvent = {
    val __obj = js.Dynamic.literal(fire = js.Any.fromFunction1(fire), subscribe = js.Any.fromFunction1(subscribe), unsubscribe = js.Any.fromFunction1(unsubscribe))
    __obj.asInstanceOf[DexiePopulateEvent]
  }
  
  extension [Self <: DexiePopulateEvent](x: Self) {
    
    inline def setFire(value: Transaction => Any): Self = StObject.set(x, "fire", js.Any.fromFunction1(value))
    
    inline def setSubscribe(value: js.Function1[/* trans */ Transaction, Any] => Unit): Self = StObject.set(x, "subscribe", js.Any.fromFunction1(value))
    
    inline def setUnsubscribe(value: js.Function1[/* trans */ Transaction, Any] => Unit): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction1(value))
  }
}
