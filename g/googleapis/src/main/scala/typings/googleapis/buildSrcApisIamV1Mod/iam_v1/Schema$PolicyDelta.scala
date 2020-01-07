package typings.googleapis.buildSrcApisIamV1Mod.iam_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The difference delta between two policies.
  */
@js.native
trait Schema$PolicyDelta extends js.Object {
  /**
    * The delta for Bindings between two policies.
    */
  var bindingDeltas: js.UndefOr[js.Array[Schema$BindingDelta]] = js.native
}

object Schema$PolicyDelta {
  @scala.inline
  def apply(bindingDeltas: js.Array[Schema$BindingDelta] = null): Schema$PolicyDelta = {
    val __obj = js.Dynamic.literal()
    if (bindingDeltas != null) __obj.updateDynamic("bindingDeltas")(bindingDeltas.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PolicyDelta]
  }
}

