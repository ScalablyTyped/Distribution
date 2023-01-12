package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Binary
  extends StObject
     with Resource
     with _FhirResource {
  
  var _contentType: js.UndefOr[Element] = js.undefined
  
  var _data: js.UndefOr[Element] = js.undefined
  
  /**
    * MimeType of the binary content represented as a standard MimeType (BCP 13).
    */
  var contentType: String
  
  /**
    * If the content type is itself base64 encoding, then this will be base64 encoded twice - what is created by un-base64ing the content must be the specified content type.
    */
  var data: js.UndefOr[String] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_Binary: typings.fhir.fhirStrings.Binary
  
  /**
    * Very often, a server will also know of a resource that references the binary, and can automatically apply the appropriate access rules based on that reference. However, there are some circumstances where this is not appropriate, e.g. the binary is uploaded directly to the server without any linking resource, the binary is referred to from multiple different resources, and/or the binary is content such as an application logo that has less protection than any of the resources that reference it.
    */
  var securityContext: js.UndefOr[Reference] = js.undefined
}
object Binary {
  
  inline def apply(contentType: String): Binary = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], resourceType = "Binary")
    __obj.asInstanceOf[Binary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Binary] (val x: Self) extends AnyVal {
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.Binary): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setSecurityContext(value: Reference): Self = StObject.set(x, "securityContext", value.asInstanceOf[js.Any])
    
    inline def setSecurityContextUndefined: Self = StObject.set(x, "securityContext", js.undefined)
    
    inline def set_contentType(value: Element): Self = StObject.set(x, "_contentType", value.asInstanceOf[js.Any])
    
    inline def set_contentTypeUndefined: Self = StObject.set(x, "_contentType", js.undefined)
    
    inline def set_data(value: Element): Self = StObject.set(x, "_data", value.asInstanceOf[js.Any])
    
    inline def set_dataUndefined: Self = StObject.set(x, "_data", js.undefined)
  }
}
