package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Maintenance window for managed Google Play Accounts. This allows Play store
  * to update the apps on the foreground in the designated window.
  */
@js.native
trait SchemaMaintenanceWindow extends js.Object {
  /**
    * Duration of the maintenance window, in milliseconds. The duration must be
    * between 30 minutes and 24 hours (inclusive).
    */
  var durationMs: js.UndefOr[String] = js.native
  /**
    * Start time of the maintenance window, in milliseconds after midnight on
    * the device. Windows can span midnight.
    */
  var startTimeAfterMidnightMs: js.UndefOr[String] = js.native
}

object SchemaMaintenanceWindow {
  @scala.inline
  def apply(durationMs: String = null, startTimeAfterMidnightMs: String = null): SchemaMaintenanceWindow = {
    val __obj = js.Dynamic.literal()
    if (durationMs != null) __obj.updateDynamic("durationMs")(durationMs.asInstanceOf[js.Any])
    if (startTimeAfterMidnightMs != null) __obj.updateDynamic("startTimeAfterMidnightMs")(startTimeAfterMidnightMs.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMaintenanceWindow]
  }
}

