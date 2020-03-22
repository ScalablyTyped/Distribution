package typings.echarts.echarts.EChartOption.SeriesBar

import typings.echarts.AnonBarBorderRadius
import typings.echarts.AnonExtraCssText
import typings.echarts.AnonFontFamily
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataObject extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-bar.data.itemStyle
    */
  var itemStyle: js.UndefOr[AnonBarBorderRadius] = js.undefined
  /**
    * The style setting of the text label in a single bar.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-bar.data.label
    */
  var label: js.UndefOr[AnonFontFamily] = js.undefined
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
  var tooltip: js.UndefOr[AnonExtraCssText] = js.undefined
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
    itemStyle: AnonBarBorderRadius = null,
    label: AnonFontFamily = null,
    name: String = null,
    tooltip: AnonExtraCssText = null,
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

