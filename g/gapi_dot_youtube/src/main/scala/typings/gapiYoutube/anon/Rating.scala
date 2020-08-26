package typings.gapiYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rating extends js.Object {
  /**
    * The rating that the authorized user gave to the video.
    */
  var rating: String = js.native
  /**
    * The ID that YouTube uses to uniquely identify the video.
    */
  var videoId: String = js.native
}

object Rating {
  @scala.inline
  def apply(rating: String, videoId: String): Rating = {
    val __obj = js.Dynamic.literal(rating = rating.asInstanceOf[js.Any], videoId = videoId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rating]
  }
  @scala.inline
  implicit class RatingOps[Self <: Rating] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRating(value: String): Self = this.set("rating", value.asInstanceOf[js.Any])
    @scala.inline
    def setVideoId(value: String): Self = this.set("videoId", value.asInstanceOf[js.Any])
  }
  
}

