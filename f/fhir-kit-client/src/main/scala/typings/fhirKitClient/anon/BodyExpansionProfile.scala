package typings.fhirKitClient.anon

import typings.fhir.fhir.ExpansionProfile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BodyExpansionProfile extends StObject {
  
  var body: ExpansionProfile = js.native
  
  var headers: js.UndefOr[typings.request.mod.Headers] = js.native
  
  var options: js.UndefOr[typings.request.mod.Options] = js.native
  
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.ExpansionProfile = js.native
}
object BodyExpansionProfile {
  
  @scala.inline
  def apply(body: ExpansionProfile, resourceType: typings.fhirKitClient.fhirKitClientStrings.ExpansionProfile): BodyExpansionProfile = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyExpansionProfile]
  }
  
  @scala.inline
  implicit class BodyExpansionProfileMutableBuilder[Self <: BodyExpansionProfile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: ExpansionProfile): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: typings.request.mod.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setOptions(value: typings.request.mod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setResourceType(value: typings.fhirKitClient.fhirKitClientStrings.ExpansionProfile): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
