package typings.gapiYoutube.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoId extends StObject {
  
  /**
    * The videoId parameter specifies a YouTube video ID for which the custom video thumbnail is being provided.
    */
  var videoId: String
}
object VideoId {
  
  inline def apply(videoId: String): VideoId = {
    val __obj = js.Dynamic.literal(videoId = videoId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoId]
  }
  
  extension [Self <: VideoId](x: Self) {
    
    inline def setVideoId(value: String): Self = StObject.set(x, "videoId", value.asInstanceOf[js.Any])
  }
}
