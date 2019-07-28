package typings.gapiDotYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EndAt extends js.Object {
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

object Anon_EndAt {
  @scala.inline
  def apply(endAt: String, note: String, startAt: String, videoId: String): Anon_EndAt = {
    val __obj = js.Dynamic.literal(endAt = endAt, note = note, startAt = startAt, videoId = videoId)
  
    __obj.asInstanceOf[Anon_EndAt]
  }
}

