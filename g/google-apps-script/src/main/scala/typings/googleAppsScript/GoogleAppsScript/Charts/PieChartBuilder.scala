package typings.googleAppsScript.GoogleAppsScript.Charts

import typings.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A builder for pie charts. For more details, see the Google Charts documentation.
  *
  * Here is an example that shows how to build a pie chart. The data is imported from a Google spreadsheet.
  *
  *       // Get sample data from a spreadsheet.
  *       var dataSourceUrl = 'https://docs.google.com/spreadsheet/tq?range=A1%3AB8' +
  *           '&key=0Aq4s9w_HxMs7dHpfX05JdmVSb1FpT21sbXd4NVE3UEE&gid=3&headers=-1';
  *
  *       var chartBuilder = Charts.newPieChart()
  *           .setTitle('World Population by Continent')
  *           .setDimensions(600, 500)
  *           .set3D()
  *           .setDataSourceUrl(dataSourceUrl);
  *
  *       var chart = chartBuilder.build();
  */
@js.native
trait PieChartBuilder extends StObject {
  
  def build(): Chart = js.native
  
  def reverseCategories(): PieChartBuilder = js.native
  
  def set3D(): PieChartBuilder = js.native
  
  def setBackgroundColor(cssValue: String): PieChartBuilder = js.native
  
  def setColors(cssValues: js.Array[String]): PieChartBuilder = js.native
  
  def setDataSourceUrl(url: String): PieChartBuilder = js.native
  
  def setDataTable(tableBuilder: DataTableBuilder): PieChartBuilder = js.native
  def setDataTable(table: DataTableSource): PieChartBuilder = js.native
  
  def setDataViewDefinition(dataViewDefinition: DataViewDefinition): PieChartBuilder = js.native
  
  def setDimensions(width: Integer, height: Integer): PieChartBuilder = js.native
  
  def setLegendPosition(position: Position): PieChartBuilder = js.native
  
  def setLegendTextStyle(textStyle: TextStyle): PieChartBuilder = js.native
  
  def setOption(option: String, value: js.Any): PieChartBuilder = js.native
  
  def setTitle(chartTitle: String): PieChartBuilder = js.native
  
  def setTitleTextStyle(textStyle: TextStyle): PieChartBuilder = js.native
}
