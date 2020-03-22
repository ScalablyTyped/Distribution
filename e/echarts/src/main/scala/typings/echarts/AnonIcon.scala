package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIcon extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var icon: js.UndefOr[js.Any] = js.undefined
  var margin: js.UndefOr[Double] = js.undefined
  var shadowBlur: js.UndefOr[Double] = js.undefined
  var shadowColor: js.UndefOr[String] = js.undefined
  var shadowOffsetX: js.UndefOr[Double] = js.undefined
  var shadowOffsetY: js.UndefOr[Double] = js.undefined
  var show: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var throttle: js.UndefOr[Double] = js.undefined
}

object AnonIcon {
  @scala.inline
  def apply(
    color: String = null,
    icon: js.Any = null,
    margin: Int | Double = null,
    shadowBlur: Int | Double = null,
    shadowColor: String = null,
    shadowOffsetX: Int | Double = null,
    shadowOffsetY: Int | Double = null,
    show: js.UndefOr[Boolean] = js.undefined,
    size: Double | js.Array[Double] = null,
    throttle: Int | Double = null
  ): AnonIcon = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (shadowBlur != null) __obj.updateDynamic("shadowBlur")(shadowBlur.asInstanceOf[js.Any])
    if (shadowColor != null) __obj.updateDynamic("shadowColor")(shadowColor.asInstanceOf[js.Any])
    if (shadowOffsetX != null) __obj.updateDynamic("shadowOffsetX")(shadowOffsetX.asInstanceOf[js.Any])
    if (shadowOffsetY != null) __obj.updateDynamic("shadowOffsetY")(shadowOffsetY.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (throttle != null) __obj.updateDynamic("throttle")(throttle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIcon]
  }
}

