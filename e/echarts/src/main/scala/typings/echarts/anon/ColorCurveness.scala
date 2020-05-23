package typings.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorCurveness extends js.Object {
  /**
    * Line color.
    *
    * > Color can be represented in RGB, for example `'rgb(128,
    * 128, 128)'`.
    * RGBA can be used when you need alpha channel, for example
    * `'rgba(128, 128, 128, 0.5)'`.
    * You may also use hexadecimal format, for example `'#ccc'`.
    * Gradient color and texture are also supported besides
    * single colors.
    * >
    * > [see doc](https://echarts.apache.org/en/option.html#series-line.line.markLine.lineStyle)
    *
    *
    * @default
    * "#000"
    * @see https://echarts.apache.org/en/option.html#series-line.markLine.lineStyle.color
    */
  var color: js.UndefOr[typings.echarts.echarts.EChartOption.Color] = js.undefined
  /**
    * Edge curvature, which supports value from 0 to 1.
    * The larger the value, the greater the curvature.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-line.markLine.lineStyle.curveness
    */
  var curveness: js.UndefOr[Double] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-line.markLine.lineStyle.emphasis
    */
  var emphasis: js.UndefOr[ShadowBlur] = js.undefined
  /**
    * Opacity of the component.
    * Supports value from 0 to 1, and the component will not
    * be drawn when set to 0.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-line.markLine.lineStyle.opacity
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /**
    * Size of shadow blur.
    * This attribute should be used along with `shadowColor`,`shadowOffsetX`,
    * `shadowOffsetY` to set shadow to component.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-line.line.markLine.lineStyle)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-line.markLine.lineStyle.shadowBlur
    */
  var shadowBlur: js.UndefOr[Double] = js.undefined
  /**
    * Shadow color. Support same format as `color`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-line.markLine.lineStyle.shadowColor
    */
  var shadowColor: js.UndefOr[String] = js.undefined
  /**
    * Offset distance on the horizontal direction of shadow.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-line.markLine.lineStyle.shadowOffsetX
    */
  var shadowOffsetX: js.UndefOr[Double] = js.undefined
  /**
    * Offset distance on the vertical direction of shadow.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-line.markLine.lineStyle.shadowOffsetY
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
    * @see https://echarts.apache.org/en/option.html#series-line.markLine.lineStyle.type
    */
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * line width.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-line.markLine.lineStyle.width
    */
  var width: js.UndefOr[Double] = js.undefined
}

object ColorCurveness {
  @scala.inline
  def apply(
    color: typings.echarts.echarts.EChartOption.Color = null,
    curveness: js.UndefOr[Double] = js.undefined,
    emphasis: ShadowBlur = null,
    opacity: js.UndefOr[Double] = js.undefined,
    shadowBlur: js.UndefOr[Double] = js.undefined,
    shadowColor: String = null,
    shadowOffsetX: js.UndefOr[Double] = js.undefined,
    shadowOffsetY: js.UndefOr[Double] = js.undefined,
    `type`: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): ColorCurveness = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(curveness)) __obj.updateDynamic("curveness")(curveness.get.asInstanceOf[js.Any])
    if (emphasis != null) __obj.updateDynamic("emphasis")(emphasis.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shadowBlur)) __obj.updateDynamic("shadowBlur")(shadowBlur.get.asInstanceOf[js.Any])
    if (shadowColor != null) __obj.updateDynamic("shadowColor")(shadowColor.asInstanceOf[js.Any])
    if (!js.isUndefined(shadowOffsetX)) __obj.updateDynamic("shadowOffsetX")(shadowOffsetX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shadowOffsetY)) __obj.updateDynamic("shadowOffsetY")(shadowOffsetY.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorCurveness]
  }
}

