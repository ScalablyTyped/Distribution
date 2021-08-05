package typings.fhirKitClient.anon

import typings.fhir.fhir.SearchParameter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BodySearchParameterHeaders extends StObject {
  
  var body: SearchParameter
  
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  
  var id: String
  
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.SearchParameter
}
object BodySearchParameterHeaders {
  
  inline def apply(body: SearchParameter, id: String): BodySearchParameterHeaders = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = "SearchParameter")
    __obj.asInstanceOf[BodySearchParameterHeaders]
  }
  
  extension [Self <: BodySearchParameterHeaders](x: Self) {
    
    inline def setBody(value: SearchParameter): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: typings.request.mod.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: typings.request.mod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setResourceType(value: typings.fhirKitClient.fhirKitClientStrings.SearchParameter): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
