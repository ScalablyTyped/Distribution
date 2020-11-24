package typings.dygraphs.dygraphs

import typings.dygraphs.Dygraph
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LegendData extends js.Object {
  
  /**
    * Dygraph object for this graph
    */
  var dygraph: Dygraph = js.native
  
  /**
    * Series data for the highlighted points
    */
  var series: js.Array[SeriesLegendData] = js.native
  
  /**
    * x value of highlighted points
    */
  var x: Double = js.native
  
  /**
    * Generated HTML for x value
    */
  var xHTML: String = js.native
}
object LegendData {
  
  @scala.inline
  def apply(dygraph: Dygraph, series: js.Array[SeriesLegendData], x: Double, xHTML: String): LegendData = {
    val __obj = js.Dynamic.literal(dygraph = dygraph.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xHTML = xHTML.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendData]
  }
  
  @scala.inline
  implicit class LegendDataOps[Self <: LegendData] (val x: Self) extends AnyVal {
    
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
    def setDygraph(value: Dygraph): Self = this.set("dygraph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesVarargs(value: SeriesLegendData*): Self = this.set("series", js.Array(value :_*))
    
    @scala.inline
    def setSeries(value: js.Array[SeriesLegendData]): Self = this.set("series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXHTML(value: String): Self = this.set("xHTML", value.asInstanceOf[js.Any])
  }
}
