package typings.googleAppsScript.GoogleAppsScript.Charts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait Charts extends StObject {
  
  var ChartHiddenDimensionStrategy: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChartHiddenDimensionStrategy */ Any
  
  var ChartMergeStrategy: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChartMergeStrategy */ Any
  
  var ChartType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChartType */ Any
  
  var ColumnType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ColumnType */ Any
  
  var CurveStyle: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CurveStyle */ Any
  
  var PointStyle: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PointStyle */ Any
  
  var Position: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Position */ Any
  
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
  
  inline def apply(
    ChartHiddenDimensionStrategy: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChartHiddenDimensionStrategy */ Any,
    ChartMergeStrategy: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChartMergeStrategy */ Any,
    ChartType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChartType */ Any,
    ColumnType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ColumnType */ Any,
    CurveStyle: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CurveStyle */ Any,
    PointStyle: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PointStyle */ Any,
    Position: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Position */ Any,
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
  ): typings.googleAppsScript.GoogleAppsScript.Charts.Charts = {
    val __obj = js.Dynamic.literal(ChartHiddenDimensionStrategy = ChartHiddenDimensionStrategy.asInstanceOf[js.Any], ChartMergeStrategy = ChartMergeStrategy.asInstanceOf[js.Any], ChartType = ChartType.asInstanceOf[js.Any], ColumnType = ColumnType.asInstanceOf[js.Any], CurveStyle = CurveStyle.asInstanceOf[js.Any], PointStyle = PointStyle.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], newAreaChart = js.Any.fromFunction0(newAreaChart), newBarChart = js.Any.fromFunction0(newBarChart), newColumnChart = js.Any.fromFunction0(newColumnChart), newDataTable = js.Any.fromFunction0(newDataTable), newDataViewDefinition = js.Any.fromFunction0(newDataViewDefinition), newLineChart = js.Any.fromFunction0(newLineChart), newPieChart = js.Any.fromFunction0(newPieChart), newScatterChart = js.Any.fromFunction0(newScatterChart), newTableChart = js.Any.fromFunction0(newTableChart), newTextStyle = js.Any.fromFunction0(newTextStyle))
    __obj.asInstanceOf[typings.googleAppsScript.GoogleAppsScript.Charts.Charts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: typings.googleAppsScript.GoogleAppsScript.Charts.Charts] (val x: Self) extends AnyVal {
    
    inline def setChartHiddenDimensionStrategy(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChartHiddenDimensionStrategy */ Any
    ): Self = StObject.set(x, "ChartHiddenDimensionStrategy", value.asInstanceOf[js.Any])
    
    inline def setChartMergeStrategy(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChartMergeStrategy */ Any
    ): Self = StObject.set(x, "ChartMergeStrategy", value.asInstanceOf[js.Any])
    
    inline def setChartType(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChartType */ Any): Self = StObject.set(x, "ChartType", value.asInstanceOf[js.Any])
    
    inline def setColumnType(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ColumnType */ Any): Self = StObject.set(x, "ColumnType", value.asInstanceOf[js.Any])
    
    inline def setCurveStyle(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CurveStyle */ Any): Self = StObject.set(x, "CurveStyle", value.asInstanceOf[js.Any])
    
    inline def setNewAreaChart(value: () => AreaChartBuilder): Self = StObject.set(x, "newAreaChart", js.Any.fromFunction0(value))
    
    inline def setNewBarChart(value: () => BarChartBuilder): Self = StObject.set(x, "newBarChart", js.Any.fromFunction0(value))
    
    inline def setNewColumnChart(value: () => ColumnChartBuilder): Self = StObject.set(x, "newColumnChart", js.Any.fromFunction0(value))
    
    inline def setNewDataTable(value: () => DataTableBuilder): Self = StObject.set(x, "newDataTable", js.Any.fromFunction0(value))
    
    inline def setNewDataViewDefinition(value: () => DataViewDefinitionBuilder): Self = StObject.set(x, "newDataViewDefinition", js.Any.fromFunction0(value))
    
    inline def setNewLineChart(value: () => LineChartBuilder): Self = StObject.set(x, "newLineChart", js.Any.fromFunction0(value))
    
    inline def setNewPieChart(value: () => PieChartBuilder): Self = StObject.set(x, "newPieChart", js.Any.fromFunction0(value))
    
    inline def setNewScatterChart(value: () => ScatterChartBuilder): Self = StObject.set(x, "newScatterChart", js.Any.fromFunction0(value))
    
    inline def setNewTableChart(value: () => TableChartBuilder): Self = StObject.set(x, "newTableChart", js.Any.fromFunction0(value))
    
    inline def setNewTextStyle(value: () => TextStyleBuilder): Self = StObject.set(x, "newTextStyle", js.Any.fromFunction0(value))
    
    inline def setPointStyle(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PointStyle */ Any): Self = StObject.set(x, "PointStyle", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Position */ Any): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
  }
}
