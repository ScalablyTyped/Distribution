package typings
package echartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BorderColorBorderTypeBorderWidthColorOpacityShadowBlurShadowColor extends js.Object {
  /**
    * boxplot border color, whose format is similar to
    * that of `color`.
    *
    *
    * @default
    * "rgba(255,255,255,0.7)"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.breadcrumb.emphasis.itemStyle.borderColor
    */
  var borderColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Border type, which can be `'solid'`, `'dashed'`,
    * or `'dotted'`. `'solid'` by default.
    *
    *
    * @default
    * "solid"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.breadcrumb.emphasis.itemStyle.borderType
    */
  var borderType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * boxplot border width.
    * No border when it is set to be 0.
    *
    *
    * @default
    * 1
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.breadcrumb.emphasis.itemStyle.borderWidth
    */
  var borderWidth: js.UndefOr[scala.Double] = js.undefined
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
    * > [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.treemap.breadcrumb.emphasis.itemStyle)
    *
    *
    * @default
    * "rgba(0,0,0,0.7)"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.breadcrumb.emphasis.itemStyle.color
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Opacity of the component.
    * Supports value from 0 to 1, and the component will
    * not be drawn when set to 0.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.breadcrumb.emphasis.itemStyle.opacity
    */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /**
    * Size of shadow blur.
    * This attribute should be used along with `shadowColor`,`shadowOffsetX`,
    * `shadowOffsetY` to set shadow to component.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.treemap.breadcrumb.emphasis.itemStyle)
    *
    *
    * @default
    * 3
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.breadcrumb.emphasis.itemStyle.shadowBlur
    */
  var shadowBlur: js.UndefOr[scala.Double] = js.undefined
  /**
    * Shadow color. Support same format as `color`.
    *
    *
    * @default
    * "rgba(150,150,150,1)"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.breadcrumb.emphasis.itemStyle.shadowColor
    */
  var shadowColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Offset distance on the horizontal direction of shadow.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.breadcrumb.emphasis.itemStyle.shadowOffsetX
    */
  var shadowOffsetX: js.UndefOr[scala.Double] = js.undefined
  /**
    * Offset distance on the vertical direction of shadow.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.breadcrumb.emphasis.itemStyle.shadowOffsetY
    */
  var shadowOffsetY: js.UndefOr[scala.Double] = js.undefined
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.breadcrumb.emphasis.itemStyle.textStyle
    */
  var textStyle: js.UndefOr[
    Anon_AlignBackgroundColorBorderColorBorderRadiusBorderWidthColorFontFamilyFontSizeFontStyleFontWeightHeight
  ] = js.undefined
}

object Anon_BorderColorBorderTypeBorderWidthColorOpacityShadowBlurShadowColor {
  @scala.inline
  def apply(
    borderColor: java.lang.String = null,
    borderType: java.lang.String = null,
    borderWidth: scala.Int | scala.Double = null,
    color: java.lang.String = null,
    opacity: scala.Int | scala.Double = null,
    shadowBlur: scala.Int | scala.Double = null,
    shadowColor: java.lang.String = null,
    shadowOffsetX: scala.Int | scala.Double = null,
    shadowOffsetY: scala.Int | scala.Double = null,
    textStyle: Anon_AlignBackgroundColorBorderColorBorderRadiusBorderWidthColorFontFamilyFontSizeFontStyleFontWeightHeight = null
  ): Anon_BorderColorBorderTypeBorderWidthColorOpacityShadowBlurShadowColor = {
    val __obj = js.Dynamic.literal()
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor)
    if (borderType != null) __obj.updateDynamic("borderType")(borderType)
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (shadowBlur != null) __obj.updateDynamic("shadowBlur")(shadowBlur.asInstanceOf[js.Any])
    if (shadowColor != null) __obj.updateDynamic("shadowColor")(shadowColor)
    if (shadowOffsetX != null) __obj.updateDynamic("shadowOffsetX")(shadowOffsetX.asInstanceOf[js.Any])
    if (shadowOffsetY != null) __obj.updateDynamic("shadowOffsetY")(shadowOffsetY.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle)
    __obj.asInstanceOf[Anon_BorderColorBorderTypeBorderWidthColorOpacityShadowBlurShadowColor]
  }
}

