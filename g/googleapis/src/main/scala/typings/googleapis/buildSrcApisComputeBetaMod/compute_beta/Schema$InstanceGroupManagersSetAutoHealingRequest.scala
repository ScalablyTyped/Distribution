package typings.googleapis.buildSrcApisComputeBetaMod.compute_beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$InstanceGroupManagersSetAutoHealingRequest extends js.Object {
  var autoHealingPolicies: js.UndefOr[js.Array[Schema$InstanceGroupManagerAutoHealingPolicy]] = js.native
}

object Schema$InstanceGroupManagersSetAutoHealingRequest {
  @scala.inline
  def apply(autoHealingPolicies: js.Array[Schema$InstanceGroupManagerAutoHealingPolicy] = null): Schema$InstanceGroupManagersSetAutoHealingRequest = {
    val __obj = js.Dynamic.literal()
    if (autoHealingPolicies != null) __obj.updateDynamic("autoHealingPolicies")(autoHealingPolicies.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$InstanceGroupManagersSetAutoHealingRequest]
  }
}

