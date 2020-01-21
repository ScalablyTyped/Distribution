package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLabelLineStyleAnonAlignBackgroundColorBorderColorBorderRadiusBorderWidthColorFontFamilyAnonColorCurvenessOpacity extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-lines.data.emphasis.label
    */
  var label: js.UndefOr[AnonAlignBackgroundColorBorderColorBorderRadiusBorderWidthColorFontFamily] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-lines.data.emphasis.lineStyle
    */
  var lineStyle: js.UndefOr[AnonColorCurvenessOpacity] = js.undefined
}

object AnonLabelLineStyleAnonAlignBackgroundColorBorderColorBorderRadiusBorderWidthColorFontFamilyAnonColorCurvenessOpacity {
  @scala.inline
  def apply(
    label: AnonAlignBackgroundColorBorderColorBorderRadiusBorderWidthColorFontFamily = null,
    lineStyle: AnonColorCurvenessOpacity = null
  ): AnonLabelLineStyleAnonAlignBackgroundColorBorderColorBorderRadiusBorderWidthColorFontFamilyAnonColorCurvenessOpacity = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLabelLineStyleAnonAlignBackgroundColorBorderColorBorderRadiusBorderWidthColorFontFamilyAnonColorCurvenessOpacity]
  }
}

