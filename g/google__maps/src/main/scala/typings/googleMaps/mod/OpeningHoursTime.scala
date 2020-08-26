package typings.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpeningHoursTime extends js.Object {
  /** a number from 0–6, corresponding to the days of the week, starting on Sunday. For example, 2 means Tuesday. */
  var day: Double = js.native
  /**
    *  may contain a time of day in 24-hour hhmm format. Values are in the range 0000–2359. The `time`
    * will be reported in the place's time zone.
    */
  var time: js.UndefOr[String] = js.native
}

object OpeningHoursTime {
  @scala.inline
  def apply(day: Double): OpeningHoursTime = {
    val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpeningHoursTime]
  }
  @scala.inline
  implicit class OpeningHoursTimeOps[Self <: OpeningHoursTime] (val x: Self) extends AnyVal {
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
    def setDay(value: Double): Self = this.set("day", value.asInstanceOf[js.Any])
    @scala.inline
    def setTime(value: String): Self = this.set("time", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
  }
  
}

