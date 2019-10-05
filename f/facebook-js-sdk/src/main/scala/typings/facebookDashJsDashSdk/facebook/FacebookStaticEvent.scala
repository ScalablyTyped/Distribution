package typings.facebookDashJsDashSdk.facebook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FacebookStaticEvent extends js.Object {
  def subscribe[TEvent /* <: FacebookEventType */](event: TEvent, callback: FacebookEventCallback[TEvent]): Unit
  def unsubscribe[TEvent /* <: FacebookEventType */](event: TEvent, callback: FacebookEventCallback[TEvent]): Unit
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
}

