package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaResourcePolicyVmMaintenancePolicy extends js.Object {
  /**
    * Maintenance windows that are applied to VMs covered by this policy.
    */
  var maintenanceWindow: js.UndefOr[SchemaResourcePolicyVmMaintenancePolicyMaintenanceWindow] = js.native
}

object SchemaResourcePolicyVmMaintenancePolicy {
  @scala.inline
  def apply(maintenanceWindow: SchemaResourcePolicyVmMaintenancePolicyMaintenanceWindow = null): SchemaResourcePolicyVmMaintenancePolicy = {
    val __obj = js.Dynamic.literal()
    if (maintenanceWindow != null) __obj.updateDynamic("maintenanceWindow")(maintenanceWindow.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaResourcePolicyVmMaintenancePolicy]
  }
}

