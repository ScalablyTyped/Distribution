package typings.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKeepLabels extends js.Object {
  var height: js.UndefOr[Double] = js.undefined
  var keepLabels: js.UndefOr[Boolean] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object AnonKeepLabels {
  @scala.inline
  def apply(
    height: Int | Double = null,
    keepLabels: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
  ): AnonKeepLabels = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(keepLabels)) __obj.updateDynamic("keepLabels")(keepLabels.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKeepLabels]
  }
}

