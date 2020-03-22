package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItemStyleAnonBarBorderWidth extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-line.data.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[AnonBarBorderWidth] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-line.data.emphasis.label
    */
  var label: js.UndefOr[AnonDistance] = js.undefined
}

object AnonItemStyleAnonBarBorderWidth {
  @scala.inline
  def apply(itemStyle: AnonBarBorderWidth = null, label: AnonDistance = null): AnonItemStyleAnonBarBorderWidth = {
    val __obj = js.Dynamic.literal()
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItemStyleAnonBarBorderWidth]
  }
}

