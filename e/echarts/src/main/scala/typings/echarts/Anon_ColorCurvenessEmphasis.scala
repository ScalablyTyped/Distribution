package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorCurvenessEmphasis extends js.Object {
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
    * > [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.scatter.markLine.data.1.lineStyle)
    *
    *
    * @default
    * "#000"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.markLine.data.1.lineStyle.color
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    * Edge curvature, which supports value from 0 to
    * 1.
    * The larger the value, the greater the curvature.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.markLine.data.1.lineStyle.curveness
    */
  var curveness: js.UndefOr[Double] = js.undefined
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.markLine.data.1.lineStyle.emphasis
    */
  var emphasis: js.UndefOr[Anon_ColorCurvenessOpacity] = js.undefined
  /**
    * Opacity of the component.
    * Supports value from 0 to 1, and the component
    * will not be drawn when set to 0.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.markLine.data.1.lineStyle.opacity
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /**
    * Size of shadow blur.
    * This attribute should be used along with `shadowColor`,`shadowOffsetX`,
    * `shadowOffsetY` to set shadow to component.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.scatter.markLine.data.1.lineStyle)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.markLine.data.1.lineStyle.shadowBlur
    */
  var shadowBlur: js.UndefOr[Double] = js.undefined
  /**
    * Shadow color. Support same format as `color`.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.markLine.data.1.lineStyle.shadowColor
    */
  var shadowColor: js.UndefOr[String] = js.undefined
  /**
    * Offset distance on the horizontal direction of
    * shadow.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.markLine.data.1.lineStyle.shadowOffsetX
    */
  var shadowOffsetX: js.UndefOr[Double] = js.undefined
  /**
    * Offset distance on the vertical direction of
    * shadow.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.markLine.data.1.lineStyle.shadowOffsetY
    */
  var shadowOffsetY: js.UndefOr[Double] = js.undefined
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.markLine.data.1.lineStyle.type
    */
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * line width.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.markLine.data.1.lineStyle.width
    */
  var width: js.UndefOr[Double] = js.undefined
}

object Anon_ColorCurvenessEmphasis {
  @scala.inline
  def apply(
    color: String = null,
    curveness: Int | Double = null,
    emphasis: Anon_ColorCurvenessOpacity = null,
    opacity: Int | Double = null,
    shadowBlur: Int | Double = null,
    shadowColor: String = null,
    shadowOffsetX: Int | Double = null,
    shadowOffsetY: Int | Double = null,
    `type`: String = null,
    width: Int | Double = null
  ): Anon_ColorCurvenessEmphasis = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (curveness != null) __obj.updateDynamic("curveness")(curveness.asInstanceOf[js.Any])
    if (emphasis != null) __obj.updateDynamic("emphasis")(emphasis)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (shadowBlur != null) __obj.updateDynamic("shadowBlur")(shadowBlur.asInstanceOf[js.Any])
    if (shadowColor != null) __obj.updateDynamic("shadowColor")(shadowColor)
    if (shadowOffsetX != null) __obj.updateDynamic("shadowOffsetX")(shadowOffsetX.asInstanceOf[js.Any])
    if (shadowOffsetY != null) __obj.updateDynamic("shadowOffsetY")(shadowOffsetY.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ColorCurvenessEmphasis]
  }
}

