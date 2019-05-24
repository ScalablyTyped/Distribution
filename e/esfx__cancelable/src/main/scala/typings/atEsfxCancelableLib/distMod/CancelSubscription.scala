package typings
package atEsfxCancelableLib.distMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelSubscription extends js.Object {
  /**
    * Unsubscribes from a cancellation signal.
    */
  def unsubscribe(): scala.Unit
}

object CancelSubscription {
  @scala.inline
  def apply(unsubscribe: () => scala.Unit): CancelSubscription = {
    val __obj = js.Dynamic.literal(unsubscribe = js.Any.fromFunction0(unsubscribe))
  
    __obj.asInstanceOf[CancelSubscription]
  }
}

