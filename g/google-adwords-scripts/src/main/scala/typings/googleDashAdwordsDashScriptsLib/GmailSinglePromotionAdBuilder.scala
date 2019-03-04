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
    build: js.Function0[AdWordsOperation[GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]]],
    withAdvertiser: js.Function1[java.lang.String, GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]],
    withCallToAction: js.Function1[java.lang.String, GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]],
    withCallToActionButtonColor: js.Function1[java.lang.String, GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]],
    withCallToActionTextColor: js.Function1[java.lang.String, GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]],
    withContent: js.Function1[java.lang.String, GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]],
    withCustomParameters: js.Function1[js.Object, GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]],
    withDescription: js.Function1[java.lang.String, GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]],
    withDisplayUrl: js.Function1[java.lang.String, GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]],
    withFinalUrl: js.Function1[java.lang.String, GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]],
    withHeader: js.Function1[Media, GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]],
    withHeadline: js.Function1[java.lang.String, GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]],
    withHeadlineColor: js.Function1[java.lang.String, GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]],
    withImage: js.Function1[Media, GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]],
    withLogo: js.Function1[Media, GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]],
    withMobileFinalUrl: js.Function1[java.lang.String, GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]],
    withName: js.Function1[java.lang.String, GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]],
    withSubject: js.Function1[java.lang.String, GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]],
    withTrackingTemplate: js.Function1[java.lang.String, GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]]
  ): GmailSinglePromotionAdBuilder[GmailSinglePromotionAd] = {
    val __obj = js.Dynamic.literal(build = build, withAdvertiser = withAdvertiser, withCallToAction = withCallToAction, withCallToActionButtonColor = withCallToActionButtonColor, withCallToActionTextColor = withCallToActionTextColor, withContent = withContent, withCustomParameters = withCustomParameters, withDescription = withDescription, withDisplayUrl = withDisplayUrl, withFinalUrl = withFinalUrl, withHeader = withHeader, withHeadline = withHeadline, withHeadlineColor = withHeadlineColor, withImage = withImage, withLogo = withLogo, withMobileFinalUrl = withMobileFinalUrl, withName = withName, withSubject = withSubject, withTrackingTemplate = withTrackingTemplate)
  
    __obj.asInstanceOf[GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]]
  }
}

