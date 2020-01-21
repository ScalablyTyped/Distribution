package typings.echarts.echarts.EChartOption.SeriesBar

import typings.echarts.AnonAlignBackgroundColorBorderColorBorderRadiusBorderWidthColor
import typings.echarts.AnonBackgroundColorBorderColor
import typings.echarts.AnonBarBorderColorBarBorderRadius
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataObject extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-bar.data.itemStyle
    */
  var itemStyle: js.UndefOr[AnonBarBorderColorBarBorderRadius] = js.undefined
  /**
    * The style setting of the text label in a single bar.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-bar.data.label
    */
  var label: js.UndefOr[AnonAlignBackgroundColorBorderColorBorderRadiusBorderWidthColor] = js.undefined
  /**
    * The name of data item.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-bar.data.name
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * tooltip settings in this series data.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-bar.data.tooltip
    */
  var tooltip: js.UndefOr[AnonBackgroundColorBorderColor] = js.undefined
  /**
    * The value of a single data item.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-bar.data.value
    */
  var value: js.UndefOr[Double] = js.undefined
}

object DataObject {
  @scala.inline
  def apply(
    itemStyle: AnonBarBorderColorBarBorderRadius = null,
    label: AnonAlignBackgroundColorBorderColorBorderRadiusBorderWidthColor = null,
    name: String = null,
    tooltip: AnonBackgroundColorBorderColor = null,
    value: Int | Double = null
  ): DataObject = {
    val __obj = js.Dynamic.literal()
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataObject]
  }
}

