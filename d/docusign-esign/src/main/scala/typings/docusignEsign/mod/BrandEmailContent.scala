package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrandEmailContent extends StObject {
  
  /**
    * Deprecated.
    */
  var content: js.UndefOr[String] = js.undefined
  
  /**
    * Deprecated.
    */
  var emailContentType: js.UndefOr[String] = js.undefined
  
  /**
    * Deprecated.
    */
  var emailToLink: js.UndefOr[String] = js.undefined
  
  /**
    * Deprecated.
    */
  var linkText: js.UndefOr[String] = js.undefined
}
object BrandEmailContent {
  
  inline def apply(): BrandEmailContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrandEmailContent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BrandEmailContent] (val x: Self) extends AnyVal {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setEmailContentType(value: String): Self = StObject.set(x, "emailContentType", value.asInstanceOf[js.Any])
    
    inline def setEmailContentTypeUndefined: Self = StObject.set(x, "emailContentType", js.undefined)
    
    inline def setEmailToLink(value: String): Self = StObject.set(x, "emailToLink", value.asInstanceOf[js.Any])
    
    inline def setEmailToLinkUndefined: Self = StObject.set(x, "emailToLink", js.undefined)
    
    inline def setLinkText(value: String): Self = StObject.set(x, "linkText", value.asInstanceOf[js.Any])
    
    inline def setLinkTextUndefined: Self = StObject.set(x, "linkText", js.undefined)
  }
}
