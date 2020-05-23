package typings.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelLine extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-funnel.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[BorderType] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-funnel.emphasis.label
    */
  var label: js.UndefOr[FontWeight] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-funnel.emphasis.labelLine
    */
  var labelLine: js.UndefOr[Length] = js.undefined
}

object LabelLine {
  @scala.inline
  def apply(itemStyle: BorderType = null, label: FontWeight = null, labelLine: Length = null): LabelLine = {
    val __obj = js.Dynamic.literal()
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelLine != null) __obj.updateDynamic("labelLine")(labelLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelLine]
  }
}

