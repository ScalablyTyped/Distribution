package typings.fhirKitClient.anon

import typings.fhir.fhir.ReferralRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BodyReferralRequestHeaders extends StObject {
  
  var body: ReferralRequest
  
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  
  var id: String
  
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.ReferralRequest
}
object BodyReferralRequestHeaders {
  
  inline def apply(body: ReferralRequest, id: String): BodyReferralRequestHeaders = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = "ReferralRequest")
    __obj.asInstanceOf[BodyReferralRequestHeaders]
  }
  
  extension [Self <: BodyReferralRequestHeaders](x: Self) {
    
    inline def setBody(value: ReferralRequest): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: typings.request.mod.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: typings.request.mod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setResourceType(value: typings.fhirKitClient.fhirKitClientStrings.ReferralRequest): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
