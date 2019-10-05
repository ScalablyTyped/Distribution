package typings.googleDashAppsDashScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoRating extends js.Object {
  var rating: js.UndefOr[String] = js.undefined
  var videoId: js.UndefOr[String] = js.undefined
}

object VideoRating {
  @scala.inline
  def apply(rating: String = null, videoId: String = null): VideoRating = {
    val __obj = js.Dynamic.literal()
    if (rating != null) __obj.updateDynamic("rating")(rating)
    if (videoId != null) __obj.updateDynamic("videoId")(videoId)
    __obj.asInstanceOf[VideoRating]
  }
}

