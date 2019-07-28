package typings.fb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FBSDKEvents extends js.Object {
  /* This method allows you to subscribe to a range of events, and define callback functions for when they fire. */
  def subscribe(event: String, callback: js.Function1[/* fbResponseObject */ js.Object, _]): Unit
  /* This method allows you to un-subscribe a callback from any events previously subscribed to using .Event.subscribe(). */
  def unsubscribe(event: String, callback: js.Function1[/* fbResponseObject */ js.Object, _]): Unit
}

object FBSDKEvents {
  @scala.inline
  def apply(
    subscribe: (String, js.Function1[/* fbResponseObject */ js.Object, _]) => Unit,
    unsubscribe: (String, js.Function1[/* fbResponseObject */ js.Object, _]) => Unit
  ): FBSDKEvents = {
    val __obj = js.Dynamic.literal(subscribe = js.Any.fromFunction2(subscribe), unsubscribe = js.Any.fromFunction2(unsubscribe))
  
    __obj.asInstanceOf[FBSDKEvents]
  }
}

