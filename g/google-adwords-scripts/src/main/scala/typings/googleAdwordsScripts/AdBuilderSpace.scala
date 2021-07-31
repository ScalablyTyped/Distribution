package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdBuilderSpace extends StObject {
  
  def expandedTextAdBuilder(): ExpandedTextAdBuilder[ExpandedTextAd]
  
  def gmailImageAdBuilder(): GmailImageAdBuilder[GmailImageAd]
  
  def gmailMultiProductAdBuilder(): GmailMultiProductAdBuilder[GmailMultiProductAd]
  
  def gmailSinglePromotionAdBuilder(): GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]
  
  def html5AdBuilder(): Html5AdBuilder[Html5Ad]
  
  def imageAdBuilder(): ImageAdBuilder[ImageAd]
  
  def responsiveDisplayAdBuilder(): ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]
}
object AdBuilderSpace {
  
  @scala.inline
  def apply(
    expandedTextAdBuilder: () => ExpandedTextAdBuilder[ExpandedTextAd],
    gmailImageAdBuilder: () => GmailImageAdBuilder[GmailImageAd],
    gmailMultiProductAdBuilder: () => GmailMultiProductAdBuilder[GmailMultiProductAd],
    gmailSinglePromotionAdBuilder: () => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd],
    html5AdBuilder: () => Html5AdBuilder[Html5Ad],
    imageAdBuilder: () => ImageAdBuilder[ImageAd],
    responsiveDisplayAdBuilder: () => ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]
  ): AdBuilderSpace = {
    val __obj = js.Dynamic.literal(expandedTextAdBuilder = js.Any.fromFunction0(expandedTextAdBuilder), gmailImageAdBuilder = js.Any.fromFunction0(gmailImageAdBuilder), gmailMultiProductAdBuilder = js.Any.fromFunction0(gmailMultiProductAdBuilder), gmailSinglePromotionAdBuilder = js.Any.fromFunction0(gmailSinglePromotionAdBuilder), html5AdBuilder = js.Any.fromFunction0(html5AdBuilder), imageAdBuilder = js.Any.fromFunction0(imageAdBuilder), responsiveDisplayAdBuilder = js.Any.fromFunction0(responsiveDisplayAdBuilder))
    __obj.asInstanceOf[AdBuilderSpace]
  }
  
  @scala.inline
  implicit class AdBuilderSpaceMutableBuilder[Self <: AdBuilderSpace] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpandedTextAdBuilder(value: () => ExpandedTextAdBuilder[ExpandedTextAd]): Self = StObject.set(x, "expandedTextAdBuilder", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGmailImageAdBuilder(value: () => GmailImageAdBuilder[GmailImageAd]): Self = StObject.set(x, "gmailImageAdBuilder", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGmailMultiProductAdBuilder(value: () => GmailMultiProductAdBuilder[GmailMultiProductAd]): Self = StObject.set(x, "gmailMultiProductAdBuilder", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGmailSinglePromotionAdBuilder(value: () => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]): Self = StObject.set(x, "gmailSinglePromotionAdBuilder", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHtml5AdBuilder(value: () => Html5AdBuilder[Html5Ad]): Self = StObject.set(x, "html5AdBuilder", js.Any.fromFunction0(value))
    
    @scala.inline
    def setImageAdBuilder(value: () => ImageAdBuilder[ImageAd]): Self = StObject.set(x, "imageAdBuilder", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResponsiveDisplayAdBuilder(value: () => ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]): Self = StObject.set(x, "responsiveDisplayAdBuilder", js.Any.fromFunction0(value))
  }
}
