package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLabelAnonFontWeight extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-pie.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[AnonBorderType] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-pie.emphasis.label
    */
  var label: js.UndefOr[AnonFontWeight] = js.undefined
}

object AnonLabelAnonFontWeight {
  @scala.inline
  def apply(itemStyle: AnonBorderType = null, label: AnonFontWeight = null): AnonLabelAnonFontWeight = {
    val __obj = js.Dynamic.literal()
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLabelAnonFontWeight]
  }
}

