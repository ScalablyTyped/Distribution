package typings.dexie.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DexieOnReadyEvent extends StObject {
  
  def fire(vipDb: Dexie): Any
  
  def subscribe(fn: js.Function1[/* vipDb */ Dexie, Any], bSticky: Boolean): Unit
  
  def unsubscribe(fn: js.Function1[/* vipDb */ Dexie, Any]): Unit
}
object DexieOnReadyEvent {
  
  inline def apply(
    fire: Dexie => Any,
    subscribe: (js.Function1[/* vipDb */ Dexie, Any], Boolean) => Unit,
    unsubscribe: js.Function1[/* vipDb */ Dexie, Any] => Unit
  ): DexieOnReadyEvent = {
    val __obj = js.Dynamic.literal(fire = js.Any.fromFunction1(fire), subscribe = js.Any.fromFunction2(subscribe), unsubscribe = js.Any.fromFunction1(unsubscribe))
    __obj.asInstanceOf[DexieOnReadyEvent]
  }
  
  extension [Self <: DexieOnReadyEvent](x: Self) {
    
    inline def setFire(value: Dexie => Any): Self = StObject.set(x, "fire", js.Any.fromFunction1(value))
    
    inline def setSubscribe(value: (js.Function1[/* vipDb */ Dexie, Any], Boolean) => Unit): Self = StObject.set(x, "subscribe", js.Any.fromFunction2(value))
    
    inline def setUnsubscribe(value: js.Function1[/* vipDb */ Dexie, Any] => Unit): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction1(value))
  }
}
