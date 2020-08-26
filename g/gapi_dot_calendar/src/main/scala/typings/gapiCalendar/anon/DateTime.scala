package typings.gapiCalendar.anon

import typings.gapiCalendar.gapi.client.calendar.date
import typings.gapiCalendar.gapi.client.calendar.datetime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateTime extends js.Object {
  var date: typings.gapiCalendar.gapi.client.calendar.date = js.native
  var dateTime: datetime = js.native
  var timeZone: String = js.native
}

object DateTime {
  @scala.inline
  def apply(date: date, dateTime: datetime, timeZone: String): DateTime = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], dateTime = dateTime.asInstanceOf[js.Any], timeZone = timeZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateTime]
  }
  @scala.inline
  implicit class DateTimeOps[Self <: DateTime] (val x: Self) extends AnyVal {
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
  }
  
}

