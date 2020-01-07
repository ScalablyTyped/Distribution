package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$VideoRating extends js.Object {
  var rating: js.UndefOr[String] = js.native
  var videoId: js.UndefOr[String] = js.native
}

object Schema$VideoRating {
  @scala.inline
  def apply(rating: String = null, videoId: String = null): Schema$VideoRating = {
    val __obj = js.Dynamic.literal()
    if (rating != null) __obj.updateDynamic("rating")(rating.asInstanceOf[js.Any])
    if (videoId != null) __obj.updateDynamic("videoId")(videoId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$VideoRating]
  }
}

