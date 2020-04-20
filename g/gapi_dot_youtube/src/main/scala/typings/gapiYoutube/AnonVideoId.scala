package typings.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonVideoId extends js.Object {
  /**
    * The ID that YouTube uses to uniquely identify the uploaded video.
    */
  var videoId: String
}

object AnonVideoId {
  @scala.inline
  def apply(videoId: String): AnonVideoId = {
    val __obj = js.Dynamic.literal(videoId = videoId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonVideoId]
  }
}

