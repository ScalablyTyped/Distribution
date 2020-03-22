package typings.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHoverStyle extends js.Object {
  var border: js.UndefOr[AnonColorVisible] = js.undefined
  var hoverStyle: js.UndefOr[AnonBorder] = js.undefined
  var selectionStyle: js.UndefOr[AnonBorder] = js.undefined
}

object AnonHoverStyle {
  @scala.inline
  def apply(border: AnonColorVisible = null, hoverStyle: AnonBorder = null, selectionStyle: AnonBorder = null): AnonHoverStyle = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (hoverStyle != null) __obj.updateDynamic("hoverStyle")(hoverStyle.asInstanceOf[js.Any])
    if (selectionStyle != null) __obj.updateDynamic("selectionStyle")(selectionStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHoverStyle]
  }
}

