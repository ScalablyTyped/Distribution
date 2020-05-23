package typings.echarts.echarts.EChartOption.Calendar

import typings.echarts.echarts.EChartOption.RichStyle
import typings.echarts.echarts.EChartOption.TextStyleWithRich
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

trait Label extends TextStyleWithRich {
  /**
    * The margin between the label and the axis line.
    */
  var margin: js.UndefOr[Double] = js.undefined
  /**
    * Week text content, defaults to 'en'; It supports Chinese, English, and custom;
    * index 0 always means Sunday;
    *
    * @default 'en'
    */
  var nameMap: js.UndefOr[String | Double | (js.Array[String | Double])] = js.undefined
  /**
    * Set this to false to prevent label from showing.
    *
    * @default true
    */
  var show: js.UndefOr[Boolean] = js.undefined
}

object Label {
  @scala.inline
  def apply(
    align: String = null,
    backgroundColor: String | js.Object = null,
    borderColor: String = null,
    borderRadius: js.UndefOr[Double] = js.undefined,
    borderWidth: js.UndefOr[Double] = js.undefined,
    color: String = null,
    fontFamily: String = null,
    fontSize: js.UndefOr[Double] = js.undefined,
    fontStyle: normal | italic | oblique = null,
    fontWeight: normal | bold | bolder | lighter | `100` | `200` | `300` | `400` = null,
    height: Double | String = null,
    lineHeight: js.UndefOr[Double] = js.undefined,
    margin: js.UndefOr[Double] = js.undefined,
    nameMap: String | Double | (js.Array[String | Double]) = null,
    padding: Double | js.Array[Double] = null,
    rich: RichStyle = null,
    shadowBlur: js.UndefOr[Double] = js.undefined,
    shadowColor: String = null,
    shadowOffsetX: js.UndefOr[Double] = js.undefined,
    shadowOffsetY: js.UndefOr[Double] = js.undefined,
    show: js.UndefOr[Boolean] = js.undefined,
    textBorderColor: String = null,
    textBorderWidth: js.UndefOr[Double] = js.undefined,
    textShadowBlur: js.UndefOr[Double] = js.undefined,
    textShadowColor: String = null,
    textShadowOffsetX: js.UndefOr[Double] = js.undefined,
    textShadowOffsetY: js.UndefOr[Double] = js.undefined,
    verticalAlign: String = null,
    width: Double | String = null
  ): Label = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (!js.isUndefined(borderRadius)) __obj.updateDynamic("borderRadius")(borderRadius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(borderWidth)) __obj.updateDynamic("borderWidth")(borderWidth.get.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (!js.isUndefined(fontSize)) __obj.updateDynamic("fontSize")(fontSize.get.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(lineHeight)) __obj.updateDynamic("lineHeight")(lineHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(margin)) __obj.updateDynamic("margin")(margin.get.asInstanceOf[js.Any])
    if (nameMap != null) __obj.updateDynamic("nameMap")(nameMap.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (rich != null) __obj.updateDynamic("rich")(rich.asInstanceOf[js.Any])
    if (!js.isUndefined(shadowBlur)) __obj.updateDynamic("shadowBlur")(shadowBlur.get.asInstanceOf[js.Any])
    if (shadowColor != null) __obj.updateDynamic("shadowColor")(shadowColor.asInstanceOf[js.Any])
    if (!js.isUndefined(shadowOffsetX)) __obj.updateDynamic("shadowOffsetX")(shadowOffsetX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shadowOffsetY)) __obj.updateDynamic("shadowOffsetY")(shadowOffsetY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.get.asInstanceOf[js.Any])
    if (textBorderColor != null) __obj.updateDynamic("textBorderColor")(textBorderColor.asInstanceOf[js.Any])
    if (!js.isUndefined(textBorderWidth)) __obj.updateDynamic("textBorderWidth")(textBorderWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(textShadowBlur)) __obj.updateDynamic("textShadowBlur")(textShadowBlur.get.asInstanceOf[js.Any])
    if (textShadowColor != null) __obj.updateDynamic("textShadowColor")(textShadowColor.asInstanceOf[js.Any])
    if (!js.isUndefined(textShadowOffsetX)) __obj.updateDynamic("textShadowOffsetX")(textShadowOffsetX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(textShadowOffsetY)) __obj.updateDynamic("textShadowOffsetY")(textShadowOffsetY.get.asInstanceOf[js.Any])
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Label]
  }
}

