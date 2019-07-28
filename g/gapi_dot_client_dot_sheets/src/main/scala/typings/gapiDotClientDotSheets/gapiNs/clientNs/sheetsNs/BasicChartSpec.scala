package typings.gapiDotClientDotSheets.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasicChartSpec extends js.Object {
  /** The axis on the chart. */
  var axis: js.UndefOr[js.Array[BasicChartAxis]] = js.undefined
  /** The type of the chart. */
  var chartType: js.UndefOr[String] = js.undefined
  /**
    * The behavior of tooltips and data highlighting when hovering on data and
    * chart area.
    */
  var compareMode: js.UndefOr[String] = js.undefined
  /**
    * The domain of data this is charting.
    * Only a single domain is supported.
    */
  var domains: js.UndefOr[js.Array[BasicChartDomain]] = js.undefined
  /**
    * The number of rows or columns in the data that are "headers".
    * If not set, Google Sheets will guess how many rows are headers based
    * on the data.
    *
    * (Note that BasicChartAxis.title may override the axis title
    * inferred from the header values.)
    */
  var headerCount: js.UndefOr[Double] = js.undefined
  /**
    * If some values in a series are missing, gaps may appear in the chart (e.g,
    * segments of lines in a line chart will be missing).  To eliminate these
    * gaps set this to true.
    * Applies to Line, Area, and Combo charts.
    */
  var interpolateNulls: js.UndefOr[Boolean] = js.undefined
  /** The position of the chart legend. */
  var legendPosition: js.UndefOr[String] = js.undefined
  /**
    * Gets whether all lines should be rendered smooth or straight by default.
    * Applies to Line charts.
    */
  var lineSmoothing: js.UndefOr[Boolean] = js.undefined
  /** The data this chart is visualizing. */
  var series: js.UndefOr[js.Array[BasicChartSeries]] = js.undefined
  /**
    * The stacked type for charts that support vertical stacking.
    * Applies to Area, Bar, Column, and Stepped Area charts.
    */
  var stackedType: js.UndefOr[String] = js.undefined
  /**
    * True to make the chart 3D.
    * Applies to Bar and Column charts.
    */
  var threeDimensional: js.UndefOr[Boolean] = js.undefined
}

object BasicChartSpec {
  @scala.inline
  def apply(
    axis: js.Array[BasicChartAxis] = null,
    chartType: String = null,
    compareMode: String = null,
    domains: js.Array[BasicChartDomain] = null,
    headerCount: Int | Double = null,
    interpolateNulls: js.UndefOr[Boolean] = js.undefined,
    legendPosition: String = null,
    lineSmoothing: js.UndefOr[Boolean] = js.undefined,
    series: js.Array[BasicChartSeries] = null,
    stackedType: String = null,
    threeDimensional: js.UndefOr[Boolean] = js.undefined
  ): BasicChartSpec = {
    val __obj = js.Dynamic.literal()
    if (axis != null) __obj.updateDynamic("axis")(axis)
    if (chartType != null) __obj.updateDynamic("chartType")(chartType)
    if (compareMode != null) __obj.updateDynamic("compareMode")(compareMode)
    if (domains != null) __obj.updateDynamic("domains")(domains)
    if (headerCount != null) __obj.updateDynamic("headerCount")(headerCount.asInstanceOf[js.Any])
    if (!js.isUndefined(interpolateNulls)) __obj.updateDynamic("interpolateNulls")(interpolateNulls)
    if (legendPosition != null) __obj.updateDynamic("legendPosition")(legendPosition)
    if (!js.isUndefined(lineSmoothing)) __obj.updateDynamic("lineSmoothing")(lineSmoothing)
    if (series != null) __obj.updateDynamic("series")(series)
    if (stackedType != null) __obj.updateDynamic("stackedType")(stackedType)
    if (!js.isUndefined(threeDimensional)) __obj.updateDynamic("threeDimensional")(threeDimensional)
    __obj.asInstanceOf[BasicChartSpec]
  }
}

