package typings.gapiDotCalendar.gapiNs.clientNs.calendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Token obtained from the nextSyncToken field returned on the last page of results from the previous list request.
// It makes the result of this list request contain only entries that have changed since then.
// All events deleted since the previous list request will always be in the result set and it is not allowed to set showDeleted to False.
// There are several query parameters that cannot be specified together with nextSyncToken to ensure consistency of the client state.
// These are:
/* Rewritten from type alias, can be one of: 
  - typings.gapiDotCalendar.gapiDotCalendarStrings.iCalUID
  - typings.gapiDotCalendar.gapiDotCalendarStrings.orderBy
  - typings.gapiDotCalendar.gapiDotCalendarStrings.privateExtendedProperty
  - typings.gapiDotCalendar.gapiDotCalendarStrings.q
  - typings.gapiDotCalendar.gapiDotCalendarStrings.sharedExtendedProperty
  - typings.gapiDotCalendar.gapiDotCalendarStrings.timeMin
  - typings.gapiDotCalendar.gapiDotCalendarStrings.timeMax
  - typings.gapiDotCalendar.gapiDotCalendarStrings.updatedMin
*/
trait SyncToken extends js.Object

