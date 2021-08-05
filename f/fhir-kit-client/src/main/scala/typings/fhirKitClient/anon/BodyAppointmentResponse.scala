package typings.fhirKitClient.anon

import typings.fhir.fhir.AppointmentResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BodyAppointmentResponse extends StObject {
  
  var body: AppointmentResponse
  
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  
  var id: String
  
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.AppointmentResponse
}
object BodyAppointmentResponse {
  
  inline def apply(body: AppointmentResponse, id: String): BodyAppointmentResponse = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = "AppointmentResponse")
    __obj.asInstanceOf[BodyAppointmentResponse]
  }
  
  extension [Self <: BodyAppointmentResponse](x: Self) {
    
    inline def setBody(value: AppointmentResponse): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: typings.request.mod.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: typings.request.mod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setResourceType(value: typings.fhirKitClient.fhirKitClientStrings.AppointmentResponse): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
