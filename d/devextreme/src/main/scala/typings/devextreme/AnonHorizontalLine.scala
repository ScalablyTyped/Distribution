package typings.devextreme

import typings.devextreme.devextremeStrings.dash
import typings.devextreme.devextremeStrings.dot
import typings.devextreme.devextremeStrings.longDash
import typings.devextreme.devextremeStrings.solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHorizontalLine extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var dashStyle: js.UndefOr[dash | dot | longDash | solid] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var horizontalLine: js.UndefOr[AnonDashStyle | Boolean] = js.undefined
  var label: js.UndefOr[AnonBackgroundColorCustomizeText] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var verticalLine: js.UndefOr[AnonDashStyle | Boolean] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object AnonHorizontalLine {
  @scala.inline
  def apply(
    color: String = null,
    dashStyle: dash | dot | longDash | solid = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    horizontalLine: AnonDashStyle | Boolean = null,
    label: AnonBackgroundColorCustomizeText = null,
    opacity: Int | Double = null,
    verticalLine: AnonDashStyle | Boolean = null,
    width: Int | Double = null
  ): AnonHorizontalLine = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (horizontalLine != null) __obj.updateDynamic("horizontalLine")(horizontalLine.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (verticalLine != null) __obj.updateDynamic("verticalLine")(verticalLine.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHorizontalLine]
  }
}

