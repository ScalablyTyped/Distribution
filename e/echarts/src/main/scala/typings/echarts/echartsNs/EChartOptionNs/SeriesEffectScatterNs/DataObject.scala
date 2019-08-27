package typings.echarts.echartsNs.EChartOptionNs.SeriesEffectScatterNs

import typings.echarts.Anon_AlignBackgroundColorBorderColorBorderRadiusBorderWidthColorDistanceFontFamilyFontSize
import typings.echarts.Anon_BackgroundColorBorderColor
import typings.echarts.Anon_BorderColorBorderTypeBorderWidthColor
import typings.echarts.Anon_ItemStyleLabelAnonAlignBackgroundColorBorderColorBorderRadiusBorderWidth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataObject extends js.Object {
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-effectScatter.data.emphasis
    */
  var emphasis: js.UndefOr[Anon_ItemStyleLabelAnonAlignBackgroundColorBorderColorBorderRadiusBorderWidth] = js.undefined
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-effectScatter.data.itemStyle
    */
  var itemStyle: js.UndefOr[Anon_BorderColorBorderTypeBorderWidthColor] = js.undefined
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-effectScatter.data.label
    */
  var label: js.UndefOr[
    Anon_AlignBackgroundColorBorderColorBorderRadiusBorderWidthColorDistanceFontFamilyFontSize
  ] = js.undefined
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
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-effectScatter.effectScatter.data)
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
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-effectScatter.effectScatter.data)
    *
    *
    * @default
    * "circle"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-effectScatter.data.symbol
    */
  var symbol: js.UndefOr[String] = js.undefined
  /**
    * Whether to keep aspect for symbols in the form of `path://`.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-effectScatter.data.symbolKeepAspect
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-effectScatter.data.symbolOffset
    */
  var symbolOffset: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Rotate degree of single data symbol.
    * Note that when `symbol` is set to be `'arrow'` in `markLine`,
    * `symbolRotate` value will be ignored, and compulsively use
    * tangent angle.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-effectScatter.data.symbolRotate
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-effectScatter.data.symbolSize
    */
  var symbolSize: js.UndefOr[js.Array[_] | Double] = js.undefined
  /**
    * tooltip settings in this series data.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-effectScatter.data.tooltip
    */
  var tooltip: js.UndefOr[Anon_BackgroundColorBorderColor] = js.undefined
}

object DataObject {
  @scala.inline
  def apply(
    emphasis: Anon_ItemStyleLabelAnonAlignBackgroundColorBorderColorBorderRadiusBorderWidth = null,
    itemStyle: Anon_BorderColorBorderTypeBorderWidthColor = null,
    label: Anon_AlignBackgroundColorBorderColorBorderRadiusBorderWidthColorDistanceFontFamilyFontSize = null,
    symbol: String = null,
    symbolKeepAspect: js.UndefOr[Boolean] = js.undefined,
    symbolOffset: js.Array[_] = null,
    symbolRotate: Int | Double = null,
    symbolSize: js.Array[_] | Double = null,
    tooltip: Anon_BackgroundColorBorderColor = null
  ): DataObject = {
    val __obj = js.Dynamic.literal()
    if (emphasis != null) __obj.updateDynamic("emphasis")(emphasis)
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle)
    if (label != null) __obj.updateDynamic("label")(label)
    if (symbol != null) __obj.updateDynamic("symbol")(symbol)
    if (!js.isUndefined(symbolKeepAspect)) __obj.updateDynamic("symbolKeepAspect")(symbolKeepAspect)
    if (symbolOffset != null) __obj.updateDynamic("symbolOffset")(symbolOffset)
    if (symbolRotate != null) __obj.updateDynamic("symbolRotate")(symbolRotate.asInstanceOf[js.Any])
    if (symbolSize != null) __obj.updateDynamic("symbolSize")(symbolSize.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    __obj.asInstanceOf[DataObject]
  }
}

