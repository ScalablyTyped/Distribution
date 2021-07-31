package typings.fhirKitClient.anon

import typings.fhir.fhir.CareTeam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BodyCareTeam extends StObject {
  
  var body: CareTeam
  
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.CareTeam
}
object BodyCareTeam {
  
  @scala.inline
  def apply(body: CareTeam): BodyCareTeam = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = "CareTeam")
    __obj.asInstanceOf[BodyCareTeam]
  }
  
  @scala.inline
  implicit class BodyCareTeamMutableBuilder[Self <: BodyCareTeam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: CareTeam): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: typings.request.mod.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setOptions(value: typings.request.mod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setResourceType(value: typings.fhirKitClient.fhirKitClientStrings.CareTeam): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
