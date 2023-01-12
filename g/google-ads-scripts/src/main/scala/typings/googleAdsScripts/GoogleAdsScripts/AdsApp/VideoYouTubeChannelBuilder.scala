package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.Builder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Builder for VideoYouTubeChannel objects.
  *
  * Example usage:
  *
  *      var videoYouTubeChannelBuilder = videoAdGroup.videoTargeting().newYouTubeChannelBuilder();
  *      var videoYouTubeChannelOperation = videoYouTubeChannelBuilder
  *        .withChannelId('UCqVDpXKLmKeBU_yyt_QkItQ')    // required
  *        .build();                                     // create the YouTube channel
  */
trait VideoYouTubeChannelBuilder
  extends StObject
     with Builder[VideoYouTubeChannelOperation] {
  
  /** Builds the excluded video YouTube channel. */
  def exclude(): ExcludedVideoYouTubeChannelOperation
  
  /** Sets the YouTube channel ID. */
  def withChannelId(channelId: String): this.type
}
object VideoYouTubeChannelBuilder {
  
  inline def apply(
    build: () => VideoYouTubeChannelOperation,
    exclude: () => ExcludedVideoYouTubeChannelOperation,
    withChannelId: String => VideoYouTubeChannelBuilder
  ): VideoYouTubeChannelBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), exclude = js.Any.fromFunction0(exclude), withChannelId = js.Any.fromFunction1(withChannelId))
    __obj.asInstanceOf[VideoYouTubeChannelBuilder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VideoYouTubeChannelBuilder] (val x: Self) extends AnyVal {
    
    inline def setExclude(value: () => ExcludedVideoYouTubeChannelOperation): Self = StObject.set(x, "exclude", js.Any.fromFunction0(value))
    
    inline def setWithChannelId(value: String => VideoYouTubeChannelBuilder): Self = StObject.set(x, "withChannelId", js.Any.fromFunction1(value))
  }
}
