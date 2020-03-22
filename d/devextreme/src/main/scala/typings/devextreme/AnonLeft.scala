package typings.devextreme

import typings.devextreme.devextremeStrings.dash
import typings.devextreme.devextremeStrings.dot
import typings.devextreme.devextremeStrings.longDash
import typings.devextreme.devextremeStrings.solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLeft extends js.Object {
  var bottom: js.UndefOr[Boolean] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var dashStyle: js.UndefOr[dash | dot | longDash | solid] = js.undefined
  var left: js.UndefOr[Boolean] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var right: js.UndefOr[Boolean] = js.undefined
  var top: js.UndefOr[Boolean] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object AnonLeft {
  @scala.inline
  def apply(
    bottom: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    dashStyle: dash | dot | longDash | solid = null,
    left: js.UndefOr[Boolean] = js.undefined,
    opacity: Int | Double = null,
    right: js.UndefOr[Boolean] = js.undefined,
    top: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
  ): AnonLeft = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bottom)) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(left)) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (!js.isUndefined(right)) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLeft]
  }
}

