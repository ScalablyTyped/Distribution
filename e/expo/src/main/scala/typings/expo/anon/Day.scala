package typings.expo.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Day extends js.Object {
  var day: js.UndefOr[Double] = js.undefined
  var hour: js.UndefOr[Double] = js.undefined
  var minute: js.UndefOr[Double] = js.undefined
  var month: js.UndefOr[Double] = js.undefined
  var repeat: js.UndefOr[Boolean] = js.undefined
  var second: js.UndefOr[Double] = js.undefined
  var weekDay: js.UndefOr[Double] = js.undefined
  var year: js.UndefOr[Double] = js.undefined
}

object Day {
  @scala.inline
  def apply(
    day: js.UndefOr[Double] = js.undefined,
    hour: js.UndefOr[Double] = js.undefined,
    minute: js.UndefOr[Double] = js.undefined,
    month: js.UndefOr[Double] = js.undefined,
    repeat: js.UndefOr[Boolean] = js.undefined,
    second: js.UndefOr[Double] = js.undefined,
    weekDay: js.UndefOr[Double] = js.undefined,
    year: js.UndefOr[Double] = js.undefined
  ): Day = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(day)) __obj.updateDynamic("day")(day.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hour)) __obj.updateDynamic("hour")(hour.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minute)) __obj.updateDynamic("minute")(minute.get.asInstanceOf[js.Any])
    if (!js.isUndefined(month)) __obj.updateDynamic("month")(month.get.asInstanceOf[js.Any])
    if (!js.isUndefined(repeat)) __obj.updateDynamic("repeat")(repeat.get.asInstanceOf[js.Any])
    if (!js.isUndefined(second)) __obj.updateDynamic("second")(second.get.asInstanceOf[js.Any])
    if (!js.isUndefined(weekDay)) __obj.updateDynamic("weekDay")(weekDay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(year)) __obj.updateDynamic("year")(year.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Day]
  }
}

