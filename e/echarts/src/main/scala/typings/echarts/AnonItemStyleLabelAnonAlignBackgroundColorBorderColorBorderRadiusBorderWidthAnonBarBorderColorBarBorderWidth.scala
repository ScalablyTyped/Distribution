package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItemStyleLabelAnonAlignBackgroundColorBorderColorBorderRadiusBorderWidthAnonBarBorderColorBarBorderWidth extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-line.data.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[AnonBarBorderColorBarBorderWidth] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-line.data.emphasis.label
    */
  var label: js.UndefOr[AnonAlignBackgroundColorBorderColorBorderRadiusBorderWidth] = js.undefined
}

object AnonItemStyleLabelAnonAlignBackgroundColorBorderColorBorderRadiusBorderWidthAnonBarBorderColorBarBorderWidth {
  @scala.inline
  def apply(
    itemStyle: AnonBarBorderColorBarBorderWidth = null,
    label: AnonAlignBackgroundColorBorderColorBorderRadiusBorderWidth = null
  ): AnonItemStyleLabelAnonAlignBackgroundColorBorderColorBorderRadiusBorderWidthAnonBarBorderColorBarBorderWidth = {
    val __obj = js.Dynamic.literal()
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItemStyleLabelAnonAlignBackgroundColorBorderColorBorderRadiusBorderWidthAnonBarBorderColorBarBorderWidth]
  }
}

