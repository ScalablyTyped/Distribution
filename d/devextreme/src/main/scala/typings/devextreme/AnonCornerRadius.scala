package typings.devextreme

import typings.devextreme.devextremeStrings.dash
import typings.devextreme.devextremeStrings.dot
import typings.devextreme.devextremeStrings.longDash
import typings.devextreme.devextremeStrings.solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCornerRadius extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var cornerRadius: js.UndefOr[Double] = js.undefined
  var dashStyle: js.UndefOr[dash | dot | longDash | solid] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object AnonCornerRadius {
  @scala.inline
  def apply(
    color: String = null,
    cornerRadius: Int | Double = null,
    dashStyle: dash | dot | longDash | solid = null,
    opacity: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
  ): AnonCornerRadius = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (cornerRadius != null) __obj.updateDynamic("cornerRadius")(cornerRadius.asInstanceOf[js.Any])
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCornerRadius]
  }
}

