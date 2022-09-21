package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.Builder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Builder for YouTubeChannel objects.
  *
  * Example usage:
  *
  *      var youTubeChannelBuilder = adGroup.display().newYouTubeChannelBuilder();
  *      var youTubeChannelOperation = youTubeChannelBuilder
  *        .withChannelId('UCqVDpXKLmKeBU_yyt_QkItQ')    // required
  *        .build();                                     // create the YouTube channel
  */
trait YouTubeChannelBuilder
  extends StObject
     with Builder[YouTubeChannelOperation] {
  
  /** Builds the excluded YouTube channel. */
  def exclude(): ExcludedYouTubeChannelOperation
  
  /** Sets the YouTube channel ID. */
  def withChannelId(channelId: String): this.type
  
  /** Sets the max CPC bid of the new YouTube channel to the specified value. */
  def withCpc(cpc: Double): this.type
  
  /** Sets the CPM bid of the new YouTube channel to the specified value. */
  def withCpm(cpm: Double): this.type
}
object YouTubeChannelBuilder {
  
  inline def apply(
    build: () => YouTubeChannelOperation,
    exclude: () => ExcludedYouTubeChannelOperation,
    withChannelId: String => YouTubeChannelBuilder,
    withCpc: Double => YouTubeChannelBuilder,
    withCpm: Double => YouTubeChannelBuilder
  ): YouTubeChannelBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), exclude = js.Any.fromFunction0(exclude), withChannelId = js.Any.fromFunction1(withChannelId), withCpc = js.Any.fromFunction1(withCpc), withCpm = js.Any.fromFunction1(withCpm))
    __obj.asInstanceOf[YouTubeChannelBuilder]
  }
  
  extension [Self <: YouTubeChannelBuilder](x: Self) {
    
    inline def setExclude(value: () => ExcludedYouTubeChannelOperation): Self = StObject.set(x, "exclude", js.Any.fromFunction0(value))
    
    inline def setWithChannelId(value: String => YouTubeChannelBuilder): Self = StObject.set(x, "withChannelId", js.Any.fromFunction1(value))
    
    inline def setWithCpc(value: Double => YouTubeChannelBuilder): Self = StObject.set(x, "withCpc", js.Any.fromFunction1(value))
    
    inline def setWithCpm(value: Double => YouTubeChannelBuilder): Self = StObject.set(x, "withCpm", js.Any.fromFunction1(value))
  }
}
