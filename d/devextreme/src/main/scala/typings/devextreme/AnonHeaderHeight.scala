package typings.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHeaderHeight extends js.Object {
  var border: js.UndefOr[AnonColorWidth] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var headerHeight: js.UndefOr[Double] = js.undefined
  var hoverEnabled: js.UndefOr[Boolean] = js.undefined
  var hoverStyle: js.UndefOr[AnonBorderAnonColorWidth] = js.undefined
  var label: js.UndefOr[AnonTextOverflow] = js.undefined
  var selectionStyle: js.UndefOr[AnonBorderAnonColorWidth] = js.undefined
}

object AnonHeaderHeight {
  @scala.inline
  def apply(
    border: AnonColorWidth = null,
    color: String = null,
    headerHeight: Int | Double = null,
    hoverEnabled: js.UndefOr[Boolean] = js.undefined,
    hoverStyle: AnonBorderAnonColorWidth = null,
    label: AnonTextOverflow = null,
    selectionStyle: AnonBorderAnonColorWidth = null
  ): AnonHeaderHeight = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (headerHeight != null) __obj.updateDynamic("headerHeight")(headerHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverEnabled)) __obj.updateDynamic("hoverEnabled")(hoverEnabled.asInstanceOf[js.Any])
    if (hoverStyle != null) __obj.updateDynamic("hoverStyle")(hoverStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (selectionStyle != null) __obj.updateDynamic("selectionStyle")(selectionStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHeaderHeight]
  }
}

