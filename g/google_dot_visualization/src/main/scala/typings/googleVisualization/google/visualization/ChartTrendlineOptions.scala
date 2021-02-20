package typings.googleVisualization.google.visualization

import typings.googleVisualization.googleVisualizationStrings.exponential
import typings.googleVisualization.googleVisualizationStrings.linear
import typings.googleVisualization.googleVisualizationStrings.polynomial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartTrendlineOptions extends StObject {
  
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
  implicit class ChartTrendlineOptionsMutableBuilder[Self <: ChartTrendlineOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setDegree(value: Double): Self = StObject.set(x, "degree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDegreeUndefined: Self = StObject.set(x, "degree", js.undefined)
    
    @scala.inline
    def setLabelInLegend(value: String): Self = StObject.set(x, "labelInLegend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelInLegendUndefined: Self = StObject.set(x, "labelInLegend", js.undefined)
    
    @scala.inline
    def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setPointSize(value: Double): Self = StObject.set(x, "pointSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointSizeUndefined: Self = StObject.set(x, "pointSize", js.undefined)
    
    @scala.inline
    def setPointsVisible(value: Boolean): Self = StObject.set(x, "pointsVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsVisibleUndefined: Self = StObject.set(x, "pointsVisible", js.undefined)
    
    @scala.inline
    def setShowR2(value: Boolean): Self = StObject.set(x, "showR2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowR2Undefined: Self = StObject.set(x, "showR2", js.undefined)
    
    @scala.inline
    def setType(value: linear | exponential | polynomial): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setVisibleInLegend(value: Boolean): Self = StObject.set(x, "visibleInLegend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleInLegendUndefined: Self = StObject.set(x, "visibleInLegend", js.undefined)
  }
}
