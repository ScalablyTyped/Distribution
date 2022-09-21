package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNodeGroupMaintenanceWindow extends StObject {
  
  /**
    * [Output only] A predetermined duration for the window, automatically chosen to be the smallest possible in the given scenario.
    */
  var duration: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output only] A predetermined duration for the window, automatically chosen to be the smallest possible in the given scenario.
    */
  var maintenanceDuration: js.UndefOr[SchemaDuration] = js.undefined
  
  /**
    * Start time of the window. This must be in UTC format that resolves to one of 00:00, 04:00, 08:00, 12:00, 16:00, or 20:00. For example, both 13:00-5 and 08:00 are valid.
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaNodeGroupMaintenanceWindow {
  
  inline def apply(): SchemaNodeGroupMaintenanceWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNodeGroupMaintenanceWindow]
  }
  
  extension [Self <: SchemaNodeGroupMaintenanceWindow](x: Self) {
    
    inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationNull: Self = StObject.set(x, "duration", null)
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setMaintenanceDuration(value: SchemaDuration): Self = StObject.set(x, "maintenanceDuration", value.asInstanceOf[js.Any])
    
    inline def setMaintenanceDurationUndefined: Self = StObject.set(x, "maintenanceDuration", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
