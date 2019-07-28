package typings.gapiDotClientDotIam.gapiNs.clientNs.iamNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyDelta extends js.Object {
  /** The delta for Bindings between two policies. */
  var bindingDeltas: js.UndefOr[js.Array[BindingDelta]] = js.undefined
}

object PolicyDelta {
  @scala.inline
  def apply(bindingDeltas: js.Array[BindingDelta] = null): PolicyDelta = {
    val __obj = js.Dynamic.literal()
    if (bindingDeltas != null) __obj.updateDynamic("bindingDeltas")(bindingDeltas)
    __obj.asInstanceOf[PolicyDelta]
  }
}

