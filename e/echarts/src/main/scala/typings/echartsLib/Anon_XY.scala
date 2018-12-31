package typings
package echartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_XY extends js.Object {
  /**
    * Coordinates of the starting point or ending point,
    * whose format depends on the coordinate of the series.
    * It can be `x`, and `y` for
    * [rectangular coordinates](https://ecomfe.github.io/echarts-doc/public/en/option.html#grid)
    * , or `radius`, and `angle` for
    * [polar coordinates](https://ecomfe.github.io/echarts-doc/public/en/option.html#polar)
    * .
    *
    * **Notice:** For axis with
    * [axis.type](https://ecomfe.github.io/echarts-doc/public/en/option.html#xAixs.type)
    * `'category'`:
    *
    * + If coord value is `number`, it represents index
    * of
    * [axis.data](https://ecomfe.github.io/echarts-doc/public/en/option.html#xAxis.data)
    * .
    * + If coord value is `string`, it represents concrete
    * value in
    * [axis.data](https://ecomfe.github.io/echarts-doc/public/en/option.html#xAxis.data)
    *
    *
    * Please notice that in this case `xAxis.data`
    * must not be written as \[number, number,
    *
    *
    *
    * \], but can only be written \[string, string,
    *
    *
    *
    * \].
    * Otherwise it is not able to be located by markPoint
    * / markLine.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.candlestick.markLine.data.0)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.markLine.data.0.coord
    */
  var coord: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Label of this data item, which will be merged with
    * `label` of starting point and ending point.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.markLine.data.0.label
    */
  var label: js.UndefOr[Anon_FormatterPosition] = js.undefined
  /**
    * Line style of this data item, which will be merged
    * with `lineStyle` of starting point and ending point.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.markLine.data.0.lineStyle
    */
  var lineStyle: js.UndefOr[Anon_ShadowOffsetXShadowBlurColor] = js.undefined
  /**
    * Symbol of starting point.
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
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.candlestick.markLine.data.0)
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
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.candlestick.markLine.data.0)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.markLine.data.0.symbol
    */
  var symbol: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether to keep aspect for symbols in the form of
    * `path://`.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.markLine.data.0.symbolKeepAspect
    */
  var symbolKeepAspect: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Offset of starting point symbol relative to original
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.markLine.data.0.symbolOffset
    */
  var symbolOffset: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Rotate degree of starting point symbol.
    * Note that when `symbol` is set to be `'arrow'` in
    * `markLine`, `symbolRotate` value will be ignored,
    * and compulsively use tangent angle.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.markLine.data.0.symbolRotate
    */
  var symbolRotate: js.UndefOr[scala.Double] = js.undefined
  /**
    * starting point symbol size.
    * It can be set to single numbers like `10`, or use
    * an array to represent width and height.
    * For example, `[20, 10]` means symbol width is `20`,
    * and height is`10`.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.markLine.data.0.symbolSize
    */
  var symbolSize: js.UndefOr[js.Array[_] | scala.Double] = js.undefined
  /**
    * Special label types, are used to label maximum value,
    * minimum value and so on.
    *
    * **Options are:**
    *
    * + `'min'` maximum value.
    * + `'max'` minimum value.
    * + `'average'` average value.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.markLine.data.0.type
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Label value, which can be ignored.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.markLine.data.0.value
    */
  var value: js.UndefOr[scala.Double] = js.undefined
  /**
    * Works only when
    * [type](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-.markLine.data.type)
    * is assigned.
    * It is used to state the dimension used to calculate
    * maximum value or minimum value.
    * It may be the direct name of a dimension, like `x`,
    * or `angle` for line charts, or `open`, or `close`
    * for candlestick charts.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.markLine.data.0.valueDim
    */
  var valueDim: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Works only when
    * [type](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-.markLine.data.type)
    * is assigned.
    * It is used to state the dimension used to calculate
    * maximum value or minimum value.
    * It may be `0` (for xAxis, or radiusAxis), or `1`
    * (for yAxis, or angleAxis).
    * Dimension of the first numeric axis is used by default.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.markLine.data.0.valueIndex
    */
  var valueIndex: js.UndefOr[scala.Double] = js.undefined
  /**
    * X position according to container, in pixel.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.markLine.data.0.x
    */
  var x: js.UndefOr[scala.Double] = js.undefined
  /**
    * Y position according to container, in pixel.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.markLine.data.0.y
    */
  var y: js.UndefOr[scala.Double] = js.undefined
}

