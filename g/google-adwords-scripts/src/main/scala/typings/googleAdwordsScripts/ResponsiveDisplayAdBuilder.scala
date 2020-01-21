package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]
  extends AdWordsBuilder[ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]]
     with hasFinalUrlBuilder[ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]]
     with hasTrackingTemplateBuilder[ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]] {
  def withBusinessName(businessName: String): ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]
  def withDescription(description: String): ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]
  def withLogoImage(logo: Media): ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]
  def withLongHeadline(longHeadline: String): ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]
  def withMarketingImage(marketingImage: Media): ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]
  def withShortHeadline(shortHeadline: String): ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]
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
}

