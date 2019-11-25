package typings.gapiDotYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Rating extends js.Object {
  /**
    * The rating that the authorized user gave to the video.
    */
  var rating: String
  /**
    * The ID that YouTube uses to uniquely identify the video.
    */
  var videoId: String
}

object Anon_Rating {
  @scala.inline
  def apply(rating: String, videoId: String): Anon_Rating = {
    val __obj = js.Dynamic.literal(rating = rating.asInstanceOf[js.Any], videoId = videoId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Rating]
  }
}

