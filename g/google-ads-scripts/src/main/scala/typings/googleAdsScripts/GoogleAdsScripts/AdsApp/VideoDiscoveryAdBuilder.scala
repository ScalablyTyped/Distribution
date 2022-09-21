package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.Builder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Builder for a video discovery ad under construction. */
trait VideoDiscoveryAdBuilder
  extends StObject
     with Builder[VideoAdOperation] {
  
  /** Sets the video ad name. */
  def withAdName(adName: String): this.type
  
  /** Sets the first line of the new ad's description to the specified value. */
  def withDescription1(description1: String): this.type
  
  /** Sets the second line of the new ad's description to the specified value. */
  def withDescription2(description2: String): this.type
  
  /** Sets the destination page. */
  def withDestinationPage(destinationPage: String): this.type
  
  /** Sets the headline of the new ad to the specified value. */
  def withHeadline(headline: String): this.type
  
  /** Sets the thumbnail that you want to appear with the ad. */
  def withThumbnail(thumbnail: String): this.type
  
  /** Sets the YouTube video that this ad will be built on. */
  def withVideo(videoMedia: Media): this.type
}
object VideoDiscoveryAdBuilder {
  
  inline def apply(
    build: () => VideoAdOperation,
    withAdName: String => VideoDiscoveryAdBuilder,
    withDescription1: String => VideoDiscoveryAdBuilder,
    withDescription2: String => VideoDiscoveryAdBuilder,
    withDestinationPage: String => VideoDiscoveryAdBuilder,
    withHeadline: String => VideoDiscoveryAdBuilder,
    withThumbnail: String => VideoDiscoveryAdBuilder,
    withVideo: Media => VideoDiscoveryAdBuilder
  ): VideoDiscoveryAdBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), withAdName = js.Any.fromFunction1(withAdName), withDescription1 = js.Any.fromFunction1(withDescription1), withDescription2 = js.Any.fromFunction1(withDescription2), withDestinationPage = js.Any.fromFunction1(withDestinationPage), withHeadline = js.Any.fromFunction1(withHeadline), withThumbnail = js.Any.fromFunction1(withThumbnail), withVideo = js.Any.fromFunction1(withVideo))
    __obj.asInstanceOf[VideoDiscoveryAdBuilder]
  }
  
  extension [Self <: VideoDiscoveryAdBuilder](x: Self) {
    
    inline def setWithAdName(value: String => VideoDiscoveryAdBuilder): Self = StObject.set(x, "withAdName", js.Any.fromFunction1(value))
    
    inline def setWithDescription1(value: String => VideoDiscoveryAdBuilder): Self = StObject.set(x, "withDescription1", js.Any.fromFunction1(value))
    
    inline def setWithDescription2(value: String => VideoDiscoveryAdBuilder): Self = StObject.set(x, "withDescription2", js.Any.fromFunction1(value))
    
    inline def setWithDestinationPage(value: String => VideoDiscoveryAdBuilder): Self = StObject.set(x, "withDestinationPage", js.Any.fromFunction1(value))
    
    inline def setWithHeadline(value: String => VideoDiscoveryAdBuilder): Self = StObject.set(x, "withHeadline", js.Any.fromFunction1(value))
    
    inline def setWithThumbnail(value: String => VideoDiscoveryAdBuilder): Self = StObject.set(x, "withThumbnail", js.Any.fromFunction1(value))
    
    inline def setWithVideo(value: Media => VideoDiscoveryAdBuilder): Self = StObject.set(x, "withVideo", js.Any.fromFunction1(value))
  }
}
