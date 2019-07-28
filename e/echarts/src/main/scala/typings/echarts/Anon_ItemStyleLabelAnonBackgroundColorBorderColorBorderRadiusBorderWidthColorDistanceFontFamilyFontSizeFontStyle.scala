package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemStyleLabelAnonBackgroundColorBorderColorBorderRadiusBorderWidthColorDistanceFontFamilyFontSizeFontStyle extends js.Object {
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-themeRiver.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[Anon_BorderColor] = js.undefined
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-themeRiver.emphasis.label
    */
  var label: js.UndefOr[
    Anon_BackgroundColorBorderColorBorderRadiusBorderWidthColorDistanceFontFamilyFontSizeFontStyle
  ] = js.undefined
}

object Anon_ItemStyleLabelAnonBackgroundColorBorderColorBorderRadiusBorderWidthColorDistanceFontFamilyFontSizeFontStyle {
  @scala.inline
  def apply(
    itemStyle: Anon_BorderColor = null,
    label: Anon_BackgroundColorBorderColorBorderRadiusBorderWidthColorDistanceFontFamilyFontSizeFontStyle = null
  ): Anon_ItemStyleLabelAnonBackgroundColorBorderColorBorderRadiusBorderWidthColorDistanceFontFamilyFontSizeFontStyle = {
    val __obj = js.Dynamic.literal()
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle)
    if (label != null) __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[Anon_ItemStyleLabelAnonBackgroundColorBorderColorBorderRadiusBorderWidthColorDistanceFontFamilyFontSizeFontStyle]
  }
}

