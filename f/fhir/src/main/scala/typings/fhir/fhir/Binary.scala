package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Pure binary content defined by a format other than FHIR
  */
trait Binary
  extends StObject
     with ResourceBase
     with Resource {
  
  /**
    * Contains extended information for property 'content'.
    */
  var _content: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'contentType'.
    */
  var _contentType: js.UndefOr[Element] = js.undefined
  
  /**
    * The actual content
    */
  var content: base64Binary
  
  /**
    * MimeType of the binary content
    */
  var contentType: code
  
  /**
    * Access Control Management
    */
  var securityContext: js.UndefOr[Reference] = js.undefined
}
object Binary {
  
  @scala.inline
  def apply(content: base64Binary, contentType: code): Binary = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Binary]
  }
  
  @scala.inline
  implicit class BinaryMutableBuilder[Self <: Binary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: base64Binary): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentType(value: code): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityContext(value: Reference): Self = StObject.set(x, "securityContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityContextUndefined: Self = StObject.set(x, "securityContext", js.undefined)
    
    @scala.inline
    def set_content(value: Element): Self = StObject.set(x, "_content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_contentType(value: Element): Self = StObject.set(x, "_contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_contentTypeUndefined: Self = StObject.set(x, "_contentType", js.undefined)
    
    @scala.inline
    def set_contentUndefined: Self = StObject.set(x, "_content", js.undefined)
  }
}
