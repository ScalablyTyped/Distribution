package typings.formatjsIntlUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@formatjs/intl-utils.@formatjs/intl-utils/dist/diff.Thresholds> */
trait PartialThresholds extends js.Object {
  var day: js.UndefOr[Double] = js.undefined
  var hour: js.UndefOr[Double] = js.undefined
  var minute: js.UndefOr[Double] = js.undefined
  var second: js.UndefOr[Double] = js.undefined
}

object PartialThresholds {
  @scala.inline
  def apply(
    day: Int | Double = null,
    hour: Int | Double = null,
    minute: Int | Double = null,
    second: Int | Double = null
  ): PartialThresholds = {
    val __obj = js.Dynamic.literal()
    if (day != null) __obj.updateDynamic("day")(day.asInstanceOf[js.Any])
    if (hour != null) __obj.updateDynamic("hour")(hour.asInstanceOf[js.Any])
    if (minute != null) __obj.updateDynamic("minute")(minute.asInstanceOf[js.Any])
    if (second != null) __obj.updateDynamic("second")(second.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialThresholds]
  }
}

