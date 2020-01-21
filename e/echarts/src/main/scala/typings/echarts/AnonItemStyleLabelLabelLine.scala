package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItemStyleLabelLabelLine extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-funnel.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[AnonBorderColorBorderType] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-funnel.emphasis.label
    */
  var label: js.UndefOr[
    AnonAlignBackgroundColorBorderColorBorderRadiusBorderWidthColorFontFamilyFontSize
  ] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-funnel.emphasis.labelLine
    */
  var labelLine: js.UndefOr[AnonEmphasisLength] = js.undefined
}

object AnonItemStyleLabelLabelLine {
  @scala.inline
  def apply(
    itemStyle: AnonBorderColorBorderType = null,
    label: AnonAlignBackgroundColorBorderColorBorderRadiusBorderWidthColorFontFamilyFontSize = null,
    labelLine: AnonEmphasisLength = null
  ): AnonItemStyleLabelLabelLine = {
    val __obj = js.Dynamic.literal()
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelLine != null) __obj.updateDynamic("labelLine")(labelLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItemStyleLabelLabelLine]
  }
}

