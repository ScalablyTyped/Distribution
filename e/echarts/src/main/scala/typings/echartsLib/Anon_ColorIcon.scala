package typings
package echartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorIcon extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var icon: js.UndefOr[js.Any] = js.undefined
  var margin: js.UndefOr[scala.Double] = js.undefined
  var shadowBlur: js.UndefOr[scala.Double] = js.undefined
  var shadowColor: js.UndefOr[java.lang.String] = js.undefined
  var shadowOffsetX: js.UndefOr[scala.Double] = js.undefined
  var shadowOffsetY: js.UndefOr[scala.Double] = js.undefined
  var show: js.UndefOr[scala.Boolean] = js.undefined
  var size: js.UndefOr[scala.Double | js.Array[scala.Double]] = js.undefined
  var throttle: js.UndefOr[scala.Double] = js.undefined
}

object Anon_ColorIcon {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    icon: js.Any = null,
    margin: scala.Int | scala.Double = null,
    shadowBlur: scala.Int | scala.Double = null,
    shadowColor: java.lang.String = null,
    shadowOffsetX: scala.Int | scala.Double = null,
    shadowOffsetY: scala.Int | scala.Double = null,
    show: js.UndefOr[scala.Boolean] = js.undefined,
    size: scala.Double | js.Array[scala.Double] = null,
    throttle: scala.Int | scala.Double = null
  ): Anon_ColorIcon = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (shadowBlur != null) __obj.updateDynamic("shadowBlur")(shadowBlur.asInstanceOf[js.Any])
    if (shadowColor != null) __obj.updateDynamic("shadowColor")(shadowColor)
    if (shadowOffsetX != null) __obj.updateDynamic("shadowOffsetX")(shadowOffsetX.asInstanceOf[js.Any])
    if (shadowOffsetY != null) __obj.updateDynamic("shadowOffsetY")(shadowOffsetY.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (throttle != null) __obj.updateDynamic("throttle")(throttle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ColorIcon]
  }
}

