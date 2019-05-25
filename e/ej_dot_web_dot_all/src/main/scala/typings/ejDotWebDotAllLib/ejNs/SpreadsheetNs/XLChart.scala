package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XLChart extends js.Object {
  /** This method is used to change the data range of the chart in the Spreadsheet.
    * @param {string} Pass the chart id.
    * @param {string} X axis range of chart data.
    * @param {string} Y axis range of chart data.
    * @param {string} Legend range of chart data.
    * @returns {void}
    */
  def changeDataRange(
    chartId: java.lang.String,
    xRange: java.lang.String,
    yRange: java.lang.String,
    lRange: java.lang.String
  ): scala.Unit = js.native
  /** This method is used to change the theme of the chart in the Spreadsheet.
    * @param {string} Pass the chart id.
    * @param {ej.datavisualization.Chart.Theme} Pass the chart theme which want to update.
    * @returns {void}
    */
  def changeTheme(chartId: java.lang.String, theme: ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.Theme): scala.Unit = js.native
  /** This method is used to change the type of the chart in the Spreadsheet.
    * @param {string} Pass the chart id.
    * @param {Spreadsheet.ChartOptions} Pass Object ChartOptions.
    * @returns {void}
    */
  def changeType(chartId: java.lang.String, option: ChartOptions): scala.Unit = js.native
  /** This method is used to create a chart for specified range in Spreadsheet.
    * @param {string|any[]} Optional. If range is specified, it will create chart for the specified range else it will use the current selected range.
    * @param {Spreadsheet.ChartOptions} Optional.
    * @returns {void}
    */
  def createChart(range: java.lang.String, options: ChartOptions): scala.Unit = js.native
  def createChart(range: js.Array[_], options: ChartOptions): scala.Unit = js.native
  /** This method is used to refresh the chart in the Spreadsheet.
    * @param {string} To pass the chart Id.
    * @param {Spreadsheet.ChartOptions} NameTypeDescriptiontypestringPass the chart typeenable3DbooleanPass the enable3D conditionmarkerobjectPass the marker object
    * @returns {void}
    */
  def refreshChart(id: java.lang.String, options: ChartOptions): scala.Unit = js.native
  /** This method is used to resize the chart of specified id in the Spreadsheet.
    * @param {string} To pass the chart id.
    * @param {number} To pass height value.
    * @param {number} To pass the width value.
    * @returns {void}
    */
  def resizeChart(id: java.lang.String, height: scala.Double, width: scala.Double): scala.Unit = js.native
  /** This method is used switch row to columns and vice versa for chart in the Spreadsheet. So that the data is displayed in the chart the way you want.
    * @param {string} Pass the chart id.
    * @returns {void}
    */
  def switchRowColumn(chartId: java.lang.String): scala.Unit = js.native
  /** This method is used to update the chart element, such as axes, titles, data labels, grid lines and legends in the Spreadsheet.
    * @param {string} Pass the chart id.
    * @param {ej.Spreadsheet.ChartProperties} Pass chart element value which you want to update.
    * @returns {void}
    */
  def updateChartElement(chartId: java.lang.String, value: ChartProperties): scala.Unit = js.native
}

