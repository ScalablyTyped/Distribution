package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLabelAnonBorderRadius extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-tree.leaves.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[AnonBorderType] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-tree.leaves.emphasis.label
    */
  var label: js.UndefOr[AnonBorderRadius] = js.undefined
}

object AnonLabelAnonBorderRadius {
  @scala.inline
  def apply(itemStyle: AnonBorderType = null, label: AnonBorderRadius = null): AnonLabelAnonBorderRadius = {
    val __obj = js.Dynamic.literal()
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLabelAnonBorderRadius]
  }
}

