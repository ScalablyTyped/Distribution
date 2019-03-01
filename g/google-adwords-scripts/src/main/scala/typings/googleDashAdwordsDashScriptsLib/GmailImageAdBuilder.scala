package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GmailImageAdBuilder[GmailImageAd] extends AdBuilder[GmailImageAdBuilder[GmailImageAd]] {
  def withAdvertiser(advertiser: java.lang.String): GmailImageAdBuilder[GmailImageAd]
  def withDescription(description: java.lang.String): GmailImageAdBuilder[GmailImageAd]
  def withDisplayUrl(displayUrl: java.lang.String): GmailImageAdBuilder[GmailImageAd]
  def withImage(image: Media): GmailImageAdBuilder[GmailImageAd]
  def withLogo(logo: Media): GmailImageAdBuilder[GmailImageAd]
  def withName(name: java.lang.String): GmailImageAdBuilder[GmailImageAd]
  def withSubject(subject: java.lang.String): GmailImageAdBuilder[GmailImageAd]
}

object GmailImageAdBuilder {
  @scala.inline
  def apply[GmailImageAd](
    build: js.Function0[AdWordsOperation[GmailImageAdBuilder[GmailImageAd]]],
    withAdvertiser: js.Function1[java.lang.String, GmailImageAdBuilder[GmailImageAd]],
    withCustomParameters: js.Function1[js.Object, GmailImageAdBuilder[GmailImageAd]],
    withDescription: js.Function1[java.lang.String, GmailImageAdBuilder[GmailImageAd]],
    withDisplayUrl: js.Function1[java.lang.String, GmailImageAdBuilder[GmailImageAd]],
    withFinalUrl: js.Function1[java.lang.String, GmailImageAdBuilder[GmailImageAd]],
    withImage: js.Function1[Media, GmailImageAdBuilder[GmailImageAd]],
    withLogo: js.Function1[Media, GmailImageAdBuilder[GmailImageAd]],
    withMobileFinalUrl: js.Function1[java.lang.String, GmailImageAdBuilder[GmailImageAd]],
    withName: js.Function1[java.lang.String, GmailImageAdBuilder[GmailImageAd]],
    withSubject: js.Function1[java.lang.String, GmailImageAdBuilder[GmailImageAd]],
    withTrackingTemplate: js.Function1[java.lang.String, GmailImageAdBuilder[GmailImageAd]]
  ): GmailImageAdBuilder[GmailImageAd] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("build")(build)
    __obj.updateDynamic("withAdvertiser")(withAdvertiser)
    __obj.updateDynamic("withCustomParameters")(withCustomParameters)
    __obj.updateDynamic("withDescription")(withDescription)
    __obj.updateDynamic("withDisplayUrl")(withDisplayUrl)
    __obj.updateDynamic("withFinalUrl")(withFinalUrl)
    __obj.updateDynamic("withImage")(withImage)
    __obj.updateDynamic("withLogo")(withLogo)
    __obj.updateDynamic("withMobileFinalUrl")(withMobileFinalUrl)
    __obj.updateDynamic("withName")(withName)
    __obj.updateDynamic("withSubject")(withSubject)
    __obj.updateDynamic("withTrackingTemplate")(withTrackingTemplate)
    __obj.asInstanceOf[GmailImageAdBuilder[GmailImageAd]]
  }
}

