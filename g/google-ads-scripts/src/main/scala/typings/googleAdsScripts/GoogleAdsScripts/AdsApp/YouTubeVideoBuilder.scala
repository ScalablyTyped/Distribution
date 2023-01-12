package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Builder for YouTubeVideo objects.
  *
  * Example usage:
  *
  *  var youTubeVideoBuilder = adGroup.display().newYouTubeVideoBuilder();
  *  var youTubeVideoOperation = youTubeVideoBuilder
  *    .withVideoId('_YUugB4IUl4')      // required
  *    .build();                        // create the YouTube video
  */
trait YouTubeVideoBuilder extends StObject {
  
  /** Builds the excluded YouTube video criterion. */
  def exclude(): ExcludedYouTubeVideoOperation
  
  /** Sets the max CPC bid of the new YouTube video to the specified value. */
  def withCpc(cpc: Double): this.type
  
  /** Sets the CPM bid of the new YouTube video to the specified value. */
  def withCpm(cpm: Double): this.type
  
  /** Sets the YouTube video ID. */
  def withVideoId(videoId: String): this.type
}
object YouTubeVideoBuilder {
  
  inline def apply(
    exclude: () => ExcludedYouTubeVideoOperation,
    withCpc: Double => YouTubeVideoBuilder,
    withCpm: Double => YouTubeVideoBuilder,
    withVideoId: String => YouTubeVideoBuilder
  ): YouTubeVideoBuilder = {
    val __obj = js.Dynamic.literal(exclude = js.Any.fromFunction0(exclude), withCpc = js.Any.fromFunction1(withCpc), withCpm = js.Any.fromFunction1(withCpm), withVideoId = js.Any.fromFunction1(withVideoId))
    __obj.asInstanceOf[YouTubeVideoBuilder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: YouTubeVideoBuilder] (val x: Self) extends AnyVal {
    
    inline def setExclude(value: () => ExcludedYouTubeVideoOperation): Self = StObject.set(x, "exclude", js.Any.fromFunction0(value))
    
    inline def setWithCpc(value: Double => YouTubeVideoBuilder): Self = StObject.set(x, "withCpc", js.Any.fromFunction1(value))
    
    inline def setWithCpm(value: Double => YouTubeVideoBuilder): Self = StObject.set(x, "withCpm", js.Any.fromFunction1(value))
    
    inline def setWithVideoId(value: String => YouTubeVideoBuilder): Self = StObject.set(x, "withVideoId", js.Any.fromFunction1(value))
  }
}
