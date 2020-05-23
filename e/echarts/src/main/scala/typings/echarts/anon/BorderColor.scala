package typings.echarts.anon

import typings.echarts.echartsStrings.dashed
import typings.echarts.echartsStrings.dotted
import typings.echarts.echartsStrings.solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BorderColor extends js.Object {
  var borderColor: js.UndefOr[String] = js.undefined
  var borderType: js.UndefOr[solid | dashed | dotted] = js.undefined
  var borderWidth: js.UndefOr[Double] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var shadowBlur: js.UndefOr[Double] = js.undefined
  var shadowColor: js.UndefOr[String] = js.undefined
  var shadowOffsetX: js.UndefOr[Double] = js.undefined
  var shadowOffsetY: js.UndefOr[Double] = js.undefined
}

object BorderColor {
  @scala.inline
  def apply(
    borderColor: String = null,
    borderType: solid | dashed | dotted = null,
    borderWidth: js.UndefOr[Double] = js.undefined,
    color: String = null,
    opacity: js.UndefOr[Double] = js.undefined,
    shadowBlur: js.UndefOr[Double] = js.undefined,
    shadowColor: String = null,
    shadowOffsetX: js.UndefOr[Double] = js.undefined,
    shadowOffsetY: js.UndefOr[Double] = js.undefined
  ): BorderColor = {
    val __obj = js.Dynamic.literal()
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderType != null) __obj.updateDynamic("borderType")(borderType.asInstanceOf[js.Any])
    if (!js.isUndefined(borderWidth)) __obj.updateDynamic("borderWidth")(borderWidth.get.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shadowBlur)) __obj.updateDynamic("shadowBlur")(shadowBlur.get.asInstanceOf[js.Any])
    if (shadowColor != null) __obj.updateDynamic("shadowColor")(shadowColor.asInstanceOf[js.Any])
    if (!js.isUndefined(shadowOffsetX)) __obj.updateDynamic("shadowOffsetX")(shadowOffsetX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shadowOffsetY)) __obj.updateDynamic("shadowOffsetY")(shadowOffsetY.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderColor]
  }
}

