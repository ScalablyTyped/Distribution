package typings
package echartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ShadowOffsetXShadowBlurColor extends js.Object {
  /**
    * Line color.
    *
    * > Color can be represented in RGB, for example
    * `'rgb(128, 128, 128)'`.
    * RGBA can be used when you need alpha channel,
    * for example `'rgba(128, 128, 128, 0.5)'`.
    * You may also use hexadecimal format, for example
    * `'#ccc'`.
    * Gradient color and texture are also supported
    * besides single colors.
    * >
    * > [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.candlestick.markLine.data.0.lineStyle)
    *
    *
    * @default
    * "#000"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.markLine.data.0.lineStyle.color
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Edge curvature, which supports value from 0 to
    * 1.
    * The larger the value, the greater the curvature.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.markLine.data.0.lineStyle.curveness
    */
  var curveness: js.UndefOr[scala.Double] = js.undefined
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.markLine.data.0.lineStyle.emphasis
    */
  var emphasis: js.UndefOr[Anon_ShadowOffsetXShadowBlur] = js.undefined
  /**
    * Opacity of the component.
    * Supports value from 0 to 1, and the component
    * will not be drawn when set to 0.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.markLine.data.0.lineStyle.opacity
    */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /**
    * Size of shadow blur.
    * This attribute should be used along with `shadowColor`,`shadowOffsetX`,
    * `shadowOffsetY` to set shadow to component.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.candlestick.markLine.data.0.lineStyle)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.markLine.data.0.lineStyle.shadowBlur
    */
  var shadowBlur: js.UndefOr[scala.Double] = js.undefined
  /**
    * Shadow color. Support same format as `color`.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.markLine.data.0.lineStyle.shadowColor
    */
  var shadowColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Offset distance on the horizontal direction of
    * shadow.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.markLine.data.0.lineStyle.shadowOffsetX
    */
  var shadowOffsetX: js.UndefOr[scala.Double] = js.undefined
  /**
    * Offset distance on the vertical direction of
    * shadow.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.markLine.data.0.lineStyle.shadowOffsetY
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.markLine.data.0.lineStyle.type
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /**
    * line width.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.markLine.data.0.lineStyle.width
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

