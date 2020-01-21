package typings.gapiCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Token obtained from the nextSyncToken field returned on the last page of results from the previous list request.
// It makes the result of this list request contain only entries that have changed since then.
// All events deleted since the previous list request will always be in the result set and it is not allowed to set showDeleted to False.
// There are several query parameters that cannot be specified together with nextSyncToken to ensure consistency of the client state.
// These are:
/* Rewritten from type alias, can be one of: 
  - typings.gapiCalendar.gapiCalendarStrings.iCalUID
  - typings.gapiCalendar.gapiCalendarStrings.orderBy
  - typings.gapiCalendar.gapiCalendarStrings.privateExtendedProperty
  - typings.gapiCalendar.gapiCalendarStrings.q
  - typings.gapiCalendar.gapiCalendarStrings.sharedExtendedProperty
  - typings.gapiCalendar.gapiCalendarStrings.timeMin
  - typings.gapiCalendar.gapiCalendarStrings.timeMax
  - typings.gapiCalendar.gapiCalendarStrings.updatedMin
*/
trait SyncToken extends js.Object

object SyncToken {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def iCalUID: typings.gapiCalendar.gapiCalendarStrings.iCalUID = this.cast("iCalUID")
  @scala.inline
  def orderBy: typings.gapiCalendar.gapiCalendarStrings.orderBy = this.cast("orderBy")
  @scala.inline
  def privateExtendedProperty: typings.gapiCalendar.gapiCalendarStrings.privateExtendedProperty = this.cast("privateExtendedProperty")
  @scala.inline
  def q: typings.gapiCalendar.gapiCalendarStrings.q = this.cast("q")
  @scala.inline
  def sharedExtendedProperty: typings.gapiCalendar.gapiCalendarStrings.sharedExtendedProperty = this.cast("sharedExtendedProperty")
  @scala.inline
  def timeMax: typings.gapiCalendar.gapiCalendarStrings.timeMax = this.cast("timeMax")
  @scala.inline
  def timeMin: typings.gapiCalendar.gapiCalendarStrings.timeMin = this.cast("timeMin")
  @scala.inline
  def updatedMin: typings.gapiCalendar.gapiCalendarStrings.updatedMin = this.cast("updatedMin")
}

