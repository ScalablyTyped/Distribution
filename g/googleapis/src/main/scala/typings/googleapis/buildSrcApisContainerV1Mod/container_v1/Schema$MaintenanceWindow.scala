package typings.googleapis.buildSrcApisContainerV1Mod.container_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * MaintenanceWindow defines the maintenance window to be used for the
  * cluster.
  */
@js.native
trait Schema$MaintenanceWindow extends js.Object {
  /**
    * DailyMaintenanceWindow specifies a daily maintenance operation window.
    */
  var dailyMaintenanceWindow: js.UndefOr[Schema$DailyMaintenanceWindow] = js.native
}

object Schema$MaintenanceWindow {
  @scala.inline
  def apply(dailyMaintenanceWindow: Schema$DailyMaintenanceWindow = null): Schema$MaintenanceWindow = {
    val __obj = js.Dynamic.literal()
    if (dailyMaintenanceWindow != null) __obj.updateDynamic("dailyMaintenanceWindow")(dailyMaintenanceWindow.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$MaintenanceWindow]
  }
}

