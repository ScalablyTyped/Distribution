package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ResourcePolicyVmMaintenancePolicy extends js.Object {
  /**
    * Maintenance windows that are applied to VMs covered by this policy.
    */
  var maintenanceWindow: js.UndefOr[Schema$ResourcePolicyVmMaintenancePolicyMaintenanceWindow] = js.native
}

object Schema$ResourcePolicyVmMaintenancePolicy {
  @scala.inline
  def apply(maintenanceWindow: Schema$ResourcePolicyVmMaintenancePolicyMaintenanceWindow = null): Schema$ResourcePolicyVmMaintenancePolicy = {
    val __obj = js.Dynamic.literal()
    if (maintenanceWindow != null) __obj.updateDynamic("maintenanceWindow")(maintenanceWindow.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ResourcePolicyVmMaintenancePolicy]
  }
}

