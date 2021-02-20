package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoBuilder[Media] extends AdWordsBuilder[Media] {
  
  def withYouTubeVideoId(youTubeVideoId: String): VideoBuilder[Media] = js.native
}
object VideoBuilder {
  
  @scala.inline
  def apply[Media](build: () => AdWordsOperation[Media], withYouTubeVideoId: String => VideoBuilder[Media]): VideoBuilder[Media] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), withYouTubeVideoId = js.Any.fromFunction1(withYouTubeVideoId))
    __obj.asInstanceOf[VideoBuilder[Media]]
  }
  
  @scala.inline
  implicit class VideoBuilderMutableBuilder[Self <: VideoBuilder[_], Media] (val x: Self with VideoBuilder[Media]) extends AnyVal {
    
    @scala.inline
    def setWithYouTubeVideoId(value: String => VideoBuilder[Media]): Self = StObject.set(x, "withYouTubeVideoId", js.Any.fromFunction1(value))
  }
}
