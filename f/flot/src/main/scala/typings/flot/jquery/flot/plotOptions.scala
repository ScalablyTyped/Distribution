package typings.flot.jquery.flot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait plotOptions extends js.Object {
  
  var colors: js.UndefOr[js.Array[_]] = js.native
  
  var grid: js.UndefOr[gridOptions] = js.native
  
  var hooks: js.UndefOr[typings.flot.jquery.flot.hooks] = js.native
  
  var interaction: js.UndefOr[typings.flot.jquery.flot.interaction] = js.native
  
  var legend: js.UndefOr[legendOptions] = js.native
  
  var series: js.UndefOr[seriesOptions] = js.native
  
  var xaxes: js.UndefOr[js.Array[axisOptions]] = js.native
  
  var xaxis: js.UndefOr[axisOptions] = js.native
  
  var yaxes: js.UndefOr[js.Array[axisOptions]] = js.native
  
  var yaxis: js.UndefOr[axisOptions] = js.native
}
object plotOptions {
  
  @scala.inline
  def apply(): plotOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[plotOptions]
  }
  
  @scala.inline
  implicit class plotOptionsOps[Self <: plotOptions] (val x: Self) extends AnyVal {
    
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
    def setColorsVarargs(value: js.Any*): Self = this.set("colors", js.Array(value :_*))
    
    @scala.inline
    def setColors(value: js.Array[_]): Self = this.set("colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    
    @scala.inline
    def setGrid(value: gridOptions): Self = this.set("grid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrid: Self = this.set("grid", js.undefined)
    
    @scala.inline
    def setHooks(value: hooks): Self = this.set("hooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHooks: Self = this.set("hooks", js.undefined)
    
    @scala.inline
    def setInteraction(value: interaction): Self = this.set("interaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInteraction: Self = this.set("interaction", js.undefined)
    
    @scala.inline
    def setLegend(value: legendOptions): Self = this.set("legend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegend: Self = this.set("legend", js.undefined)
    
    @scala.inline
    def setSeries(value: seriesOptions): Self = this.set("series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeries: Self = this.set("series", js.undefined)
    
    @scala.inline
    def setXaxesVarargs(value: axisOptions*): Self = this.set("xaxes", js.Array(value :_*))
    
    @scala.inline
    def setXaxes(value: js.Array[axisOptions]): Self = this.set("xaxes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXaxes: Self = this.set("xaxes", js.undefined)
    
    @scala.inline
    def setXaxis(value: axisOptions): Self = this.set("xaxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXaxis: Self = this.set("xaxis", js.undefined)
    
    @scala.inline
    def setYaxesVarargs(value: axisOptions*): Self = this.set("yaxes", js.Array(value :_*))
    
    @scala.inline
    def setYaxes(value: js.Array[axisOptions]): Self = this.set("yaxes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYaxes: Self = this.set("yaxes", js.undefined)
    
    @scala.inline
    def setYaxis(value: axisOptions): Self = this.set("yaxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYaxis: Self = this.set("yaxis", js.undefined)
  }
}
