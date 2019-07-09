package typings
package atEsfxCancelableLib.distMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@esfx/cancelable/dist", "Cancelable")
@js.native
object CancelableNs extends js.Object {
  /**
    * A well-known symbol used to define a method to retrieve the `CancelSignal` for an object.
    */
  val cancelSignal: js.Symbol = js.native
  /**
    * A `Cancelable` that is already signaled.
    */
  val canceled: atEsfxCancelableLib.distMod.CancelableCancelSignal = js.native
  val name: atEsfxCancelableLib.atEsfxCancelableLibStrings.Cancelable = js.native
  /**
    * A `Cancelable` that can never be signaled.
    */
  val none: atEsfxCancelableLib.distMod.CancelableCancelSignal = js.native
  /**
    * Determines whether a value is a `Cancelable` object.
    */
  def hasInstance(value: js.Any): /* is @esfx/cancelable.@esfx/cancelable/dist.Cancelable */ scala.Boolean = js.native
  /**
    * Determines whether a value is a `Cancelable` object.
    * @deprecated Use `Cancelable.hasInstance` instead.
    */
  def isCancelable(value: js.Any): /* is @esfx/cancelable.@esfx/cancelable/dist.Cancelable */ scala.Boolean = js.native
  def isSignaled(): scala.Boolean = js.native
  /**
    * Determines whether `cancelable` is in the signaled state.
    */
  def isSignaled(cancelable: atEsfxCancelableLib.distMod.Cancelable): scala.Boolean = js.native
  def subscribe(cancelable: js.UndefOr[scala.Nothing], onSignaled: js.Function0[scala.Unit]): atEsfxCancelableLib.distMod.CancelSubscription = js.native
  /**
    * Subscribes to be notified when a `cancelable` becomes signaled.
    */
  def subscribe(cancelable: atEsfxCancelableLib.distMod.Cancelable, onSignaled: js.Function0[scala.Unit]): atEsfxCancelableLib.distMod.CancelSubscription = js.native
  def throwIfSignaled(): scala.Unit = js.native
  /**
    * Throws a `CancelError` exception if the provided `cancelable` is in the signaled state.
    */
  def throwIfSignaled(cancelable: atEsfxCancelableLib.distMod.Cancelable): scala.Unit = js.native
}

