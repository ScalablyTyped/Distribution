package typings
package gapiDotCalendarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Method extends js.Object {
  var method: gapiDotCalendarLib.gapiNs.clientNs.calendarNs.ReminderMethod
  var minutes: gapiDotCalendarLib.gapiNs.clientNs.calendarNs.integer
}

object Anon_Method {
  @scala.inline
  def apply(
    method: gapiDotCalendarLib.gapiNs.clientNs.calendarNs.ReminderMethod,
    minutes: gapiDotCalendarLib.gapiNs.clientNs.calendarNs.integer
  ): Anon_Method = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("method")(method)
    __obj.updateDynamic("minutes")(minutes)
    __obj.asInstanceOf[Anon_Method]
  }
}

