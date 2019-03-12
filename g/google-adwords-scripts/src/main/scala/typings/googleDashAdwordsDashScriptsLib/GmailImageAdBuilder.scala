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
    build: () => AdWordsOperation[GmailImageAdBuilder[GmailImageAd]],
    withAdvertiser: java.lang.String => GmailImageAdBuilder[GmailImageAd],
    withCustomParameters: js.Object => GmailImageAdBuilder[GmailImageAd],
    withDescription: java.lang.String => GmailImageAdBuilder[GmailImageAd],
    withDisplayUrl: java.lang.String => GmailImageAdBuilder[GmailImageAd],
    withFinalUrl: java.lang.String => GmailImageAdBuilder[GmailImageAd],
    withImage: Media => GmailImageAdBuilder[GmailImageAd],
    withLogo: Media => GmailImageAdBuilder[GmailImageAd],
    withMobileFinalUrl: java.lang.String => GmailImageAdBuilder[GmailImageAd],
    withName: java.lang.String => GmailImageAdBuilder[GmailImageAd],
    withSubject: java.lang.String => GmailImageAdBuilder[GmailImageAd],
    withTrackingTemplate: java.lang.String => GmailImageAdBuilder[GmailImageAd]
  ): GmailImageAdBuilder[GmailImageAd] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), withAdvertiser = js.Any.fromFunction1(withAdvertiser), withCustomParameters = js.Any.fromFunction1(withCustomParameters), withDescription = js.Any.fromFunction1(withDescription), withDisplayUrl = js.Any.fromFunction1(withDisplayUrl), withFinalUrl = js.Any.fromFunction1(withFinalUrl), withImage = js.Any.fromFunction1(withImage), withLogo = js.Any.fromFunction1(withLogo), withMobileFinalUrl = js.Any.fromFunction1(withMobileFinalUrl), withName = js.Any.fromFunction1(withName), withSubject = js.Any.fromFunction1(withSubject), withTrackingTemplate = js.Any.fromFunction1(withTrackingTemplate))
  
    __obj.asInstanceOf[GmailImageAdBuilder[GmailImageAd]]
  }
}

