package typings.fhirKitClient.anon

import typings.fhir.fhir.Library
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BodyLibraryHeaders extends StObject {
  
  var body: Library
  
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  
  var id: String
  
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.Library
}
object BodyLibraryHeaders {
  
  @scala.inline
  def apply(body: Library, id: String): BodyLibraryHeaders = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = "Library")
    __obj.asInstanceOf[BodyLibraryHeaders]
  }
  
  @scala.inline
  implicit class BodyLibraryHeadersMutableBuilder[Self <: BodyLibraryHeaders] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: Library): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
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
    def setResourceType(value: typings.fhirKitClient.fhirKitClientStrings.Library): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
