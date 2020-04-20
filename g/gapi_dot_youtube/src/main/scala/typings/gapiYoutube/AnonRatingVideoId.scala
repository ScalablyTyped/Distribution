package typings.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRatingVideoId extends js.Object {
  /**
    * The rating that the authorized user gave to the video.
    */
  var rating: String
  /**
    * The ID that YouTube uses to uniquely identify the video.
    */
  var videoId: String
}

object AnonRatingVideoId {
  @scala.inline
  def apply(rating: String, videoId: String): AnonRatingVideoId = {
    val __obj = js.Dynamic.literal(rating = rating.asInstanceOf[js.Any], videoId = videoId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRatingVideoId]
  }
}

