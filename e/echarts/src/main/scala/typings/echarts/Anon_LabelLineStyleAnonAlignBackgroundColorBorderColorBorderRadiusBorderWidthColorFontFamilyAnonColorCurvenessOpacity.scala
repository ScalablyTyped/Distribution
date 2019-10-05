package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LabelLineStyleAnonAlignBackgroundColorBorderColorBorderRadiusBorderWidthColorFontFamilyAnonColorCurvenessOpacity extends js.Object {
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-lines.data.emphasis.label
    */
  var label: js.UndefOr[Anon_AlignBackgroundColorBorderColorBorderRadiusBorderWidthColorFontFamily] = js.undefined
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-lines.data.emphasis.lineStyle
    */
  var lineStyle: js.UndefOr[Anon_ColorCurvenessOpacity] = js.undefined
}

object Anon_LabelLineStyleAnonAlignBackgroundColorBorderColorBorderRadiusBorderWidthColorFontFamilyAnonColorCurvenessOpacity {
  @scala.inline
  def apply(
    label: Anon_AlignBackgroundColorBorderColorBorderRadiusBorderWidthColorFontFamily = null,
    lineStyle: Anon_ColorCurvenessOpacity = null
  ): Anon_LabelLineStyleAnonAlignBackgroundColorBorderColorBorderRadiusBorderWidthColorFontFamilyAnonColorCurvenessOpacity = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label)
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle)
    __obj.asInstanceOf[Anon_LabelLineStyleAnonAlignBackgroundColorBorderColorBorderRadiusBorderWidthColorFontFamilyAnonColorCurvenessOpacity]
  }
}

