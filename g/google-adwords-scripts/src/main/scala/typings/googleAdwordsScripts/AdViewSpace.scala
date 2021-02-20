package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdViewSpace extends StObject {
  
  def expandedTextAd(): ExpandedTextAd = js.native
  
  def gmailImageAd(): GmailImageAd = js.native
  
  def gmailMultiProductAd(): GmailMultiProductAd = js.native
  
  def gmailSinglePromotionAd(): GmailSinglePromotionAd = js.native
  
  def html5Ad(): Html5Ad = js.native
  
  def imageAd(): ImageAd = js.native
  
  def responsiveDisplayAd(): ResponsiveDisplayAd = js.native
}
object AdViewSpace {
  
  @scala.inline
  def apply(
    expandedTextAd: () => ExpandedTextAd,
    gmailImageAd: () => GmailImageAd,
    gmailMultiProductAd: () => GmailMultiProductAd,
    gmailSinglePromotionAd: () => GmailSinglePromotionAd,
    html5Ad: () => Html5Ad,
    imageAd: () => ImageAd,
    responsiveDisplayAd: () => ResponsiveDisplayAd
  ): AdViewSpace = {
    val __obj = js.Dynamic.literal(expandedTextAd = js.Any.fromFunction0(expandedTextAd), gmailImageAd = js.Any.fromFunction0(gmailImageAd), gmailMultiProductAd = js.Any.fromFunction0(gmailMultiProductAd), gmailSinglePromotionAd = js.Any.fromFunction0(gmailSinglePromotionAd), html5Ad = js.Any.fromFunction0(html5Ad), imageAd = js.Any.fromFunction0(imageAd), responsiveDisplayAd = js.Any.fromFunction0(responsiveDisplayAd))
    __obj.asInstanceOf[AdViewSpace]
  }
  
  @scala.inline
  implicit class AdViewSpaceMutableBuilder[Self <: AdViewSpace] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpandedTextAd(value: () => ExpandedTextAd): Self = StObject.set(x, "expandedTextAd", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGmailImageAd(value: () => GmailImageAd): Self = StObject.set(x, "gmailImageAd", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGmailMultiProductAd(value: () => GmailMultiProductAd): Self = StObject.set(x, "gmailMultiProductAd", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGmailSinglePromotionAd(value: () => GmailSinglePromotionAd): Self = StObject.set(x, "gmailSinglePromotionAd", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHtml5Ad(value: () => Html5Ad): Self = StObject.set(x, "html5Ad", js.Any.fromFunction0(value))
    
    @scala.inline
    def setImageAd(value: () => ImageAd): Self = StObject.set(x, "imageAd", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResponsiveDisplayAd(value: () => ResponsiveDisplayAd): Self = StObject.set(x, "responsiveDisplayAd", js.Any.fromFunction0(value))
  }
}
