package typings.googleapis.calendarV3Mod.calendarV3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFreeBusyResponse extends StObject {
  
  /**
    * List of free/busy information for calendars.
    */
  var calendars: js.UndefOr[StringDictionary[SchemaFreeBusyCalendar] | Null] = js.undefined
  
  /**
    * Expansion of groups.
    */
  var groups: js.UndefOr[StringDictionary[SchemaFreeBusyGroup] | Null] = js.undefined
  
  /**
    * Type of the resource ("calendar#freeBusy").
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The end of the interval.
    */
  var timeMax: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The start of the interval.
    */
  var timeMin: js.UndefOr[String | Null] = js.undefined
}
object SchemaFreeBusyResponse {
  
  inline def apply(): SchemaFreeBusyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFreeBusyResponse]
  }
  
  extension [Self <: SchemaFreeBusyResponse](x: Self) {
    
    inline def setCalendars(value: StringDictionary[SchemaFreeBusyCalendar]): Self = StObject.set(x, "calendars", value.asInstanceOf[js.Any])
    
    inline def setCalendarsNull: Self = StObject.set(x, "calendars", null)
    
    inline def setCalendarsUndefined: Self = StObject.set(x, "calendars", js.undefined)
    
    inline def setGroups(value: StringDictionary[SchemaFreeBusyGroup]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsNull: Self = StObject.set(x, "groups", null)
    
    inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setTimeMax(value: String): Self = StObject.set(x, "timeMax", value.asInstanceOf[js.Any])
    
    inline def setTimeMaxNull: Self = StObject.set(x, "timeMax", null)
    
    inline def setTimeMaxUndefined: Self = StObject.set(x, "timeMax", js.undefined)
    
    inline def setTimeMin(value: String): Self = StObject.set(x, "timeMin", value.asInstanceOf[js.Any])
    
    inline def setTimeMinNull: Self = StObject.set(x, "timeMin", null)
    
    inline def setTimeMinUndefined: Self = StObject.set(x, "timeMin", js.undefined)
  }
}
