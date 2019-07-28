package typings.gapiDotCalendar

import typings.gapiDotCalendar.gapiNs.clientNs.calendarNs.date
import typings.gapiDotCalendar.gapiNs.clientNs.calendarNs.datetime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DateDateTime extends js.Object {
  var date: typings.gapiDotCalendar.gapiNs.clientNs.calendarNs.date
  var dateTime: datetime
  var timeZone: String
}

object Anon_DateDateTime {
  @scala.inline
  def apply(date: date, dateTime: datetime, timeZone: String): Anon_DateDateTime = {
    val __obj = js.Dynamic.literal(date = date, dateTime = dateTime, timeZone = timeZone)
  
    __obj.asInstanceOf[Anon_DateDateTime]
  }
}

