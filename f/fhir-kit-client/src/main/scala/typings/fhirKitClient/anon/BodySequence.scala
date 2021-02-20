package typings.fhirKitClient.anon

import typings.fhir.fhir.Sequence
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BodySequence extends StObject {
  
  var body: Sequence = js.native
  
  var headers: js.UndefOr[typings.request.mod.Headers] = js.native
  
  var options: js.UndefOr[typings.request.mod.Options] = js.native
  
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.Sequence = js.native
}
object BodySequence {
  
  @scala.inline
  def apply(body: Sequence, resourceType: typings.fhirKitClient.fhirKitClientStrings.Sequence): BodySequence = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodySequence]
  }
  
  @scala.inline
  implicit class BodySequenceMutableBuilder[Self <: BodySequence] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: Sequence): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: typings.request.mod.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setOptions(value: typings.request.mod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setResourceType(value: typings.fhirKitClient.fhirKitClientStrings.Sequence): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
