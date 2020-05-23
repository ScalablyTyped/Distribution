package typings.devextreme.anon

import typings.devextreme.devextremeStrings.dash
import typings.devextreme.devextremeStrings.dot
import typings.devextreme.devextremeStrings.longDash
import typings.devextreme.devextremeStrings.solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HorizontalLine extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var dashStyle: js.UndefOr[dash | dot | longDash | solid] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var horizontalLine: js.UndefOr[DashStyle | Boolean] = js.undefined
  var label: js.UndefOr[BackgroundColorCustomizeText] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var verticalLine: js.UndefOr[DashStyle | Boolean] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object HorizontalLine {
  @scala.inline
  def apply(
    color: String = null,
    dashStyle: dash | dot | longDash | solid = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    horizontalLine: DashStyle | Boolean = null,
    label: BackgroundColorCustomizeText = null,
    opacity: js.UndefOr[Double] = js.undefined,
    verticalLine: DashStyle | Boolean = null,
    width: js.UndefOr[Double] = js.undefined
  ): HorizontalLine = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (horizontalLine != null) __obj.updateDynamic("horizontalLine")(horizontalLine.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (verticalLine != null) __obj.updateDynamic("verticalLine")(verticalLine.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HorizontalLine]
  }
}

