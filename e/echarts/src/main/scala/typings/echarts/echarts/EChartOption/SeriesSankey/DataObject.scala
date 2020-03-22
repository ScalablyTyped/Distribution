package typings.echarts.echarts.EChartOption.SeriesSankey

import typings.echarts.AnonBorderType
import typings.echarts.AnonDistance
import typings.echarts.AnonExtraCssText
import typings.echarts.AnonItemStyleAnonBorderTypeLabelAnonDistance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataObject extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-sankey.data.emphasis
    */
  var emphasis: js.UndefOr[AnonItemStyleAnonBorderTypeLabelAnonDistance] = js.undefined
  /**
    * The style of this node.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-sankey.data.itemStyle
    */
  var itemStyle: js.UndefOr[AnonBorderType] = js.undefined
  /**
    * The lable style of this node.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-sankey.data.label
    */
  var label: js.UndefOr[AnonDistance] = js.undefined
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
  var tooltip: js.UndefOr[AnonExtraCssText] = js.undefined
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
    emphasis: AnonItemStyleAnonBorderTypeLabelAnonDistance = null,
    itemStyle: AnonBorderType = null,
    label: AnonDistance = null,
    name: String = null,
    tooltip: AnonExtraCssText = null,
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

