package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResponsiveDisplayAdBuilder[ResponsiveDisplayAd] extends AdBuilder[ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]] {
  
  def withBusinessName(businessName: String): ResponsiveDisplayAdBuilder[ResponsiveDisplayAd] = js.native
  
  def withDescription(description: String): ResponsiveDisplayAdBuilder[ResponsiveDisplayAd] = js.native
  
  def withLogoImage(logo: Media): ResponsiveDisplayAdBuilder[ResponsiveDisplayAd] = js.native
  
  def withLongHeadline(longHeadline: String): ResponsiveDisplayAdBuilder[ResponsiveDisplayAd] = js.native
  
  def withMarketingImage(marketingImage: Media): ResponsiveDisplayAdBuilder[ResponsiveDisplayAd] = js.native
  
  def withShortHeadline(shortHeadline: String): ResponsiveDisplayAdBuilder[ResponsiveDisplayAd] = js.native
}
object ResponsiveDisplayAdBuilder {
  
  @scala.inline
  def apply[ResponsiveDisplayAd](
    build: () => AdWordsOperation[ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]],
    withBusinessName: String => ResponsiveDisplayAdBuilder[ResponsiveDisplayAd],
    withCustomParameters: js.Object => ResponsiveDisplayAdBuilder[ResponsiveDisplayAd],
    withDescription: String => ResponsiveDisplayAdBuilder[ResponsiveDisplayAd],
    withFinalUrl: String => ResponsiveDisplayAdBuilder[ResponsiveDisplayAd],
    withLogoImage: Media => ResponsiveDisplayAdBuilder[ResponsiveDisplayAd],
    withLongHeadline: String => ResponsiveDisplayAdBuilder[ResponsiveDisplayAd],
    withMarketingImage: Media => ResponsiveDisplayAdBuilder[ResponsiveDisplayAd],
    withMobileFinalUrl: String => ResponsiveDisplayAdBuilder[ResponsiveDisplayAd],
    withShortHeadline: String => ResponsiveDisplayAdBuilder[ResponsiveDisplayAd],
    withTrackingTemplate: String => ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]
  ): ResponsiveDisplayAdBuilder[ResponsiveDisplayAd] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), withBusinessName = js.Any.fromFunction1(withBusinessName), withCustomParameters = js.Any.fromFunction1(withCustomParameters), withDescription = js.Any.fromFunction1(withDescription), withFinalUrl = js.Any.fromFunction1(withFinalUrl), withLogoImage = js.Any.fromFunction1(withLogoImage), withLongHeadline = js.Any.fromFunction1(withLongHeadline), withMarketingImage = js.Any.fromFunction1(withMarketingImage), withMobileFinalUrl = js.Any.fromFunction1(withMobileFinalUrl), withShortHeadline = js.Any.fromFunction1(withShortHeadline), withTrackingTemplate = js.Any.fromFunction1(withTrackingTemplate))
    __obj.asInstanceOf[ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]]
  }
  
  @scala.inline
  implicit class ResponsiveDisplayAdBuilderMutableBuilder[Self <: ResponsiveDisplayAdBuilder[_], ResponsiveDisplayAd] (val x: Self with ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]) extends AnyVal {
    
    @scala.inline
    def setWithBusinessName(value: String => ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]): Self = StObject.set(x, "withBusinessName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWithDescription(value: String => ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]): Self = StObject.set(x, "withDescription", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWithLogoImage(value: Media => ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]): Self = StObject.set(x, "withLogoImage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWithLongHeadline(value: String => ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]): Self = StObject.set(x, "withLongHeadline", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWithMarketingImage(value: Media => ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]): Self = StObject.set(x, "withMarketingImage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWithShortHeadline(value: String => ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]): Self = StObject.set(x, "withShortHeadline", js.Any.fromFunction1(value))
  }
}
