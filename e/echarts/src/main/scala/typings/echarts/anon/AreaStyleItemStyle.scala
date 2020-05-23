package typings.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AreaStyleItemStyle extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-radar.data.emphasis.areaStyle
    */
  var areaStyle: js.UndefOr[Opacity] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-radar.data.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[BarBorderWidth] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-radar.data.emphasis.label
    */
  var label: js.UndefOr[Distance] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-radar.data.emphasis.lineStyle
    */
  var lineStyle: js.UndefOr[ShadowBlur] = js.undefined
}

object AreaStyleItemStyle {
  @scala.inline
  def apply(
    areaStyle: Opacity = null,
    itemStyle: BarBorderWidth = null,
    label: Distance = null,
    lineStyle: ShadowBlur = null
  ): AreaStyleItemStyle = {
    val __obj = js.Dynamic.literal()
    if (areaStyle != null) __obj.updateDynamic("areaStyle")(areaStyle.asInstanceOf[js.Any])
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AreaStyleItemStyle]
  }
}

