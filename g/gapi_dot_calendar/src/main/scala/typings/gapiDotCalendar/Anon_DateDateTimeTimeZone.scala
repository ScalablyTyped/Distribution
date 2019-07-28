package typings.gapiDotCalendar

import typings.gapiDotCalendar.gapiNs.clientNs.calendarNs.date
import typings.gapiDotCalendar.gapiNs.clientNs.calendarNs.datetime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DateDateTimeTimeZone extends js.Object {
  var date: typings.gapiDotCalendar.gapiNs.clientNs.calendarNs.date
  var dateTime: datetime
  var timeZone: js.UndefOr[String] = js.undefined
}

object Anon_DateDateTimeTimeZone {
  @scala.inline
  def apply(date: date, dateTime: datetime, timeZone: String = null): Anon_DateDateTimeTimeZone = {
    val __obj = js.Dynamic.literal(date = date, dateTime = dateTime)
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone)
    __obj.asInstanceOf[Anon_DateDateTimeTimeZone]
  }
}

