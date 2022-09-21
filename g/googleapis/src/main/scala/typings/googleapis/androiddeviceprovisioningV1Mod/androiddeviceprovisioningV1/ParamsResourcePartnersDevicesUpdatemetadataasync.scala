package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePartnersDevicesUpdatemetadataasync
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The reseller partner ID.
    */
  var partnerId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaUpdateDeviceMetadataInBatchRequest] = js.undefined
}
object ParamsResourcePartnersDevicesUpdatemetadataasync {
  
  inline def apply(): ParamsResourcePartnersDevicesUpdatemetadataasync = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePartnersDevicesUpdatemetadataasync]
  }
  
  extension [Self <: ParamsResourcePartnersDevicesUpdatemetadataasync](x: Self) {
    
    inline def setPartnerId(value: String): Self = StObject.set(x, "partnerId", value.asInstanceOf[js.Any])
    
    inline def setPartnerIdUndefined: Self = StObject.set(x, "partnerId", js.undefined)
    
    inline def setRequestBody(value: SchemaUpdateDeviceMetadataInBatchRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
