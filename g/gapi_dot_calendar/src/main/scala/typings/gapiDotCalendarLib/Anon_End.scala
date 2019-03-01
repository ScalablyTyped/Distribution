package typings
package gapiDotCalendarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_End extends js.Object {
  var end: gapiDotCalendarLib.gapiNs.clientNs.calendarNs.datetime
  var start: gapiDotCalendarLib.gapiNs.clientNs.calendarNs.datetime
}

object Anon_End {
  @scala.inline
  def apply(
    end: gapiDotCalendarLib.gapiNs.clientNs.calendarNs.datetime,
    start: gapiDotCalendarLib.gapiNs.clientNs.calendarNs.datetime
  ): Anon_End = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[Anon_End]
  }
}

