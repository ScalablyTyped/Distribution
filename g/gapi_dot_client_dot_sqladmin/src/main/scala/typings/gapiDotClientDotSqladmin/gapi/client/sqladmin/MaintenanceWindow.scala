package typings.gapiDotClientDotSqladmin.gapi.client.sqladmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaintenanceWindow extends js.Object {
  /** day of week (1-7), starting on Monday. */
  var day: js.UndefOr[Double] = js.undefined
  /** hour of day - 0 to 23. */
  var hour: js.UndefOr[Double] = js.undefined
  /** This is always sql#maintenanceWindow. */
  var kind: js.UndefOr[String] = js.undefined
  var updateTrack: js.UndefOr[String] = js.undefined
}

object MaintenanceWindow {
  @scala.inline
  def apply(
    day: Int | Double = null,
    hour: Int | Double = null,
    kind: String = null,
    updateTrack: String = null
  ): MaintenanceWindow = {
    val __obj = js.Dynamic.literal()
    if (day != null) __obj.updateDynamic("day")(day.asInstanceOf[js.Any])
    if (hour != null) __obj.updateDynamic("hour")(hour.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (updateTrack != null) __obj.updateDynamic("updateTrack")(updateTrack.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaintenanceWindow]
  }
}

