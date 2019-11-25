package typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HolidayCutoff extends js.Object {
  var deadlineDate: js.UndefOr[String] = js.undefined
  var deadlineHour: js.UndefOr[Double] = js.undefined
  var deadlineTimezone: js.UndefOr[String] = js.undefined
  var holidayId: js.UndefOr[String] = js.undefined
  var visibleFromDate: js.UndefOr[String] = js.undefined
}

object HolidayCutoff {
  @scala.inline
  def apply(
    deadlineDate: String = null,
    deadlineHour: Int | Double = null,
    deadlineTimezone: String = null,
    holidayId: String = null,
    visibleFromDate: String = null
  ): HolidayCutoff = {
    val __obj = js.Dynamic.literal()
    if (deadlineDate != null) __obj.updateDynamic("deadlineDate")(deadlineDate.asInstanceOf[js.Any])
    if (deadlineHour != null) __obj.updateDynamic("deadlineHour")(deadlineHour.asInstanceOf[js.Any])
    if (deadlineTimezone != null) __obj.updateDynamic("deadlineTimezone")(deadlineTimezone.asInstanceOf[js.Any])
    if (holidayId != null) __obj.updateDynamic("holidayId")(holidayId.asInstanceOf[js.Any])
    if (visibleFromDate != null) __obj.updateDynamic("visibleFromDate")(visibleFromDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[HolidayCutoff]
  }
}

