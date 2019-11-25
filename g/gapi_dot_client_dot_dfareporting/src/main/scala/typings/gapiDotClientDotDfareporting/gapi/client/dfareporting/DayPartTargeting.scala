package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DayPartTargeting extends js.Object {
  /**
    * Days of the week when the ad will serve.
    *
    * Acceptable values are:
    * - "SUNDAY"
    * - "MONDAY"
    * - "TUESDAY"
    * - "WEDNESDAY"
    * - "THURSDAY"
    * - "FRIDAY"
    * - "SATURDAY"
    */
  var daysOfWeek: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Hours of the day when the ad will serve, where 0 is midnight to 1 AM and 23 is 11 PM to midnight. Can be specified with days of week, in which case the
    * ad would serve during these hours on the specified days. For example if Monday, Wednesday, Friday are the days of week specified and 9-10am, 3-5pm
    * (hours 9, 15, and 16) is specified, the ad would serve Monday, Wednesdays, and Fridays at 9-10am and 3-5pm. Acceptable values are 0 to 23, inclusive.
    */
  var hoursOfDay: js.UndefOr[js.Array[Double]] = js.undefined
  /** Whether or not to use the user's local time. If false, the America/New York time zone applies. */
  var userLocalTime: js.UndefOr[Boolean] = js.undefined
}

object DayPartTargeting {
  @scala.inline
  def apply(
    daysOfWeek: js.Array[String] = null,
    hoursOfDay: js.Array[Double] = null,
    userLocalTime: js.UndefOr[Boolean] = js.undefined
  ): DayPartTargeting = {
    val __obj = js.Dynamic.literal()
    if (daysOfWeek != null) __obj.updateDynamic("daysOfWeek")(daysOfWeek.asInstanceOf[js.Any])
    if (hoursOfDay != null) __obj.updateDynamic("hoursOfDay")(hoursOfDay.asInstanceOf[js.Any])
    if (!js.isUndefined(userLocalTime)) __obj.updateDynamic("userLocalTime")(userLocalTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DayPartTargeting]
  }
}

