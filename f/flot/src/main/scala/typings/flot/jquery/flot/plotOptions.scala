package typings.flot.jquery.flot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait plotOptions extends StObject {
  
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
  implicit class plotOptionsMutableBuilder[Self <: plotOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColors(value: js.Array[_]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    @scala.inline
    def setColorsVarargs(value: js.Any*): Self = StObject.set(x, "colors", js.Array(value :_*))
    
    @scala.inline
    def setGrid(value: gridOptions): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
    
    @scala.inline
    def setHooks(value: hooks): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHooksUndefined: Self = StObject.set(x, "hooks", js.undefined)
    
    @scala.inline
    def setInteraction(value: interaction): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInteractionUndefined: Self = StObject.set(x, "interaction", js.undefined)
    
    @scala.inline
    def setLegend(value: legendOptions): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
    
    @scala.inline
    def setSeries(value: seriesOptions): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    @scala.inline
    def setXaxes(value: js.Array[axisOptions]): Self = StObject.set(x, "xaxes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXaxesUndefined: Self = StObject.set(x, "xaxes", js.undefined)
    
    @scala.inline
    def setXaxesVarargs(value: axisOptions*): Self = StObject.set(x, "xaxes", js.Array(value :_*))
    
    @scala.inline
    def setXaxis(value: axisOptions): Self = StObject.set(x, "xaxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXaxisUndefined: Self = StObject.set(x, "xaxis", js.undefined)
    
    @scala.inline
    def setYaxes(value: js.Array[axisOptions]): Self = StObject.set(x, "yaxes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYaxesUndefined: Self = StObject.set(x, "yaxes", js.undefined)
    
    @scala.inline
    def setYaxesVarargs(value: axisOptions*): Self = StObject.set(x, "yaxes", js.Array(value :_*))
    
    @scala.inline
    def setYaxis(value: axisOptions): Self = StObject.set(x, "yaxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYaxisUndefined: Self = StObject.set(x, "yaxis", js.undefined)
  }
}
