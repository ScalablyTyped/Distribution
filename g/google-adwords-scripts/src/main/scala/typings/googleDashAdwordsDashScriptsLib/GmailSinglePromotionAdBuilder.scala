package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GmailSinglePromotionAdBuilder[GmailSinglePromotionAd] extends AdBuilder[GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]] {
  def withAdvertiser(advertiser: java.lang.String): GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]
  def withCallToAction(callToAction: java.lang.String): GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]
  def withCallToActionButtonColor(callToActionButtonColor: java.lang.String): GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]
  def withCallToActionTextColor(callToActionTextColor: java.lang.String): GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]
  def withContent(content: java.lang.String): GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]
  def withDescription(description: java.lang.String): GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]
  def withDisplayUrl(displayUrl: java.lang.String): GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]
  def withHeader(header: Media): GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]
  def withHeadline(headline: java.lang.String): GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]
  def withHeadlineColor(headlineColor: java.lang.String): GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]
  def withImage(image: Media): GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]
  def withLogo(logo: Media): GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]
  def withName(name: java.lang.String): GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]
  def withSubject(subject: java.lang.String): GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]
}

object GmailSinglePromotionAdBuilder {
  @scala.inline
  def apply[GmailSinglePromotionAd](
    build: () => AdWordsOperation[GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]],
    withAdvertiser: java.lang.String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd],
    withCallToAction: java.lang.String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd],
    withCallToActionButtonColor: java.lang.String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd],
    withCallToActionTextColor: java.lang.String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd],
    withContent: java.lang.String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd],
    withCustomParameters: js.Object => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd],
    withDescription: java.lang.String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd],
    withDisplayUrl: java.lang.String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd],
    withFinalUrl: java.lang.String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd],
    withHeader: Media => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd],
    withHeadline: java.lang.String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd],
    withHeadlineColor: java.lang.String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd],
    withImage: Media => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd],
    withLogo: Media => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd],
    withMobileFinalUrl: java.lang.String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd],
    withName: java.lang.String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd],
    withSubject: java.lang.String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd],
    withTrackingTemplate: java.lang.String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]
  ): GmailSinglePromotionAdBuilder[GmailSinglePromotionAd] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), withAdvertiser = js.Any.fromFunction1(withAdvertiser), withCallToAction = js.Any.fromFunction1(withCallToAction), withCallToActionButtonColor = js.Any.fromFunction1(withCallToActionButtonColor), withCallToActionTextColor = js.Any.fromFunction1(withCallToActionTextColor), withContent = js.Any.fromFunction1(withContent), withCustomParameters = js.Any.fromFunction1(withCustomParameters), withDescription = js.Any.fromFunction1(withDescription), withDisplayUrl = js.Any.fromFunction1(withDisplayUrl), withFinalUrl = js.Any.fromFunction1(withFinalUrl), withHeader = js.Any.fromFunction1(withHeader), withHeadline = js.Any.fromFunction1(withHeadline), withHeadlineColor = js.Any.fromFunction1(withHeadlineColor), withImage = js.Any.fromFunction1(withImage), withLogo = js.Any.fromFunction1(withLogo), withMobileFinalUrl = js.Any.fromFunction1(withMobileFinalUrl), withName = js.Any.fromFunction1(withName), withSubject = js.Any.fromFunction1(withSubject), withTrackingTemplate = js.Any.fromFunction1(withTrackingTemplate))
  
    __obj.asInstanceOf[GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]]
  }
}

