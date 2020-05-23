package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionStyle extends js.Object {
  var border: js.UndefOr[ColorWidth] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var hoverStyle: js.UndefOr[BorderColorWidth] = js.undefined
  var label: js.UndefOr[WordWrap] = js.undefined
  var selectionStyle: js.UndefOr[BorderColorWidth] = js.undefined
}

object SelectionStyle {
  @scala.inline
  def apply(
    border: ColorWidth = null,
    color: String = null,
    hoverStyle: BorderColorWidth = null,
    label: WordWrap = null,
    selectionStyle: BorderColorWidth = null
  ): SelectionStyle = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (hoverStyle != null) __obj.updateDynamic("hoverStyle")(hoverStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (selectionStyle != null) __obj.updateDynamic("selectionStyle")(selectionStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionStyle]
  }
}

