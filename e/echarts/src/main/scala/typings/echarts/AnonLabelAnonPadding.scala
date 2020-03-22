package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLabelAnonPadding extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-pie.data.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[AnonBorderType] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-pie.data.emphasis.label
    */
  var label: js.UndefOr[AnonPadding] = js.undefined
}

object AnonLabelAnonPadding {
  @scala.inline
  def apply(itemStyle: AnonBorderType = null, label: AnonPadding = null): AnonLabelAnonPadding = {
    val __obj = js.Dynamic.literal()
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLabelAnonPadding]
  }
}

