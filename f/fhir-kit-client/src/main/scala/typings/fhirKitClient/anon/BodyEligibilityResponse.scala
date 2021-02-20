package typings.fhirKitClient.anon

import typings.fhir.fhir.EligibilityResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BodyEligibilityResponse extends StObject {
  
  var body: EligibilityResponse = js.native
  
  var headers: js.UndefOr[typings.request.mod.Headers] = js.native
  
  var options: js.UndefOr[typings.request.mod.Options] = js.native
  
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.EligibilityResponse = js.native
}
object BodyEligibilityResponse {
  
  @scala.inline
  def apply(
    body: EligibilityResponse,
    resourceType: typings.fhirKitClient.fhirKitClientStrings.EligibilityResponse
  ): BodyEligibilityResponse = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyEligibilityResponse]
  }
  
  @scala.inline
  implicit class BodyEligibilityResponseMutableBuilder[Self <: BodyEligibilityResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: EligibilityResponse): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: typings.request.mod.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setOptions(value: typings.request.mod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setResourceType(value: typings.fhirKitClient.fhirKitClientStrings.EligibilityResponse): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
