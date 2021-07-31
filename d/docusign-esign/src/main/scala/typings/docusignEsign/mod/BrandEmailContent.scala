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
  
  @scala.inline
  def apply(): BrandEmailContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrandEmailContent]
  }
  
  @scala.inline
  implicit class BrandEmailContentMutableBuilder[Self <: BrandEmailContent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setEmailContentType(value: String): Self = StObject.set(x, "emailContentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailContentTypeUndefined: Self = StObject.set(x, "emailContentType", js.undefined)
    
    @scala.inline
    def setEmailToLink(value: String): Self = StObject.set(x, "emailToLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailToLinkUndefined: Self = StObject.set(x, "emailToLink", js.undefined)
    
    @scala.inline
    def setLinkText(value: String): Self = StObject.set(x, "linkText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkTextUndefined: Self = StObject.set(x, "linkText", js.undefined)
  }
}
