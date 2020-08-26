package typings.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
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
  var daysOfWeek: js.UndefOr[js.Array[String]] = js.native
  /**
    * Hours of the day when the ad will serve, where 0 is midnight to 1 AM and 23 is 11 PM to midnight. Can be specified with days of week, in which case the
    * ad would serve during these hours on the specified days. For example if Monday, Wednesday, Friday are the days of week specified and 9-10am, 3-5pm
    * (hours 9, 15, and 16) is specified, the ad would serve Monday, Wednesdays, and Fridays at 9-10am and 3-5pm. Acceptable values are 0 to 23, inclusive.
    */
  var hoursOfDay: js.UndefOr[js.Array[Double]] = js.native
  /** Whether or not to use the user's local time. If false, the America/New York time zone applies. */
  var userLocalTime: js.UndefOr[Boolean] = js.native
}

object DayPartTargeting {
  @scala.inline
  def apply(): DayPartTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DayPartTargeting]
  }
  @scala.inline
  implicit class DayPartTargetingOps[Self <: DayPartTargeting] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDaysOfWeekVarargs(value: String*): Self = this.set("daysOfWeek", js.Array(value :_*))
    @scala.inline
    def setDaysOfWeek(value: js.Array[String]): Self = this.set("daysOfWeek", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDaysOfWeek: Self = this.set("daysOfWeek", js.undefined)
    @scala.inline
    def setHoursOfDayVarargs(value: Double*): Self = this.set("hoursOfDay", js.Array(value :_*))
    @scala.inline
    def setHoursOfDay(value: js.Array[Double]): Self = this.set("hoursOfDay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoursOfDay: Self = this.set("hoursOfDay", js.undefined)
    @scala.inline
    def setUserLocalTime(value: Boolean): Self = this.set("userLocalTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserLocalTime: Self = this.set("userLocalTime", js.undefined)
  }
  
}

