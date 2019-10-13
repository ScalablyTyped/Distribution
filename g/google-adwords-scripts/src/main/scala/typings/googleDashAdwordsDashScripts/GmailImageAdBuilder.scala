package typings.googleDashAdwordsDashScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GmailImageAdBuilder[GmailImageAd]
  extends AdWordsBuilder[GmailImageAdBuilder[GmailImageAd]]
     with hasFinalUrlBuilder[GmailImageAdBuilder[GmailImageAd]]
     with hasTrackingTemplateBuilder[GmailImageAdBuilder[GmailImageAd]] {
  def withAdvertiser(advertiser: String): GmailImageAdBuilder[GmailImageAd]
  def withDescription(description: String): GmailImageAdBuilder[GmailImageAd]
  def withDisplayUrl(displayUrl: String): GmailImageAdBuilder[GmailImageAd]
  def withImage(image: Media): GmailImageAdBuilder[GmailImageAd]
  def withLogo(logo: Media): GmailImageAdBuilder[GmailImageAd]
  def withName(name: String): GmailImageAdBuilder[GmailImageAd]
  def withSubject(subject: String): GmailImageAdBuilder[GmailImageAd]
}

object GmailImageAdBuilder {
  @scala.inline
  def apply[GmailImageAd](
    build: () => AdWordsOperation[GmailImageAdBuilder[GmailImageAd]],
    withAdvertiser: String => GmailImageAdBuilder[GmailImageAd],
    withCustomParameters: js.Object => GmailImageAdBuilder[GmailImageAd],
    withDescription: String => GmailImageAdBuilder[GmailImageAd],
    withDisplayUrl: String => GmailImageAdBuilder[GmailImageAd],
    withFinalUrl: String => GmailImageAdBuilder[GmailImageAd],
    withImage: Media => GmailImageAdBuilder[GmailImageAd],
    withLogo: Media => GmailImageAdBuilder[GmailImageAd],
    withMobileFinalUrl: String => GmailImageAdBuilder[GmailImageAd],
    withName: String => GmailImageAdBuilder[GmailImageAd],
    withSubject: String => GmailImageAdBuilder[GmailImageAd],
    withTrackingTemplate: String => GmailImageAdBuilder[GmailImageAd]
  ): GmailImageAdBuilder[GmailImageAd] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), withAdvertiser = js.Any.fromFunction1(withAdvertiser), withCustomParameters = js.Any.fromFunction1(withCustomParameters), withDescription = js.Any.fromFunction1(withDescription), withDisplayUrl = js.Any.fromFunction1(withDisplayUrl), withFinalUrl = js.Any.fromFunction1(withFinalUrl), withImage = js.Any.fromFunction1(withImage), withLogo = js.Any.fromFunction1(withLogo), withMobileFinalUrl = js.Any.fromFunction1(withMobileFinalUrl), withName = js.Any.fromFunction1(withName), withSubject = js.Any.fromFunction1(withSubject), withTrackingTemplate = js.Any.fromFunction1(withTrackingTemplate))
  
    __obj.asInstanceOf[GmailImageAdBuilder[GmailImageAd]]
  }
}

