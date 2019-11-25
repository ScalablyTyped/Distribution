package typings.gapiDotCalendar

import typings.gapiDotCalendar.gapi.client.calendar.date
import typings.gapiDotCalendar.gapi.client.calendar.datetime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DateDateTime extends js.Object {
  var date: typings.gapiDotCalendar.gapi.client.calendar.date
  var dateTime: datetime
  var timeZone: String
}

object Anon_DateDateTime {
  @scala.inline
  def apply(date: date, dateTime: datetime, timeZone: String): Anon_DateDateTime = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], dateTime = dateTime.asInstanceOf[js.Any], timeZone = timeZone.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DateDateTime]
  }
}

