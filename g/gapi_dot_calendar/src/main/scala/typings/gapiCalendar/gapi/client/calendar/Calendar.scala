package typings.gapiCalendar.gapi.client.calendar

import typings.gapiCalendar.gapiCalendarStrings.calendarNumbersigncalendar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Calendar extends StObject {
  
  var description: js.UndefOr[String] = js.undefined
  
  var etag: typings.gapiCalendar.gapi.client.calendar.etag
  
  var id: String
  
  var kind: calendarNumbersigncalendar
  
  var location: js.UndefOr[String] = js.undefined
  
  var summary: String
  
  var timeZone: js.UndefOr[String] = js.undefined
}
object Calendar {
  
  inline def apply(etag: etag, id: String, summary: String): Calendar = {
    val __obj = js.Dynamic.literal(etag = etag.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = "calendar#calendar", summary = summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[Calendar]
  }
  
  extension [Self <: Calendar](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEtag(value: etag): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setKind(value: calendarNumbersigncalendar): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
  }
}
