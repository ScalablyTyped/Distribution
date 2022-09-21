package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePartnersDevicesMetadata
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The ID of the device.
    */
  var deviceId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The owner of the newly set metadata. Set this to the partner ID.
    */
  var metadataOwnerId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaUpdateDeviceMetadataRequest] = js.undefined
}
object ParamsResourcePartnersDevicesMetadata {
  
  inline def apply(): ParamsResourcePartnersDevicesMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePartnersDevicesMetadata]
  }
  
  extension [Self <: ParamsResourcePartnersDevicesMetadata](x: Self) {
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    inline def setMetadataOwnerId(value: String): Self = StObject.set(x, "metadataOwnerId", value.asInstanceOf[js.Any])
    
    inline def setMetadataOwnerIdUndefined: Self = StObject.set(x, "metadataOwnerId", js.undefined)
    
    inline def setRequestBody(value: SchemaUpdateDeviceMetadataRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
