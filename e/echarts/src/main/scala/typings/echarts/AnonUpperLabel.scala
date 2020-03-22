package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonUpperLabel extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-treemap.data.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[AnonColorString] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-treemap.data.emphasis.label
    */
  var label: js.UndefOr[AnonEllipsis] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-treemap.data.emphasis.upperLabel
    */
  var upperLabel: js.UndefOr[AnonEllipsis] = js.undefined
}

object AnonUpperLabel {
  @scala.inline
  def apply(itemStyle: AnonColorString = null, label: AnonEllipsis = null, upperLabel: AnonEllipsis = null): AnonUpperLabel = {
    val __obj = js.Dynamic.literal()
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (upperLabel != null) __obj.updateDynamic("upperLabel")(upperLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonUpperLabel]
  }
}

