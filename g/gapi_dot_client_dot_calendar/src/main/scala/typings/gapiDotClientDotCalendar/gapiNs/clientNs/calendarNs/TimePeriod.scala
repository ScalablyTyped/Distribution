package typings.gapiDotClientDotCalendar.gapiNs.clientNs.calendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimePeriod extends js.Object {
  /** The (exclusive) end of the time period. */
  var end: js.UndefOr[String] = js.undefined
  /** The (inclusive) start of the time period. */
  var start: js.UndefOr[String] = js.undefined
}

object TimePeriod {
  @scala.inline
  def apply(end: String = null, start: String = null): TimePeriod = {
    val __obj = js.Dynamic.literal()
    if (end != null) __obj.updateDynamic("end")(end)
    if (start != null) __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[TimePeriod]
  }
}

