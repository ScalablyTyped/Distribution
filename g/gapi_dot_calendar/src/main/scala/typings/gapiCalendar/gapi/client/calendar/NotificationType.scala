package typings.gapiCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// The type of notification. Possible values are:
/* Rewritten from type alias, can be one of: 
  - typings.gapiCalendar.gapiCalendarStrings.eventCreation
  - typings.gapiCalendar.gapiCalendarStrings.eventChange
  - typings.gapiCalendar.gapiCalendarStrings.eventCancellation
  - typings.gapiCalendar.gapiCalendarStrings.eventResponse
  - typings.gapiCalendar.gapiCalendarStrings.agenda
*/
trait NotificationType extends js.Object

object NotificationType {
  @scala.inline
  def agenda: typings.gapiCalendar.gapiCalendarStrings.agenda = this.cast("agenda")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def eventCancellation: typings.gapiCalendar.gapiCalendarStrings.eventCancellation = this.cast("eventCancellation")
  @scala.inline
  def eventChange: typings.gapiCalendar.gapiCalendarStrings.eventChange = this.cast("eventChange")
  @scala.inline
  def eventCreation: typings.gapiCalendar.gapiCalendarStrings.eventCreation = this.cast("eventCreation")
  @scala.inline
  def eventResponse: typings.gapiCalendar.gapiCalendarStrings.eventResponse = this.cast("eventResponse")
}

