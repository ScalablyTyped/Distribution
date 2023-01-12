package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoBuilder[Media]
  extends StObject
     with AdWordsBuilder[Media] {
  
  def withYouTubeVideoId(youTubeVideoId: String): VideoBuilder[Media]
}
object VideoBuilder {
  
  inline def apply[Media](build: () => AdWordsOperation[Media], withYouTubeVideoId: String => VideoBuilder[Media]): VideoBuilder[Media] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), withYouTubeVideoId = js.Any.fromFunction1(withYouTubeVideoId))
    __obj.asInstanceOf[VideoBuilder[Media]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VideoBuilder[?], Media] (val x: Self & VideoBuilder[Media]) extends AnyVal {
    
    inline def setWithYouTubeVideoId(value: String => VideoBuilder[Media]): Self = StObject.set(x, "withYouTubeVideoId", js.Any.fromFunction1(value))
  }
}
