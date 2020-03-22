package typings.devextreme

import typings.devextreme.devextremeStrings.dash
import typings.devextreme.devextremeStrings.dot
import typings.devextreme.devextremeStrings.longDash
import typings.devextreme.devextremeStrings.solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBorderColor extends js.Object {
  var border: js.UndefOr[AnonColorDashStyle] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var dashStyle: js.UndefOr[dash | dot | longDash | solid] = js.undefined
  var hatching: js.UndefOr[AnonStep] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object AnonBorderColor {
  @scala.inline
  def apply(
    border: AnonColorDashStyle = null,
    color: String = null,
    dashStyle: dash | dot | longDash | solid = null,
    hatching: AnonStep = null,
    width: Int | Double = null
  ): AnonBorderColor = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle.asInstanceOf[js.Any])
    if (hatching != null) __obj.updateDynamic("hatching")(hatching.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBorderColor]
  }
}

