package typings.echarts.echartsNs.EChartOptionNs.TooltipNs

import typings.echarts.echartsStrings.series
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Format extends js.Object {
  // Color of data
  var color: js.UndefOr[String] = js.undefined
  var componentType: js.UndefOr[series] = js.undefined
  // Original data as input
  var data: js.UndefOr[js.Any] = js.undefined
  // Data index in input data array
  var dataIndex: js.UndefOr[Double] = js.undefined
  // Data name, or category name
  var name: js.UndefOr[String] = js.undefined
  // the percentage of pie chart
  var percent: js.UndefOr[Double] = js.undefined
  // Series index in option.series
  var seriesIndex: js.UndefOr[Double] = js.undefined
  // Series name
  var seriesName: js.UndefOr[String] = js.undefined
  // Series type
  var seriesType: js.UndefOr[String] = js.undefined
  // Value of data
  var value: js.UndefOr[Double | js.Array[_]] = js.undefined
}

object Format {
  @scala.inline
  def apply(
    color: String = null,
    componentType: series = null,
    data: js.Any = null,
    dataIndex: Int | Double = null,
    name: String = null,
    percent: Int | Double = null,
    seriesIndex: Int | Double = null,
    seriesName: String = null,
    seriesType: String = null,
    value: Double | js.Array[_] = null
  ): Format = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (componentType != null) __obj.updateDynamic("componentType")(componentType)
    if (data != null) __obj.updateDynamic("data")(data)
    if (dataIndex != null) __obj.updateDynamic("dataIndex")(dataIndex.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (percent != null) __obj.updateDynamic("percent")(percent.asInstanceOf[js.Any])
    if (seriesIndex != null) __obj.updateDynamic("seriesIndex")(seriesIndex.asInstanceOf[js.Any])
    if (seriesName != null) __obj.updateDynamic("seriesName")(seriesName)
    if (seriesType != null) __obj.updateDynamic("seriesType")(seriesType)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Format]
  }
}

