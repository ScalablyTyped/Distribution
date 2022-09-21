package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUpcomingMaintenance extends StObject {
  
  /**
    * Indicates if the maintenance can be customer triggered. From more detail, see go/sf-ctm-design.
    */
  var canReschedule: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * [Output Only] The date when the maintenance will take place. This value is in RFC3339 text format. DEPRECATED: Use start_time_window instead.
    */
  var date: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] The start time window of the maintenance disruption.
    */
  var startTimeWindow: js.UndefOr[SchemaUpcomingMaintenanceTimeWindow] = js.undefined
  
  /**
    * [Output Only] The time when the maintenance will take place. This value is in RFC3339 text format. DEPRECATED: Use start_time_window instead.
    */
  var time: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Defines the type of maintenance.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaUpcomingMaintenance {
  
  inline def apply(): SchemaUpcomingMaintenance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpcomingMaintenance]
  }
  
  extension [Self <: SchemaUpcomingMaintenance](x: Self) {
    
    inline def setCanReschedule(value: Boolean): Self = StObject.set(x, "canReschedule", value.asInstanceOf[js.Any])
    
    inline def setCanRescheduleNull: Self = StObject.set(x, "canReschedule", null)
    
    inline def setCanRescheduleUndefined: Self = StObject.set(x, "canReschedule", js.undefined)
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateNull: Self = StObject.set(x, "date", null)
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setStartTimeWindow(value: SchemaUpcomingMaintenanceTimeWindow): Self = StObject.set(x, "startTimeWindow", value.asInstanceOf[js.Any])
    
    inline def setStartTimeWindowUndefined: Self = StObject.set(x, "startTimeWindow", js.undefined)
    
    inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeNull: Self = StObject.set(x, "time", null)
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
