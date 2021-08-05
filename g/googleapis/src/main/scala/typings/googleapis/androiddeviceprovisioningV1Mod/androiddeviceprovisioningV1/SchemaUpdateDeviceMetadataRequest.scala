package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request to set metadata for a device.
  */
trait SchemaUpdateDeviceMetadataRequest extends StObject {
  
  /**
    * Required. The metdata to attach to the device.
    */
  var deviceMetadata: js.UndefOr[SchemaDeviceMetadata] = js.undefined
}
object SchemaUpdateDeviceMetadataRequest {
  
  inline def apply(): SchemaUpdateDeviceMetadataRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateDeviceMetadataRequest]
  }
  
  extension [Self <: SchemaUpdateDeviceMetadataRequest](x: Self) {
    
    inline def setDeviceMetadata(value: SchemaDeviceMetadata): Self = StObject.set(x, "deviceMetadata", value.asInstanceOf[js.Any])
    
    inline def setDeviceMetadataUndefined: Self = StObject.set(x, "deviceMetadata", js.undefined)
  }
}
