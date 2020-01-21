package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItemStyleLabelAnonAlignBackgroundColorBorderColorBorderRadiusBorderWidth extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-tree.data.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[AnonBorderColorBorderType] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-tree.data.emphasis.label
    */
  var label: js.UndefOr[AnonAlignBackgroundColorBorderColorBorderRadiusBorderWidth] = js.undefined
}

object AnonItemStyleLabelAnonAlignBackgroundColorBorderColorBorderRadiusBorderWidth {
  @scala.inline
  def apply(
    itemStyle: AnonBorderColorBorderType = null,
    label: AnonAlignBackgroundColorBorderColorBorderRadiusBorderWidth = null
  ): AnonItemStyleLabelAnonAlignBackgroundColorBorderColorBorderRadiusBorderWidth = {
    val __obj = js.Dynamic.literal()
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItemStyleLabelAnonAlignBackgroundColorBorderColorBorderRadiusBorderWidth]
  }
}

