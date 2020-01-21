package typings.echarts.echarts.EChartOption.SeriesRadar

import typings.echarts.AnonAlignBackgroundColorBorderColorBorderRadiusBorderWidth
import typings.echarts.AnonAreaStyleItemStyle
import typings.echarts.AnonBackgroundColorBorderColor
import typings.echarts.AnonBarBorderColorBarBorderWidth
import typings.echarts.AnonColorOpacity
import typings.echarts.AnonColorOpacityShadowBlur
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataObject extends js.Object {
  /**
    * Area filling style of a single item.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-radar.data.areaStyle
    */
  var areaStyle: js.UndefOr[AnonColorOpacity] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-radar.data.emphasis
    */
  var emphasis: js.UndefOr[AnonAreaStyleItemStyle] = js.undefined
  /**
    * Style setting of the symbol on single inflection point.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-radar.data.itemStyle
    */
  var itemStyle: js.UndefOr[AnonBarBorderColorBarBorderWidth] = js.undefined
  /**
    * Style setting of the text on single inflection point.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-radar.data.label
    */
  var label: js.UndefOr[AnonAlignBackgroundColorBorderColorBorderRadiusBorderWidth] = js.undefined
  /**
    * Line style of a single item.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-radar.data.lineStyle
    */
  var lineStyle: js.UndefOr[AnonColorOpacityShadowBlur] = js.undefined
  /**
    * Data item name
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-radar.data.name
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Symbol of single data.
    *
    * Icon types provided by ECharts includes `'circle'`, `'rect'`,
    * `'roundRect'`, `'triangle'`, `'diamond'`, `'pin'`, `'arrow'`,
    * `'none'`
    *
    * It can be set to an image with `'image://url'` , in which
    * URL is the link to an image, or `dataURI` of an image.
    *
    * An image URL example:
    *
    * ```
    * 'image://http://xxx.xxx.xxx/a/b.png'
    *
    * ```
    *
    * A `dataURI` example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-radar.radar.data)
    *
    * Icons can be set to arbitrary vector path via `'path://'`
    * in ECharts.
    * As compared with raster image, vector paths prevent from
    * jagging and blurring when scaled, and have a better control
    * over changing colors.
    * Size of vectoer icon will be adapted automatically.
    * Refer to
    * [SVG PathData](http://www.w3.org/TR/SVG/paths.html#PathData)
    * for more information about format of path.
    * You may export vector paths from tools like Adobe Illustrator.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-radar.radar.data)
    *
    *
    * @default
    * "circle"
    * @see https://echarts.apache.org/en/option.html#series-radar.data.symbol
    */
  var symbol: js.UndefOr[String] = js.undefined
  /**
    * Whether to keep aspect for symbols in the form of `path://`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-radar.data.symbolKeepAspect
    */
  var symbolKeepAspect: js.UndefOr[Boolean] = js.undefined
  /**
    * Offset of single data symbol relative to original position.
    * By default, symbol will be put in the center position of
    * data.
    * But if symbol is from user-defined vector path or image,
    * you may not expect symbol to be in center.
    * In this case, you may use this attribute to set offset to
    * default position.
    * It can be in absolute pixel value, or in relative percentage
    * value.
    *
    * For example, `[0, '50%']` means to move upside side position
    * of symbol height.
    * It can be used to make the arrow in the bottom to be at data
    * position when symbol is pin.
    *
    *
    * @default
    * [0, 0]
    * @see https://echarts.apache.org/en/option.html#series-radar.data.symbolOffset
    */
  var symbolOffset: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Rotate degree of single data symbol.
    * Note that when `symbol` is set to be `'arrow'` in `markLine`,
    * `symbolRotate` value will be ignored, and compulsively use
    * tangent angle.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-radar.data.symbolRotate
    */
  var symbolRotate: js.UndefOr[Double] = js.undefined
  /**
    * single data symbol size.
    * It can be set to single numbers like `10`, or use an array
    * to represent width and height.
    * For example, `[20, 10]` means symbol width is `20`, and height
    * is`10`.
    *
    *
    * @default
    * 4
    * @see https://echarts.apache.org/en/option.html#series-radar.data.symbolSize
    */
  var symbolSize: js.UndefOr[js.Array[_] | Double] = js.undefined
  /**
    * tooltip settings in this series data.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-radar.data.tooltip
    */
  var tooltip: js.UndefOr[AnonBackgroundColorBorderColor] = js.undefined
  /**
    * Numerical value of a single data item.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-radar.data.value
    */
  var value: js.UndefOr[Double | js.Array[Double]] = js.undefined
}

object DataObject {
  @scala.inline
  def apply(
    areaStyle: AnonColorOpacity = null,
    emphasis: AnonAreaStyleItemStyle = null,
    itemStyle: AnonBarBorderColorBarBorderWidth = null,
    label: AnonAlignBackgroundColorBorderColorBorderRadiusBorderWidth = null,
    lineStyle: AnonColorOpacityShadowBlur = null,
    name: String = null,
    symbol: String = null,
    symbolKeepAspect: js.UndefOr[Boolean] = js.undefined,
    symbolOffset: js.Array[_] = null,
    symbolRotate: Int | Double = null,
    symbolSize: js.Array[_] | Double = null,
    tooltip: AnonBackgroundColorBorderColor = null,
    value: Double | js.Array[Double] = null
  ): DataObject = {
    val __obj = js.Dynamic.literal()
    if (areaStyle != null) __obj.updateDynamic("areaStyle")(areaStyle.asInstanceOf[js.Any])
    if (emphasis != null) __obj.updateDynamic("emphasis")(emphasis.asInstanceOf[js.Any])
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (symbol != null) __obj.updateDynamic("symbol")(symbol.asInstanceOf[js.Any])
    if (!js.isUndefined(symbolKeepAspect)) __obj.updateDynamic("symbolKeepAspect")(symbolKeepAspect.asInstanceOf[js.Any])
    if (symbolOffset != null) __obj.updateDynamic("symbolOffset")(symbolOffset.asInstanceOf[js.Any])
    if (symbolRotate != null) __obj.updateDynamic("symbolRotate")(symbolRotate.asInstanceOf[js.Any])
    if (symbolSize != null) __obj.updateDynamic("symbolSize")(symbolSize.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataObject]
  }
}

