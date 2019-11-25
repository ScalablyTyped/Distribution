package typings.gapiDotCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// The type of notification. Possible values are:
/* Rewritten from type alias, can be one of: 
  - typings.gapiDotCalendar.gapiDotCalendarStrings.eventCreation
  - typings.gapiDotCalendar.gapiDotCalendarStrings.eventChange
  - typings.gapiDotCalendar.gapiDotCalendarStrings.eventCancellation
  - typings.gapiDotCalendar.gapiDotCalendarStrings.eventResponse
  - typings.gapiDotCalendar.gapiDotCalendarStrings.agenda
*/
trait NotificationType extends js.Object

object NotificationType {
  @scala.inline
  def agenda: typings.gapiDotCalendar.gapiDotCalendarStrings.agenda = this.cast("agenda")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def eventCancellation: typings.gapiDotCalendar.gapiDotCalendarStrings.eventCancellation = this.cast("eventCancellation")
  @scala.inline
  def eventChange: typings.gapiDotCalendar.gapiDotCalendarStrings.eventChange = this.cast("eventChange")
  @scala.inline
  def eventCreation: typings.gapiDotCalendar.gapiDotCalendarStrings.eventCreation = this.cast("eventCreation")
  @scala.inline
  def eventResponse: typings.gapiDotCalendar.gapiDotCalendarStrings.eventResponse = this.cast("eventResponse")
}

