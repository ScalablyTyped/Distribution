package typings.flot.jqueryNs.flotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait interaction extends js.Object {
  var redrawOverlayInterval: js.UndefOr[Double] = js.undefined
}

object interaction {
  @scala.inline
  def apply(redrawOverlayInterval: Int | Double = null): interaction = {
    val __obj = js.Dynamic.literal()
    if (redrawOverlayInterval != null) __obj.updateDynamic("redrawOverlayInterval")(redrawOverlayInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[interaction]
  }
}

