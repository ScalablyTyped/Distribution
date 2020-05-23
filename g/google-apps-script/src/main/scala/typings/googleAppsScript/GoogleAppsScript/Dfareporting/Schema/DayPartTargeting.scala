package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DayPartTargeting extends js.Object {
  var daysOfWeek: js.UndefOr[js.Array[String]] = js.undefined
  var hoursOfDay: js.UndefOr[js.Array[Double]] = js.undefined
  var userLocalTime: js.UndefOr[Boolean] = js.undefined
}

object DayPartTargeting {
  @scala.inline
  def apply(
    daysOfWeek: js.Array[String] = null,
    hoursOfDay: js.Array[Double] = null,
    userLocalTime: js.UndefOr[Boolean] = js.undefined
  ): DayPartTargeting = {
    val __obj = js.Dynamic.literal()
    if (daysOfWeek != null) __obj.updateDynamic("daysOfWeek")(daysOfWeek.asInstanceOf[js.Any])
    if (hoursOfDay != null) __obj.updateDynamic("hoursOfDay")(hoursOfDay.asInstanceOf[js.Any])
    if (!js.isUndefined(userLocalTime)) __obj.updateDynamic("userLocalTime")(userLocalTime.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DayPartTargeting]
  }
}

