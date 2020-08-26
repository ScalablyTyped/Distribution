package typings.googleAppsScript.GoogleAppsScript.Charts

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
@js.native
trait Charts extends js.Object {
  var ChartHiddenDimensionStrategy: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChartHiddenDimensionStrategy */ js.Any = js.native
  var ChartMergeStrategy: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChartMergeStrategy */ js.Any = js.native
  var ChartType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChartType */ js.Any = js.native
  var ColumnType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ColumnType */ js.Any = js.native
  var CurveStyle: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CurveStyle */ js.Any = js.native
  var PointStyle: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PointStyle */ js.Any = js.native
  var Position: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Position */ js.Any = js.native
  def newAreaChart(): AreaChartBuilder = js.native
  def newBarChart(): BarChartBuilder = js.native
  def newColumnChart(): ColumnChartBuilder = js.native
  def newDataTable(): DataTableBuilder = js.native
  def newDataViewDefinition(): DataViewDefinitionBuilder = js.native
  def newLineChart(): LineChartBuilder = js.native
  def newPieChart(): PieChartBuilder = js.native
  def newScatterChart(): ScatterChartBuilder = js.native
  def newTableChart(): TableChartBuilder = js.native
  def newTextStyle(): TextStyleBuilder = js.native
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
  @scala.inline
  implicit class ChartsOps[Self <: typings.googleAppsScript.GoogleAppsScript.Charts.Charts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChartHiddenDimensionStrategy(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChartHiddenDimensionStrategy */ js.Any
    ): Self = this.set("ChartHiddenDimensionStrategy", value.asInstanceOf[js.Any])
    @scala.inline
    def setChartMergeStrategy(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChartMergeStrategy */ js.Any
    ): Self = this.set("ChartMergeStrategy", value.asInstanceOf[js.Any])
    @scala.inline
    def setChartType(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChartType */ js.Any): Self = this.set("ChartType", value.asInstanceOf[js.Any])
    @scala.inline
    def setColumnType(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ColumnType */ js.Any): Self = this.set("ColumnType", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurveStyle(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CurveStyle */ js.Any): Self = this.set("CurveStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setPointStyle(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PointStyle */ js.Any): Self = this.set("PointStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Position */ js.Any): Self = this.set("Position", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewAreaChart(value: () => AreaChartBuilder): Self = this.set("newAreaChart", js.Any.fromFunction0(value))
    @scala.inline
    def setNewBarChart(value: () => BarChartBuilder): Self = this.set("newBarChart", js.Any.fromFunction0(value))
    @scala.inline
    def setNewColumnChart(value: () => ColumnChartBuilder): Self = this.set("newColumnChart", js.Any.fromFunction0(value))
    @scala.inline
    def setNewDataTable(value: () => DataTableBuilder): Self = this.set("newDataTable", js.Any.fromFunction0(value))
    @scala.inline
    def setNewDataViewDefinition(value: () => DataViewDefinitionBuilder): Self = this.set("newDataViewDefinition", js.Any.fromFunction0(value))
    @scala.inline
    def setNewLineChart(value: () => LineChartBuilder): Self = this.set("newLineChart", js.Any.fromFunction0(value))
    @scala.inline
    def setNewPieChart(value: () => PieChartBuilder): Self = this.set("newPieChart", js.Any.fromFunction0(value))
    @scala.inline
    def setNewScatterChart(value: () => ScatterChartBuilder): Self = this.set("newScatterChart", js.Any.fromFunction0(value))
    @scala.inline
    def setNewTableChart(value: () => TableChartBuilder): Self = this.set("newTableChart", js.Any.fromFunction0(value))
    @scala.inline
    def setNewTextStyle(value: () => TextStyleBuilder): Self = this.set("newTextStyle", js.Any.fromFunction0(value))
  }
  
}

