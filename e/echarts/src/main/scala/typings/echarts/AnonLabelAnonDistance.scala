package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLabelAnonDistance extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-tree.data.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[AnonBorderType] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-tree.data.emphasis.label
    */
  var label: js.UndefOr[AnonDistance] = js.undefined
}

object AnonLabelAnonDistance {
  @scala.inline
  def apply(itemStyle: AnonBorderType = null, label: AnonDistance = null): AnonLabelAnonDistance = {
    val __obj = js.Dynamic.literal()
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLabelAnonDistance]
  }
}

