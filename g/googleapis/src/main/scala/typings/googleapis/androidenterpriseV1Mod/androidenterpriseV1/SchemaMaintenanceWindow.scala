package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMaintenanceWindow extends StObject {
  
  /**
    * Duration of the maintenance window, in milliseconds. The duration must be between 30 minutes and 24 hours (inclusive).
    */
  var durationMs: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Start time of the maintenance window, in milliseconds after midnight on the device. Windows can span midnight.
    */
  var startTimeAfterMidnightMs: js.UndefOr[String | Null] = js.undefined
}
object SchemaMaintenanceWindow {
  
  inline def apply(): SchemaMaintenanceWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMaintenanceWindow]
  }
  
  extension [Self <: SchemaMaintenanceWindow](x: Self) {
    
    inline def setDurationMs(value: String): Self = StObject.set(x, "durationMs", value.asInstanceOf[js.Any])
    
    inline def setDurationMsNull: Self = StObject.set(x, "durationMs", null)
    
    inline def setDurationMsUndefined: Self = StObject.set(x, "durationMs", js.undefined)
    
    inline def setStartTimeAfterMidnightMs(value: String): Self = StObject.set(x, "startTimeAfterMidnightMs", value.asInstanceOf[js.Any])
    
    inline def setStartTimeAfterMidnightMsNull: Self = StObject.set(x, "startTimeAfterMidnightMs", null)
    
    inline def setStartTimeAfterMidnightMsUndefined: Self = StObject.set(x, "startTimeAfterMidnightMs", js.undefined)
  }
}
