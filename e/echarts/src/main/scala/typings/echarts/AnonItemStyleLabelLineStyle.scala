package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItemStyleLabelLineStyle extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-sankey.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[AnonBorderType] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-sankey.emphasis.label
    */
  var label: js.UndefOr[AnonBorderRadius] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-sankey.emphasis.lineStyle
    */
  var lineStyle: js.UndefOr[AnonCurvenessOpacity] = js.undefined
}

object AnonItemStyleLabelLineStyle {
  @scala.inline
  def apply(
    itemStyle: AnonBorderType = null,
    label: AnonBorderRadius = null,
    lineStyle: AnonCurvenessOpacity = null
  ): AnonItemStyleLabelLineStyle = {
    val __obj = js.Dynamic.literal()
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItemStyleLabelLineStyle]
  }
}

