package typings.esfxCancelable.distMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelSignal extends js.Object {
  /**
    * Gets a value indicating whether cancellation was signaled.
    */
  val signaled: Boolean
  /**
    * Subscribes to notifications for when the object becomes signaled.
    */
  def subscribe(onSignaled: js.Function0[Unit]): CancelSubscription
}

object CancelSignal {
  @scala.inline
  def apply(signaled: Boolean, subscribe: js.Function0[Unit] => CancelSubscription): CancelSignal = {
    val __obj = js.Dynamic.literal(signaled = signaled.asInstanceOf[js.Any], subscribe = js.Any.fromFunction1(subscribe))
    __obj.asInstanceOf[CancelSignal]
  }
}

