package typings
package gapiDotClientDotContainerLib.gapiNs.clientNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaintenanceWindow extends js.Object {
  /** DailyMaintenanceWindow specifies a daily maintenance operation window. */
  var dailyMaintenanceWindow: js.UndefOr[DailyMaintenanceWindow] = js.undefined
}

object MaintenanceWindow {
  @scala.inline
  def apply(dailyMaintenanceWindow: DailyMaintenanceWindow = null): MaintenanceWindow = {
    val __obj = js.Dynamic.literal()
    if (dailyMaintenanceWindow != null) __obj.updateDynamic("dailyMaintenanceWindow")(dailyMaintenanceWindow)
    __obj.asInstanceOf[MaintenanceWindow]
  }
}

