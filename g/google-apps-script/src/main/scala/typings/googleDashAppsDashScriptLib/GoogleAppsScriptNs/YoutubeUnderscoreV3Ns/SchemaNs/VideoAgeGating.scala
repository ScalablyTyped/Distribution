package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoAgeGating extends js.Object {
  var alcoholContent: js.UndefOr[scala.Boolean] = js.undefined
  var restricted: js.UndefOr[scala.Boolean] = js.undefined
  var videoGameRating: js.UndefOr[java.lang.String] = js.undefined
}

object VideoAgeGating {
  @scala.inline
  def apply(
    alcoholContent: js.UndefOr[scala.Boolean] = js.undefined,
    restricted: js.UndefOr[scala.Boolean] = js.undefined,
    videoGameRating: java.lang.String = null
  ): VideoAgeGating = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alcoholContent)) __obj.updateDynamic("alcoholContent")(alcoholContent)
    if (!js.isUndefined(restricted)) __obj.updateDynamic("restricted")(restricted)
    if (videoGameRating != null) __obj.updateDynamic("videoGameRating")(videoGameRating)
    __obj.asInstanceOf[VideoAgeGating]
  }
}

