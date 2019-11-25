package typings.gapiDotClientDotAdexchangebuyer.gapi.client.adexchangebuyer

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
    endHour: Int | Double = null,
    endMinute: Int | Double = null,
    startHour: Int | Double = null,
    startMinute: Int | Double = null
  ): TargetingValueDayPartTargetingDayPart = {
    val __obj = js.Dynamic.literal()
    if (dayOfWeek != null) __obj.updateDynamic("dayOfWeek")(dayOfWeek.asInstanceOf[js.Any])
    if (endHour != null) __obj.updateDynamic("endHour")(endHour.asInstanceOf[js.Any])
    if (endMinute != null) __obj.updateDynamic("endMinute")(endMinute.asInstanceOf[js.Any])
    if (startHour != null) __obj.updateDynamic("startHour")(startHour.asInstanceOf[js.Any])
    if (startMinute != null) __obj.updateDynamic("startMinute")(startMinute.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetingValueDayPartTargetingDayPart]
  }
}

