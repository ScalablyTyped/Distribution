package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorOpacityShadowBlurShadowColorShadowOffsetXShadowOffsetY extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var shadowBlur: js.UndefOr[Double] = js.undefined
  var shadowColor: js.UndefOr[String] = js.undefined
  var shadowOffsetX: js.UndefOr[Double] = js.undefined
  var shadowOffsetY: js.UndefOr[Double] = js.undefined
}

object Anon_ColorOpacityShadowBlurShadowColorShadowOffsetXShadowOffsetY {
  @scala.inline
  def apply(
    color: String = null,
    opacity: Int | Double = null,
    shadowBlur: Int | Double = null,
    shadowColor: String = null,
    shadowOffsetX: Int | Double = null,
    shadowOffsetY: Int | Double = null
  ): Anon_ColorOpacityShadowBlurShadowColorShadowOffsetXShadowOffsetY = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (shadowBlur != null) __obj.updateDynamic("shadowBlur")(shadowBlur.asInstanceOf[js.Any])
    if (shadowColor != null) __obj.updateDynamic("shadowColor")(shadowColor)
    if (shadowOffsetX != null) __obj.updateDynamic("shadowOffsetX")(shadowOffsetX.asInstanceOf[js.Any])
    if (shadowOffsetY != null) __obj.updateDynamic("shadowOffsetY")(shadowOffsetY.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ColorOpacityShadowBlurShadowColorShadowOffsetXShadowOffsetY]
  }
}

