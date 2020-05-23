package typings.gapiYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rating extends js.Object {
  /**
    * The rating that the authorized user gave to the video.
    */
  var rating: String
  /**
    * The ID that YouTube uses to uniquely identify the video.
    */
  var videoId: String
}

object Rating {
  @scala.inline
  def apply(rating: String, videoId: String): Rating = {
    val __obj = js.Dynamic.literal(rating = rating.asInstanceOf[js.Any], videoId = videoId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rating]
  }
}

