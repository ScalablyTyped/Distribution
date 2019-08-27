package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorOpacityShadowBlurShadowColor extends js.Object {
  /**
    * The axis line of gauge chart can be divided to several
    * segments in different colors.
    * The end position and color of each segment can be expressed
    * by an array.
    *
    * Default value:
    *
    * ```
    * [[0.2, '#91c7ae'], [0.8, '#63869e'], [1, '#c23531']]
    *
    * ```
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.axisLine.lineStyle.color
    */
  var color: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Opacity of the component.
    * Supports value from 0 to 1, and the component will not
    * be drawn when set to 0.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.axisLine.lineStyle.opacity
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /**
    * Size of shadow blur.
    * This attribute should be used along with `shadowColor`,`shadowOffsetX`,
    * `shadowOffsetY` to set shadow to component.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.gauge.axisLine.lineStyle)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.axisLine.lineStyle.shadowBlur
    */
  var shadowBlur: js.UndefOr[Double] = js.undefined
  /**
    * Shadow color. Support same format as `color`.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.axisLine.lineStyle.shadowColor
    */
  var shadowColor: js.UndefOr[String] = js.undefined
  /**
    * Offset distance on the horizontal direction of shadow.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.axisLine.lineStyle.shadowOffsetX
    */
  var shadowOffsetX: js.UndefOr[Double] = js.undefined
  /**
    * Offset distance on the vertical direction of shadow.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.axisLine.lineStyle.shadowOffsetY
    */
  var shadowOffsetY: js.UndefOr[Double] = js.undefined
  /**
    * The width of axis line.
    *
    *
    * @default
    * 30
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.axisLine.lineStyle.width
    */
  var width: js.UndefOr[Double] = js.undefined
}

object Anon_ColorOpacityShadowBlurShadowColor {
  @scala.inline
  def apply(
    color: js.Array[_] = null,
    opacity: Int | Double = null,
    shadowBlur: Int | Double = null,
    shadowColor: String = null,
    shadowOffsetX: Int | Double = null,
    shadowOffsetY: Int | Double = null,
    width: Int | Double = null
  ): Anon_ColorOpacityShadowBlurShadowColor = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (shadowBlur != null) __obj.updateDynamic("shadowBlur")(shadowBlur.asInstanceOf[js.Any])
    if (shadowColor != null) __obj.updateDynamic("shadowColor")(shadowColor)
    if (shadowOffsetX != null) __obj.updateDynamic("shadowOffsetX")(shadowOffsetX.asInstanceOf[js.Any])
    if (shadowOffsetY != null) __obj.updateDynamic("shadowOffsetY")(shadowOffsetY.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ColorOpacityShadowBlurShadowColor]
  }
}

