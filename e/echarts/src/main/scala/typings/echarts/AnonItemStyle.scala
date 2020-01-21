package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItemStyle extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-bar.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[AnonBarBorderColorBarBorderWidth] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-bar.emphasis.label
    */
  var label: js.UndefOr[AnonAlignBackgroundColorBorderColor] = js.undefined
}

object AnonItemStyle {
  @scala.inline
  def apply(
    itemStyle: AnonBarBorderColorBarBorderWidth = null,
    label: AnonAlignBackgroundColorBorderColor = null
  ): AnonItemStyle = {
    val __obj = js.Dynamic.literal()
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItemStyle]
  }
}

