package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Charts extends js.Object {
  var ChartHiddenDimensionStrategy: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChartHiddenDimensionStrategy */ js.Any
  var ChartMergeStrategy: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChartMergeStrategy */ js.Any
  var ChartType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChartType */ js.Any
  var ColumnType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ColumnType */ js.Any
  var CurveStyle: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CurveStyle */ js.Any
  var MatchType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MatchType */ js.Any
  var Orientation: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Orientation */ js.Any
  var PickerValuesLayout: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PickerValuesLayout */ js.Any
  var PointStyle: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PointStyle */ js.Any
  var Position: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Position */ js.Any
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

