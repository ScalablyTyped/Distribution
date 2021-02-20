package typings.fhirKitClient.anon

import typings.fhir.fhir.ClaimResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BodyClaimResponseHeaders extends StObject {
  
  var body: ClaimResponse = js.native
  
  var headers: js.UndefOr[typings.request.mod.Headers] = js.native
  
  var id: String = js.native
  
  var options: js.UndefOr[typings.request.mod.Options] = js.native
  
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.ClaimResponse = js.native
}
object BodyClaimResponseHeaders {
  
  @scala.inline
  def apply(
    body: ClaimResponse,
    id: String,
    resourceType: typings.fhirKitClient.fhirKitClientStrings.ClaimResponse
  ): BodyClaimResponseHeaders = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyClaimResponseHeaders]
  }
  
  @scala.inline
  implicit class BodyClaimResponseHeadersMutableBuilder[Self <: BodyClaimResponseHeaders] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: ClaimResponse): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
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
    def setResourceType(value: typings.fhirKitClient.fhirKitClientStrings.ClaimResponse): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
