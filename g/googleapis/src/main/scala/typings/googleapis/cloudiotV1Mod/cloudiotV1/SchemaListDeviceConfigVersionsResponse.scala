package typings.googleapis.cloudiotV1Mod.cloudiotV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response for `ListDeviceConfigVersions`.
  */
trait SchemaListDeviceConfigVersionsResponse extends StObject {
  
  /**
    * The device configuration for the last few versions. Versions are listed
    * in decreasing order, starting from the most recent one.
    */
  var deviceConfigs: js.UndefOr[js.Array[SchemaDeviceConfig]] = js.undefined
}
object SchemaListDeviceConfigVersionsResponse {
  
  inline def apply(): SchemaListDeviceConfigVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListDeviceConfigVersionsResponse]
  }
  
  extension [Self <: SchemaListDeviceConfigVersionsResponse](x: Self) {
    
    inline def setDeviceConfigs(value: js.Array[SchemaDeviceConfig]): Self = StObject.set(x, "deviceConfigs", value.asInstanceOf[js.Any])
    
    inline def setDeviceConfigsUndefined: Self = StObject.set(x, "deviceConfigs", js.undefined)
    
    inline def setDeviceConfigsVarargs(value: SchemaDeviceConfig*): Self = StObject.set(x, "deviceConfigs", js.Array(value :_*))
  }
}
