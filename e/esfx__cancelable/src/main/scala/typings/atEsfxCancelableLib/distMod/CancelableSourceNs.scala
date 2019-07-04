package typings
package atEsfxCancelableLib.distMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@esfx/cancelable/dist", "CancelableSource")
@js.native
object CancelableSourceNs extends js.Object {
  val cancel: js.Symbol = js.native
  /**
    * A well-known symbol used to define a method to retrieve the `CancelSignal` for an object.
    */
  val cancelSignal: js.Symbol = js.native
  /**
    * Determines whether a value is a `Cancelable` object.
    */
  def isCancelable(value: js.Any): /* is @esfx/cancelable.@esfx/cancelable/dist.Cancelable */ scala.Boolean = js.native
  /**
    * Determines whether a value is a `CancelableSource` object.
    */
  def isCancelableSource(value: js.Any): /* is @esfx/cancelable.@esfx/cancelable/dist.CancelableSource */ scala.Boolean = js.native
}

