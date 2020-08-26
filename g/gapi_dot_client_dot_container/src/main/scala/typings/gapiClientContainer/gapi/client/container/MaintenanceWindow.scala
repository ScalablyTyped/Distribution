package typings.gapiClientContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaintenanceWindow extends js.Object {
  /** DailyMaintenanceWindow specifies a daily maintenance operation window. */
  var dailyMaintenanceWindow: js.UndefOr[DailyMaintenanceWindow] = js.native
}

object MaintenanceWindow {
  @scala.inline
  def apply(): MaintenanceWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaintenanceWindow]
  }
  @scala.inline
  implicit class MaintenanceWindowOps[Self <: MaintenanceWindow] (val x: Self) extends AnyVal {
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
    def setDailyMaintenanceWindow(value: DailyMaintenanceWindow): Self = this.set("dailyMaintenanceWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDailyMaintenanceWindow: Self = this.set("dailyMaintenanceWindow", js.undefined)
  }
  
}

