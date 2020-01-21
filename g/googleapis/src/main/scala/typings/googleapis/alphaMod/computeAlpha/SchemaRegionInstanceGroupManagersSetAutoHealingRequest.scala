package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaRegionInstanceGroupManagersSetAutoHealingRequest extends js.Object {
  var autoHealingPolicies: js.UndefOr[js.Array[SchemaInstanceGroupManagerAutoHealingPolicy]] = js.native
}

object SchemaRegionInstanceGroupManagersSetAutoHealingRequest {
  @scala.inline
  def apply(autoHealingPolicies: js.Array[SchemaInstanceGroupManagerAutoHealingPolicy] = null): SchemaRegionInstanceGroupManagersSetAutoHealingRequest = {
    val __obj = js.Dynamic.literal()
    if (autoHealingPolicies != null) __obj.updateDynamic("autoHealingPolicies")(autoHealingPolicies.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRegionInstanceGroupManagersSetAutoHealingRequest]
  }
}

