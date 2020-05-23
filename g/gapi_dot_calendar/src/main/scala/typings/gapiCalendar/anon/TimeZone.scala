package typings.gapiCalendar.anon

import typings.gapiCalendar.gapi.client.calendar.date
import typings.gapiCalendar.gapi.client.calendar.datetime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeZone extends js.Object {
  var date: typings.gapiCalendar.gapi.client.calendar.date
  var dateTime: datetime
  var timeZone: js.UndefOr[String] = js.undefined
}

object TimeZone {
  @scala.inline
  def apply(date: date, dateTime: datetime, timeZone: String = null): TimeZone = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], dateTime = dateTime.asInstanceOf[js.Any])
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeZone]
  }
}

