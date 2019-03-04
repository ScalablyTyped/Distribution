package typings
package gapiDotCalendarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DateDateTimeTimeZone extends js.Object {
  var date: gapiDotCalendarLib.gapiNs.clientNs.calendarNs.date
  var dateTime: gapiDotCalendarLib.gapiNs.clientNs.calendarNs.datetime
  var timeZone: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_DateDateTimeTimeZone {
  @scala.inline
  def apply(
    date: gapiDotCalendarLib.gapiNs.clientNs.calendarNs.date,
    dateTime: gapiDotCalendarLib.gapiNs.clientNs.calendarNs.datetime,
    timeZone: java.lang.String = null
  ): Anon_DateDateTimeTimeZone = {
    val __obj = js.Dynamic.literal(date = date, dateTime = dateTime)
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone)
    __obj.asInstanceOf[Anon_DateDateTimeTimeZone]
  }
}

