package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatafeedFetchSchedule extends js.Object {
  var dayOfMonth: js.UndefOr[scala.Double] = js.undefined
  var fetchUrl: js.UndefOr[java.lang.String] = js.undefined
  var hour: js.UndefOr[scala.Double] = js.undefined
  var minuteOfHour: js.UndefOr[scala.Double] = js.undefined
  var password: js.UndefOr[java.lang.String] = js.undefined
  var paused: js.UndefOr[scala.Boolean] = js.undefined
  var timeZone: js.UndefOr[java.lang.String] = js.undefined
  var username: js.UndefOr[java.lang.String] = js.undefined
  var weekday: js.UndefOr[java.lang.String] = js.undefined
}

object DatafeedFetchSchedule {
  @scala.inline
  def apply(
    dayOfMonth: scala.Int | scala.Double = null,
    fetchUrl: java.lang.String = null,
    hour: scala.Int | scala.Double = null,
    minuteOfHour: scala.Int | scala.Double = null,
    password: java.lang.String = null,
    paused: js.UndefOr[scala.Boolean] = js.undefined,
    timeZone: java.lang.String = null,
    username: java.lang.String = null,
    weekday: java.lang.String = null
  ): DatafeedFetchSchedule = {
    val __obj = js.Dynamic.literal()
    if (dayOfMonth != null) __obj.updateDynamic("dayOfMonth")(dayOfMonth.asInstanceOf[js.Any])
    if (fetchUrl != null) __obj.updateDynamic("fetchUrl")(fetchUrl)
    if (hour != null) __obj.updateDynamic("hour")(hour.asInstanceOf[js.Any])
    if (minuteOfHour != null) __obj.updateDynamic("minuteOfHour")(minuteOfHour.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password)
    if (!js.isUndefined(paused)) __obj.updateDynamic("paused")(paused)
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone)
    if (username != null) __obj.updateDynamic("username")(username)
    if (weekday != null) __obj.updateDynamic("weekday")(weekday)
    __obj.asInstanceOf[DatafeedFetchSchedule]
  }
}

