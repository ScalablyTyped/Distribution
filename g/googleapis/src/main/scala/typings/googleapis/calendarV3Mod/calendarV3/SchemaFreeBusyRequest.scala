package typings.googleapis.calendarV3Mod.calendarV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFreeBusyRequest extends StObject {
  
  /**
    * Maximal number of calendars for which FreeBusy information is to be provided. Optional. Maximum value is 50.
    */
  var calendarExpansionMax: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Maximal number of calendar identifiers to be provided for a single group. Optional. An error is returned for a group with more members than this value. Maximum value is 100.
    */
  var groupExpansionMax: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * List of calendars and/or groups to query.
    */
  var items: js.UndefOr[js.Array[SchemaFreeBusyRequestItem]] = js.undefined
  
  /**
    * The end of the interval for the query formatted as per RFC3339.
    */
  var timeMax: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The start of the interval for the query formatted as per RFC3339.
    */
  var timeMin: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Time zone used in the response. Optional. The default is UTC.
    */
  var timeZone: js.UndefOr[String | Null] = js.undefined
}
object SchemaFreeBusyRequest {
  
  inline def apply(): SchemaFreeBusyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFreeBusyRequest]
  }
  
  extension [Self <: SchemaFreeBusyRequest](x: Self) {
    
    inline def setCalendarExpansionMax(value: Double): Self = StObject.set(x, "calendarExpansionMax", value.asInstanceOf[js.Any])
    
    inline def setCalendarExpansionMaxNull: Self = StObject.set(x, "calendarExpansionMax", null)
    
    inline def setCalendarExpansionMaxUndefined: Self = StObject.set(x, "calendarExpansionMax", js.undefined)
    
    inline def setGroupExpansionMax(value: Double): Self = StObject.set(x, "groupExpansionMax", value.asInstanceOf[js.Any])
    
    inline def setGroupExpansionMaxNull: Self = StObject.set(x, "groupExpansionMax", null)
    
    inline def setGroupExpansionMaxUndefined: Self = StObject.set(x, "groupExpansionMax", js.undefined)
    
    inline def setItems(value: js.Array[SchemaFreeBusyRequestItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SchemaFreeBusyRequestItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setTimeMax(value: String): Self = StObject.set(x, "timeMax", value.asInstanceOf[js.Any])
    
    inline def setTimeMaxNull: Self = StObject.set(x, "timeMax", null)
    
    inline def setTimeMaxUndefined: Self = StObject.set(x, "timeMax", js.undefined)
    
    inline def setTimeMin(value: String): Self = StObject.set(x, "timeMin", value.asInstanceOf[js.Any])
    
    inline def setTimeMinNull: Self = StObject.set(x, "timeMin", null)
    
    inline def setTimeMinUndefined: Self = StObject.set(x, "timeMin", js.undefined)
    
    inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneNull: Self = StObject.set(x, "timeZone", null)
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
  }
}
