package typings.fhirKitClient.anon

import typings.fhir.fhir.EnrollmentResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BodyEnrollmentResponse extends StObject {
  
  var body: EnrollmentResponse
  
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.EnrollmentResponse
}
object BodyEnrollmentResponse {
  
  inline def apply(body: EnrollmentResponse): BodyEnrollmentResponse = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = "EnrollmentResponse")
    __obj.asInstanceOf[BodyEnrollmentResponse]
  }
  
  extension [Self <: BodyEnrollmentResponse](x: Self) {
    
    inline def setBody(value: EnrollmentResponse): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: typings.request.mod.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setOptions(value: typings.request.mod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setResourceType(value: typings.fhirKitClient.fhirKitClientStrings.EnrollmentResponse): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
