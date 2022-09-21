package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.Builder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Builder for a YouTube video under construction.
  *
  * Typical usage:
  *
  *      var youTubeVideoId = "123ABCabc-_";
  *      var mediaOperation = AdsApp.adMedia().newVideoBuilder()
  *         .withYouTubeVideoId(youTubeVideoId)
  *         .build();
  *
  *      var video = mediaOperation.getResult();
  */
trait VideoBuilder
  extends StObject
     with Builder[MediaOperation] {
  
  /** Sets YouTube video ID. */
  def withYouTubeVideoId(youTubeVideoId: String): VideoBuilder
}
object VideoBuilder {
  
  inline def apply(build: () => MediaOperation, withYouTubeVideoId: String => VideoBuilder): VideoBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), withYouTubeVideoId = js.Any.fromFunction1(withYouTubeVideoId))
    __obj.asInstanceOf[VideoBuilder]
  }
  
  extension [Self <: VideoBuilder](x: Self) {
    
    inline def setWithYouTubeVideoId(value: String => VideoBuilder): Self = StObject.set(x, "withYouTubeVideoId", js.Any.fromFunction1(value))
  }
}
