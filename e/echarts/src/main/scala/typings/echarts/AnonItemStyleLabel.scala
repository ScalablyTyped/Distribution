package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItemStyleLabel extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-effectScatter.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[AnonBorderColorBorderTypeBorderWidthColor] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-effectScatter.emphasis.label
    */
  var label: js.UndefOr[AnonAlignBackgroundColorBorderColor] = js.undefined
}

object AnonItemStyleLabel {
  @scala.inline
  def apply(
    itemStyle: AnonBorderColorBorderTypeBorderWidthColor = null,
    label: AnonAlignBackgroundColorBorderColor = null
  ): AnonItemStyleLabel = {
    val __obj = js.Dynamic.literal()
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItemStyleLabel]
  }
}

