package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaInstanceGroupManagersSetAutoHealingRequest extends js.Object {
  var autoHealingPolicies: js.UndefOr[js.Array[SchemaInstanceGroupManagerAutoHealingPolicy]] = js.native
}

object SchemaInstanceGroupManagersSetAutoHealingRequest {
  @scala.inline
  def apply(autoHealingPolicies: js.Array[SchemaInstanceGroupManagerAutoHealingPolicy] = null): SchemaInstanceGroupManagersSetAutoHealingRequest = {
    val __obj = js.Dynamic.literal()
    if (autoHealingPolicies != null) __obj.updateDynamic("autoHealingPolicies")(autoHealingPolicies.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInstanceGroupManagersSetAutoHealingRequest]
  }
}

