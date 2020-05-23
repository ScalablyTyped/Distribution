package typings.echarts.echarts.EChartOption.SeriesHeatmap

import typings.echarts.anon.BorderType
import typings.echarts.anon.Distance
import typings.echarts.anon.ItemStyleBorderTypeLabelDistance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataObject extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-heatmap.data.emphasis
    */
  var emphasis: js.UndefOr[ItemStyleBorderTypeLabelDistance] = js.undefined
  /**
    * Style of a single data point. It is valid with
    * [coordinateSystem](https://echarts.apache.org/en/option.html#series-heatmap.coordinateSystem)
    * of 'cartesian2d' value.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-heatmap.data.itemStyle
    */
  var itemStyle: js.UndefOr[BorderType] = js.undefined
  /**
    * It is valid with
    * [coordinateSystem](https://echarts.apache.org/en/option.html#series-heatmap.coordinateSystem)
    * of 'cartesian2d' value.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-heatmap.data.label
    */
  var label: js.UndefOr[Distance] = js.undefined
  /**
    * Name of data item.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-heatmap.data.name
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Value of data item.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-heatmap.data.value
    */
  var value: js.UndefOr[js.Array[_]] = js.undefined
}

object DataObject {
  @scala.inline
  def apply(
    emphasis: ItemStyleBorderTypeLabelDistance = null,
    itemStyle: BorderType = null,
    label: Distance = null,
    name: String = null,
    value: js.Array[_] = null
  ): DataObject = {
    val __obj = js.Dynamic.literal()
    if (emphasis != null) __obj.updateDynamic("emphasis")(emphasis.asInstanceOf[js.Any])
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataObject]
  }
}

