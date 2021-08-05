package typings.gapiCalendar.gapi.client.calendar

import typings.gapiCalendar.gapiCalendarStrings.calendarNumbersigncalendarList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalendarList_ extends StObject {
  
  var etag: typings.gapiCalendar.gapi.client.calendar.etag
  
  var items: js.Array[CalendarListEntry]
  
  var kind: calendarNumbersigncalendarList
  
  /**
    * Token used to access the next page of this result.
    * Omitted if no further results are available, in which case nextSyncToken is provided.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Token used at a later point in time to retrieve only the entries that have changed since this result was returned.
    * Omitted if further results are available, in which case nextPageToken is provided.
    */
  var nextSyncToken: js.UndefOr[String] = js.undefined
}
object CalendarList_ {
  
  inline def apply(etag: etag, items: js.Array[CalendarListEntry]): CalendarList_ = {
    val __obj = js.Dynamic.literal(etag = etag.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], kind = "calendar#calendarList")
    __obj.asInstanceOf[CalendarList_]
  }
  
  extension [Self <: CalendarList_](x: Self) {
    
    inline def setEtag(value: etag): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setItems(value: js.Array[CalendarListEntry]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: CalendarListEntry*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setKind(value: calendarNumbersigncalendarList): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setNextSyncToken(value: String): Self = StObject.set(x, "nextSyncToken", value.asInstanceOf[js.Any])
    
    inline def setNextSyncTokenUndefined: Self = StObject.set(x, "nextSyncToken", js.undefined)
  }
}
