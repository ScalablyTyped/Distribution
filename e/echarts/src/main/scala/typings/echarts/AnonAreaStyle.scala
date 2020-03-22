package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAreaStyle extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-radar.emphasis.areaStyle
    */
  var areaStyle: js.UndefOr[AnonOpacity] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-radar.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[AnonBorderType] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-radar.emphasis.label
    */
  var label: js.UndefOr[AnonBorderRadius] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-radar.emphasis.lineStyle
    */
  var lineStyle: js.UndefOr[AnonShadowBlur] = js.undefined
}

object AnonAreaStyle {
  @scala.inline
  def apply(
    areaStyle: AnonOpacity = null,
    itemStyle: AnonBorderType = null,
    label: AnonBorderRadius = null,
    lineStyle: AnonShadowBlur = null
  ): AnonAreaStyle = {
    val __obj = js.Dynamic.literal()
    if (areaStyle != null) __obj.updateDynamic("areaStyle")(areaStyle.asInstanceOf[js.Any])
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAreaStyle]
  }
}

