package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLabelLineStyleAnonAlignBackgroundColorBorderColorBorderRadiusBorderWidthColorFontFamily extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-lines.emphasis.label
    */
  var label: js.UndefOr[AnonAlignBackgroundColorBorderColorBorderRadiusBorderWidthColorFontFamily] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-lines.emphasis.lineStyle
    */
  var lineStyle: js.UndefOr[AnonColorOpacityShadowBlur] = js.undefined
}

object AnonLabelLineStyleAnonAlignBackgroundColorBorderColorBorderRadiusBorderWidthColorFontFamily {
  @scala.inline
  def apply(
    label: AnonAlignBackgroundColorBorderColorBorderRadiusBorderWidthColorFontFamily = null,
    lineStyle: AnonColorOpacityShadowBlur = null
  ): AnonLabelLineStyleAnonAlignBackgroundColorBorderColorBorderRadiusBorderWidthColorFontFamily = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLabelLineStyleAnonAlignBackgroundColorBorderColorBorderRadiusBorderWidthColorFontFamily]
  }
}

