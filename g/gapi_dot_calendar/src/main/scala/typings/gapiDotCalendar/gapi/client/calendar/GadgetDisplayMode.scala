package typings.gapiDotCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// The gadget's display mode. Optional. Possible values are:
/* Rewritten from type alias, can be one of: 
  - typings.gapiDotCalendar.gapiDotCalendarStrings.icon
  - typings.gapiDotCalendar.gapiDotCalendarStrings.chip
*/
trait GadgetDisplayMode extends js.Object

object GadgetDisplayMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def chip: typings.gapiDotCalendar.gapiDotCalendarStrings.chip = this.cast("chip")
  @scala.inline
  def icon: typings.gapiDotCalendar.gapiDotCalendarStrings.icon = this.cast("icon")
}

