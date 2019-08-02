package typings.echarts

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BarBorderColor
  extends /**
  * Some properties like "normal" or "emphasis" are not documented.
  * Please, write description for them
  */
/* unknownProperty */ StringDictionary[js.Any] {
  /**
    * The bodrder color of bar.
    *
    *
    * @default
    * '#000'
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-bar.itemStyle.barBorderColor
    */
  var barBorderColor: js.UndefOr[String] = js.undefined
  /**
    * The radius of rounded corner.
    * Its unit is px.
    * And it supports use array to respectively specify the 4 corner
    * radiuses.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-bar.bar.itemStyle)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-bar.itemStyle.barBorderRadius
    */
  var barBorderRadius: js.UndefOr[js.Array[_] | Double] = js.undefined
  /**
    * The bodrder width of bar. defaults to have no border.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-bar.itemStyle.barBorderWidth
    */
  var barBorderWidth: js.UndefOr[Double] = js.undefined
  /**
    * Bar color. defaults to acquire colors from global palette
    * [option.color](https://ecomfe.github.io/echarts-doc/public/en/option.html#color)
    * .
    *
    *
    * @default
    * "auto"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-bar.itemStyle.color
    */
  var color: js.UndefOr[String | Anon_ColorStops | Anon_ColorStopsGlobal] = js.undefined
  /**
    * Opacity of the component.
    * Supports value from 0 to 1, and the component will not be
    * drawn when set to 0.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-bar.itemStyle.opacity
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /**
    * Size of shadow blur.
    * This attribute should be used along with `shadowColor`,`shadowOffsetX`,
    * `shadowOffsetY` to set shadow to component.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-bar.bar.itemStyle)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-bar.itemStyle.shadowBlur
    */
  var shadowBlur: js.UndefOr[Double] = js.undefined
  /**
    * Shadow color. Support same format as `color`.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-bar.itemStyle.shadowColor
    */
  var shadowColor: js.UndefOr[String] = js.undefined
  /**
    * Offset distance on the horizontal direction of shadow.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-bar.itemStyle.shadowOffsetX
    */
  var shadowOffsetX: js.UndefOr[Double] = js.undefined
  /**
    * Offset distance on the vertical direction of shadow.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-bar.itemStyle.shadowOffsetY
    */
  var shadowOffsetY: js.UndefOr[Double] = js.undefined
}

object Anon_BarBorderColor {
  @scala.inline
  def apply(
    StringDictionary: /**
    * Some properties like "normal" or "emphasis" are not documented.
    * Please, write description for them
    */
  /* unknownProperty */ StringDictionary[js.Any] = null,
    barBorderColor: String = null,
    barBorderRadius: js.Array[_] | Double = null,
    barBorderWidth: Int | Double = null,
    color: String | Anon_ColorStops | Anon_ColorStopsGlobal = null,
    opacity: Int | Double = null,
    shadowBlur: Int | Double = null,
    shadowColor: String = null,
    shadowOffsetX: Int | Double = null,
    shadowOffsetY: Int | Double = null
  ): Anon_BarBorderColor = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (barBorderColor != null) __obj.updateDynamic("barBorderColor")(barBorderColor)
    if (barBorderRadius != null) __obj.updateDynamic("barBorderRadius")(barBorderRadius.asInstanceOf[js.Any])
    if (barBorderWidth != null) __obj.updateDynamic("barBorderWidth")(barBorderWidth.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (shadowBlur != null) __obj.updateDynamic("shadowBlur")(shadowBlur.asInstanceOf[js.Any])
    if (shadowColor != null) __obj.updateDynamic("shadowColor")(shadowColor)
    if (shadowOffsetX != null) __obj.updateDynamic("shadowOffsetX")(shadowOffsetX.asInstanceOf[js.Any])
    if (shadowOffsetY != null) __obj.updateDynamic("shadowOffsetY")(shadowOffsetY.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BarBorderColor]
  }
}

