package typings.googleapis.buildSrcApisAdexchangebuyer2V2beta1Mod.adexchangebuyer2_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies the day part targeting criteria.
  */
@js.native
trait Schema$DayPartTargeting extends js.Object {
  /**
    * A list of day part targeting criterion.
    */
  var dayParts: js.UndefOr[js.Array[Schema$DayPart]] = js.native
  /**
    * The timezone to use for interpreting the day part targeting.
    */
  var timeZoneType: js.UndefOr[String] = js.native
}

object Schema$DayPartTargeting {
  @scala.inline
  def apply(dayParts: js.Array[Schema$DayPart] = null, timeZoneType: String = null): Schema$DayPartTargeting = {
    val __obj = js.Dynamic.literal()
    if (dayParts != null) __obj.updateDynamic("dayParts")(dayParts.asInstanceOf[js.Any])
    if (timeZoneType != null) __obj.updateDynamic("timeZoneType")(timeZoneType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DayPartTargeting]
  }
}

