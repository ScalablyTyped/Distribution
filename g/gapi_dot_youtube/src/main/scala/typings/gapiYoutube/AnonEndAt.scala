package typings.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEndAt extends js.Object {
  /**
    * The time, measured in seconds from the start of the video, when the video should stop playing. (The playlist owner can specify the times when the video should start and stop playing when the video is played in the context of the playlist.) By default, assume that the video.endTime is the end of the video.
    */
  var endAt: String
  /**
    * A user-generated note for this item.
    */
  var note: String
  /**
    * The time, measured in seconds from the start of the video, when the video should start playing. (The playlist owner can specify the times when the video should start and stop playing when the video is played in the context of the playlist.) The default value is 0.
    */
  var startAt: String
  /**
    * The ID that YouTube uses to uniquely identify a video. To retrieve the video resource, set the id query parameter to this value in your API request.
    */
  var videoId: String
}

object AnonEndAt {
  @scala.inline
  def apply(endAt: String, note: String, startAt: String, videoId: String): AnonEndAt = {
    val __obj = js.Dynamic.literal(endAt = endAt.asInstanceOf[js.Any], note = note.asInstanceOf[js.Any], startAt = startAt.asInstanceOf[js.Any], videoId = videoId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEndAt]
  }
}

