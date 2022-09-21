package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.Builder
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Builder for an in-stream video ad under construction. */
trait InStreamAdBuilder
  extends StObject
     with Builder[VideoAdOperation] {
  
  /** Sets the headline of the action ad. */
  def withActionHeadline(headline: String): this.type
  
  /** Sets the video ad name. */
  def withAdName(adName: String): this.type
  
  /** Sets the call-to-action of the action ad. */
  def withCallToAction(callToAction: String): this.type
  
  /** Sets the image that will be used as customized companion banner. */
  def withCompanionBanner(imageMedia: Media): this.type
  
  /** Sets the custom parameters of the new video ad to the specified value. */
  def withCustomParameters(customParameters: Record[String, String]): this.type
  
  /** Sets the website address that appears on the ad. */
  def withDisplayUrl(displayUrl: String): this.type
  
  /** Sets the final URL of the new video ad to the specified value. */
  def withFinalUrl(finalUrl: String): this.type
  
  /** Sets the tracking template of the new video ad to the specified value. */
  def withTrackingTemplate(trackingTemplate: String): this.type
  
  /** Sets the YouTube video that this ad will be built on. */
  def withVideo(videoMedia: Media): this.type
}
object InStreamAdBuilder {
  
  inline def apply(
    build: () => VideoAdOperation,
    withActionHeadline: String => InStreamAdBuilder,
    withAdName: String => InStreamAdBuilder,
    withCallToAction: String => InStreamAdBuilder,
    withCompanionBanner: Media => InStreamAdBuilder,
    withCustomParameters: Record[String, String] => InStreamAdBuilder,
    withDisplayUrl: String => InStreamAdBuilder,
    withFinalUrl: String => InStreamAdBuilder,
    withTrackingTemplate: String => InStreamAdBuilder,
    withVideo: Media => InStreamAdBuilder
  ): InStreamAdBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), withActionHeadline = js.Any.fromFunction1(withActionHeadline), withAdName = js.Any.fromFunction1(withAdName), withCallToAction = js.Any.fromFunction1(withCallToAction), withCompanionBanner = js.Any.fromFunction1(withCompanionBanner), withCustomParameters = js.Any.fromFunction1(withCustomParameters), withDisplayUrl = js.Any.fromFunction1(withDisplayUrl), withFinalUrl = js.Any.fromFunction1(withFinalUrl), withTrackingTemplate = js.Any.fromFunction1(withTrackingTemplate), withVideo = js.Any.fromFunction1(withVideo))
    __obj.asInstanceOf[InStreamAdBuilder]
  }
  
  extension [Self <: InStreamAdBuilder](x: Self) {
    
    inline def setWithActionHeadline(value: String => InStreamAdBuilder): Self = StObject.set(x, "withActionHeadline", js.Any.fromFunction1(value))
    
    inline def setWithAdName(value: String => InStreamAdBuilder): Self = StObject.set(x, "withAdName", js.Any.fromFunction1(value))
    
    inline def setWithCallToAction(value: String => InStreamAdBuilder): Self = StObject.set(x, "withCallToAction", js.Any.fromFunction1(value))
    
    inline def setWithCompanionBanner(value: Media => InStreamAdBuilder): Self = StObject.set(x, "withCompanionBanner", js.Any.fromFunction1(value))
    
    inline def setWithCustomParameters(value: Record[String, String] => InStreamAdBuilder): Self = StObject.set(x, "withCustomParameters", js.Any.fromFunction1(value))
    
    inline def setWithDisplayUrl(value: String => InStreamAdBuilder): Self = StObject.set(x, "withDisplayUrl", js.Any.fromFunction1(value))
    
    inline def setWithFinalUrl(value: String => InStreamAdBuilder): Self = StObject.set(x, "withFinalUrl", js.Any.fromFunction1(value))
    
    inline def setWithTrackingTemplate(value: String => InStreamAdBuilder): Self = StObject.set(x, "withTrackingTemplate", js.Any.fromFunction1(value))
    
    inline def setWithVideo(value: Media => InStreamAdBuilder): Self = StObject.set(x, "withVideo", js.Any.fromFunction1(value))
  }
}
