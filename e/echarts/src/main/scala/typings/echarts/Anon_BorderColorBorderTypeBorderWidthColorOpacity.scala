package typings.echarts

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BorderColorBorderTypeBorderWidthColorOpacity
  extends /**
  * Some properties like "normal" or "emphasis" are not documented.
  * Please, write description for them
  */
/* unknownProperty */ StringDictionary[js.Any] {
  /**
    * border color, whose format is similar to that of `color`.
    *
    *
    * @default
    * "#000"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.itemStyle.borderColor
    */
  var borderColor: js.UndefOr[String] = js.undefined
  /**
    * Border type, which can be `'solid'`, `'dashed'`, or `'dotted'`.
    * `'solid'` by default.
    *
    *
    * @default
    * "solid"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.itemStyle.borderType
    */
  var borderType: js.UndefOr[String] = js.undefined
  /**
    * border width. No border when it is set to be 0.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.itemStyle.borderWidth
    */
  var borderWidth: js.UndefOr[Double] = js.undefined
  /**
    * color. Color is taken from
    * [option.color Palette](https://ecomfe.github.io/echarts-doc/public/en/option.html#color)
    * by default.
    *
    * > Color can be represented in RGB, for example `'rgb(128,
    * 128, 128)'`.
    * RGBA can be used when you need alpha channel, for example
    * `'rgba(128, 128, 128, 0.5)'`.
    * You may also use hexadecimal format, for example `'#ccc'`.
    * Gradient color and texture are also supported besides single
    * colors.
    * >
    * > [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.pie.itemStyle)
    *
    * Supports callback functions, in the form of:
    *
    * ```
    * (params: Object) => Color
    *
    * ```
    *
    * Input parameters are `seriesIndex`, `dataIndex`, `data`,
    * `value`, and etc. of data item.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.itemStyle.color
    */
  var color: js.UndefOr[String | js.Function] = js.undefined
  /**
    * Opacity of the component.
    * Supports value from 0 to 1, and the component will not be
    * drawn when set to 0.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.itemStyle.opacity
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /**
    * Size of shadow blur.
    * This attribute should be used along with `shadowColor`,`shadowOffsetX`,
    * `shadowOffsetY` to set shadow to component.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.pie.itemStyle)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.itemStyle.shadowBlur
    */
  var shadowBlur: js.UndefOr[Double] = js.undefined
  /**
    * Shadow color. Support same format as `color`.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.itemStyle.shadowColor
    */
  var shadowColor: js.UndefOr[String] = js.undefined
  /**
    * Offset distance on the horizontal direction of shadow.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.itemStyle.shadowOffsetX
    */
  var shadowOffsetX: js.UndefOr[Double] = js.undefined
  /**
    * Offset distance on the vertical direction of shadow.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.itemStyle.shadowOffsetY
    */
  var shadowOffsetY: js.UndefOr[Double] = js.undefined
}

object Anon_BorderColorBorderTypeBorderWidthColorOpacity {
  @scala.inline
  def apply(
    StringDictionary: /**
    * Some properties like "normal" or "emphasis" are not documented.
    * Please, write description for them
    */
  /* unknownProperty */ StringDictionary[js.Any] = null,
    borderColor: String = null,
    borderType: String = null,
    borderWidth: Int | Double = null,
    color: String | js.Function = null,
    opacity: Int | Double = null,
    shadowBlur: Int | Double = null,
    shadowColor: String = null,
    shadowOffsetX: Int | Double = null,
    shadowOffsetY: Int | Double = null
  ): Anon_BorderColorBorderTypeBorderWidthColorOpacity = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor)
    if (borderType != null) __obj.updateDynamic("borderType")(borderType)
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (shadowBlur != null) __obj.updateDynamic("shadowBlur")(shadowBlur.asInstanceOf[js.Any])
    if (shadowColor != null) __obj.updateDynamic("shadowColor")(shadowColor)
    if (shadowOffsetX != null) __obj.updateDynamic("shadowOffsetX")(shadowOffsetX.asInstanceOf[js.Any])
    if (shadowOffsetY != null) __obj.updateDynamic("shadowOffsetY")(shadowOffsetY.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BorderColorBorderTypeBorderWidthColorOpacity]
  }
}

