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
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def freeBusyReader: typings.gapiCalendar.gapiCalendarStrings.freeBusyReader = this.cast("freeBusyReader")
  @scala.inline
  def none: typings.gapiCalendar.gapiCalendarStrings.none = this.cast("none")
  @scala.inline
  def owner: typings.gapiCalendar.gapiCalendarStrings.owner = this.cast("owner")
  @scala.inline
  def reader: typings.gapiCalendar.gapiCalendarStrings.reader = this.cast("reader")
  @scala.inline
  def writer: typings.gapiCalendar.gapiCalendarStrings.writer = this.cast("writer")
}

