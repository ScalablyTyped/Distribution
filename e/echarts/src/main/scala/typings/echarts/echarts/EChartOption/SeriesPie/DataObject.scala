package typings.echarts.echarts.EChartOption.SeriesPie

import typings.echarts.anon.BorderType
import typings.echarts.anon.ExtraCssText
import typings.echarts.anon.LabelPadding
import typings.echarts.anon.LineHeight
import typings.echarts.anon.Smooth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataObject extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-pie.data.emphasis
    */
  var emphasis: js.UndefOr[LabelPadding] = js.undefined
  /**
    * Graphic style of , `emphasis` is the style when it is highlighted,
    * like being hovered by mouse, or highlighted via legend connect.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.data.itemStyle
    */
  var itemStyle: js.UndefOr[BorderType] = js.undefined
  /**
    * The label configuration of a single sector.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.data.label
    */
  var label: js.UndefOr[LineHeight] = js.undefined
  /**
    * The style of visual guide line.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.data.labelLine
    */
  var labelLine: js.UndefOr[Smooth] = js.undefined
  /**
    * The name of data item.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.data.name
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Whether the data item is selected.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.data.selected
    */
  var selected: js.UndefOr[Boolean] = js.undefined
  /**
    * tooltip settings in this series data.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.data.tooltip
    */
  var tooltip: js.UndefOr[ExtraCssText] = js.undefined
  /**
    * Data value.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.data.value
    */
  var value: js.UndefOr[Double] = js.undefined
}

object DataObject {
  @scala.inline
  def apply(
    emphasis: LabelPadding = null,
    itemStyle: BorderType = null,
    label: LineHeight = null,
    labelLine: Smooth = null,
    name: String = null,
    selected: js.UndefOr[Boolean] = js.undefined,
    tooltip: ExtraCssText = null,
    value: js.UndefOr[Double] = js.undefined
  ): DataObject = {
    val __obj = js.Dynamic.literal()
    if (emphasis != null) __obj.updateDynamic("emphasis")(emphasis.asInstanceOf[js.Any])
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelLine != null) __obj.updateDynamic("labelLine")(labelLine.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.get.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataObject]
  }
}

