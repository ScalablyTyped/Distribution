package typings.dexie.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DexieEvent extends StObject {
  
  def fire(args: Any*): Any
  
  def subscribe(fn: js.Function1[/* repeated */ Any, Any]): Unit
  
  var subscribers: js.Array[js.Function]
  
  def unsubscribe(fn: js.Function1[/* repeated */ Any, Any]): Unit
}
object DexieEvent {
  
  inline def apply(
    fire: /* repeated */ Any => Any,
    subscribe: js.Function1[/* repeated */ Any, Any] => Unit,
    subscribers: js.Array[js.Function],
    unsubscribe: js.Function1[/* repeated */ Any, Any] => Unit
  ): DexieEvent = {
    val __obj = js.Dynamic.literal(fire = js.Any.fromFunction1(fire), subscribe = js.Any.fromFunction1(subscribe), subscribers = subscribers.asInstanceOf[js.Any], unsubscribe = js.Any.fromFunction1(unsubscribe))
    __obj.asInstanceOf[DexieEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DexieEvent] (val x: Self) extends AnyVal {
    
    inline def setFire(value: /* repeated */ Any => Any): Self = StObject.set(x, "fire", js.Any.fromFunction1(value))
    
    inline def setSubscribe(value: js.Function1[/* repeated */ Any, Any] => Unit): Self = StObject.set(x, "subscribe", js.Any.fromFunction1(value))
    
    inline def setSubscribers(value: js.Array[js.Function]): Self = StObject.set(x, "subscribers", value.asInstanceOf[js.Any])
    
    inline def setSubscribersVarargs(value: js.Function*): Self = StObject.set(x, "subscribers", js.Array(value*))
    
    inline def setUnsubscribe(value: js.Function1[/* repeated */ Any, Any] => Unit): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction1(value))
  }
}
