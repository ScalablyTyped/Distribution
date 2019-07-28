package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AreaStyleItemStyle extends js.Object {
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-radar.data.emphasis.areaStyle
    */
  var areaStyle: js.UndefOr[Anon_ColorOpacityShadowBlurShadowColor] = js.undefined
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-radar.data.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[Anon_BarBorderColorBarBorderWidth] = js.undefined
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-radar.data.emphasis.label
    */
  var label: js.UndefOr[Anon_AlignBackgroundColorBorderColorBorderRadiusBorderWidth] = js.undefined
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-radar.data.emphasis.lineStyle
    */
  var lineStyle: js.UndefOr[Anon_ColorOpacityShadowBlur] = js.undefined
}

object Anon_AreaStyleItemStyle {
  @scala.inline
  def apply(
    areaStyle: Anon_ColorOpacityShadowBlurShadowColor = null,
    itemStyle: Anon_BarBorderColorBarBorderWidth = null,
    label: Anon_AlignBackgroundColorBorderColorBorderRadiusBorderWidth = null,
    lineStyle: Anon_ColorOpacityShadowBlur = null
  ): Anon_AreaStyleItemStyle = {
    val __obj = js.Dynamic.literal()
    if (areaStyle != null) __obj.updateDynamic("areaStyle")(areaStyle)
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle)
    if (label != null) __obj.updateDynamic("label")(label)
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle)
    __obj.asInstanceOf[Anon_AreaStyleItemStyle]
  }
}

