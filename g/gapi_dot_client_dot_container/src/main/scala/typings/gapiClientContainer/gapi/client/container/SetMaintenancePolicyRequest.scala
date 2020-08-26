package typings.gapiClientContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetMaintenancePolicyRequest extends js.Object {
  /**
    * The maintenance policy to be set for the cluster. An empty field
    * clears the existing maintenance policy.
    */
  var maintenancePolicy: js.UndefOr[MaintenancePolicy] = js.native
}

object SetMaintenancePolicyRequest {
  @scala.inline
  def apply(): SetMaintenancePolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetMaintenancePolicyRequest]
  }
  @scala.inline
  implicit class SetMaintenancePolicyRequestOps[Self <: SetMaintenancePolicyRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMaintenancePolicy(value: MaintenancePolicy): Self = this.set("maintenancePolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaintenancePolicy: Self = this.set("maintenancePolicy", js.undefined)
  }
  
}

