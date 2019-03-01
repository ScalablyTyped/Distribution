package typings
package gapiDotCalendarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DateDateTime extends js.Object {
  var date: gapiDotCalendarLib.gapiNs.clientNs.calendarNs.date
  var dateTime: gapiDotCalendarLib.gapiNs.clientNs.calendarNs.datetime
  var timeZone: java.lang.String
}

object Anon_DateDateTime {
  @scala.inline
  def apply(
    date: gapiDotCalendarLib.gapiNs.clientNs.calendarNs.date,
    dateTime: gapiDotCalendarLib.gapiNs.clientNs.calendarNs.datetime,
    timeZone: java.lang.String
  ): Anon_DateDateTime = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("date")(date)
    __obj.updateDynamic("dateTime")(dateTime)
    __obj.updateDynamic("timeZone")(timeZone)
    __obj.asInstanceOf[Anon_DateDateTime]
  }
}

