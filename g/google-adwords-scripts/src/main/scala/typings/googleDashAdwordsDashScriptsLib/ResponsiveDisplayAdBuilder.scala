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
    build: () => AdWordsOperation[ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]],
    withBusinessName: java.lang.String => ResponsiveDisplayAdBuilder[ResponsiveDisplayAd],
    withCustomParameters: js.Object => ResponsiveDisplayAdBuilder[ResponsiveDisplayAd],
    withDescription: java.lang.String => ResponsiveDisplayAdBuilder[ResponsiveDisplayAd],
    withFinalUrl: java.lang.String => ResponsiveDisplayAdBuilder[ResponsiveDisplayAd],
    withLogoImage: Media => ResponsiveDisplayAdBuilder[ResponsiveDisplayAd],
    withLongHeadline: java.lang.String => ResponsiveDisplayAdBuilder[ResponsiveDisplayAd],
    withMarketingImage: Media => ResponsiveDisplayAdBuilder[ResponsiveDisplayAd],
    withMobileFinalUrl: java.lang.String => ResponsiveDisplayAdBuilder[ResponsiveDisplayAd],
    withShortHeadline: java.lang.String => ResponsiveDisplayAdBuilder[ResponsiveDisplayAd],
    withTrackingTemplate: java.lang.String => ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]
  ): ResponsiveDisplayAdBuilder[ResponsiveDisplayAd] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), withBusinessName = js.Any.fromFunction1(withBusinessName), withCustomParameters = js.Any.fromFunction1(withCustomParameters), withDescription = js.Any.fromFunction1(withDescription), withFinalUrl = js.Any.fromFunction1(withFinalUrl), withLogoImage = js.Any.fromFunction1(withLogoImage), withLongHeadline = js.Any.fromFunction1(withLongHeadline), withMarketingImage = js.Any.fromFunction1(withMarketingImage), withMobileFinalUrl = js.Any.fromFunction1(withMobileFinalUrl), withShortHeadline = js.Any.fromFunction1(withShortHeadline), withTrackingTemplate = js.Any.fromFunction1(withTrackingTemplate))
  
    __obj.asInstanceOf[ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]]
  }
}

