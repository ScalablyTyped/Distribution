package typings.fhir.r2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Binary
  extends StObject
     with Resource
     with _FhirResource {
  
  var _content: js.UndefOr[Element] = js.undefined
  
  var _contentType: js.UndefOr[Element] = js.undefined
  
  /**
    * The actual content, base64 encoded.
    */
  var content: String
  
  /**
    * MimeType of the binary content represented as a standard MimeType (BCP 13).
    */
  var contentType: String
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_Binary: typings.fhir.fhirStrings.Binary
}
object Binary {
  
  inline def apply(content: String, contentType: String): Binary = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], resourceType = "Binary")
    __obj.asInstanceOf[Binary]
  }
  
  extension [Self <: Binary](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setResourceType(value: typings.fhir.fhirStrings.Binary): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def set_content(value: Element): Self = StObject.set(x, "_content", value.asInstanceOf[js.Any])
    
    inline def set_contentType(value: Element): Self = StObject.set(x, "_contentType", value.asInstanceOf[js.Any])
    
    inline def set_contentTypeUndefined: Self = StObject.set(x, "_contentType", js.undefined)
    
    inline def set_contentUndefined: Self = StObject.set(x, "_content", js.undefined)
  }
}
