package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LabelLineStyleAnonAlignBackgroundColorBorderColorBorderRadiusBorderWidthColorFontFamily extends js.Object {
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-lines.emphasis.label
    */
  var label: js.UndefOr[Anon_AlignBackgroundColorBorderColorBorderRadiusBorderWidthColorFontFamily] = js.undefined
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-lines.emphasis.lineStyle
    */
  var lineStyle: js.UndefOr[Anon_ColorOpacityShadowBlur] = js.undefined
}

object Anon_LabelLineStyleAnonAlignBackgroundColorBorderColorBorderRadiusBorderWidthColorFontFamily {
  @scala.inline
  def apply(
    label: Anon_AlignBackgroundColorBorderColorBorderRadiusBorderWidthColorFontFamily = null,
    lineStyle: Anon_ColorOpacityShadowBlur = null
  ): Anon_LabelLineStyleAnonAlignBackgroundColorBorderColorBorderRadiusBorderWidthColorFontFamily = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_LabelLineStyleAnonAlignBackgroundColorBorderColorBorderRadiusBorderWidthColorFontFamily]
  }
}

