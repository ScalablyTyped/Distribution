package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUsageLog extends StObject {
  
  /**
    * Specifies which log types are enabled. Note that users will receive on-device messaging when usage logging is enabled.
    */
  var enabledLogTypes: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Specifies which of the enabled log types can be uploaded over mobile data. By default logs are queued for upload when the device connects to WiFi.
    */
  var uploadOnCellularAllowed: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaUsageLog {
  
  inline def apply(): SchemaUsageLog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUsageLog]
  }
  
  extension [Self <: SchemaUsageLog](x: Self) {
    
    inline def setEnabledLogTypes(value: js.Array[String]): Self = StObject.set(x, "enabledLogTypes", value.asInstanceOf[js.Any])
    
    inline def setEnabledLogTypesNull: Self = StObject.set(x, "enabledLogTypes", null)
    
    inline def setEnabledLogTypesUndefined: Self = StObject.set(x, "enabledLogTypes", js.undefined)
    
    inline def setEnabledLogTypesVarargs(value: String*): Self = StObject.set(x, "enabledLogTypes", js.Array(value*))
    
    inline def setUploadOnCellularAllowed(value: js.Array[String]): Self = StObject.set(x, "uploadOnCellularAllowed", value.asInstanceOf[js.Any])
    
    inline def setUploadOnCellularAllowedNull: Self = StObject.set(x, "uploadOnCellularAllowed", null)
    
    inline def setUploadOnCellularAllowedUndefined: Self = StObject.set(x, "uploadOnCellularAllowed", js.undefined)
    
    inline def setUploadOnCellularAllowedVarargs(value: String*): Self = StObject.set(x, "uploadOnCellularAllowed", js.Array(value*))
  }
}
