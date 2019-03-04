package typings
package gapiDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Rating extends js.Object {
  /**
    * The rating that the authorized user gave to the video.
    */
  var rating: java.lang.String
  /**
    * The ID that YouTube uses to uniquely identify the video.
    */
  var videoId: java.lang.String
}

object Anon_Rating {
  @scala.inline
  def apply(rating: java.lang.String, videoId: java.lang.String): Anon_Rating = {
    val __obj = js.Dynamic.literal(rating = rating, videoId = videoId)
  
    __obj.asInstanceOf[Anon_Rating]
  }
}

