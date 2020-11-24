package typings.googleVisualization.google.visualization

import typings.googleVisualization.googleVisualizationStrings.exponential
import typings.googleVisualization.googleVisualizationStrings.linear
import typings.googleVisualization.googleVisualizationStrings.polynomial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartTrendlineOptions extends js.Object {
  
  var color: js.UndefOr[String] = js.native
  
  var degree: js.UndefOr[Double] = js.native
  
  var labelInLegend: js.UndefOr[String] = js.native
  
  var lineWidth: js.UndefOr[Double] = js.native
  
  var opacity: js.UndefOr[Double] = js.native
  
  var pointSize: js.UndefOr[Double] = js.native
  
  var pointsVisible: js.UndefOr[Boolean] = js.native
  
  var showR2: js.UndefOr[Boolean] = js.native
  
  var `type`: js.UndefOr[linear | exponential | polynomial] = js.native
  
  var visibleInLegend: js.UndefOr[Boolean] = js.native
}
object ChartTrendlineOptions {
  
  @scala.inline
  def apply(): ChartTrendlineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartTrendlineOptions]
  }
  
  @scala.inline
  implicit class ChartTrendlineOptionsOps[Self <: ChartTrendlineOptions] (val x: Self) extends AnyVal {
    
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setDegree(value: Double): Self = this.set("degree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDegree: Self = this.set("degree", js.undefined)
    
    @scala.inline
    def setLabelInLegend(value: String): Self = this.set("labelInLegend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelInLegend: Self = this.set("labelInLegend", js.undefined)
    
    @scala.inline
    def setLineWidth(value: Double): Self = this.set("lineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineWidth: Self = this.set("lineWidth", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setPointSize(value: Double): Self = this.set("pointSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointSize: Self = this.set("pointSize", js.undefined)
    
    @scala.inline
    def setPointsVisible(value: Boolean): Self = this.set("pointsVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointsVisible: Self = this.set("pointsVisible", js.undefined)
    
    @scala.inline
    def setShowR2(value: Boolean): Self = this.set("showR2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowR2: Self = this.set("showR2", js.undefined)
    
    @scala.inline
    def setType(value: linear | exponential | polynomial): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setVisibleInLegend(value: Boolean): Self = this.set("visibleInLegend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibleInLegend: Self = this.set("visibleInLegend", js.undefined)
  }
}
