package typings.fhirKitClient.anon

import typings.fhir.fhir.RelatedPerson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BodyRelatedPersonHeaders extends StObject {
  
  var body: RelatedPerson = js.native
  
  var headers: js.UndefOr[typings.request.mod.Headers] = js.native
  
  var id: String = js.native
  
  var options: js.UndefOr[typings.request.mod.Options] = js.native
  
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.RelatedPerson = js.native
}
object BodyRelatedPersonHeaders {
  
  @scala.inline
  def apply(
    body: RelatedPerson,
    id: String,
    resourceType: typings.fhirKitClient.fhirKitClientStrings.RelatedPerson
  ): BodyRelatedPersonHeaders = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyRelatedPersonHeaders]
  }
  
  @scala.inline
  implicit class BodyRelatedPersonHeadersMutableBuilder[Self <: BodyRelatedPersonHeaders] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: RelatedPerson): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
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
    def setResourceType(value: typings.fhirKitClient.fhirKitClientStrings.RelatedPerson): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
