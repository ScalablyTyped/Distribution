package typings.echarts.echarts.EChartOption

import typings.echarts.echartsStrings.`100`
import typings.echarts.echartsStrings.`200`
import typings.echarts.echartsStrings.`300`
import typings.echarts.echartsStrings.`400`
import typings.echarts.echartsStrings.bold
import typings.echarts.echartsStrings.bolder
import typings.echarts.echartsStrings.italic
import typings.echarts.echartsStrings.lighter
import typings.echarts.echartsStrings.normal
import typings.echarts.echartsStrings.oblique
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see https://echarts.apache.org/en/option.html#textStyle
  */
trait BaseTextStyle extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var fontFamily: js.UndefOr[String] = js.undefined
  var fontSize: js.UndefOr[Double] = js.undefined
  var fontStyle: js.UndefOr[normal | italic | oblique] = js.undefined
  var fontWeight: js.UndefOr[normal | bold | bolder | lighter | `100` | `200` | `300` | `400`] = js.undefined
  var height: js.UndefOr[Double | String] = js.undefined
  var lineHeight: js.UndefOr[Double] = js.undefined
  var textBorderColor: js.UndefOr[String] = js.undefined
  var textBorderWidth: js.UndefOr[Double] = js.undefined
  var textShadowBlur: js.UndefOr[Double] = js.undefined
  var textShadowColor: js.UndefOr[String] = js.undefined
  var textShadowOffsetX: js.UndefOr[Double] = js.undefined
  var textShadowOffsetY: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double | String] = js.undefined
}

object BaseTextStyle {
  @scala.inline
  def apply(
    color: String = null,
    fontFamily: String = null,
    fontSize: js.UndefOr[Double] = js.undefined,
    fontStyle: normal | italic | oblique = null,
    fontWeight: normal | bold | bolder | lighter | `100` | `200` | `300` | `400` = null,
    height: Double | String = null,
    lineHeight: js.UndefOr[Double] = js.undefined,
    textBorderColor: String = null,
    textBorderWidth: js.UndefOr[Double] = js.undefined,
    textShadowBlur: js.UndefOr[Double] = js.undefined,
    textShadowColor: String = null,
    textShadowOffsetX: js.UndefOr[Double] = js.undefined,
    textShadowOffsetY: js.UndefOr[Double] = js.undefined,
    width: Double | String = null
  ): BaseTextStyle = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (!js.isUndefined(fontSize)) __obj.updateDynamic("fontSize")(fontSize.get.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(lineHeight)) __obj.updateDynamic("lineHeight")(lineHeight.get.asInstanceOf[js.Any])
    if (textBorderColor != null) __obj.updateDynamic("textBorderColor")(textBorderColor.asInstanceOf[js.Any])
    if (!js.isUndefined(textBorderWidth)) __obj.updateDynamic("textBorderWidth")(textBorderWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(textShadowBlur)) __obj.updateDynamic("textShadowBlur")(textShadowBlur.get.asInstanceOf[js.Any])
    if (textShadowColor != null) __obj.updateDynamic("textShadowColor")(textShadowColor.asInstanceOf[js.Any])
    if (!js.isUndefined(textShadowOffsetX)) __obj.updateDynamic("textShadowOffsetX")(textShadowOffsetX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(textShadowOffsetY)) __obj.updateDynamic("textShadowOffsetY")(textShadowOffsetY.get.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseTextStyle]
  }
}

