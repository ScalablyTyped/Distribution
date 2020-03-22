package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSymbolKeepAspect extends js.Object {
  /**
    * Label of this data item, which will be merged with
    * `label` of starting point and ending point.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.markLine.data.1.label
    */
  var label: js.UndefOr[AnonPosition] = js.undefined
  /**
    * Line style of this data item, which will be merged
    * with `lineStyle` of starting point and ending point.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.markLine.data.1.lineStyle
    */
  var lineStyle: js.UndefOr[AnonShadowOffsetX] = js.undefined
  /**
    * Name of the marker, which will display as a label.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.markLine.data.1.name
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Symbol of ending point.
    *
    * Icon types provided by ECharts includes `'circle'`,
    * `'rect'`, `'roundRect'`, `'triangle'`, `'diamond'`,
    * `'pin'`, `'arrow'`, `'none'`
    *
    * It can be set to an image with `'image://url'` ,
    * in which URL is the link to an image, or `dataURI`
    * of an image.
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
    * [see doc](https://echarts.apache.org/en/option.html#series-pie.pie.markLine.data.1)
    *
    * Icons can be set to arbitrary vector path via `'path://'`
    * in ECharts.
    * As compared with raster image, vector paths prevent
    * from jagging and blurring when scaled, and have a
    * better control over changing colors.
    * Size of vectoer icon will be adapted automatically.
    * Refer to
    * [SVG PathData](http://www.w3.org/TR/SVG/paths.html#PathData)
    * for more information about format of path.
    * You may export vector paths from tools like Adobe
    * Illustrator.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-pie.pie.markLine.data.1)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.markLine.data.1.symbol
    */
  var symbol: js.UndefOr[String] = js.undefined
  /**
    * Whether to keep aspect for symbols in the form of
    * `path://`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.markLine.data.1.symbolKeepAspect
    */
  var symbolKeepAspect: js.UndefOr[Boolean] = js.undefined
  /**
    * Offset of ending point symbol relative to original
    * position.
    * By default, symbol will be put in the center position
    * of data.
    * But if symbol is from user-defined vector path or
    * image, you may not expect symbol to be in center.
    * In this case, you may use this attribute to set offset
    * to default position.
    * It can be in absolute pixel value, or in relative
    * percentage value.
    *
    * For example, `[0, '50%']` means to move upside side
    * position of symbol height.
    * It can be used to make the arrow in the bottom to
    * be at data position when symbol is pin.
    *
    *
    * @default
    * [0, 0]
    * @see https://echarts.apache.org/en/option.html#series-pie.markLine.data.1.symbolOffset
    */
  var symbolOffset: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Rotate degree of ending point symbol.
    * Note that when `symbol` is set to be `'arrow'` in
    * `markLine`, `symbolRotate` value will be ignored,
    * and compulsively use tangent angle.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.markLine.data.1.symbolRotate
    */
  var symbolRotate: js.UndefOr[Double] = js.undefined
  /**
    * ending point symbol size.
    * It can be set to single numbers like `10`, or use
    * an array to represent width and height.
    * For example, `[20, 10]` means symbol width is `20`,
    * and height is`10`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.markLine.data.1.symbolSize
    */
  var symbolSize: js.UndefOr[js.Array[_] | Double] = js.undefined
  /**
    * Label value, which can be ignored.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.markLine.data.1.value
    */
  var value: js.UndefOr[Double] = js.undefined
  /**
    * X position according to container, in pixel.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.markLine.data.1.x
    */
  var x: js.UndefOr[Double] = js.undefined
  /**
    * Y position according to container, in pixel.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.markLine.data.1.y
    */
  var y: js.UndefOr[Double] = js.undefined
}

object AnonSymbolKeepAspect {
  @scala.inline
  def apply(
    label: AnonPosition = null,
    lineStyle: AnonShadowOffsetX = null,
    name: String = null,
    symbol: String = null,
    symbolKeepAspect: js.UndefOr[Boolean] = js.undefined,
    symbolOffset: js.Array[_] = null,
    symbolRotate: Int | Double = null,
    symbolSize: js.Array[_] | Double = null,
    value: Int | Double = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): AnonSymbolKeepAspect = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (symbol != null) __obj.updateDynamic("symbol")(symbol.asInstanceOf[js.Any])
    if (!js.isUndefined(symbolKeepAspect)) __obj.updateDynamic("symbolKeepAspect")(symbolKeepAspect.asInstanceOf[js.Any])
    if (symbolOffset != null) __obj.updateDynamic("symbolOffset")(symbolOffset.asInstanceOf[js.Any])
    if (symbolRotate != null) __obj.updateDynamic("symbolRotate")(symbolRotate.asInstanceOf[js.Any])
    if (symbolSize != null) __obj.updateDynamic("symbolSize")(symbolSize.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSymbolKeepAspect]
  }
}

