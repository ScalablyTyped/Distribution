package typings
package gapiDotClientDotAdexchangebuyerLib.gapiNs.clientNs.adexchangebuyerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetingValueDayPartTargeting extends js.Object {
  var dayParts: js.UndefOr[js.Array[TargetingValueDayPartTargetingDayPart]] = js.undefined
  var timeZoneType: js.UndefOr[java.lang.String] = js.undefined
}

object TargetingValueDayPartTargeting {
  @scala.inline
  def apply(
    dayParts: js.Array[TargetingValueDayPartTargetingDayPart] = null,
    timeZoneType: java.lang.String = null
  ): TargetingValueDayPartTargeting = {
    val __obj = js.Dynamic.literal()
    if (dayParts != null) __obj.updateDynamic("dayParts")(dayParts)
    if (timeZoneType != null) __obj.updateDynamic("timeZoneType")(timeZoneType)
    __obj.asInstanceOf[TargetingValueDayPartTargeting]
  }
}

