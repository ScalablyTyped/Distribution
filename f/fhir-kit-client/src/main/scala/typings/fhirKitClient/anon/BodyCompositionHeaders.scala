package typings.fhirKitClient.anon

import typings.fhir.fhir.Composition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BodyCompositionHeaders extends StObject {
  
  var body: Composition
  
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  
  var id: String
  
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.Composition
}
object BodyCompositionHeaders {
  
  @scala.inline
  def apply(body: Composition, id: String): BodyCompositionHeaders = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = "Composition")
    __obj.asInstanceOf[BodyCompositionHeaders]
  }
  
  @scala.inline
  implicit class BodyCompositionHeadersMutableBuilder[Self <: BodyCompositionHeaders] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: Composition): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
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
    def setResourceType(value: typings.fhirKitClient.fhirKitClientStrings.Composition): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
