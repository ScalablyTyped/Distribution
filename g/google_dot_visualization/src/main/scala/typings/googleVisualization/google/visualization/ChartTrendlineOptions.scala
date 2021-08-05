package typings.googleVisualization.google.visualization

import typings.googleVisualization.googleVisualizationStrings.exponential
import typings.googleVisualization.googleVisualizationStrings.linear
import typings.googleVisualization.googleVisualizationStrings.polynomial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartTrendlineOptions extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
  
  var degree: js.UndefOr[Double] = js.undefined
  
  var labelInLegend: js.UndefOr[String] = js.undefined
  
  var lineWidth: js.UndefOr[Double] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var pointSize: js.UndefOr[Double] = js.undefined
  
  var pointsVisible: js.UndefOr[Boolean] = js.undefined
  
  var showR2: js.UndefOr[Boolean] = js.undefined
  
  var `type`: js.UndefOr[linear | exponential | polynomial] = js.undefined
  
  var visibleInLegend: js.UndefOr[Boolean] = js.undefined
}
object ChartTrendlineOptions {
  
  inline def apply(): ChartTrendlineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartTrendlineOptions]
  }
  
  extension [Self <: ChartTrendlineOptions](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDegree(value: Double): Self = StObject.set(x, "degree", value.asInstanceOf[js.Any])
    
    inline def setDegreeUndefined: Self = StObject.set(x, "degree", js.undefined)
    
    inline def setLabelInLegend(value: String): Self = StObject.set(x, "labelInLegend", value.asInstanceOf[js.Any])
    
    inline def setLabelInLegendUndefined: Self = StObject.set(x, "labelInLegend", js.undefined)
    
    inline def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    inline def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setPointSize(value: Double): Self = StObject.set(x, "pointSize", value.asInstanceOf[js.Any])
    
    inline def setPointSizeUndefined: Self = StObject.set(x, "pointSize", js.undefined)
    
    inline def setPointsVisible(value: Boolean): Self = StObject.set(x, "pointsVisible", value.asInstanceOf[js.Any])
    
    inline def setPointsVisibleUndefined: Self = StObject.set(x, "pointsVisible", js.undefined)
    
    inline def setShowR2(value: Boolean): Self = StObject.set(x, "showR2", value.asInstanceOf[js.Any])
    
    inline def setShowR2Undefined: Self = StObject.set(x, "showR2", js.undefined)
    
    inline def setType(value: linear | exponential | polynomial): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVisibleInLegend(value: Boolean): Self = StObject.set(x, "visibleInLegend", value.asInstanceOf[js.Any])
    
    inline def setVisibleInLegendUndefined: Self = StObject.set(x, "visibleInLegend", js.undefined)
  }
}
