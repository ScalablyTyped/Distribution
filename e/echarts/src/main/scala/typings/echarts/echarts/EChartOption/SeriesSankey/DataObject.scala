package typings.echarts.echarts.EChartOption.SeriesSankey

import typings.echarts.anon.BorderType
import typings.echarts.anon.Distance
import typings.echarts.anon.ItemStyleBorderTypeLabelDistance
import typings.echarts.echarts.EChartOption.BaseTooltip
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataObject extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-sankey.data.emphasis
    */
  var emphasis: js.UndefOr[ItemStyleBorderTypeLabelDistance] = js.undefined
  /**
    * The style of this node.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-sankey.data.itemStyle
    */
  var itemStyle: js.UndefOr[BorderType] = js.undefined
  /**
    * The lable style of this node.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-sankey.data.label
    */
  var label: js.UndefOr[Distance] = js.undefined
  /**
    * The name of data item.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-sankey.data.name
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * tooltip settings in this series data.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-sankey.data.tooltip
    */
  var tooltip: js.UndefOr[BaseTooltip] = js.undefined
  /**
    * The value of data item.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-sankey.data.value
    */
  var value: js.UndefOr[js.Array[_] | Double] = js.undefined
}

object DataObject {
  @scala.inline
  def apply(
    emphasis: ItemStyleBorderTypeLabelDistance = null,
    itemStyle: BorderType = null,
    label: Distance = null,
    name: String = null,
    tooltip: BaseTooltip = null,
    value: js.Array[_] | Double = null
  ): DataObject = {
    val __obj = js.Dynamic.literal()
    if (emphasis != null) __obj.updateDynamic("emphasis")(emphasis.asInstanceOf[js.Any])
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataObject]
  }
}

