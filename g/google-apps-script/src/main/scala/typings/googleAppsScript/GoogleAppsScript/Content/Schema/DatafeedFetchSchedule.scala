package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatafeedFetchSchedule extends js.Object {
  var dayOfMonth: js.UndefOr[Double] = js.undefined
  var fetchUrl: js.UndefOr[String] = js.undefined
  var hour: js.UndefOr[Double] = js.undefined
  var minuteOfHour: js.UndefOr[Double] = js.undefined
  var password: js.UndefOr[String] = js.undefined
  var paused: js.UndefOr[Boolean] = js.undefined
  var timeZone: js.UndefOr[String] = js.undefined
  var username: js.UndefOr[String] = js.undefined
  var weekday: js.UndefOr[String] = js.undefined
}

object DatafeedFetchSchedule {
  @scala.inline
  def apply(
    dayOfMonth: js.UndefOr[Double] = js.undefined,
    fetchUrl: String = null,
    hour: js.UndefOr[Double] = js.undefined,
    minuteOfHour: js.UndefOr[Double] = js.undefined,
    password: String = null,
    paused: js.UndefOr[Boolean] = js.undefined,
    timeZone: String = null,
    username: String = null,
    weekday: String = null
  ): DatafeedFetchSchedule = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dayOfMonth)) __obj.updateDynamic("dayOfMonth")(dayOfMonth.get.asInstanceOf[js.Any])
    if (fetchUrl != null) __obj.updateDynamic("fetchUrl")(fetchUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(hour)) __obj.updateDynamic("hour")(hour.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minuteOfHour)) __obj.updateDynamic("minuteOfHour")(minuteOfHour.get.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (!js.isUndefined(paused)) __obj.updateDynamic("paused")(paused.get.asInstanceOf[js.Any])
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    if (weekday != null) __obj.updateDynamic("weekday")(weekday.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatafeedFetchSchedule]
  }
}

