package typings.gapiCalendar

import typings.gapiCalendar.gapi.client.calendar.date
import typings.gapiCalendar.gapi.client.calendar.datetime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDateTime extends js.Object {
  var date: typings.gapiCalendar.gapi.client.calendar.date
  var dateTime: datetime
  var timeZone: String
}

object AnonDateTime {
  @scala.inline
  def apply(date: date, dateTime: datetime, timeZone: String): AnonDateTime = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], dateTime = dateTime.asInstanceOf[js.Any], timeZone = timeZone.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDateTime]
  }
}

