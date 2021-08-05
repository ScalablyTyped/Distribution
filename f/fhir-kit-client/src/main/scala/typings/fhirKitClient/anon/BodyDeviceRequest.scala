package typings.fhirKitClient.anon

import typings.fhir.fhir.DeviceRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BodyDeviceRequest extends StObject {
  
  var body: DeviceRequest
  
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.DeviceRequest
}
object BodyDeviceRequest {
  
  inline def apply(body: DeviceRequest): BodyDeviceRequest = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = "DeviceRequest")
    __obj.asInstanceOf[BodyDeviceRequest]
  }
  
  extension [Self <: BodyDeviceRequest](x: Self) {
    
    inline def setBody(value: DeviceRequest): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: typings.request.mod.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setOptions(value: typings.request.mod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setResourceType(value: typings.fhirKitClient.fhirKitClientStrings.DeviceRequest): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
