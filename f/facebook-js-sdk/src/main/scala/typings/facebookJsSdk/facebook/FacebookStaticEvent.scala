package typings.facebookJsSdk.facebook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FacebookStaticEvent extends StObject {
  
  def subscribe[TEvent /* <: FacebookEventType */](event: TEvent, callback: FacebookEventCallback[TEvent]): Unit
  
  def unsubscribe[TEvent /* <: FacebookEventType */](event: TEvent, callback: FacebookEventCallback[TEvent]): Unit
}
object FacebookStaticEvent {
  
  inline def apply(
    subscribe: (Any, FacebookEventCallback[Any]) => Unit,
    unsubscribe: (Any, FacebookEventCallback[Any]) => Unit
  ): FacebookStaticEvent = {
    val __obj = js.Dynamic.literal(subscribe = js.Any.fromFunction2(subscribe), unsubscribe = js.Any.fromFunction2(unsubscribe))
    __obj.asInstanceOf[FacebookStaticEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FacebookStaticEvent] (val x: Self) extends AnyVal {
    
    inline def setSubscribe(value: (Any, FacebookEventCallback[Any]) => Unit): Self = StObject.set(x, "subscribe", js.Any.fromFunction2(value))
    
    inline def setUnsubscribe(value: (Any, FacebookEventCallback[Any]) => Unit): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction2(value))
  }
}
