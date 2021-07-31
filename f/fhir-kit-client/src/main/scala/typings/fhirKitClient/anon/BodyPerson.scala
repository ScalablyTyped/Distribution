package typings.fhirKitClient.anon

import typings.fhir.fhir.Person
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BodyPerson extends StObject {
  
  var body: Person
  
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.Person
}
object BodyPerson {
  
  @scala.inline
  def apply(body: Person): BodyPerson = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = "Person")
    __obj.asInstanceOf[BodyPerson]
  }
  
  @scala.inline
  implicit class BodyPersonMutableBuilder[Self <: BodyPerson] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: Person): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: typings.request.mod.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setOptions(value: typings.request.mod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setResourceType(value: typings.fhirKitClient.fhirKitClientStrings.Person): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
