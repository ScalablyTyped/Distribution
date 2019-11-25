package typings.googleDashAppsDashScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Requirements extends js.Object {
  var caption: js.UndefOr[Boolean] = js.undefined
  var hdTranscode: js.UndefOr[Boolean] = js.undefined
  var posterArt: js.UndefOr[Boolean] = js.undefined
  var spotlightArt: js.UndefOr[Boolean] = js.undefined
  var spotlightReview: js.UndefOr[Boolean] = js.undefined
  var trailer: js.UndefOr[Boolean] = js.undefined
}

object Requirements {
  @scala.inline
  def apply(
    caption: js.UndefOr[Boolean] = js.undefined,
    hdTranscode: js.UndefOr[Boolean] = js.undefined,
    posterArt: js.UndefOr[Boolean] = js.undefined,
    spotlightArt: js.UndefOr[Boolean] = js.undefined,
    spotlightReview: js.UndefOr[Boolean] = js.undefined,
    trailer: js.UndefOr[Boolean] = js.undefined
  ): Requirements = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(caption)) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (!js.isUndefined(hdTranscode)) __obj.updateDynamic("hdTranscode")(hdTranscode.asInstanceOf[js.Any])
    if (!js.isUndefined(posterArt)) __obj.updateDynamic("posterArt")(posterArt.asInstanceOf[js.Any])
    if (!js.isUndefined(spotlightArt)) __obj.updateDynamic("spotlightArt")(spotlightArt.asInstanceOf[js.Any])
    if (!js.isUndefined(spotlightReview)) __obj.updateDynamic("spotlightReview")(spotlightReview.asInstanceOf[js.Any])
    if (!js.isUndefined(trailer)) __obj.updateDynamic("trailer")(trailer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Requirements]
  }
}

