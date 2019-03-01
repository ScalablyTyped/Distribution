package typings
package echartsLib.echartsNs.EChartOptionNs.TooltipNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Format extends js.Object {
  // Color of data
  var color: js.UndefOr[java.lang.String] = js.undefined
  var componentType: js.UndefOr[echartsLib.echartsLibStrings.series] = js.undefined
  // Original data as input
  var data: js.UndefOr[js.Any] = js.undefined
  // Data index in input data array
  var dataIndex: js.UndefOr[scala.Double] = js.undefined
  // Data name, or category name
  var name: js.UndefOr[java.lang.String] = js.undefined
  // the percentage of pie chart
  var percent: js.UndefOr[scala.Double] = js.undefined
  // Series index in option.series
  var seriesIndex: js.UndefOr[scala.Double] = js.undefined
  // Series name
  var seriesName: js.UndefOr[java.lang.String] = js.undefined
  // Series type
  var seriesType: js.UndefOr[java.lang.String] = js.undefined
  // Value of data
  var value: js.UndefOr[scala.Double | js.Array[_]] = js.undefined
}

object Format {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    componentType: echartsLib.echartsLibStrings.series = null,
    data: js.Any = null,
    dataIndex: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    percent: scala.Int | scala.Double = null,
    seriesIndex: scala.Int | scala.Double = null,
    seriesName: java.lang.String = null,
    seriesType: java.lang.String = null,
    value: scala.Double | js.Array[_] = null
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

