package typings.googleVisualization.google.visualization

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartSpecs extends StObject {
  
  var chartType: String
  
  var container: js.UndefOr[HTMLElement] = js.undefined
  
  var containerId: js.UndefOr[String] = js.undefined
  
  var dataSourceUrl: js.UndefOr[String] = js.undefined
  
  var dataTable: js.UndefOr[js.Object] = js.undefined
  
  var options: js.UndefOr[js.Object] = js.undefined
  
  var query: js.UndefOr[String] = js.undefined
  
  var refreshInterval: js.UndefOr[Double] = js.undefined
  
  var view: js.UndefOr[js.Any] = js.undefined
}
object ChartSpecs {
  
  @scala.inline
  def apply(chartType: String): ChartSpecs = {
    val __obj = js.Dynamic.literal(chartType = chartType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartSpecs]
  }
  
  @scala.inline
  implicit class ChartSpecsMutableBuilder[Self <: ChartSpecs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChartType(value: String): Self = StObject.set(x, "chartType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    @scala.inline
    def setDataSourceUrl(value: String): Self = StObject.set(x, "dataSourceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceUrlUndefined: Self = StObject.set(x, "dataSourceUrl", js.undefined)
    
    @scala.inline
    def setDataTable(value: js.Object): Self = StObject.set(x, "dataTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTableUndefined: Self = StObject.set(x, "dataTable", js.undefined)
    
    @scala.inline
    def setOptions(value: js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    @scala.inline
    def setRefreshInterval(value: Double): Self = StObject.set(x, "refreshInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshIntervalUndefined: Self = StObject.set(x, "refreshInterval", js.undefined)
    
    @scala.inline
    def setView(value: js.Any): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
