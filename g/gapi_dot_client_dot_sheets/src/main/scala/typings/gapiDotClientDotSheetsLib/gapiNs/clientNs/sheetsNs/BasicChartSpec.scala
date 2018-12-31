package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasicChartSpec extends js.Object {
  /** The axis on the chart. */
  var axis: js.UndefOr[js.Array[BasicChartAxis]] = js.undefined
  /** The type of the chart. */
  var chartType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The behavior of tooltips and data highlighting when hovering on data and
    * chart area.
    */
  var compareMode: js.UndefOr[java.lang.String] = js.undefined
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
  var headerCount: js.UndefOr[scala.Double] = js.undefined
  /**
    * If some values in a series are missing, gaps may appear in the chart (e.g,
    * segments of lines in a line chart will be missing).  To eliminate these
    * gaps set this to true.
    * Applies to Line, Area, and Combo charts.
    */
  var interpolateNulls: js.UndefOr[scala.Boolean] = js.undefined
  /** The position of the chart legend. */
  var legendPosition: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Gets whether all lines should be rendered smooth or straight by default.
    * Applies to Line charts.
    */
  var lineSmoothing: js.UndefOr[scala.Boolean] = js.undefined
  /** The data this chart is visualizing. */
  var series: js.UndefOr[js.Array[BasicChartSeries]] = js.undefined
  /**
    * The stacked type for charts that support vertical stacking.
    * Applies to Area, Bar, Column, and Stepped Area charts.
    */
  var stackedType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * True to make the chart 3D.
    * Applies to Bar and Column charts.
    */
  var threeDimensional: js.UndefOr[scala.Boolean] = js.undefined
}

