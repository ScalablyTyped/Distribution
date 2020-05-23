package typings.echarts.echarts.EChartOption.SeriesGraph

import typings.echarts.anon.BorderRadius
import typings.echarts.anon.BorderType
import typings.echarts.anon.ItemStyleBorderTypeLabelDistance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CategoryObject extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-graph.categories.emphasis
    */
  var emphasis: js.UndefOr[ItemStyleBorderTypeLabelDistance] = js.undefined
  /**
    * The style of node in this category.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.categories.itemStyle
    */
  var itemStyle: js.UndefOr[BorderType] = js.undefined
  /**
    * The label style of node in this category.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.categories.label
    */
  var label: js.UndefOr[BorderRadius] = js.undefined
  /**
    * Name of category, which is used to correspond with
    * [legend](https://echarts.apache.org/en/option.html#legend)
    * and the content of
    * [tooltip](https://echarts.apache.org/en/option.html#tooltip)
    * .
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.categories.name
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Symbol of node of this category.
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
    * [see doc](https://echarts.apache.org/en/option.html#series-graph.graph.categories)
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
    * [see doc](https://echarts.apache.org/en/option.html#series-graph.graph.categories)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.categories.symbol
    */
  var symbol: js.UndefOr[String] = js.undefined
  /**
    * Whether to keep aspect for symbols in the form of `path://`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.categories.symbolKeepAspect
    */
  var symbolKeepAspect: js.UndefOr[Boolean] = js.undefined
  /**
    * Offset of node of this category symbol relative to original
    * position.
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
    * @see https://echarts.apache.org/en/option.html#series-graph.categories.symbolOffset
    */
  var symbolOffset: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Rotate degree of node of this category symbol.
    * Note that when `symbol` is set to be `'arrow'` in `markLine`,
    * `symbolRotate` value will be ignored, and compulsively use
    * tangent angle.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.categories.symbolRotate
    */
  var symbolRotate: js.UndefOr[Double] = js.undefined
  /**
    * node of this category symbol size.
    * It can be set to single numbers like `10`, or use an array
    * to represent width and height.
    * For example, `[20, 10]` means symbol width is `20`, and height
    * is`10`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.categories.symbolSize
    */
  var symbolSize: js.UndefOr[js.Array[_] | Double] = js.undefined
}

object CategoryObject {
  @scala.inline
  def apply(
    emphasis: ItemStyleBorderTypeLabelDistance = null,
    itemStyle: BorderType = null,
    label: BorderRadius = null,
    name: String = null,
    symbol: String = null,
    symbolKeepAspect: js.UndefOr[Boolean] = js.undefined,
    symbolOffset: js.Array[_] = null,
    symbolRotate: js.UndefOr[Double] = js.undefined,
    symbolSize: js.Array[_] | Double = null
  ): CategoryObject = {
    val __obj = js.Dynamic.literal()
    if (emphasis != null) __obj.updateDynamic("emphasis")(emphasis.asInstanceOf[js.Any])
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (symbol != null) __obj.updateDynamic("symbol")(symbol.asInstanceOf[js.Any])
    if (!js.isUndefined(symbolKeepAspect)) __obj.updateDynamic("symbolKeepAspect")(symbolKeepAspect.get.asInstanceOf[js.Any])
    if (symbolOffset != null) __obj.updateDynamic("symbolOffset")(symbolOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(symbolRotate)) __obj.updateDynamic("symbolRotate")(symbolRotate.get.asInstanceOf[js.Any])
    if (symbolSize != null) __obj.updateDynamic("symbolSize")(symbolSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[CategoryObject]
  }
}

