package typings.expo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDay extends js.Object {
  var day: js.UndefOr[Double] = js.undefined
  var hour: js.UndefOr[Double] = js.undefined
  var minute: js.UndefOr[Double] = js.undefined
  var month: js.UndefOr[Double] = js.undefined
  var repeat: js.UndefOr[Boolean] = js.undefined
  var second: js.UndefOr[Double] = js.undefined
  var weekDay: js.UndefOr[Double] = js.undefined
  var year: js.UndefOr[Double] = js.undefined
}

object AnonDay {
  @scala.inline
  def apply(
    day: Int | Double = null,
    hour: Int | Double = null,
    minute: Int | Double = null,
    month: Int | Double = null,
    repeat: js.UndefOr[Boolean] = js.undefined,
    second: Int | Double = null,
    weekDay: Int | Double = null,
    year: Int | Double = null
  ): AnonDay = {
    val __obj = js.Dynamic.literal()
    if (day != null) __obj.updateDynamic("day")(day.asInstanceOf[js.Any])
    if (hour != null) __obj.updateDynamic("hour")(hour.asInstanceOf[js.Any])
    if (minute != null) __obj.updateDynamic("minute")(minute.asInstanceOf[js.Any])
    if (month != null) __obj.updateDynamic("month")(month.asInstanceOf[js.Any])
    if (!js.isUndefined(repeat)) __obj.updateDynamic("repeat")(repeat.asInstanceOf[js.Any])
    if (second != null) __obj.updateDynamic("second")(second.asInstanceOf[js.Any])
    if (weekDay != null) __obj.updateDynamic("weekDay")(weekDay.asInstanceOf[js.Any])
    if (year != null) __obj.updateDynamic("year")(year.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDay]
  }
}

