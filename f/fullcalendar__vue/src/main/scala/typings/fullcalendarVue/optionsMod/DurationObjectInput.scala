package typings.fullcalendarVue.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DurationObjectInput extends js.Object {
  var day: js.UndefOr[Double] = js.undefined
  var days: js.UndefOr[Double] = js.undefined
  var hour: js.UndefOr[Double] = js.undefined
  var hours: js.UndefOr[Double] = js.undefined
  var millisecond: js.UndefOr[Double] = js.undefined
  var milliseconds: js.UndefOr[Double] = js.undefined
  var minute: js.UndefOr[Double] = js.undefined
  var minutes: js.UndefOr[Double] = js.undefined
  var month: js.UndefOr[Double] = js.undefined
  var months: js.UndefOr[Double] = js.undefined
  var ms: js.UndefOr[Double] = js.undefined
  var second: js.UndefOr[Double] = js.undefined
  var seconds: js.UndefOr[Double] = js.undefined
  var week: js.UndefOr[Double] = js.undefined
  var weeks: js.UndefOr[Double] = js.undefined
  var year: js.UndefOr[Double] = js.undefined
  var years: js.UndefOr[Double] = js.undefined
}

object DurationObjectInput {
  @scala.inline
  def apply(
    day: Int | Double = null,
    days: Int | Double = null,
    hour: Int | Double = null,
    hours: Int | Double = null,
    millisecond: Int | Double = null,
    milliseconds: Int | Double = null,
    minute: Int | Double = null,
    minutes: Int | Double = null,
    month: Int | Double = null,
    months: Int | Double = null,
    ms: Int | Double = null,
    second: Int | Double = null,
    seconds: Int | Double = null,
    week: Int | Double = null,
    weeks: Int | Double = null,
    year: Int | Double = null,
    years: Int | Double = null
  ): DurationObjectInput = {
    val __obj = js.Dynamic.literal()
    if (day != null) __obj.updateDynamic("day")(day.asInstanceOf[js.Any])
    if (days != null) __obj.updateDynamic("days")(days.asInstanceOf[js.Any])
    if (hour != null) __obj.updateDynamic("hour")(hour.asInstanceOf[js.Any])
    if (hours != null) __obj.updateDynamic("hours")(hours.asInstanceOf[js.Any])
    if (millisecond != null) __obj.updateDynamic("millisecond")(millisecond.asInstanceOf[js.Any])
    if (milliseconds != null) __obj.updateDynamic("milliseconds")(milliseconds.asInstanceOf[js.Any])
    if (minute != null) __obj.updateDynamic("minute")(minute.asInstanceOf[js.Any])
    if (minutes != null) __obj.updateDynamic("minutes")(minutes.asInstanceOf[js.Any])
    if (month != null) __obj.updateDynamic("month")(month.asInstanceOf[js.Any])
    if (months != null) __obj.updateDynamic("months")(months.asInstanceOf[js.Any])
    if (ms != null) __obj.updateDynamic("ms")(ms.asInstanceOf[js.Any])
    if (second != null) __obj.updateDynamic("second")(second.asInstanceOf[js.Any])
    if (seconds != null) __obj.updateDynamic("seconds")(seconds.asInstanceOf[js.Any])
    if (week != null) __obj.updateDynamic("week")(week.asInstanceOf[js.Any])
    if (weeks != null) __obj.updateDynamic("weeks")(weeks.asInstanceOf[js.Any])
    if (year != null) __obj.updateDynamic("year")(year.asInstanceOf[js.Any])
    if (years != null) __obj.updateDynamic("years")(years.asInstanceOf[js.Any])
    __obj.asInstanceOf[DurationObjectInput]
  }
}

