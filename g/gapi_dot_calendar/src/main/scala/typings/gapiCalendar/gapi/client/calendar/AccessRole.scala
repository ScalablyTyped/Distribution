package typings.gapiCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// The user's access role for this calendar. Read-only. Possible values are:
/* Rewritten from type alias, can be one of: 
  - typings.gapiCalendar.gapiCalendarStrings.none
  - typings.gapiCalendar.gapiCalendarStrings.freeBusyReader
  - typings.gapiCalendar.gapiCalendarStrings.reader
  - typings.gapiCalendar.gapiCalendarStrings.writer
  - typings.gapiCalendar.gapiCalendarStrings.owner
*/
trait AccessRole extends js.Object

object AccessRole {
  @scala.inline
  def freeBusyReader: typings.gapiCalendar.gapiCalendarStrings.freeBusyReader = "freeBusyReader".asInstanceOf[typings.gapiCalendar.gapiCalendarStrings.freeBusyReader]
  @scala.inline
  def none: typings.gapiCalendar.gapiCalendarStrings.none = "none".asInstanceOf[typings.gapiCalendar.gapiCalendarStrings.none]
  @scala.inline
  def owner: typings.gapiCalendar.gapiCalendarStrings.owner = "owner".asInstanceOf[typings.gapiCalendar.gapiCalendarStrings.owner]
  @scala.inline
  def reader: typings.gapiCalendar.gapiCalendarStrings.reader = "reader".asInstanceOf[typings.gapiCalendar.gapiCalendarStrings.reader]
  @scala.inline
  def writer: typings.gapiCalendar.gapiCalendarStrings.writer = "writer".asInstanceOf[typings.gapiCalendar.gapiCalendarStrings.writer]
}

