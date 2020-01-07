package typings.googleapis.buildSrcApisAdexchangebuyerV1Dot4Mod.adexchangebuyer_v1_4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$TargetingValueDayPartTargeting extends js.Object {
  var dayParts: js.UndefOr[js.Array[Schema$TargetingValueDayPartTargetingDayPart]] = js.native
  var timeZoneType: js.UndefOr[String] = js.native
}

object Schema$TargetingValueDayPartTargeting {
  @scala.inline
  def apply(
    dayParts: js.Array[Schema$TargetingValueDayPartTargetingDayPart] = null,
    timeZoneType: String = null
  ): Schema$TargetingValueDayPartTargeting = {
    val __obj = js.Dynamic.literal()
    if (dayParts != null) __obj.updateDynamic("dayParts")(dayParts.asInstanceOf[js.Any])
    if (timeZoneType != null) __obj.updateDynamic("timeZoneType")(timeZoneType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TargetingValueDayPartTargeting]
  }
}

