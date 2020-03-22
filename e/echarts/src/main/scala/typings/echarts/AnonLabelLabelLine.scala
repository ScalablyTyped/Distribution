package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLabelLabelLine extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-funnel.data.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[AnonBorderType] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-funnel.data.emphasis.label
    */
  var label: js.UndefOr[AnonPadding] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-funnel.data.emphasis.labelLine
    */
  var labelLine: js.UndefOr[AnonLength] = js.undefined
}

object AnonLabelLabelLine {
  @scala.inline
  def apply(itemStyle: AnonBorderType = null, label: AnonPadding = null, labelLine: AnonLength = null): AnonLabelLabelLine = {
    val __obj = js.Dynamic.literal()
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelLine != null) __obj.updateDynamic("labelLine")(labelLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLabelLabelLine]
  }
}

