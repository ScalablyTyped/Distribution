package typings.googleAppsScript.GoogleAppsScript.Charts

import typings.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Builder for line charts. For more details, see the Google Charts documentation.
  *
  * Here is an example that shows how to build a line chart. The data is imported from a Google spreadsheet.
  *
  *       // Get sample data from a spreadsheet.
  *       var dataSourceUrl = 'https://docs.google.com/spreadsheet/tq?range=A1%3AG5' +
  *           '&key=0Aq4s9w_HxMs7dHpfX05JdmVSb1FpT21sbXd4NVE3UEE&gid=2&headers=-1';
  *
  *       var chartBuilder = Charts.newLineChart()
  *           .setTitle('Yearly Rainfall')
  *           .setXAxisTitle('Month')
  *           .setYAxisTitle('Rainfall (in)')
  *           .setDimensions(600, 500)
  *           .setCurveStyle(Charts.CurveStyle.SMOOTH)
  *           .setPointStyle(Charts.PointStyle.MEDIUM)
  *           .setDataSourceUrl(dataSourceUrl);
  *
  *       var chart = chartBuilder.build();
  */
@js.native
trait LineChartBuilder extends StObject {
  
  def build(): Chart = js.native
  
  def reverseCategories(): LineChartBuilder = js.native
  
  def setBackgroundColor(cssValue: String): LineChartBuilder = js.native
  
  def setColors(cssValues: js.Array[String]): LineChartBuilder = js.native
  
  def setCurveStyle(style: CurveStyle): LineChartBuilder = js.native
  
  def setDataSourceUrl(url: String): LineChartBuilder = js.native
  
  def setDataTable(tableBuilder: DataTableBuilder): LineChartBuilder = js.native
  def setDataTable(table: DataTableSource): LineChartBuilder = js.native
  
  def setDataViewDefinition(dataViewDefinition: DataViewDefinition): LineChartBuilder = js.native
  
  def setDimensions(width: Integer, height: Integer): LineChartBuilder = js.native
  
  def setLegendPosition(position: Position): LineChartBuilder = js.native
  
  def setLegendTextStyle(textStyle: TextStyle): LineChartBuilder = js.native
  
  def setOption(option: String, value: js.Any): LineChartBuilder = js.native
  
  def setPointStyle(style: PointStyle): LineChartBuilder = js.native
  
  def setRange(start: Double, end: Double): LineChartBuilder = js.native
  
  def setTitle(chartTitle: String): LineChartBuilder = js.native
  
  def setTitleTextStyle(textStyle: TextStyle): LineChartBuilder = js.native
  
  def setXAxisTextStyle(textStyle: TextStyle): LineChartBuilder = js.native
  
  def setXAxisTitle(title: String): LineChartBuilder = js.native
  
  def setXAxisTitleTextStyle(textStyle: TextStyle): LineChartBuilder = js.native
  
  def setYAxisTextStyle(textStyle: TextStyle): LineChartBuilder = js.native
  
  def setYAxisTitle(title: String): LineChartBuilder = js.native
  
  def setYAxisTitleTextStyle(textStyle: TextStyle): LineChartBuilder = js.native
  
  def useLogScale(): LineChartBuilder = js.native
}
