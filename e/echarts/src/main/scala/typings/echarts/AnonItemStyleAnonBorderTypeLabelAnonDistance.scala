package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItemStyleAnonBorderTypeLabelAnonDistance extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-sankey.data.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[AnonBorderType] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-sankey.data.emphasis.label
    */
  var label: js.UndefOr[AnonDistance] = js.undefined
}

object AnonItemStyleAnonBorderTypeLabelAnonDistance {
  @scala.inline
  def apply(itemStyle: AnonBorderType = null, label: AnonDistance = null): AnonItemStyleAnonBorderTypeLabelAnonDistance = {
    val __obj = js.Dynamic.literal()
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItemStyleAnonBorderTypeLabelAnonDistance]
  }
}

