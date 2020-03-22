package typings.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAllowPan extends js.Object {
  var allowPan: js.UndefOr[Boolean] = js.undefined
  var allowSelection: js.UndefOr[Boolean] = js.undefined
  var allowZoom: js.UndefOr[Boolean] = js.undefined
}

object AnonAllowPan {
  @scala.inline
  def apply(
    allowPan: js.UndefOr[Boolean] = js.undefined,
    allowSelection: js.UndefOr[Boolean] = js.undefined,
    allowZoom: js.UndefOr[Boolean] = js.undefined
  ): AnonAllowPan = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowPan)) __obj.updateDynamic("allowPan")(allowPan.asInstanceOf[js.Any])
    if (!js.isUndefined(allowSelection)) __obj.updateDynamic("allowSelection")(allowSelection.asInstanceOf[js.Any])
    if (!js.isUndefined(allowZoom)) __obj.updateDynamic("allowZoom")(allowZoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAllowPan]
  }
}

