package typings.fhirKitClient.anon

import typings.fhir.fhir.Provenance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BodyProvenanceHeaders extends StObject {
  
  var body: Provenance
  
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  
  var id: String
  
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.Provenance
}
object BodyProvenanceHeaders {
  
  @scala.inline
  def apply(body: Provenance, id: String): BodyProvenanceHeaders = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = "Provenance")
    __obj.asInstanceOf[BodyProvenanceHeaders]
  }
  
  @scala.inline
  implicit class BodyProvenanceHeadersMutableBuilder[Self <: BodyProvenanceHeaders] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: Provenance): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: typings.request.mod.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: typings.request.mod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setResourceType(value: typings.fhirKitClient.fhirKitClientStrings.Provenance): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
