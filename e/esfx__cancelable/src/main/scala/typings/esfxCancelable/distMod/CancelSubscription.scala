package typings.esfxCancelable.distMod

import typings.esfxDisposable.distMod.Disposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelSubscription extends Disposable {
  /**
    * Unsubscribes from a cancellation signal.
    */
  def unsubscribe(): Unit = js.native
}

@JSImport("@esfx/cancelable/dist", "CancelSubscription")
@js.native
object CancelSubscription extends js.Object {
  /**
    * Creates a `CancelSubscription` object for an `unsubscribe` callback.
    * @param unsubscribe The callback to execute when the `unsubscribe()` method is called.
    */
  def create(unsubscribe: js.Function0[Unit]): CancelSubscription = js.native
}

