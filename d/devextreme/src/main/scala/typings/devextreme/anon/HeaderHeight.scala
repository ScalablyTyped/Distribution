package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderHeight extends js.Object {
  var border: js.UndefOr[ColorWidth] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var headerHeight: js.UndefOr[Double] = js.undefined
  var hoverEnabled: js.UndefOr[Boolean] = js.undefined
  var hoverStyle: js.UndefOr[BorderColorWidth] = js.undefined
  var label: js.UndefOr[TextOverflow] = js.undefined
  var selectionStyle: js.UndefOr[BorderColorWidth] = js.undefined
}

object HeaderHeight {
  @scala.inline
  def apply(
    border: ColorWidth = null,
    color: String = null,
    headerHeight: js.UndefOr[Double] = js.undefined,
    hoverEnabled: js.UndefOr[Boolean] = js.undefined,
    hoverStyle: BorderColorWidth = null,
    label: TextOverflow = null,
    selectionStyle: BorderColorWidth = null
  ): HeaderHeight = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(headerHeight)) __obj.updateDynamic("headerHeight")(headerHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverEnabled)) __obj.updateDynamic("hoverEnabled")(hoverEnabled.get.asInstanceOf[js.Any])
    if (hoverStyle != null) __obj.updateDynamic("hoverStyle")(hoverStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (selectionStyle != null) __obj.updateDynamic("selectionStyle")(selectionStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderHeight]
  }
}

