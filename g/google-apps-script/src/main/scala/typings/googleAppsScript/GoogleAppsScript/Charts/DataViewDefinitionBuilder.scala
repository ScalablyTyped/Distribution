package typings.googleAppsScript.GoogleAppsScript.Charts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Builder for DataViewDefinition objects.
  *
  * Here's an example of using the builder. The data is imported
  * from a Google spreadsheet.
  *
  *     function doGet() {
  *       // This example creates two table charts side by side. One uses a data view definition to
  *       // restrict the number of displayed columns.
  *
  *       // Get sample data from a spreadsheet.
  *       var dataSourceUrl = 'https://docs.google.com/spreadsheet/tq?range=A1%3AF' +
  *           '&key=0Aq4s9w_HxMs7dHpfX05JdmVSb1FpT21sbXd4NVE3UEE&gid=4&headers=-1';
  *
  *       // Create a chart to display all of the data.
  *       var originalChart = Charts.newTableChart()
  *           .setDimensions(600, 500)
  *           .setDataSourceUrl(dataSourceUrl)
  *           .build();
  *
  *       // Create another chart to display a subset of the data (only columns 1 and 4).
  *       var dataViewDefinition = Charts.newDataViewDefinition().setColumns([0, 3]);
  *       var limitedChart = Charts.newTableChart()
  *           .setDimensions(200, 500)
  *           .setDataSourceUrl(dataSourceUrl)
  *           .setDataViewDefinition(dataViewDefinition)
  *           .build();
  *
  *       var htmlOutput = HtmlService.createHtmlOutput();
  *       var originalChartData = Utilities.base64Encode(originalChart.getAs('image/png').getBytes());
  *       var originalChartUrl = "data:image/png;base64," + encodeURI(originalChartData);
  *       var limitedChartData = Utilities.base64Encode(limitedChart.getAs('image/png').getBytes());
  *       var limitedChartUrl = "data:image/png;base64," + encodeURI(limitedChartData);
  *       htmlOutput.append("<table><tr><td>");
  *       htmlOutput.append("<img border=\"1\" src=\"" + originalChartUrl + "\">");
  *       htmlOutput.append("</td><td>");
  *       htmlOutput.append("<img border=\"1\" src=\"" + limitedChartUrl + "\">");
  *       htmlOutput.append("</td></tr></table>");
  *       return htmlOutput;
  *     }
  */
trait DataViewDefinitionBuilder extends StObject {
  
  def build(): DataViewDefinition
  
  def setColumns(columns: js.Array[Any]): DataViewDefinitionBuilder
}
object DataViewDefinitionBuilder {
  
  inline def apply(build: () => DataViewDefinition, setColumns: js.Array[Any] => DataViewDefinitionBuilder): DataViewDefinitionBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), setColumns = js.Any.fromFunction1(setColumns))
    __obj.asInstanceOf[DataViewDefinitionBuilder]
  }
  
  extension [Self <: DataViewDefinitionBuilder](x: Self) {
    
    inline def setBuild(value: () => DataViewDefinition): Self = StObject.set(x, "build", js.Any.fromFunction0(value))
    
    inline def setSetColumns(value: js.Array[Any] => DataViewDefinitionBuilder): Self = StObject.set(x, "setColumns", js.Any.fromFunction1(value))
  }
}
