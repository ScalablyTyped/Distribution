package typings.googleVisualization.google.visualization

import typings.googleVisualization.googleVisualizationStrings.function
import typings.googleVisualization.googleVisualizationStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineChartSeriesOptions
  extends StObject
     with ChartSeriesOptionsBase {
  
  var annotations: js.UndefOr[ChartAnnotations] = js.undefined
  
  var curveType: js.UndefOr[none | function] = js.undefined
  
  var labelInLegend: js.UndefOr[String] = js.undefined
  
  var lineDashStyle: js.UndefOr[js.Array[Double]] = js.undefined
  
  var lineWidth: js.UndefOr[Double] = js.undefined
  
  var pointShape: js.UndefOr[ChartPointShape] = js.undefined
  
  var pointSize: js.UndefOr[Double] = js.undefined
  
  var pointsVisible: js.UndefOr[Boolean] = js.undefined
  
  var targetAxisIndex: js.UndefOr[Double] = js.undefined
  
  var visibleInLegend: js.UndefOr[Boolean] = js.undefined
}
object LineChartSeriesOptions {
  
  inline def apply(): LineChartSeriesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineChartSeriesOptions]
  }
  
  extension [Self <: LineChartSeriesOptions](x: Self) {
    
    inline def setAnnotations(value: ChartAnnotations): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    inline def setCurveType(value: none | function): Self = StObject.set(x, "curveType", value.asInstanceOf[js.Any])
    
    inline def setCurveTypeUndefined: Self = StObject.set(x, "curveType", js.undefined)
    
    inline def setLabelInLegend(value: String): Self = StObject.set(x, "labelInLegend", value.asInstanceOf[js.Any])
    
    inline def setLabelInLegendUndefined: Self = StObject.set(x, "labelInLegend", js.undefined)
    
    inline def setLineDashStyle(value: js.Array[Double]): Self = StObject.set(x, "lineDashStyle", value.asInstanceOf[js.Any])
    
    inline def setLineDashStyleUndefined: Self = StObject.set(x, "lineDashStyle", js.undefined)
    
    inline def setLineDashStyleVarargs(value: Double*): Self = StObject.set(x, "lineDashStyle", js.Array(value :_*))
    
    inline def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    inline def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
    
    inline def setPointShape(value: ChartPointShape): Self = StObject.set(x, "pointShape", value.asInstanceOf[js.Any])
    
    inline def setPointShapeUndefined: Self = StObject.set(x, "pointShape", js.undefined)
    
    inline def setPointSize(value: Double): Self = StObject.set(x, "pointSize", value.asInstanceOf[js.Any])
    
    inline def setPointSizeUndefined: Self = StObject.set(x, "pointSize", js.undefined)
    
    inline def setPointsVisible(value: Boolean): Self = StObject.set(x, "pointsVisible", value.asInstanceOf[js.Any])
    
    inline def setPointsVisibleUndefined: Self = StObject.set(x, "pointsVisible", js.undefined)
    
    inline def setTargetAxisIndex(value: Double): Self = StObject.set(x, "targetAxisIndex", value.asInstanceOf[js.Any])
    
    inline def setTargetAxisIndexUndefined: Self = StObject.set(x, "targetAxisIndex", js.undefined)
    
    inline def setVisibleInLegend(value: Boolean): Self = StObject.set(x, "visibleInLegend", value.asInstanceOf[js.Any])
    
    inline def setVisibleInLegendUndefined: Self = StObject.set(x, "visibleInLegend", js.undefined)
  }
}
