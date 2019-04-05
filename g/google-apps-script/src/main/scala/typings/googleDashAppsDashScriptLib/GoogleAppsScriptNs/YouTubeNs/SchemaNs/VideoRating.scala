package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoRating extends js.Object {
  var rating: js.UndefOr[java.lang.String] = js.undefined
  var videoId: js.UndefOr[java.lang.String] = js.undefined
}

object VideoRating {
  @scala.inline
  def apply(rating: java.lang.String = null, videoId: java.lang.String = null): VideoRating = {
    val __obj = js.Dynamic.literal()
    if (rating != null) __obj.updateDynamic("rating")(rating)
    if (videoId != null) __obj.updateDynamic("videoId")(videoId)
    __obj.asInstanceOf[VideoRating]
  }
}

