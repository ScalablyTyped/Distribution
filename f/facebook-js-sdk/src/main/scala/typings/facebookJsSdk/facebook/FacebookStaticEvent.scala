package typings.facebookJsSdk.facebook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FacebookStaticEvent extends StObject {
  
  def subscribe[TEvent /* <: FacebookEventType */](event: TEvent, callback: FacebookEventCallback[TEvent]): Unit = js.native
  
  def unsubscribe[TEvent /* <: FacebookEventType */](event: TEvent, callback: FacebookEventCallback[TEvent]): Unit = js.native
}
object FacebookStaticEvent {
  
  @scala.inline
  def apply(
    subscribe: (js.Any, FacebookEventCallback[js.Any]) => Unit,
    unsubscribe: (js.Any, FacebookEventCallback[js.Any]) => Unit
  ): FacebookStaticEvent = {
    val __obj = js.Dynamic.literal(subscribe = js.Any.fromFunction2(subscribe), unsubscribe = js.Any.fromFunction2(unsubscribe))
    __obj.asInstanceOf[FacebookStaticEvent]
  }
  
  @scala.inline
  implicit class FacebookStaticEventMutableBuilder[Self <: FacebookStaticEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSubscribe(value: (js.Any, FacebookEventCallback[js.Any]) => Unit): Self = StObject.set(x, "subscribe", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUnsubscribe(value: (js.Any, FacebookEventCallback[js.Any]) => Unit): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction2(value))
  }
}
