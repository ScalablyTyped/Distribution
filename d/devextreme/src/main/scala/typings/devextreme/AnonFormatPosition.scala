package typings.devextreme

import typings.devextreme.devextremeStrings.bottom
import typings.devextreme.devextremeStrings.top
import typings.devextreme.mod.DevExpress.ui.format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFormatPosition extends js.Object {
  var format: js.UndefOr[typings.devextreme.mod.DevExpress.ui.format] = js.undefined
  var position: js.UndefOr[bottom | top] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object AnonFormatPosition {
  @scala.inline
  def apply(format: format = null, position: bottom | top = null, visible: js.UndefOr[Boolean] = js.undefined): AnonFormatPosition = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFormatPosition]
  }
}

