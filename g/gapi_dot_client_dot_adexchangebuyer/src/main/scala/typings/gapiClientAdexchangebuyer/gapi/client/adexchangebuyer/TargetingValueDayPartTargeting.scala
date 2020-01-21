package typings.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetingValueDayPartTargeting extends js.Object {
  var dayParts: js.UndefOr[js.Array[TargetingValueDayPartTargetingDayPart]] = js.undefined
  var timeZoneType: js.UndefOr[String] = js.undefined
}

object TargetingValueDayPartTargeting {
  @scala.inline
  def apply(dayParts: js.Array[TargetingValueDayPartTargetingDayPart] = null, timeZoneType: String = null): TargetingValueDayPartTargeting = {
    val __obj = js.Dynamic.literal()
    if (dayParts != null) __obj.updateDynamic("dayParts")(dayParts.asInstanceOf[js.Any])
    if (timeZoneType != null) __obj.updateDynamic("timeZoneType")(timeZoneType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetingValueDayPartTargeting]
  }
}

