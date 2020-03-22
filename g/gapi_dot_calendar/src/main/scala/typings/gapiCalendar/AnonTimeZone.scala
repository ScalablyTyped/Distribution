package typings.gapiCalendar

import typings.gapiCalendar.gapi.client.calendar.date
import typings.gapiCalendar.gapi.client.calendar.datetime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTimeZone extends js.Object {
  var date: typings.gapiCalendar.gapi.client.calendar.date
  var dateTime: datetime
  var timeZone: js.UndefOr[String] = js.undefined
}

object AnonTimeZone {
  @scala.inline
  def apply(date: date, dateTime: datetime, timeZone: String = null): AnonTimeZone = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], dateTime = dateTime.asInstanceOf[js.Any])
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTimeZone]
  }
}

