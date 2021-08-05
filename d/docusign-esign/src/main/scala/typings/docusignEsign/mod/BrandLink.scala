package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrandLink extends StObject {
  
  /**
    * The text used for the link.
    */
  var linkText: js.UndefOr[String] = js.undefined
  
  /**
    * The type of link. Valid values include:
    *
    * - `aboutDocusign`
    * - `closeButton`
    */
  var linkType: js.UndefOr[String] = js.undefined
  
  /**
    * When **true**, the link displays to the recipient.
    */
  var showLink: js.UndefOr[String] = js.undefined
  
  /**
    * The URL or mailto address of the link.
    */
  var urlOrMailTo: js.UndefOr[String] = js.undefined
}
object BrandLink {
  
  inline def apply(): BrandLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrandLink]
  }
  
  extension [Self <: BrandLink](x: Self) {
    
    inline def setLinkText(value: String): Self = StObject.set(x, "linkText", value.asInstanceOf[js.Any])
    
    inline def setLinkTextUndefined: Self = StObject.set(x, "linkText", js.undefined)
    
    inline def setLinkType(value: String): Self = StObject.set(x, "linkType", value.asInstanceOf[js.Any])
    
    inline def setLinkTypeUndefined: Self = StObject.set(x, "linkType", js.undefined)
    
    inline def setShowLink(value: String): Self = StObject.set(x, "showLink", value.asInstanceOf[js.Any])
    
    inline def setShowLinkUndefined: Self = StObject.set(x, "showLink", js.undefined)
    
    inline def setUrlOrMailTo(value: String): Self = StObject.set(x, "urlOrMailTo", value.asInstanceOf[js.Any])
    
    inline def setUrlOrMailToUndefined: Self = StObject.set(x, "urlOrMailTo", js.undefined)
  }
}
