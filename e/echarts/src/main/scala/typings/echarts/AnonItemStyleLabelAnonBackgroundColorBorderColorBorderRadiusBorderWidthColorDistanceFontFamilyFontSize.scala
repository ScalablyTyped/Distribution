package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItemStyleLabelAnonBackgroundColorBorderColorBorderRadiusBorderWidthColorDistanceFontFamilyFontSize extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-themeRiver.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[AnonBorderColorBorderType] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-themeRiver.emphasis.label
    */
  var label: js.UndefOr[
    AnonBackgroundColorBorderColorBorderRadiusBorderWidthColorDistanceFontFamilyFontSize
  ] = js.undefined
}

object AnonItemStyleLabelAnonBackgroundColorBorderColorBorderRadiusBorderWidthColorDistanceFontFamilyFontSize {
  @scala.inline
  def apply(
    itemStyle: AnonBorderColorBorderType = null,
    label: AnonBackgroundColorBorderColorBorderRadiusBorderWidthColorDistanceFontFamilyFontSize = null
  ): AnonItemStyleLabelAnonBackgroundColorBorderColorBorderRadiusBorderWidthColorDistanceFontFamilyFontSize = {
    val __obj = js.Dynamic.literal()
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItemStyleLabelAnonBackgroundColorBorderColorBorderRadiusBorderWidthColorDistanceFontFamilyFontSize]
  }
}

