package typings.gapiYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoId extends js.Object {
  /**
    * The videoId parameter specifies a YouTube video ID for which the custom video thumbnail is being provided.
    */
  var videoId: String
}

object VideoId {
  @scala.inline
  def apply(videoId: String): VideoId = {
    val __obj = js.Dynamic.literal(videoId = videoId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoId]
  }
}

