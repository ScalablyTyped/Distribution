package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$RegionInstanceGroupManagersSetAutoHealingRequest extends js.Object {
  var autoHealingPolicies: js.UndefOr[js.Array[Schema$InstanceGroupManagerAutoHealingPolicy]] = js.native
}

object Schema$RegionInstanceGroupManagersSetAutoHealingRequest {
  @scala.inline
  def apply(autoHealingPolicies: js.Array[Schema$InstanceGroupManagerAutoHealingPolicy] = null): Schema$RegionInstanceGroupManagersSetAutoHealingRequest = {
    val __obj = js.Dynamic.literal()
    if (autoHealingPolicies != null) __obj.updateDynamic("autoHealingPolicies")(autoHealingPolicies.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RegionInstanceGroupManagersSetAutoHealingRequest]
  }
}

