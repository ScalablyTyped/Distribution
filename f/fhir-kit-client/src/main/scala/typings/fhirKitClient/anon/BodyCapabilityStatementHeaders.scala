package typings.fhirKitClient.anon

import typings.fhir.fhir.CapabilityStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BodyCapabilityStatementHeaders extends StObject {
  
  var body: CapabilityStatement
  
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  
  var id: String
  
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.CapabilityStatement
}
object BodyCapabilityStatementHeaders {
  
  @scala.inline
  def apply(body: CapabilityStatement, id: String): BodyCapabilityStatementHeaders = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = "CapabilityStatement")
    __obj.asInstanceOf[BodyCapabilityStatementHeaders]
  }
  
  @scala.inline
  implicit class BodyCapabilityStatementHeadersMutableBuilder[Self <: BodyCapabilityStatementHeaders] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: CapabilityStatement): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
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
    def setResourceType(value: typings.fhirKitClient.fhirKitClientStrings.CapabilityStatement): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
