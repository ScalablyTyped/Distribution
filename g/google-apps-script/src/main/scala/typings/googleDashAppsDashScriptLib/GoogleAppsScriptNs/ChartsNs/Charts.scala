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
    newAreaChart: () => AreaChartBuilder,
    newBarChart: () => BarChartBuilder,
    newCategoryFilter: () => CategoryFilterBuilder,
    newColumnChart: () => ColumnChartBuilder,
    newDashboardPanel: () => DashboardPanelBuilder,
    newDataTable: () => DataTableBuilder,
    newDataViewDefinition: () => DataViewDefinitionBuilder,
    newLineChart: () => LineChartBuilder,
    newNumberRangeFilter: () => NumberRangeFilterBuilder,
    newPieChart: () => PieChartBuilder,
    newScatterChart: () => ScatterChartBuilder,
    newStringFilter: () => StringFilterBuilder,
    newTableChart: () => TableChartBuilder,
    newTextStyle: () => TextStyleBuilder
  ): Charts = {
    val __obj = js.Dynamic.literal(ChartHiddenDimensionStrategy = ChartHiddenDimensionStrategy, ChartMergeStrategy = ChartMergeStrategy, ChartType = ChartType, ColumnType = ColumnType, CurveStyle = CurveStyle, MatchType = MatchType, Orientation = Orientation, PickerValuesLayout = PickerValuesLayout, PointStyle = PointStyle, Position = Position, newAreaChart = js.Any.fromFunction0(newAreaChart), newBarChart = js.Any.fromFunction0(newBarChart), newCategoryFilter = js.Any.fromFunction0(newCategoryFilter), newColumnChart = js.Any.fromFunction0(newColumnChart), newDashboardPanel = js.Any.fromFunction0(newDashboardPanel), newDataTable = js.Any.fromFunction0(newDataTable), newDataViewDefinition = js.Any.fromFunction0(newDataViewDefinition), newLineChart = js.Any.fromFunction0(newLineChart), newNumberRangeFilter = js.Any.fromFunction0(newNumberRangeFilter), newPieChart = js.Any.fromFunction0(newPieChart), newScatterChart = js.Any.fromFunction0(newScatterChart), newStringFilter = js.Any.fromFunction0(newStringFilter), newTableChart = js.Any.fromFunction0(newTableChart), newTextStyle = js.Any.fromFunction0(newTextStyle))
  
    __obj.asInstanceOf[Charts]
  }
}

