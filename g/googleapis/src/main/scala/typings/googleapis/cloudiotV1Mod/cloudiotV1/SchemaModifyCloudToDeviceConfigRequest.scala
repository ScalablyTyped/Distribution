package typings.googleapis.cloudiotV1Mod.cloudiotV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaModifyCloudToDeviceConfigRequest extends StObject {
  
  /**
    * Required. The configuration data for the device.
    */
  var binaryData: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The version number to update. If this value is zero, it will not check the version number of the server and will always update the current version; otherwise, this update will fail if the version number found on the server does not match this version number. This is used to support multiple simultaneous updates without losing data.
    */
  var versionToUpdate: js.UndefOr[String | Null] = js.undefined
}
object SchemaModifyCloudToDeviceConfigRequest {
  
  inline def apply(): SchemaModifyCloudToDeviceConfigRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaModifyCloudToDeviceConfigRequest]
  }
  
  extension [Self <: SchemaModifyCloudToDeviceConfigRequest](x: Self) {
    
    inline def setBinaryData(value: String): Self = StObject.set(x, "binaryData", value.asInstanceOf[js.Any])
    
    inline def setBinaryDataNull: Self = StObject.set(x, "binaryData", null)
    
    inline def setBinaryDataUndefined: Self = StObject.set(x, "binaryData", js.undefined)
    
    inline def setVersionToUpdate(value: String): Self = StObject.set(x, "versionToUpdate", value.asInstanceOf[js.Any])
    
    inline def setVersionToUpdateNull: Self = StObject.set(x, "versionToUpdate", null)
    
    inline def setVersionToUpdateUndefined: Self = StObject.set(x, "versionToUpdate", js.undefined)
  }
}
