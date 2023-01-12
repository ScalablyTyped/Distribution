package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdTypeSpace extends StObject {
  
  def expandedTextAd(): Boolean
  
  def gmailImageAd(): Boolean
  
  def gmailMultiProductAd(): Boolean
  
  def gmailSinglePromotionAd(): Boolean
  
  def html5Ad(): Boolean
  
  def imageAd(): Boolean
  
  def responsiveDisplayAd(): Boolean
}
object AdTypeSpace {
  
  inline def apply(
    expandedTextAd: () => Boolean,
    gmailImageAd: () => Boolean,
    gmailMultiProductAd: () => Boolean,
    gmailSinglePromotionAd: () => Boolean,
    html5Ad: () => Boolean,
    imageAd: () => Boolean,
    responsiveDisplayAd: () => Boolean
  ): AdTypeSpace = {
    val __obj = js.Dynamic.literal(expandedTextAd = js.Any.fromFunction0(expandedTextAd), gmailImageAd = js.Any.fromFunction0(gmailImageAd), gmailMultiProductAd = js.Any.fromFunction0(gmailMultiProductAd), gmailSinglePromotionAd = js.Any.fromFunction0(gmailSinglePromotionAd), html5Ad = js.Any.fromFunction0(html5Ad), imageAd = js.Any.fromFunction0(imageAd), responsiveDisplayAd = js.Any.fromFunction0(responsiveDisplayAd))
    __obj.asInstanceOf[AdTypeSpace]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdTypeSpace] (val x: Self) extends AnyVal {
    
    inline def setExpandedTextAd(value: () => Boolean): Self = StObject.set(x, "expandedTextAd", js.Any.fromFunction0(value))
    
    inline def setGmailImageAd(value: () => Boolean): Self = StObject.set(x, "gmailImageAd", js.Any.fromFunction0(value))
    
    inline def setGmailMultiProductAd(value: () => Boolean): Self = StObject.set(x, "gmailMultiProductAd", js.Any.fromFunction0(value))
    
    inline def setGmailSinglePromotionAd(value: () => Boolean): Self = StObject.set(x, "gmailSinglePromotionAd", js.Any.fromFunction0(value))
    
    inline def setHtml5Ad(value: () => Boolean): Self = StObject.set(x, "html5Ad", js.Any.fromFunction0(value))
    
    inline def setImageAd(value: () => Boolean): Self = StObject.set(x, "imageAd", js.Any.fromFunction0(value))
    
    inline def setResponsiveDisplayAd(value: () => Boolean): Self = StObject.set(x, "responsiveDisplayAd", js.Any.fromFunction0(value))
  }
}
