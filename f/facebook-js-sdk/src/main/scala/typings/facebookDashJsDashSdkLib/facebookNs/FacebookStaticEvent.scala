package typings
package facebookDashJsDashSdkLib.facebookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FacebookStaticEvent extends js.Object {
  def subscribe[TEvent /* <: FacebookEventType */](event: TEvent, callback: FacebookEventCallback[TEvent]): scala.Unit
  def unsubscribe[TEvent /* <: FacebookEventType */](event: TEvent, callback: FacebookEventCallback[TEvent]): scala.Unit
}

object FacebookStaticEvent {
  @scala.inline
  def apply(
    subscribe: (js.Any, FacebookEventCallback[js.Any]) => scala.Unit,
    unsubscribe: (js.Any, FacebookEventCallback[js.Any]) => scala.Unit
  ): FacebookStaticEvent = {
    val __obj = js.Dynamic.literal(subscribe = js.Any.fromFunction2(subscribe), unsubscribe = js.Any.fromFunction2(unsubscribe))
  
    __obj.asInstanceOf[FacebookStaticEvent]
  }
}

