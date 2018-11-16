package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Charts extends js.Object {
  var ChartHiddenDimensionStrategy: js.Any
  var ChartMergeStrategy: js.Any
  var ChartType: js.Any
  var ColumnType: js.Any
  var CurveStyle: js.Any
  var MatchType: js.Any
  var Orientation: js.Any
  var PickerValuesLayout: js.Any
  var PointStyle: js.Any
  var Position: js.Any
  def newAreaChart(): AreaChartBuilder
  def newBarChart(): BarChartBuilder
  def newCategoryFilter(): CategoryFilterBuilder
  def newColumnChart(): ColumnChartBuilder
  def newDashboardPanel(): DashboardPanelBuilder
  def newDataTable(): DataTableBuilder
  def newDataViewDefinition(): DataViewDefinitionBuilder
  def newLineChart(): LineChartBuilder
  def newNumberRangeFilter(): NumberRangeFilterBuilder
  def newPieChart(): PieChartBuilder
  def newScatterChart(): ScatterChartBuilder
  def newStringFilter(): StringFilterBuilder
  def newTableChart(): TableChartBuilder
  def newTextStyle(): TextStyleBuilder
}

