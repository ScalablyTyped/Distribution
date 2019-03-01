package typings
package echartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorOpacity extends js.Object {
  var color: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var opacity: js.UndefOr[scala.Double] = js.undefined
  var shadowBlur: js.UndefOr[scala.Double] = js.undefined
  var shadowColor: js.UndefOr[java.lang.String] = js.undefined
  var shadowOffsetX: js.UndefOr[scala.Double] = js.undefined
  var shadowOffsetY: js.UndefOr[scala.Double] = js.undefined
}

object Anon_ColorOpacity {
  @scala.inline
  def apply(
    color: js.Array[java.lang.String] = null,
    opacity: scala.Int | scala.Double = null,
    shadowBlur: scala.Int | scala.Double = null,
    shadowColor: java.lang.String = null,
    shadowOffsetX: scala.Int | scala.Double = null,
    shadowOffsetY: scala.Int | scala.Double = null
  ): Anon_ColorOpacity = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (shadowBlur != null) __obj.updateDynamic("shadowBlur")(shadowBlur.asInstanceOf[js.Any])
    if (shadowColor != null) __obj.updateDynamic("shadowColor")(shadowColor)
    if (shadowOffsetX != null) __obj.updateDynamic("shadowOffsetX")(shadowOffsetX.asInstanceOf[js.Any])
    if (shadowOffsetY != null) __obj.updateDynamic("shadowOffsetY")(shadowOffsetY.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ColorOpacity]
  }
}

