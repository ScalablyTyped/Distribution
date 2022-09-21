package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Starting point for determining the type of an ad.
  * For types that are not fully supported, use Ad.getType instead.
  *
  * Typical usage:
  *
  *      if (ad.isType().expandedTextAd()) {
  *        var expandedTextAd = ad.asType().expandedTextAd();
  *        var headlinePart1 = expandedTextAd.getHeadlinePart1();
  *      }
  */
trait AdTypeSpace extends StObject {
  
  /** Returns whether the ad is an ExpandedTextAd. */
  def expandedTextAd(): Boolean
  
  /** Returns whether the ad is a GmailImageAd. */
  def gmailImageAd(): Boolean
  
  /** Returns whether the ad is a GmailMultiProductAd. */
  def gmailMultiProductAd(): Boolean
  
  /** Returns whether the ad is a GmailSinglePromotionAd. */
  def gmailSinglePromotionAd(): Boolean
  
  /** Returns whether the ad is a Html5Ad. */
  def html5Ad(): Boolean
  
  /** Returns whether the ad is an ImageAd. */
  def imageAd(): Boolean
  
  /** Returns whether the ad is a ResponsiveDisplayAd. */
  def responsiveDisplayAd(): Boolean
  
  /** Returns whether the ad is a ResponsiveSearchAd. */
  def responsiveSearchAd(): Boolean
}
object AdTypeSpace {
  
  inline def apply(
    expandedTextAd: () => Boolean,
    gmailImageAd: () => Boolean,
    gmailMultiProductAd: () => Boolean,
    gmailSinglePromotionAd: () => Boolean,
    html5Ad: () => Boolean,
    imageAd: () => Boolean,
    responsiveDisplayAd: () => Boolean,
    responsiveSearchAd: () => Boolean
  ): AdTypeSpace = {
    val __obj = js.Dynamic.literal(expandedTextAd = js.Any.fromFunction0(expandedTextAd), gmailImageAd = js.Any.fromFunction0(gmailImageAd), gmailMultiProductAd = js.Any.fromFunction0(gmailMultiProductAd), gmailSinglePromotionAd = js.Any.fromFunction0(gmailSinglePromotionAd), html5Ad = js.Any.fromFunction0(html5Ad), imageAd = js.Any.fromFunction0(imageAd), responsiveDisplayAd = js.Any.fromFunction0(responsiveDisplayAd), responsiveSearchAd = js.Any.fromFunction0(responsiveSearchAd))
    __obj.asInstanceOf[AdTypeSpace]
  }
  
  extension [Self <: AdTypeSpace](x: Self) {
    
    inline def setExpandedTextAd(value: () => Boolean): Self = StObject.set(x, "expandedTextAd", js.Any.fromFunction0(value))
    
    inline def setGmailImageAd(value: () => Boolean): Self = StObject.set(x, "gmailImageAd", js.Any.fromFunction0(value))
    
    inline def setGmailMultiProductAd(value: () => Boolean): Self = StObject.set(x, "gmailMultiProductAd", js.Any.fromFunction0(value))
    
    inline def setGmailSinglePromotionAd(value: () => Boolean): Self = StObject.set(x, "gmailSinglePromotionAd", js.Any.fromFunction0(value))
    
    inline def setHtml5Ad(value: () => Boolean): Self = StObject.set(x, "html5Ad", js.Any.fromFunction0(value))
    
    inline def setImageAd(value: () => Boolean): Self = StObject.set(x, "imageAd", js.Any.fromFunction0(value))
    
    inline def setResponsiveDisplayAd(value: () => Boolean): Self = StObject.set(x, "responsiveDisplayAd", js.Any.fromFunction0(value))
    
    inline def setResponsiveSearchAd(value: () => Boolean): Self = StObject.set(x, "responsiveSearchAd", js.Any.fromFunction0(value))
  }
}
