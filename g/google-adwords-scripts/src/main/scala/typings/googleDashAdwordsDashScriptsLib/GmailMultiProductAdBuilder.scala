package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GmailMultiProductAdBuilder[GmailMultiProductAd] extends AdBuilder[GmailMultiProductAdBuilder[GmailImageAd]] {
  def withAdvertiser(advertiser: java.lang.String): GmailMultiProductAdBuilder[GmailMultiProductAd]
  def withContent(content: java.lang.String): GmailMultiProductAdBuilder[GmailMultiProductAd]
  def withDescription(description: java.lang.String): GmailMultiProductAdBuilder[GmailMultiProductAd]
  def withHeader(header: Media): GmailMultiProductAdBuilder[GmailMultiProductAd]
  def withHeadline(headline: java.lang.String): GmailMultiProductAdBuilder[GmailMultiProductAd]
  def withHeadlineColor(headlineColor: java.lang.String): GmailMultiProductAdBuilder[GmailMultiProductAd]
  def withItemButtonCallsToAction(itemCallsToAction: js.Array[java.lang.String]): GmailMultiProductAdBuilder[GmailMultiProductAd]
  def withItemButtonFinalMobileUrls(itemButtonFinalMobileUrls: js.Array[java.lang.String]): GmailMultiProductAdBuilder[GmailMultiProductAd]
  def withItemButtonFinalUrls(itemButtonFinalUrls: js.Array[java.lang.String]): GmailMultiProductAdBuilder[GmailMultiProductAd]
  def withItemButtonTrackingTemplates(itemButtonTrackingTemplates: js.Array[java.lang.String]): GmailMultiProductAdBuilder[GmailMultiProductAd]
  def withItemImages(itemImages: js.Array[Media]): GmailMultiProductAdBuilder[GmailMultiProductAd]
  def withItemTitle(itemTitles: js.Array[java.lang.String]): GmailMultiProductAdBuilder[GmailMultiProductAd]
  def withLogo(logo: Media): GmailMultiProductAdBuilder[GmailMultiProductAd]
  def withName(name: java.lang.String): GmailMultiProductAdBuilder[GmailMultiProductAd]
  def withSubject(subject: java.lang.String): GmailMultiProductAdBuilder[GmailMultiProductAd]
}

object GmailMultiProductAdBuilder {
  @scala.inline
  def apply[GmailMultiProductAd](
    build: () => AdWordsOperation[GmailMultiProductAdBuilder[GmailImageAd]],
    withAdvertiser: java.lang.String => GmailMultiProductAdBuilder[GmailMultiProductAd],
    withContent: java.lang.String => GmailMultiProductAdBuilder[GmailMultiProductAd],
    withCustomParameters: js.Object => GmailMultiProductAdBuilder[GmailImageAd],
    withDescription: java.lang.String => GmailMultiProductAdBuilder[GmailMultiProductAd],
    withFinalUrl: java.lang.String => GmailMultiProductAdBuilder[GmailImageAd],
    withHeader: Media => GmailMultiProductAdBuilder[GmailMultiProductAd],
    withHeadline: java.lang.String => GmailMultiProductAdBuilder[GmailMultiProductAd],
    withHeadlineColor: java.lang.String => GmailMultiProductAdBuilder[GmailMultiProductAd],
    withItemButtonCallsToAction: js.Array[java.lang.String] => GmailMultiProductAdBuilder[GmailMultiProductAd],
    withItemButtonFinalMobileUrls: js.Array[java.lang.String] => GmailMultiProductAdBuilder[GmailMultiProductAd],
    withItemButtonFinalUrls: js.Array[java.lang.String] => GmailMultiProductAdBuilder[GmailMultiProductAd],
    withItemButtonTrackingTemplates: js.Array[java.lang.String] => GmailMultiProductAdBuilder[GmailMultiProductAd],
    withItemImages: js.Array[Media] => GmailMultiProductAdBuilder[GmailMultiProductAd],
    withItemTitle: js.Array[java.lang.String] => GmailMultiProductAdBuilder[GmailMultiProductAd],
    withLogo: Media => GmailMultiProductAdBuilder[GmailMultiProductAd],
    withMobileFinalUrl: java.lang.String => GmailMultiProductAdBuilder[GmailImageAd],
    withName: java.lang.String => GmailMultiProductAdBuilder[GmailMultiProductAd],
    withSubject: java.lang.String => GmailMultiProductAdBuilder[GmailMultiProductAd],
    withTrackingTemplate: java.lang.String => GmailMultiProductAdBuilder[GmailImageAd]
  ): GmailMultiProductAdBuilder[GmailMultiProductAd] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), withAdvertiser = js.Any.fromFunction1(withAdvertiser), withContent = js.Any.fromFunction1(withContent), withCustomParameters = js.Any.fromFunction1(withCustomParameters), withDescription = js.Any.fromFunction1(withDescription), withFinalUrl = js.Any.fromFunction1(withFinalUrl), withHeader = js.Any.fromFunction1(withHeader), withHeadline = js.Any.fromFunction1(withHeadline), withHeadlineColor = js.Any.fromFunction1(withHeadlineColor), withItemButtonCallsToAction = js.Any.fromFunction1(withItemButtonCallsToAction), withItemButtonFinalMobileUrls = js.Any.fromFunction1(withItemButtonFinalMobileUrls), withItemButtonFinalUrls = js.Any.fromFunction1(withItemButtonFinalUrls), withItemButtonTrackingTemplates = js.Any.fromFunction1(withItemButtonTrackingTemplates), withItemImages = js.Any.fromFunction1(withItemImages), withItemTitle = js.Any.fromFunction1(withItemTitle), withLogo = js.Any.fromFunction1(withLogo), withMobileFinalUrl = js.Any.fromFunction1(withMobileFinalUrl), withName = js.Any.fromFunction1(withName), withSubject = js.Any.fromFunction1(withSubject), withTrackingTemplate = js.Any.fromFunction1(withTrackingTemplate))
  
    __obj.asInstanceOf[GmailMultiProductAdBuilder[GmailMultiProductAd]]
  }
}

