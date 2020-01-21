package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A maintenance window for VMs. When set, we restrict our maintenance
  * operations to this window.
  */
@js.native
trait SchemaResourcePolicyVmMaintenancePolicyMaintenanceWindow extends js.Object {
  var dailyMaintenanceWindow: js.UndefOr[SchemaResourcePolicyDailyCycle] = js.native
}

object SchemaResourcePolicyVmMaintenancePolicyMaintenanceWindow {
  @scala.inline
  def apply(dailyMaintenanceWindow: SchemaResourcePolicyDailyCycle = null): SchemaResourcePolicyVmMaintenancePolicyMaintenanceWindow = {
    val __obj = js.Dynamic.literal()
    if (dailyMaintenanceWindow != null) __obj.updateDynamic("dailyMaintenanceWindow")(dailyMaintenanceWindow.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaResourcePolicyVmMaintenancePolicyMaintenanceWindow]
  }
}

