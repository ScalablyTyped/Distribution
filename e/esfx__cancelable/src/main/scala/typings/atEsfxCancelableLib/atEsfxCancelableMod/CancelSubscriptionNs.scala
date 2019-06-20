package typings
package atEsfxCancelableLib.atEsfxCancelableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@esfx/cancelable", "CancelSubscription")
@js.native
object CancelSubscriptionNs extends js.Object {
  /**
    * Creates a `CancelSubscription` object for an `unsubscribe` callback.
    * @param unsubscribe The callback to execute when the `unsubscribe()` method is called.
    */
  def create(unsubscribe: js.Function0[scala.Unit]): atEsfxCancelableLib.distMod.CancelSubscription = js.native
}

