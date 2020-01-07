package typings.googleapis.buildSrcApisAdexchangebuyer2V2beta1Mod.adexchangebuyer2_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Daypart targeting message that specifies if the ad can be shown only during
  * certain parts of a day/week.
  */
@js.native
trait Schema$DayPart extends js.Object {
  /**
    * The day of the week to target. If unspecified, applicable to all days.
    */
  var dayOfWeek: js.UndefOr[String] = js.native
  /**
    * The ending time of the day for the ad to show (minute level granularity).
    * The end time is exclusive. This field is not available for filtering in
    * PQL queries.
    */
  var endTime: js.UndefOr[Schema$TimeOfDay] = js.native
  /**
    * The starting time of day for the ad to show (minute level granularity).
    * The start time is inclusive. This field is not available for filtering in
    * PQL queries.
    */
  var startTime: js.UndefOr[Schema$TimeOfDay] = js.native
}

object Schema$DayPart {
  @scala.inline
  def apply(dayOfWeek: String = null, endTime: Schema$TimeOfDay = null, startTime: Schema$TimeOfDay = null): Schema$DayPart = {
    val __obj = js.Dynamic.literal()
    if (dayOfWeek != null) __obj.updateDynamic("dayOfWeek")(dayOfWeek.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DayPart]
  }
}

