package typings.gapiClientContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetMaintenancePolicyRequest extends js.Object {
  /**
    * The maintenance policy to be set for the cluster. An empty field
    * clears the existing maintenance policy.
    */
  var maintenancePolicy: js.UndefOr[MaintenancePolicy] = js.undefined
}

object SetMaintenancePolicyRequest {
  @scala.inline
  def apply(maintenancePolicy: MaintenancePolicy = null): SetMaintenancePolicyRequest = {
    val __obj = js.Dynamic.literal()
    if (maintenancePolicy != null) __obj.updateDynamic("maintenancePolicy")(maintenancePolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetMaintenancePolicyRequest]
  }
}

