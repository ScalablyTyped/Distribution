package typings.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetingValueDayPartTargetingDayPart extends js.Object {
  var dayOfWeek: js.UndefOr[String] = js.undefined
  var endHour: js.UndefOr[Double] = js.undefined
  var endMinute: js.UndefOr[Double] = js.undefined
  var startHour: js.UndefOr[Double] = js.undefined
  var startMinute: js.UndefOr[Double] = js.undefined
}

object TargetingValueDayPartTargetingDayPart {
  @scala.inline
  def apply(
    dayOfWeek: String = null,
    endHour: js.UndefOr[Double] = js.undefined,
    endMinute: js.UndefOr[Double] = js.undefined,
    startHour: js.UndefOr[Double] = js.undefined,
    startMinute: js.UndefOr[Double] = js.undefined
  ): TargetingValueDayPartTargetingDayPart = {
    val __obj = js.Dynamic.literal()
    if (dayOfWeek != null) __obj.updateDynamic("dayOfWeek")(dayOfWeek.asInstanceOf[js.Any])
    if (!js.isUndefined(endHour)) __obj.updateDynamic("endHour")(endHour.get.asInstanceOf[js.Any])
    if (!js.isUndefined(endMinute)) __obj.updateDynamic("endMinute")(endMinute.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startHour)) __obj.updateDynamic("startHour")(startHour.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startMinute)) __obj.updateDynamic("startMinute")(startMinute.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetingValueDayPartTargetingDayPart]
  }
}

