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
  def agenda: typings.gapiCalendar.gapiCalendarStrings.agenda = "agenda".asInstanceOf[typings.gapiCalendar.gapiCalendarStrings.agenda]
  @scala.inline
  def eventCancellation: typings.gapiCalendar.gapiCalendarStrings.eventCancellation = "eventCancellation".asInstanceOf[typings.gapiCalendar.gapiCalendarStrings.eventCancellation]
  @scala.inline
  def eventChange: typings.gapiCalendar.gapiCalendarStrings.eventChange = "eventChange".asInstanceOf[typings.gapiCalendar.gapiCalendarStrings.eventChange]
  @scala.inline
  def eventCreation: typings.gapiCalendar.gapiCalendarStrings.eventCreation = "eventCreation".asInstanceOf[typings.gapiCalendar.gapiCalendarStrings.eventCreation]
  @scala.inline
  def eventResponse: typings.gapiCalendar.gapiCalendarStrings.eventResponse = "eventResponse".asInstanceOf[typings.gapiCalendar.gapiCalendarStrings.eventResponse]
}

