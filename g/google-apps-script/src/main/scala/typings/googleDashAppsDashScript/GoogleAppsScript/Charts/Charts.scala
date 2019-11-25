package typings.googleDashAppsDashScript.GoogleAppsScript.Charts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Entry point for creating Charts in scripts.
  *
  * This example creates a basic data table, populates an area chart with the data, and adds it
  * into a web page as an image:
  *
  *     function doGet() {
  *       var data = Charts.newDataTable()
  *           .addColumn(Charts.ColumnType.STRING, "Month")
  *           .addColumn(Charts.ColumnType.NUMBER, "In Store")
  *           .addColumn(Charts.ColumnType.NUMBER, "Online")
  *           .addRow(["January", 10, 1])
  *           .addRow(["February", 12, 1])
  *           .addRow(["March", 20, 2])
  *           .addRow(["April", 25, 3])
  *           .addRow(["May", 30, 4])
  *           .build();
  *
  *       var chart = Charts.newAreaChart()
  *           .setDataTable(data)
  *           .setStacked()
  *           .setRange(0, 40)
  *           .setTitle("Sales per Month")
  *           .build();
  *
  *        var htmlOutput = HtmlService.createHtmlOutput().setTitle('My Chart');
  *        var imageData = Utilities.base64Encode(chart.getAs('image/png').getBytes());
  *        var imageUrl = "data:image/png;base64," + encodeURI(imageData);
  *        htmlOutput.append("Render chart server side: <br/>");
  *        htmlOutput.append("<img border=\"1\" src=\"" + imageUrl + "\">");
  *        return htmlOutput;
  *     }
  */
trait Charts extends js.Object {
  var ChartHiddenDimensionStrategy: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChartHiddenDimensionStrategy */ js.Any
  var ChartMergeStrategy: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChartMergeStrategy */ js.Any
  var ChartType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChartType */ js.Any
  var ColumnType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ColumnType */ js.Any
  var CurveStyle: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CurveStyle */ js.Any
  var PointStyle: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PointStyle */ js.Any
  var Position: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Position */ js.Any
  def newAreaChart(): AreaChartBuilder
  def newBarChart(): BarChartBuilder
  def newColumnChart(): ColumnChartBuilder
  def newDataTable(): DataTableBuilder
  def newDataViewDefinition(): DataViewDefinitionBuilder
  def newLineChart(): LineChartBuilder
  def newPieChart(): PieChartBuilder
  def newScatterChart(): ScatterChartBuilder
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
    PointStyle: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PointStyle */ js.Any,
    Position: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Position */ js.Any,
    newAreaChart: () => AreaChartBuilder,
    newBarChart: () => BarChartBuilder,
    newColumnChart: () => ColumnChartBuilder,
    newDataTable: () => DataTableBuilder,
    newDataViewDefinition: () => DataViewDefinitionBuilder,
    newLineChart: () => LineChartBuilder,
    newPieChart: () => PieChartBuilder,
    newScatterChart: () => ScatterChartBuilder,
    newTableChart: () => TableChartBuilder,
    newTextStyle: () => TextStyleBuilder
  ): Charts = {
    val __obj = js.Dynamic.literal(ChartHiddenDimensionStrategy = ChartHiddenDimensionStrategy.asInstanceOf[js.Any], ChartMergeStrategy = ChartMergeStrategy.asInstanceOf[js.Any], ChartType = ChartType.asInstanceOf[js.Any], ColumnType = ColumnType.asInstanceOf[js.Any], CurveStyle = CurveStyle.asInstanceOf[js.Any], PointStyle = PointStyle.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], newAreaChart = js.Any.fromFunction0(newAreaChart), newBarChart = js.Any.fromFunction0(newBarChart), newColumnChart = js.Any.fromFunction0(newColumnChart), newDataTable = js.Any.fromFunction0(newDataTable), newDataViewDefinition = js.Any.fromFunction0(newDataViewDefinition), newLineChart = js.Any.fromFunction0(newLineChart), newPieChart = js.Any.fromFunction0(newPieChart), newScatterChart = js.Any.fromFunction0(newScatterChart), newTableChart = js.Any.fromFunction0(newTableChart), newTextStyle = js.Any.fromFunction0(newTextStyle))
  
    __obj.asInstanceOf[Charts]
  }
}

