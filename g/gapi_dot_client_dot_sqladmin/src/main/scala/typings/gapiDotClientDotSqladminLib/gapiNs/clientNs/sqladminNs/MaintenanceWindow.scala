package typings
package gapiDotClientDotSqladminLib.gapiNs.clientNs.sqladminNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaintenanceWindow extends js.Object {
  /** day of week (1-7), starting on Monday. */
  var day: js.UndefOr[scala.Double] = js.undefined
  /** hour of day - 0 to 23. */
  var hour: js.UndefOr[scala.Double] = js.undefined
  /** This is always sql#maintenanceWindow. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var updateTrack: js.UndefOr[java.lang.String] = js.undefined
}

object MaintenanceWindow {
  @scala.inline
  def apply(
    day: scala.Int | scala.Double = null,
    hour: scala.Int | scala.Double = null,
    kind: java.lang.String = null,
    updateTrack: java.lang.String = null
  ): MaintenanceWindow = {
    val __obj = js.Dynamic.literal()
    if (day != null) __obj.updateDynamic("day")(day.asInstanceOf[js.Any])
    if (hour != null) __obj.updateDynamic("hour")(hour.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (updateTrack != null) __obj.updateDynamic("updateTrack")(updateTrack)
    __obj.asInstanceOf[MaintenanceWindow]
  }
}

