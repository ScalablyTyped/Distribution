package typings.atEsfxCancelable.distMod

import typings.atEsfxDisposable.distMod.Disposable
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

