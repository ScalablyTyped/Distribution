package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAreaStyleItemStyle extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-radar.data.emphasis.areaStyle
    */
  var areaStyle: js.UndefOr[AnonOpacity] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-radar.data.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[AnonBarBorderWidth] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-radar.data.emphasis.label
    */
  var label: js.UndefOr[AnonDistance] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-radar.data.emphasis.lineStyle
    */
  var lineStyle: js.UndefOr[AnonShadowBlur] = js.undefined
}

object AnonAreaStyleItemStyle {
  @scala.inline
  def apply(
    areaStyle: AnonOpacity = null,
    itemStyle: AnonBarBorderWidth = null,
    label: AnonDistance = null,
    lineStyle: AnonShadowBlur = null
  ): AnonAreaStyleItemStyle = {
    val __obj = js.Dynamic.literal()
    if (areaStyle != null) __obj.updateDynamic("areaStyle")(areaStyle.asInstanceOf[js.Any])
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAreaStyleItemStyle]
  }
}

