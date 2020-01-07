package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A maintenance window for VMs. When set, we restrict our maintenance
  * operations to this window.
  */
@js.native
trait Schema$ResourcePolicyVmMaintenancePolicyMaintenanceWindow extends js.Object {
  var dailyMaintenanceWindow: js.UndefOr[Schema$ResourcePolicyDailyCycle] = js.native
}

object Schema$ResourcePolicyVmMaintenancePolicyMaintenanceWindow {
  @scala.inline
  def apply(dailyMaintenanceWindow: Schema$ResourcePolicyDailyCycle = null): Schema$ResourcePolicyVmMaintenancePolicyMaintenanceWindow = {
    val __obj = js.Dynamic.literal()
    if (dailyMaintenanceWindow != null) __obj.updateDynamic("dailyMaintenanceWindow")(dailyMaintenanceWindow.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ResourcePolicyVmMaintenancePolicyMaintenanceWindow]
  }
}

