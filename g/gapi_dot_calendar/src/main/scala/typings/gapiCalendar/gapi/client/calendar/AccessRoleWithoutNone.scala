package typings.gapiCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.gapiCalendar.gapiCalendarStrings.freeBusyReader
  - typings.gapiCalendar.gapiCalendarStrings.reader
  - typings.gapiCalendar.gapiCalendarStrings.writer
  - typings.gapiCalendar.gapiCalendarStrings.owner
*/
trait AccessRoleWithoutNone extends js.Object

object AccessRoleWithoutNone {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def freeBusyReader: typings.gapiCalendar.gapiCalendarStrings.freeBusyReader = this.cast("freeBusyReader")
  @scala.inline
  def owner: typings.gapiCalendar.gapiCalendarStrings.owner = this.cast("owner")
  @scala.inline
  def reader: typings.gapiCalendar.gapiCalendarStrings.reader = this.cast("reader")
  @scala.inline
  def writer: typings.gapiCalendar.gapiCalendarStrings.writer = this.cast("writer")
}

