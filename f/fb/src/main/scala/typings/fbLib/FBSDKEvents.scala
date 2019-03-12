package typings
package fbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FBSDKEvents extends js.Object {
  /* This method allows you to subscribe to a range of events, and define callback functions for when they fire. */
  def subscribe(event: java.lang.String, callback: js.Function1[/* fbResponseObject */ js.Object, _]): scala.Unit
  /* This method allows you to un-subscribe a callback from any events previously subscribed to using .Event.subscribe(). */
  def unsubscribe(event: java.lang.String, callback: js.Function1[/* fbResponseObject */ js.Object, _]): scala.Unit
}

object FBSDKEvents {
  @scala.inline
  def apply(
    subscribe: (java.lang.String, js.Function1[/* fbResponseObject */ js.Object, _]) => scala.Unit,
    unsubscribe: (java.lang.String, js.Function1[/* fbResponseObject */ js.Object, _]) => scala.Unit
  ): FBSDKEvents = {
    val __obj = js.Dynamic.literal(subscribe = js.Any.fromFunction2(subscribe), unsubscribe = js.Any.fromFunction2(unsubscribe))
  
    __obj.asInstanceOf[FBSDKEvents]
  }
}

