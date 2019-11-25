package typings.gapiDotCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Whether the event blocks time on the calendar. Optional. Possible values are:
/* Rewritten from type alias, can be one of: 
  - typings.gapiDotCalendar.gapiDotCalendarStrings.opaque
  - typings.gapiDotCalendar.gapiDotCalendarStrings.transparent
*/
trait EventTransparency extends js.Object

object EventTransparency {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def opaque: typings.gapiDotCalendar.gapiDotCalendarStrings.opaque = this.cast("opaque")
  @scala.inline
  def transparent: typings.gapiDotCalendar.gapiDotCalendarStrings.transparent = this.cast("transparent")
}

