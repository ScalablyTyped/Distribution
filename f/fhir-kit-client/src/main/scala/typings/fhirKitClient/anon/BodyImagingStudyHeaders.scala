package typings.fhirKitClient.anon

import typings.fhir.fhir.ImagingStudy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BodyImagingStudyHeaders extends StObject {
  
  var body: ImagingStudy
  
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  
  var id: String
  
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.ImagingStudy
}
object BodyImagingStudyHeaders {
  
  @scala.inline
  def apply(body: ImagingStudy, id: String): BodyImagingStudyHeaders = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = "ImagingStudy")
    __obj.asInstanceOf[BodyImagingStudyHeaders]
  }
  
  @scala.inline
  implicit class BodyImagingStudyHeadersMutableBuilder[Self <: BodyImagingStudyHeaders] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: ImagingStudy): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
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
    def setResourceType(value: typings.fhirKitClient.fhirKitClientStrings.ImagingStudy): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
