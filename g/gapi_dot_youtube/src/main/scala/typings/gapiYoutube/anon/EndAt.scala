package typings.gapiYoutube.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndAt extends StObject {
  
  /**
    * The time, measured in seconds from the start of the video, when the video should stop playing. (The playlist owner can specify the times when the video should start and stop playing when the video is played in the context of the playlist.) By default, assume that the video.endTime is the end of the video.
    */
  var endAt: String = js.native
  
  /**
    * A user-generated note for this item.
    */
  var note: String = js.native
  
  /**
    * The time, measured in seconds from the start of the video, when the video should start playing. (The playlist owner can specify the times when the video should start and stop playing when the video is played in the context of the playlist.) The default value is 0.
    */
  var startAt: String = js.native
  
  /**
    * The ID that YouTube uses to uniquely identify a video. To retrieve the video resource, set the id query parameter to this value in your API request.
    */
  var videoId: String = js.native
}
object EndAt {
  
  @scala.inline
  def apply(endAt: String, note: String, startAt: String, videoId: String): EndAt = {
    val __obj = js.Dynamic.literal(endAt = endAt.asInstanceOf[js.Any], note = note.asInstanceOf[js.Any], startAt = startAt.asInstanceOf[js.Any], videoId = videoId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndAt]
  }
  
  @scala.inline
  implicit class EndAtMutableBuilder[Self <: EndAt] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndAt(value: String): Self = StObject.set(x, "endAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartAt(value: String): Self = StObject.set(x, "startAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoId(value: String): Self = StObject.set(x, "videoId", value.asInstanceOf[js.Any])
  }
}
