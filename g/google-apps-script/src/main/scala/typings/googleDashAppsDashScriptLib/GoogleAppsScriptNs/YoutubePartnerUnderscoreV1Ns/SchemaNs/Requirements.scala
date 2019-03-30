package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Requirements extends js.Object {
  var caption: js.UndefOr[scala.Boolean] = js.undefined
  var hdTranscode: js.UndefOr[scala.Boolean] = js.undefined
  var posterArt: js.UndefOr[scala.Boolean] = js.undefined
  var spotlightArt: js.UndefOr[scala.Boolean] = js.undefined
  var spotlightReview: js.UndefOr[scala.Boolean] = js.undefined
  var trailer: js.UndefOr[scala.Boolean] = js.undefined
}

object Requirements {
  @scala.inline
  def apply(
    caption: js.UndefOr[scala.Boolean] = js.undefined,
    hdTranscode: js.UndefOr[scala.Boolean] = js.undefined,
    posterArt: js.UndefOr[scala.Boolean] = js.undefined,
    spotlightArt: js.UndefOr[scala.Boolean] = js.undefined,
    spotlightReview: js.UndefOr[scala.Boolean] = js.undefined,
    trailer: js.UndefOr[scala.Boolean] = js.undefined
  ): Requirements = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(caption)) __obj.updateDynamic("caption")(caption)
    if (!js.isUndefined(hdTranscode)) __obj.updateDynamic("hdTranscode")(hdTranscode)
    if (!js.isUndefined(posterArt)) __obj.updateDynamic("posterArt")(posterArt)
    if (!js.isUndefined(spotlightArt)) __obj.updateDynamic("spotlightArt")(spotlightArt)
    if (!js.isUndefined(spotlightReview)) __obj.updateDynamic("spotlightReview")(spotlightReview)
    if (!js.isUndefined(trailer)) __obj.updateDynamic("trailer")(trailer)
    __obj.asInstanceOf[Requirements]
  }
}

