package typings.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSelectionStyle extends js.Object {
  var border: js.UndefOr[AnonColorWidth] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var hoverStyle: js.UndefOr[AnonBorderAnonColorWidth] = js.undefined
  var label: js.UndefOr[AnonWordWrap] = js.undefined
  var selectionStyle: js.UndefOr[AnonBorderAnonColorWidth] = js.undefined
}

object AnonSelectionStyle {
  @scala.inline
  def apply(
    border: AnonColorWidth = null,
    color: String = null,
    hoverStyle: AnonBorderAnonColorWidth = null,
    label: AnonWordWrap = null,
    selectionStyle: AnonBorderAnonColorWidth = null
  ): AnonSelectionStyle = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (hoverStyle != null) __obj.updateDynamic("hoverStyle")(hoverStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (selectionStyle != null) __obj.updateDynamic("selectionStyle")(selectionStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSelectionStyle]
  }
}

