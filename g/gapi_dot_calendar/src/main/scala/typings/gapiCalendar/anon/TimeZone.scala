package typings.gapiCalendar.anon

import typings.gapiCalendar.gapi.client.calendar.date
import typings.gapiCalendar.gapi.client.calendar.datetime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeZone extends js.Object {
  var date: typings.gapiCalendar.gapi.client.calendar.date = js.native
  var dateTime: datetime = js.native
  var timeZone: js.UndefOr[String] = js.native
}

object TimeZone {
  @scala.inline
  def apply(date: date, dateTime: datetime): TimeZone = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], dateTime = dateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeZone]
  }
  @scala.inline
  implicit class TimeZoneOps[Self <: TimeZone] (val x: Self) extends AnyVal {
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
    def setDate(value: date): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def setDateTime(value: datetime): Self = this.set("dateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeZone(value: String): Self = this.set("timeZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeZone: Self = this.set("timeZone", js.undefined)
  }
  
}

