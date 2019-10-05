package typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema

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
    if (daysOfWeek != null) __obj.updateDynamic("daysOfWeek")(daysOfWeek)
    if (hoursOfDay != null) __obj.updateDynamic("hoursOfDay")(hoursOfDay)
    if (!js.isUndefined(userLocalTime)) __obj.updateDynamic("userLocalTime")(userLocalTime)
    __obj.asInstanceOf[DayPartTargeting]
  }
}

