package typings.fhir.r3Mod

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
    * If the content type is itself base64 encoding, then this will be base64 encoded twice - what is created by un-base64ing the content must be the specified content type.
    */
  var content: String
  
  /**
    * MimeType of the binary content represented as a standard MimeType (BCP 13).
    */
  var contentType: String
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_Binary: typings.fhir.fhirStrings.Binary
  
  /**
    * Treat this binary as if it was this other resource for access control purposes.
    */
  var securityContext: js.UndefOr[Reference] = js.undefined
}
object Binary {
  
  inline def apply(content: String, contentType: String): Binary = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], resourceType = "Binary")
    __obj.asInstanceOf[Binary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Binary] (val x: Self) extends AnyVal {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setResourceType(value: typings.fhir.fhirStrings.Binary): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setSecurityContext(value: Reference): Self = StObject.set(x, "securityContext", value.asInstanceOf[js.Any])
    
    inline def setSecurityContextUndefined: Self = StObject.set(x, "securityContext", js.undefined)
    
    inline def set_content(value: Element): Self = StObject.set(x, "_content", value.asInstanceOf[js.Any])
    
    inline def set_contentType(value: Element): Self = StObject.set(x, "_contentType", value.asInstanceOf[js.Any])
    
    inline def set_contentTypeUndefined: Self = StObject.set(x, "_contentType", js.undefined)
    
    inline def set_contentUndefined: Self = StObject.set(x, "_content", js.undefined)
  }
}
