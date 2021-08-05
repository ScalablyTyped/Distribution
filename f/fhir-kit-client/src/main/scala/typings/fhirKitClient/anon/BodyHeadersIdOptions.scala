package typings.fhirKitClient.anon

import typings.fhir.fhir.ActivityDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BodyHeadersIdOptions extends StObject {
  
  var body: ActivityDefinition
  
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  
  var id: String
  
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.ActivityDefinition
}
object BodyHeadersIdOptions {
  
  inline def apply(body: ActivityDefinition, id: String): BodyHeadersIdOptions = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = "ActivityDefinition")
    __obj.asInstanceOf[BodyHeadersIdOptions]
  }
  
  extension [Self <: BodyHeadersIdOptions](x: Self) {
    
    inline def setBody(value: ActivityDefinition): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: typings.request.mod.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: typings.request.mod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setResourceType(value: typings.fhirKitClient.fhirKitClientStrings.ActivityDefinition): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
