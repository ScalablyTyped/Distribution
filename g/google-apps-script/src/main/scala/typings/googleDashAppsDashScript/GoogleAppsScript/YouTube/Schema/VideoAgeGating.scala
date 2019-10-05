package typings.googleDashAppsDashScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoAgeGating extends js.Object {
  var alcoholContent: js.UndefOr[Boolean] = js.undefined
  var restricted: js.UndefOr[Boolean] = js.undefined
  var videoGameRating: js.UndefOr[String] = js.undefined
}

object VideoAgeGating {
  @scala.inline
  def apply(
    alcoholContent: js.UndefOr[Boolean] = js.undefined,
    restricted: js.UndefOr[Boolean] = js.undefined,
    videoGameRating: String = null
  ): VideoAgeGating = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alcoholContent)) __obj.updateDynamic("alcoholContent")(alcoholContent)
    if (!js.isUndefined(restricted)) __obj.updateDynamic("restricted")(restricted)
    if (videoGameRating != null) __obj.updateDynamic("videoGameRating")(videoGameRating)
    __obj.asInstanceOf[VideoAgeGating]
  }
}

