package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BrandLink extends StObject {
  
  /**
    * The text used for the link.
    */
  var linkText: js.UndefOr[String] = js.native
  
  /**
    * The type of link. Valid values include:
    *
    * - `aboutDocusign`
    * - `closeButton`
    */
  var linkType: js.UndefOr[String] = js.native
  
  /**
    * When **true**, the link displays to the recipient.
    */
  var showLink: js.UndefOr[String] = js.native
  
  /**
    * The URL or mailto address of the link.
    */
  var urlOrMailTo: js.UndefOr[String] = js.native
}
object BrandLink {
  
  @scala.inline
  def apply(): BrandLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrandLink]
  }
  
  @scala.inline
  implicit class BrandLinkMutableBuilder[Self <: BrandLink] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLinkText(value: String): Self = StObject.set(x, "linkText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkTextUndefined: Self = StObject.set(x, "linkText", js.undefined)
    
    @scala.inline
    def setLinkType(value: String): Self = StObject.set(x, "linkType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkTypeUndefined: Self = StObject.set(x, "linkType", js.undefined)
    
    @scala.inline
    def setShowLink(value: String): Self = StObject.set(x, "showLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowLinkUndefined: Self = StObject.set(x, "showLink", js.undefined)
    
    @scala.inline
    def setUrlOrMailTo(value: String): Self = StObject.set(x, "urlOrMailTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlOrMailToUndefined: Self = StObject.set(x, "urlOrMailTo", js.undefined)
  }
}
