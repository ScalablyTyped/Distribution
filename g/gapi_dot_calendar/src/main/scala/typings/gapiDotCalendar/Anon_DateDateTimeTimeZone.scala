package typings.gapiDotCalendar

import typings.gapiDotCalendar.gapi.client.calendar.date
import typings.gapiDotCalendar.gapi.client.calendar.datetime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DateDateTimeTimeZone extends js.Object {
  var date: typings.gapiDotCalendar.gapi.client.calendar.date
  var dateTime: datetime
  var timeZone: js.UndefOr[String] = js.undefined
}

object Anon_DateDateTimeTimeZone {
  @scala.inline
  def apply(date: date, dateTime: datetime, timeZone: String = null): Anon_DateDateTimeTimeZone = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], dateTime = dateTime.asInstanceOf[js.Any])
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DateDateTimeTimeZone]
  }
}

