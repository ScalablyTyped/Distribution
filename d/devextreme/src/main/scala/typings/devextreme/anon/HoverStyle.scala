package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HoverStyle extends js.Object {
  var border: js.UndefOr[ColorVisible] = js.undefined
  var hoverStyle: js.UndefOr[Border] = js.undefined
  var selectionStyle: js.UndefOr[Border] = js.undefined
}

object HoverStyle {
  @scala.inline
  def apply(border: ColorVisible = null, hoverStyle: Border = null, selectionStyle: Border = null): HoverStyle = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (hoverStyle != null) __obj.updateDynamic("hoverStyle")(hoverStyle.asInstanceOf[js.Any])
    if (selectionStyle != null) __obj.updateDynamic("selectionStyle")(selectionStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[HoverStyle]
  }
}

