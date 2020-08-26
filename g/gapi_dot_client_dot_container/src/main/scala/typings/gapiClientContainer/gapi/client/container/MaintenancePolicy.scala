package typings.gapiClientContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaintenancePolicy extends js.Object {
  /** Specifies the maintenance window in which maintenance may be performed. */
  var window: js.UndefOr[MaintenanceWindow] = js.native
}

object MaintenancePolicy {
  @scala.inline
  def apply(): MaintenancePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaintenancePolicy]
  }
  @scala.inline
  implicit class MaintenancePolicyOps[Self <: MaintenancePolicy] (val x: Self) extends AnyVal {
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
    def setWindow(value: MaintenanceWindow): Self = this.set("window", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindow: Self = this.set("window", js.undefined)
  }
  
}

