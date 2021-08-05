package typings.fhirKitClient.anon

import typings.fhir.fhir.HealthcareService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BodyHealthcareServiceHeaders extends StObject {
  
  var body: HealthcareService
  
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  
  var id: String
  
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.HealthcareService
}
object BodyHealthcareServiceHeaders {
  
  inline def apply(body: HealthcareService, id: String): BodyHealthcareServiceHeaders = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = "HealthcareService")
    __obj.asInstanceOf[BodyHealthcareServiceHeaders]
  }
  
  extension [Self <: BodyHealthcareServiceHeaders](x: Self) {
    
    inline def setBody(value: HealthcareService): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: typings.request.mod.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: typings.request.mod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setResourceType(value: typings.fhirKitClient.fhirKitClientStrings.HealthcareService): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
