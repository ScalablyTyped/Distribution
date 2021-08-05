package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration for managing system updates
  */
trait SchemaSystemUpdate extends StObject {
  
  /**
    * If the type is WINDOWED, the end of the maintenance window, measured as
    * the number of minutes after midnight in device&#39;s local time. This
    * value must be between 0 and 1439, inclusive. If this value is less than
    * start_minutes, then the maintenance window spans midnight. If the
    * maintenance window specified is smaller than 30 minutes, the actual
    * window is extended to 30 minutes beyond the start time.
    */
  var endMinutes: js.UndefOr[Double] = js.undefined
  
  /**
    * If the type is WINDOWED, the start of the maintenance window, measured as
    * the number of minutes after midnight in the device&#39;s local time. This
    * value must be between 0 and 1439, inclusive.
    */
  var startMinutes: js.UndefOr[Double] = js.undefined
  
  /**
    * The type of system update to configure.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaSystemUpdate {
  
  inline def apply(): SchemaSystemUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSystemUpdate]
  }
  
  extension [Self <: SchemaSystemUpdate](x: Self) {
    
    inline def setEndMinutes(value: Double): Self = StObject.set(x, "endMinutes", value.asInstanceOf[js.Any])
    
    inline def setEndMinutesUndefined: Self = StObject.set(x, "endMinutes", js.undefined)
    
    inline def setStartMinutes(value: Double): Self = StObject.set(x, "startMinutes", value.asInstanceOf[js.Any])
    
    inline def setStartMinutesUndefined: Self = StObject.set(x, "startMinutes", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
