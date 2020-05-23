package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllowPan extends js.Object {
  var allowPan: js.UndefOr[Boolean] = js.undefined
  var allowSelection: js.UndefOr[Boolean] = js.undefined
  var allowZoom: js.UndefOr[Boolean] = js.undefined
}

object AllowPan {
  @scala.inline
  def apply(
    allowPan: js.UndefOr[Boolean] = js.undefined,
    allowSelection: js.UndefOr[Boolean] = js.undefined,
    allowZoom: js.UndefOr[Boolean] = js.undefined
  ): AllowPan = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowPan)) __obj.updateDynamic("allowPan")(allowPan.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowSelection)) __obj.updateDynamic("allowSelection")(allowSelection.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowZoom)) __obj.updateDynamic("allowZoom")(allowZoom.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowPan]
  }
}

