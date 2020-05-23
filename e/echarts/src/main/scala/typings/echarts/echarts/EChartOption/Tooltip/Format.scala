package typings.echarts.echarts.EChartOption.Tooltip

import typings.echarts.echartsStrings.series
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Format extends js.Object {
  // Value of axis
  var axisValue: js.UndefOr[Double | String] = js.undefined
  // Label of axis value
  var axisValueLabel: js.UndefOr[String] = js.undefined
  // Color of data
  var color: js.UndefOr[String] = js.undefined
  var componentType: js.UndefOr[series] = js.undefined
  // Original data as input
  var data: js.UndefOr[js.Any] = js.undefined
  // Data index in input data array
  var dataIndex: js.UndefOr[Double] = js.undefined
  // data dimension index, for example 0 or 1 or 2 ...
  // Only work in `radar` series.
  var dimensionIndex: js.UndefOr[Double] = js.undefined
  // dimension names list
  var dimensionNames: js.UndefOr[js.Array[String]] = js.undefined
  // encoding info of coordinate system
  // Key: coord, like ('x' 'y' 'radius' 'angle')
  // value: Must be an array, not null/undefined. Contain dimension indices, like:
  // {
  //     x: [2] // values on dimension index 2 are mapped to x axis.
  //     y: [0] // values on dimension index 0 are mapped to y axis.
  // }
  var encode: js.UndefOr[js.Object] = js.undefined
  // item marker, string of HTMLElement
  var marker: js.UndefOr[String] = js.undefined
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
    axisValue: Double | String = null,
    axisValueLabel: String = null,
    color: String = null,
    componentType: series = null,
    data: js.Any = null,
    dataIndex: js.UndefOr[Double] = js.undefined,
    dimensionIndex: js.UndefOr[Double] = js.undefined,
    dimensionNames: js.Array[String] = null,
    encode: js.Object = null,
    marker: String = null,
    name: String = null,
    percent: js.UndefOr[Double] = js.undefined,
    seriesIndex: js.UndefOr[Double] = js.undefined,
    seriesName: String = null,
    seriesType: String = null,
    value: Double | js.Array[_] = null
  ): Format = {
    val __obj = js.Dynamic.literal()
    if (axisValue != null) __obj.updateDynamic("axisValue")(axisValue.asInstanceOf[js.Any])
    if (axisValueLabel != null) __obj.updateDynamic("axisValueLabel")(axisValueLabel.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (componentType != null) __obj.updateDynamic("componentType")(componentType.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(dataIndex)) __obj.updateDynamic("dataIndex")(dataIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dimensionIndex)) __obj.updateDynamic("dimensionIndex")(dimensionIndex.get.asInstanceOf[js.Any])
    if (dimensionNames != null) __obj.updateDynamic("dimensionNames")(dimensionNames.asInstanceOf[js.Any])
    if (encode != null) __obj.updateDynamic("encode")(encode.asInstanceOf[js.Any])
    if (marker != null) __obj.updateDynamic("marker")(marker.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(percent)) __obj.updateDynamic("percent")(percent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(seriesIndex)) __obj.updateDynamic("seriesIndex")(seriesIndex.get.asInstanceOf[js.Any])
    if (seriesName != null) __obj.updateDynamic("seriesName")(seriesName.asInstanceOf[js.Any])
    if (seriesType != null) __obj.updateDynamic("seriesType")(seriesType.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Format]
  }
}

