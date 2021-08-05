package typings.gapiCalendar.gapi.client.calendar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait SyncToken extends StObject
object SyncToken {
  
  inline def iCalUID: typings.gapiCalendar.gapiCalendarStrings.iCalUID = "iCalUID".asInstanceOf[typings.gapiCalendar.gapiCalendarStrings.iCalUID]
  
  inline def orderBy: typings.gapiCalendar.gapiCalendarStrings.orderBy = "orderBy".asInstanceOf[typings.gapiCalendar.gapiCalendarStrings.orderBy]
  
  inline def privateExtendedProperty: typings.gapiCalendar.gapiCalendarStrings.privateExtendedProperty = "privateExtendedProperty".asInstanceOf[typings.gapiCalendar.gapiCalendarStrings.privateExtendedProperty]
  
  inline def q: typings.gapiCalendar.gapiCalendarStrings.q = "q".asInstanceOf[typings.gapiCalendar.gapiCalendarStrings.q]
  
  inline def sharedExtendedProperty: typings.gapiCalendar.gapiCalendarStrings.sharedExtendedProperty = "sharedExtendedProperty".asInstanceOf[typings.gapiCalendar.gapiCalendarStrings.sharedExtendedProperty]
  
  inline def timeMax: typings.gapiCalendar.gapiCalendarStrings.timeMax = "timeMax".asInstanceOf[typings.gapiCalendar.gapiCalendarStrings.timeMax]
  
  inline def timeMin: typings.gapiCalendar.gapiCalendarStrings.timeMin = "timeMin".asInstanceOf[typings.gapiCalendar.gapiCalendarStrings.timeMin]
  
  inline def updatedMin: typings.gapiCalendar.gapiCalendarStrings.updatedMin = "updatedMin".asInstanceOf[typings.gapiCalendar.gapiCalendarStrings.updatedMin]
}
