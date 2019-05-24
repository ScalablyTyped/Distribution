package typings
package atEsfxCancelableLib.distMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelSignal extends js.Object {
  /**
    * Gets a value indicating whether cancellation was signalled.
    */
  val signaled: scala.Boolean
  /**
    * Subscribes to notifications for when the object becomes signaled.
    */
  def subscribe(onSignaled: js.Function0[scala.Unit]): CancelSubscription
}

object CancelSignal {
  @scala.inline
  def apply(signaled: scala.Boolean, subscribe: js.Function0[scala.Unit] => CancelSubscription): CancelSignal = {
    val __obj = js.Dynamic.literal(signaled = signaled, subscribe = js.Any.fromFunction1(subscribe))
  
    __obj.asInstanceOf[CancelSignal]
  }
}

