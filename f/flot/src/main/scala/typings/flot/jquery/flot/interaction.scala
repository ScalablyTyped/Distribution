package typings.flot.jquery.flot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait interaction extends js.Object {
  var redrawOverlayInterval: js.UndefOr[Double] = js.undefined
}

object interaction {
  @scala.inline
  def apply(redrawOverlayInterval: js.UndefOr[Double] = js.undefined): interaction = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(redrawOverlayInterval)) __obj.updateDynamic("redrawOverlayInterval")(redrawOverlayInterval.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[interaction]
  }
}

