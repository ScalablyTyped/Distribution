package typings.fhirKitClient.anon

import typings.fhir.fhir.ProcessRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BodyProcessRequestHeaders extends StObject {
  
  var body: ProcessRequest
  
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  
  var id: String
  
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.ProcessRequest
}
object BodyProcessRequestHeaders {
  
  inline def apply(body: ProcessRequest, id: String): BodyProcessRequestHeaders = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = "ProcessRequest")
    __obj.asInstanceOf[BodyProcessRequestHeaders]
  }
  
  extension [Self <: BodyProcessRequestHeaders](x: Self) {
    
    inline def setBody(value: ProcessRequest): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: typings.request.mod.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: typings.request.mod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setResourceType(value: typings.fhirKitClient.fhirKitClientStrings.ProcessRequest): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
