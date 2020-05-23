package typings.formatjsIntlUtils.anon

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
    day: js.UndefOr[Double] = js.undefined,
    hour: js.UndefOr[Double] = js.undefined,
    minute: js.UndefOr[Double] = js.undefined,
    second: js.UndefOr[Double] = js.undefined
  ): PartialThresholds = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(day)) __obj.updateDynamic("day")(day.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hour)) __obj.updateDynamic("hour")(hour.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minute)) __obj.updateDynamic("minute")(minute.get.asInstanceOf[js.Any])
    if (!js.isUndefined(second)) __obj.updateDynamic("second")(second.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialThresholds]
  }
}

