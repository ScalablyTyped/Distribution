package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUpdateMetadataArguments extends StObject {
  
  /**
    * Required. Device ID of the device.
    */
  var deviceId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Device identifier.
    */
  var deviceIdentifier: js.UndefOr[SchemaDeviceIdentifier] = js.undefined
  
  /**
    * Required. The metadata to update.
    */
  var deviceMetadata: js.UndefOr[SchemaDeviceMetadata] = js.undefined
}
object SchemaUpdateMetadataArguments {
  
  inline def apply(): SchemaUpdateMetadataArguments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateMetadataArguments]
  }
  
  extension [Self <: SchemaUpdateMetadataArguments](x: Self) {
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdNull: Self = StObject.set(x, "deviceId", null)
    
    inline def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    inline def setDeviceIdentifier(value: SchemaDeviceIdentifier): Self = StObject.set(x, "deviceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdentifierUndefined: Self = StObject.set(x, "deviceIdentifier", js.undefined)
    
    inline def setDeviceMetadata(value: SchemaDeviceMetadata): Self = StObject.set(x, "deviceMetadata", value.asInstanceOf[js.Any])
    
    inline def setDeviceMetadataUndefined: Self = StObject.set(x, "deviceMetadata", js.undefined)
  }
}
