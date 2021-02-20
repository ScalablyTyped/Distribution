package typings.fhirKitClient.anon

import typings.fhir.fhir.Procedure
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BodyProcedureHeaders extends StObject {
  
  var body: Procedure = js.native
  
  var headers: js.UndefOr[typings.request.mod.Headers] = js.native
  
  var id: String = js.native
  
  var options: js.UndefOr[typings.request.mod.Options] = js.native
  
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.Procedure = js.native
}
object BodyProcedureHeaders {
  
  @scala.inline
  def apply(body: Procedure, id: String, resourceType: typings.fhirKitClient.fhirKitClientStrings.Procedure): BodyProcedureHeaders = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyProcedureHeaders]
  }
  
  @scala.inline
  implicit class BodyProcedureHeadersMutableBuilder[Self <: BodyProcedureHeaders] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: Procedure): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
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
    def setResourceType(value: typings.fhirKitClient.fhirKitClientStrings.Procedure): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
