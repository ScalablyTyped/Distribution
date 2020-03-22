package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEmphasis extends js.Object {
  /**
    * border color, whose format is similar to that
    * of `color`.
    *
    *
    * @default
    * "#000"
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.data.1.itemStyle.borderColor
    */
  var borderColor: js.UndefOr[String] = js.undefined
  /**
    * Border type, which can be `'solid'`, `'dashed'`,
    * or `'dotted'`. `'solid'` by default.
    *
    *
    * @default
    * "solid"
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.data.1.itemStyle.borderType
    */
  var borderType: js.UndefOr[String] = js.undefined
  /**
    * border width.
    * No border when it is set to be 0.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.data.1.itemStyle.borderWidth
    */
  var borderWidth: js.UndefOr[Double] = js.undefined
  /**
    * color.
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
    * > [see doc](https://echarts.apache.org/en/option.html#series-scatter.scatter.markArea.data.1.itemStyle)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.data.1.itemStyle.color
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.data.1.itemStyle.emphasis
    */
  var emphasis: js.UndefOr[AnonBorderType] = js.undefined
  /**
    * Opacity of the component.
    * Supports value from 0 to 1, and the component
    * will not be drawn when set to 0.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.data.1.itemStyle.opacity
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /**
    * Size of shadow blur.
    * This attribute should be used along with `shadowColor`,`shadowOffsetX`,
    * `shadowOffsetY` to set shadow to component.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-scatter.scatter.markArea.data.1.itemStyle)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.data.1.itemStyle.shadowBlur
    */
  var shadowBlur: js.UndefOr[Double] = js.undefined
  /**
    * Shadow color. Support same format as `color`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.data.1.itemStyle.shadowColor
    */
  var shadowColor: js.UndefOr[String] = js.undefined
  /**
    * Offset distance on the horizontal direction of
    * shadow.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.data.1.itemStyle.shadowOffsetX
    */
  var shadowOffsetX: js.UndefOr[Double] = js.undefined
  /**
    * Offset distance on the vertical direction of
    * shadow.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.data.1.itemStyle.shadowOffsetY
    */
  var shadowOffsetY: js.UndefOr[Double] = js.undefined
}

object AnonEmphasis {
  @scala.inline
  def apply(
    borderColor: String = null,
    borderType: String = null,
    borderWidth: Int | Double = null,
    color: String = null,
    emphasis: AnonBorderType = null,
    opacity: Int | Double = null,
    shadowBlur: Int | Double = null,
    shadowColor: String = null,
    shadowOffsetX: Int | Double = null,
    shadowOffsetY: Int | Double = null
  ): AnonEmphasis = {
    val __obj = js.Dynamic.literal()
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderType != null) __obj.updateDynamic("borderType")(borderType.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (emphasis != null) __obj.updateDynamic("emphasis")(emphasis.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (shadowBlur != null) __obj.updateDynamic("shadowBlur")(shadowBlur.asInstanceOf[js.Any])
    if (shadowColor != null) __obj.updateDynamic("shadowColor")(shadowColor.asInstanceOf[js.Any])
    if (shadowOffsetX != null) __obj.updateDynamic("shadowOffsetX")(shadowOffsetX.asInstanceOf[js.Any])
    if (shadowOffsetY != null) __obj.updateDynamic("shadowOffsetY")(shadowOffsetY.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEmphasis]
  }
}

