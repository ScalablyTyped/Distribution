package typings
package echartsLib.echartsNs.EChartOptionNs.SeriesParallelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataObject extends js.Object {
  /**
    * Line color.
    *
    * > Color can be represented in RGB, for example `'rgb(128,
    * 128, 128)'`.
    * RGBA can be used when you need alpha channel, for example
    * `'rgba(128, 128, 128, 0.5)'`.
    * You may also use hexadecimal format, for example `'#ccc'`.
    * Gradient color and texture are also supported besides single
    * colors.
    * >
    * > [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-parallel.parallel.data)
    *
    *
    * @default
    * "#000"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-parallel.data.color
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-parallel.data.emphasis
    */
  var emphasis: js.UndefOr[echartsLib.Anon_LineStyleAnonColorOpacityShadowBlur] = js.undefined
  /**
    * Line style.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-parallel.data.lineStyle
    */
  var lineStyle: js.UndefOr[js.Object] = js.undefined
  /**
    * The name of a data item.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-parallel.data.name
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Opacity of the component.
    * Supports value from 0 to 1, and the component will not be
    * drawn when set to 0.
    *
    *
    * @default
    * 0.45
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-parallel.data.opacity
    */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /**
    * Size of shadow blur.
    * This attribute should be used along with `shadowColor`,`shadowOffsetX`,
    * `shadowOffsetY` to set shadow to component.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-parallel.parallel.data)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-parallel.data.shadowBlur
    */
  var shadowBlur: js.UndefOr[scala.Double] = js.undefined
  /**
    * Shadow color. Support same format as `color`.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-parallel.data.shadowColor
    */
  var shadowColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Offset distance on the horizontal direction of shadow.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-parallel.data.shadowOffsetX
    */
  var shadowOffsetX: js.UndefOr[scala.Double] = js.undefined
  /**
    * Offset distance on the vertical direction of shadow.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-parallel.data.shadowOffsetY
    */
  var shadowOffsetY: js.UndefOr[scala.Double] = js.undefined
  /**
    * line type.
    *
    * Options are:
    *
    * + `'solid'`
    * + `'dashed'`
    * + `'dotted'`
    *
    *
    * @default
    * "solid"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-parallel.data.type
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The value of a data item.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-parallel.data.value
    */
  var value: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * line width.
    *
    *
    * @default
    * 2
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-parallel.data.width
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

