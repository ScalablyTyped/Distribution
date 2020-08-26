package typings.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpeningHours extends js.Object {
  /** is a boolean value indicating if the place is open at the current time. */
  var open_now: Boolean = js.native
  /** is an array of opening periods covering seven days, starting from Sunday, in chronological order. */
  var periods: js.Array[OpeningPeriod] = js.native
  /**
    * is an array of seven strings representing the formatted opening hours for each day of the week.
    * If a `language` parameter was specified in the Place Details request, the Places Service will format
    * and localize the opening hours appropriately for that language. The ordering of the elements in this array
    * depends on the `language` parameter. Some languages start the week on Monday while others start on Sunday.
    */
  var weekday_text: js.Array[String] = js.native
}

object OpeningHours {
  @scala.inline
  def apply(open_now: Boolean, periods: js.Array[OpeningPeriod], weekday_text: js.Array[String]): OpeningHours = {
    val __obj = js.Dynamic.literal(open_now = open_now.asInstanceOf[js.Any], periods = periods.asInstanceOf[js.Any], weekday_text = weekday_text.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpeningHours]
  }
  @scala.inline
  implicit class OpeningHoursOps[Self <: OpeningHours] (val x: Self) extends AnyVal {
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
    def setOpen_now(value: Boolean): Self = this.set("open_now", value.asInstanceOf[js.Any])
    @scala.inline
    def setPeriodsVarargs(value: OpeningPeriod*): Self = this.set("periods", js.Array(value :_*))
    @scala.inline
    def setPeriods(value: js.Array[OpeningPeriod]): Self = this.set("periods", value.asInstanceOf[js.Any])
    @scala.inline
    def setWeekday_textVarargs(value: String*): Self = this.set("weekday_text", js.Array(value :_*))
    @scala.inline
    def setWeekday_text(value: js.Array[String]): Self = this.set("weekday_text", value.asInstanceOf[js.Any])
  }
  
}

