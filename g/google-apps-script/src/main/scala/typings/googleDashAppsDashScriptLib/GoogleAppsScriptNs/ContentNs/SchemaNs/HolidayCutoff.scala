package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HolidayCutoff extends js.Object {
  var deadlineDate: js.UndefOr[java.lang.String] = js.undefined
  var deadlineHour: js.UndefOr[scala.Double] = js.undefined
  var deadlineTimezone: js.UndefOr[java.lang.String] = js.undefined
  var holidayId: js.UndefOr[java.lang.String] = js.undefined
  var visibleFromDate: js.UndefOr[java.lang.String] = js.undefined
}

object HolidayCutoff {
  @scala.inline
  def apply(
    deadlineDate: java.lang.String = null,
    deadlineHour: scala.Int | scala.Double = null,
    deadlineTimezone: java.lang.String = null,
    holidayId: java.lang.String = null,
    visibleFromDate: java.lang.String = null
  ): HolidayCutoff = {
    val __obj = js.Dynamic.literal()
    if (deadlineDate != null) __obj.updateDynamic("deadlineDate")(deadlineDate)
    if (deadlineHour != null) __obj.updateDynamic("deadlineHour")(deadlineHour.asInstanceOf[js.Any])
    if (deadlineTimezone != null) __obj.updateDynamic("deadlineTimezone")(deadlineTimezone)
    if (holidayId != null) __obj.updateDynamic("holidayId")(holidayId)
    if (visibleFromDate != null) __obj.updateDynamic("visibleFromDate")(visibleFromDate)
    __obj.asInstanceOf[HolidayCutoff]
  }
}

