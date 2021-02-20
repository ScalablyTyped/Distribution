package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GmailSinglePromotionAdBuilder[GmailSinglePromotionAd] extends AdBuilder[GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]] {
  
  def withAdvertiser(advertiser: String): GmailSinglePromotionAdBuilder[GmailSinglePromotionAd] = js.native
  
  def withCallToAction(callToAction: String): GmailSinglePromotionAdBuilder[GmailSinglePromotionAd] = js.native
  
  def withCallToActionButtonColor(callToActionButtonColor: String): GmailSinglePromotionAdBuilder[GmailSinglePromotionAd] = js.native
  
  def withCallToActionTextColor(callToActionTextColor: String): GmailSinglePromotionAdBuilder[GmailSinglePromotionAd] = js.native
  
  def withContent(content: String): GmailSinglePromotionAdBuilder[GmailSinglePromotionAd] = js.native
  
  def withDescription(description: String): GmailSinglePromotionAdBuilder[GmailSinglePromotionAd] = js.native
  
  def withDisplayUrl(displayUrl: String): GmailSinglePromotionAdBuilder[GmailSinglePromotionAd] = js.native
  
  def withHeader(header: Media): GmailSinglePromotionAdBuilder[GmailSinglePromotionAd] = js.native
  
  def withHeadline(headline: String): GmailSinglePromotionAdBuilder[GmailSinglePromotionAd] = js.native
  
  def withHeadlineColor(headlineColor: String): GmailSinglePromotionAdBuilder[GmailSinglePromotionAd] = js.native
  
  def withImage(image: Media): GmailSinglePromotionAdBuilder[GmailSinglePromotionAd] = js.native
  
  def withLogo(logo: Media): GmailSinglePromotionAdBuilder[GmailSinglePromotionAd] = js.native
  
  def withName(name: String): GmailSinglePromotionAdBuilder[GmailSinglePromotionAd] = js.native
  
  def withSubject(subject: String): GmailSinglePromotionAdBuilder[GmailSinglePromotionAd] = js.native
}
object GmailSinglePromotionAdBuilder {
  
  @scala.inline
  def apply[GmailSinglePromotionAd](
    build: () => AdWordsOperation[GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]],
    withAdvertiser: String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd],
    withCallToAction: String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd],
    withCallToActionButtonColor: String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd],
    withCallToActionTextColor: String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd],
    withContent: String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd],
    withCustomParameters: js.Object => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd],
    withDescription: String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd],
    withDisplayUrl: String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd],
    withFinalUrl: String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd],
    withHeader: Media => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd],
    withHeadline: String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd],
    withHeadlineColor: String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd],
    withImage: Media => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd],
    withLogo: Media => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd],
    withMobileFinalUrl: String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd],
    withName: String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd],
    withSubject: String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd],
    withTrackingTemplate: String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]
  ): GmailSinglePromotionAdBuilder[GmailSinglePromotionAd] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), withAdvertiser = js.Any.fromFunction1(withAdvertiser), withCallToAction = js.Any.fromFunction1(withCallToAction), withCallToActionButtonColor = js.Any.fromFunction1(withCallToActionButtonColor), withCallToActionTextColor = js.Any.fromFunction1(withCallToActionTextColor), withContent = js.Any.fromFunction1(withContent), withCustomParameters = js.Any.fromFunction1(withCustomParameters), withDescription = js.Any.fromFunction1(withDescription), withDisplayUrl = js.Any.fromFunction1(withDisplayUrl), withFinalUrl = js.Any.fromFunction1(withFinalUrl), withHeader = js.Any.fromFunction1(withHeader), withHeadline = js.Any.fromFunction1(withHeadline), withHeadlineColor = js.Any.fromFunction1(withHeadlineColor), withImage = js.Any.fromFunction1(withImage), withLogo = js.Any.fromFunction1(withLogo), withMobileFinalUrl = js.Any.fromFunction1(withMobileFinalUrl), withName = js.Any.fromFunction1(withName), withSubject = js.Any.fromFunction1(withSubject), withTrackingTemplate = js.Any.fromFunction1(withTrackingTemplate))
    __obj.asInstanceOf[GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]]
  }
  
  @scala.inline
  implicit class GmailSinglePromotionAdBuilderMutableBuilder[Self <: GmailSinglePromotionAdBuilder[_], GmailSinglePromotionAd] (val x: Self with GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]) extends AnyVal {
    
    @scala.inline
    def setWithAdvertiser(value: String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]): Self = StObject.set(x, "withAdvertiser", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWithCallToAction(value: String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]): Self = StObject.set(x, "withCallToAction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWithCallToActionButtonColor(value: String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]): Self = StObject.set(x, "withCallToActionButtonColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWithCallToActionTextColor(value: String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]): Self = StObject.set(x, "withCallToActionTextColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWithContent(value: String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]): Self = StObject.set(x, "withContent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWithDescription(value: String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]): Self = StObject.set(x, "withDescription", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWithDisplayUrl(value: String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]): Self = StObject.set(x, "withDisplayUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWithHeader(value: Media => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]): Self = StObject.set(x, "withHeader", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWithHeadline(value: String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]): Self = StObject.set(x, "withHeadline", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWithHeadlineColor(value: String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]): Self = StObject.set(x, "withHeadlineColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWithImage(value: Media => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]): Self = StObject.set(x, "withImage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWithLogo(value: Media => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]): Self = StObject.set(x, "withLogo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWithName(value: String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]): Self = StObject.set(x, "withName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWithSubject(value: String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]): Self = StObject.set(x, "withSubject", js.Any.fromFunction1(value))
  }
}
