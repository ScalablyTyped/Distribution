package typings.gapiYoutube.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoId extends StObject {
  
  /**
    * The videoId parameter specifies a YouTube video ID for which the custom video thumbnail is being provided.
    */
  var videoId: String = js.native
}
object VideoId {
  
  @scala.inline
  def apply(videoId: String): VideoId = {
    val __obj = js.Dynamic.literal(videoId = videoId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoId]
  }
  
  @scala.inline
  implicit class VideoIdMutableBuilder[Self <: VideoId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVideoId(value: String): Self = StObject.set(x, "videoId", value.asInstanceOf[js.Any])
  }
}
