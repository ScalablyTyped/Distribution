package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.Builder
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Builder for a non-skippable video ad under construction. */
trait NonSkippableAdBuilder
  extends StObject
     with Builder[VideoAdOperation] {
  
  /** Sets the video ad name. */
  def withAdName(adName: String): this.type
  
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
object NonSkippableAdBuilder {
  
  inline def apply(
    build: () => VideoAdOperation,
    withAdName: String => NonSkippableAdBuilder,
    withCompanionBanner: Media => NonSkippableAdBuilder,
    withCustomParameters: Record[String, String] => NonSkippableAdBuilder,
    withDisplayUrl: String => NonSkippableAdBuilder,
    withFinalUrl: String => NonSkippableAdBuilder,
    withTrackingTemplate: String => NonSkippableAdBuilder,
    withVideo: Media => NonSkippableAdBuilder
  ): NonSkippableAdBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), withAdName = js.Any.fromFunction1(withAdName), withCompanionBanner = js.Any.fromFunction1(withCompanionBanner), withCustomParameters = js.Any.fromFunction1(withCustomParameters), withDisplayUrl = js.Any.fromFunction1(withDisplayUrl), withFinalUrl = js.Any.fromFunction1(withFinalUrl), withTrackingTemplate = js.Any.fromFunction1(withTrackingTemplate), withVideo = js.Any.fromFunction1(withVideo))
    __obj.asInstanceOf[NonSkippableAdBuilder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NonSkippableAdBuilder] (val x: Self) extends AnyVal {
    
    inline def setWithAdName(value: String => NonSkippableAdBuilder): Self = StObject.set(x, "withAdName", js.Any.fromFunction1(value))
    
    inline def setWithCompanionBanner(value: Media => NonSkippableAdBuilder): Self = StObject.set(x, "withCompanionBanner", js.Any.fromFunction1(value))
    
    inline def setWithCustomParameters(value: Record[String, String] => NonSkippableAdBuilder): Self = StObject.set(x, "withCustomParameters", js.Any.fromFunction1(value))
    
    inline def setWithDisplayUrl(value: String => NonSkippableAdBuilder): Self = StObject.set(x, "withDisplayUrl", js.Any.fromFunction1(value))
    
    inline def setWithFinalUrl(value: String => NonSkippableAdBuilder): Self = StObject.set(x, "withFinalUrl", js.Any.fromFunction1(value))
    
    inline def setWithTrackingTemplate(value: String => NonSkippableAdBuilder): Self = StObject.set(x, "withTrackingTemplate", js.Any.fromFunction1(value))
    
    inline def setWithVideo(value: Media => NonSkippableAdBuilder): Self = StObject.set(x, "withVideo", js.Any.fromFunction1(value))
  }
}
