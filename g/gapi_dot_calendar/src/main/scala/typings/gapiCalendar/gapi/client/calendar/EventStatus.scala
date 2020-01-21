package typings.gapiCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Status of the event. Optional. Possible values are:
/* Rewritten from type alias, can be one of: 
  - typings.gapiCalendar.gapiCalendarStrings.confirmed
  - typings.gapiCalendar.gapiCalendarStrings.tentative
  - typings.gapiCalendar.gapiCalendarStrings.cancelled
*/
trait EventStatus extends js.Object

object EventStatus {
  @scala.inline
  def cancelled: typings.gapiCalendar.gapiCalendarStrings.cancelled = this.cast("cancelled")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def confirmed: typings.gapiCalendar.gapiCalendarStrings.confirmed = this.cast("confirmed")
  @scala.inline
  def tentative: typings.gapiCalendar.gapiCalendarStrings.tentative = this.cast("tentative")
}

