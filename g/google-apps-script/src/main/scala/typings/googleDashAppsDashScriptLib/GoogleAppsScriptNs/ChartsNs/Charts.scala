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

object Charts {
  @scala.inline
  def apply(
    ChartHiddenDimensionStrategy: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChartHiddenDimensionStrategy */ js.Any,
    ChartMergeStrategy: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChartMergeStrategy */ js.Any,
    ChartType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChartType */ js.Any,
    ColumnType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ColumnType */ js.Any,
    CurveStyle: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CurveStyle */ js.Any,
    MatchType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MatchType */ js.Any,
    Orientation: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Orientation */ js.Any,
    PickerValuesLayout: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PickerValuesLayout */ js.Any,
    PointStyle: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PointStyle */ js.Any,
    Position: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Position */ js.Any,
    newAreaChart: js.Function0[AreaChartBuilder],
    newBarChart: js.Function0[BarChartBuilder],
    newCategoryFilter: js.Function0[CategoryFilterBuilder],
    newColumnChart: js.Function0[ColumnChartBuilder],
    newDashboardPanel: js.Function0[DashboardPanelBuilder],
    newDataTable: js.Function0[DataTableBuilder],
    newDataViewDefinition: js.Function0[DataViewDefinitionBuilder],
    newLineChart: js.Function0[LineChartBuilder],
    newNumberRangeFilter: js.Function0[NumberRangeFilterBuilder],
    newPieChart: js.Function0[PieChartBuilder],
    newScatterChart: js.Function0[ScatterChartBuilder],
    newStringFilter: js.Function0[StringFilterBuilder],
    newTableChart: js.Function0[TableChartBuilder],
    newTextStyle: js.Function0[TextStyleBuilder]
  ): Charts = {
    val __obj = js.Dynamic.literal(ChartHiddenDimensionStrategy = ChartHiddenDimensionStrategy, ChartMergeStrategy = ChartMergeStrategy, ChartType = ChartType, ColumnType = ColumnType, CurveStyle = CurveStyle, MatchType = MatchType, Orientation = Orientation, PickerValuesLayout = PickerValuesLayout, PointStyle = PointStyle, Position = Position, newAreaChart = newAreaChart, newBarChart = newBarChart, newCategoryFilter = newCategoryFilter, newColumnChart = newColumnChart, newDashboardPanel = newDashboardPanel, newDataTable = newDataTable, newDataViewDefinition = newDataViewDefinition, newLineChart = newLineChart, newNumberRangeFilter = newNumberRangeFilter, newPieChart = newPieChart, newScatterChart = newScatterChart, newStringFilter = newStringFilter, newTableChart = newTableChart, newTextStyle = newTextStyle)
  
    __obj.asInstanceOf[Charts]
  }
}

