package typings.fhirKitClient.anon

import typings.fhir.fhir.ConceptMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BodyConceptMap extends StObject {
  
  var body: ConceptMap
  
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.ConceptMap
}
object BodyConceptMap {
  
  @scala.inline
  def apply(body: ConceptMap): BodyConceptMap = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = "ConceptMap")
    __obj.asInstanceOf[BodyConceptMap]
  }
  
  @scala.inline
  implicit class BodyConceptMapMutableBuilder[Self <: BodyConceptMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: ConceptMap): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: typings.request.mod.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setOptions(value: typings.request.mod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setResourceType(value: typings.fhirKitClient.fhirKitClientStrings.ConceptMap): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
