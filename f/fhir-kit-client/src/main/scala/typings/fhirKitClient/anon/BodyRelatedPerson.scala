package typings.fhirKitClient.anon

import typings.fhir.fhir.RelatedPerson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BodyRelatedPerson extends StObject {
  
  var body: RelatedPerson
  
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.RelatedPerson
}
object BodyRelatedPerson {
  
  inline def apply(body: RelatedPerson): BodyRelatedPerson = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = "RelatedPerson")
    __obj.asInstanceOf[BodyRelatedPerson]
  }
  
  extension [Self <: BodyRelatedPerson](x: Self) {
    
    inline def setBody(value: RelatedPerson): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: typings.request.mod.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setOptions(value: typings.request.mod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setResourceType(value: typings.fhirKitClient.fhirKitClientStrings.RelatedPerson): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
