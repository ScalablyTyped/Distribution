package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponsiveDisplayAdBuilder[ResponsiveDisplayAd] extends AdBuilder[ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]] {
  def withBusinessName(businessName: java.lang.String): ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]
  def withDescription(description: java.lang.String): ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]
  def withLogoImage(logo: Media): ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]
  def withLongHeadline(longHeadline: java.lang.String): ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]
  def withMarketingImage(marketingImage: Media): ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]
  def withShortHeadline(shortHeadline: java.lang.String): ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]
}

object ResponsiveDisplayAdBuilder {
  @scala.inline
  def apply[ResponsiveDisplayAd](
    build: js.Function0[AdWordsOperation[ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]]],
    withBusinessName: js.Function1[java.lang.String, ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]],
    withCustomParameters: js.Function1[js.Object, ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]],
    withDescription: js.Function1[java.lang.String, ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]],
    withFinalUrl: js.Function1[java.lang.String, ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]],
    withLogoImage: js.Function1[Media, ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]],
    withLongHeadline: js.Function1[java.lang.String, ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]],
    withMarketingImage: js.Function1[Media, ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]],
    withMobileFinalUrl: js.Function1[java.lang.String, ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]],
    withShortHeadline: js.Function1[java.lang.String, ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]],
    withTrackingTemplate: js.Function1[java.lang.String, ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]]
  ): ResponsiveDisplayAdBuilder[ResponsiveDisplayAd] = {
    val __obj = js.Dynamic.literal(build = build, withBusinessName = withBusinessName, withCustomParameters = withCustomParameters, withDescription = withDescription, withFinalUrl = withFinalUrl, withLogoImage = withLogoImage, withLongHeadline = withLongHeadline, withMarketingImage = withMarketingImage, withMobileFinalUrl = withMobileFinalUrl, withShortHeadline = withShortHeadline, withTrackingTemplate = withTrackingTemplate)
  
    __obj.asInstanceOf[ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]]
  }
}

