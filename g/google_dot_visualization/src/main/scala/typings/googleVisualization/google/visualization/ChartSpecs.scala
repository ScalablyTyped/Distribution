package typings.googleVisualization.google.visualization

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartSpecs extends js.Object {
  
  var chartType: String = js.native
  
  var container: js.UndefOr[HTMLElement] = js.native
  
  var containerId: js.UndefOr[String] = js.native
  
  var dataSourceUrl: js.UndefOr[String] = js.native
  
  var dataTable: js.UndefOr[js.Object] = js.native
  
  var options: js.UndefOr[js.Object] = js.native
  
  var query: js.UndefOr[String] = js.native
  
  var refreshInterval: js.UndefOr[Double] = js.native
  
  var view: js.UndefOr[js.Any] = js.native
}
object ChartSpecs {
  
  @scala.inline
  def apply(chartType: String): ChartSpecs = {
    val __obj = js.Dynamic.literal(chartType = chartType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartSpecs]
  }
  
  @scala.inline
  implicit class ChartSpecsOps[Self <: ChartSpecs] (val x: Self) extends AnyVal {
    
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
    def setChartType(value: String): Self = this.set("chartType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainer(value: HTMLElement): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setContainerId(value: String): Self = this.set("containerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerId: Self = this.set("containerId", js.undefined)
    
    @scala.inline
    def setDataSourceUrl(value: String): Self = this.set("dataSourceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSourceUrl: Self = this.set("dataSourceUrl", js.undefined)
    
    @scala.inline
    def setDataTable(value: js.Object): Self = this.set("dataTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataTable: Self = this.set("dataTable", js.undefined)
    
    @scala.inline
    def setOptions(value: js.Object): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    
    @scala.inline
    def setRefreshInterval(value: Double): Self = this.set("refreshInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefreshInterval: Self = this.set("refreshInterval", js.undefined)
    
    @scala.inline
    def setView(value: js.Any): Self = this.set("view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
  }
}
