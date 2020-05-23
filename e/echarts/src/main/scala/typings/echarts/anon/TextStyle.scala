package typings.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextStyle extends js.Object {
  /**
    * boxplot border color, whose format is similar to
    * that of `color`.
    *
    *
    * @default
    * "rgba(255,255,255,0.7)"
    * @see https://echarts.apache.org/en/option.html#series-treemap.breadcrumb.emphasis.itemStyle.borderColor
    */
  var borderColor: js.UndefOr[String] = js.undefined
  /**
    * Border type, which can be `'solid'`, `'dashed'`,
    * or `'dotted'`. `'solid'` by default.
    *
    *
    * @default
    * "solid"
    * @see https://echarts.apache.org/en/option.html#series-treemap.breadcrumb.emphasis.itemStyle.borderType
    */
  var borderType: js.UndefOr[String] = js.undefined
  /**
    * boxplot border width.
    * No border when it is set to be 0.
    *
    *
    * @default
    * 1
    * @see https://echarts.apache.org/en/option.html#series-treemap.breadcrumb.emphasis.itemStyle.borderWidth
    */
  var borderWidth: js.UndefOr[Double] = js.undefined
  /**
    * boxplot color.
    *
    * > Color can be represented in RGB, for example `'rgb(128,
    * 128, 128)'`.
    * RGBA can be used when you need alpha channel, for
    * example `'rgba(128, 128, 128, 0.5)'`.
    * You may also use hexadecimal format, for example
    * `'#ccc'`.
    * Gradient color and texture are also supported besides
    * single colors.
    * >
    * > [see doc](https://echarts.apache.org/en/option.html#series-treemap.treemap.breadcrumb.emphasis.itemStyle)
    *
    *
    * @default
    * "rgba(0,0,0,0.7)"
    * @see https://echarts.apache.org/en/option.html#series-treemap.breadcrumb.emphasis.itemStyle.color
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    * Opacity of the component.
    * Supports value from 0 to 1, and the component will
    * not be drawn when set to 0.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.breadcrumb.emphasis.itemStyle.opacity
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /**
    * Size of shadow blur.
    * This attribute should be used along with `shadowColor`,`shadowOffsetX`,
    * `shadowOffsetY` to set shadow to component.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-treemap.treemap.breadcrumb.emphasis.itemStyle)
    *
    *
    * @default
    * 3
    * @see https://echarts.apache.org/en/option.html#series-treemap.breadcrumb.emphasis.itemStyle.shadowBlur
    */
  var shadowBlur: js.UndefOr[Double] = js.undefined
  /**
    * Shadow color. Support same format as `color`.
    *
    *
    * @default
    * "rgba(150,150,150,1)"
    * @see https://echarts.apache.org/en/option.html#series-treemap.breadcrumb.emphasis.itemStyle.shadowColor
    */
  var shadowColor: js.UndefOr[String] = js.undefined
  /**
    * Offset distance on the horizontal direction of shadow.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.breadcrumb.emphasis.itemStyle.shadowOffsetX
    */
  var shadowOffsetX: js.UndefOr[Double] = js.undefined
  /**
    * Offset distance on the vertical direction of shadow.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.breadcrumb.emphasis.itemStyle.shadowOffsetY
    */
  var shadowOffsetY: js.UndefOr[Double] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-treemap.breadcrumb.emphasis.itemStyle.textStyle
    */
  var textStyle: js.UndefOr[TextShadowOffsetY] = js.undefined
}

object TextStyle {
  @scala.inline
  def apply(
    borderColor: String = null,
    borderType: String = null,
    borderWidth: js.UndefOr[Double] = js.undefined,
    color: String = null,
    opacity: js.UndefOr[Double] = js.undefined,
    shadowBlur: js.UndefOr[Double] = js.undefined,
    shadowColor: String = null,
    shadowOffsetX: js.UndefOr[Double] = js.undefined,
    shadowOffsetY: js.UndefOr[Double] = js.undefined,
    textStyle: TextShadowOffsetY = null
  ): TextStyle = {
    val __obj = js.Dynamic.literal()
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderType != null) __obj.updateDynamic("borderType")(borderType.asInstanceOf[js.Any])
    if (!js.isUndefined(borderWidth)) __obj.updateDynamic("borderWidth")(borderWidth.get.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shadowBlur)) __obj.updateDynamic("shadowBlur")(shadowBlur.get.asInstanceOf[js.Any])
    if (shadowColor != null) __obj.updateDynamic("shadowColor")(shadowColor.asInstanceOf[js.Any])
    if (!js.isUndefined(shadowOffsetX)) __obj.updateDynamic("shadowOffsetX")(shadowOffsetX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shadowOffsetY)) __obj.updateDynamic("shadowOffsetY")(shadowOffsetY.get.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextStyle]
  }
}

