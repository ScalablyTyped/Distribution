package typings.googleVisualization.google.visualization

import typings.googleVisualization.googleVisualizationStrings.function
import typings.googleVisualization.googleVisualizationStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineChartSeriesOptions extends ChartSeriesOptionsBase {
  
  var annotations: js.UndefOr[ChartAnnotations] = js.native
  
  var curveType: js.UndefOr[none | function] = js.native
  
  var labelInLegend: js.UndefOr[String] = js.native
  
  var lineDashStyle: js.UndefOr[js.Array[Double]] = js.native
  
  var lineWidth: js.UndefOr[Double] = js.native
  
  var pointShape: js.UndefOr[ChartPointShape] = js.native
  
  var pointSize: js.UndefOr[Double] = js.native
  
  var pointsVisible: js.UndefOr[Boolean] = js.native
  
  var targetAxisIndex: js.UndefOr[Double] = js.native
  
  var visibleInLegend: js.UndefOr[Boolean] = js.native
}
object LineChartSeriesOptions {
  
  @scala.inline
  def apply(): LineChartSeriesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineChartSeriesOptions]
  }
  
  @scala.inline
  implicit class LineChartSeriesOptionsMutableBuilder[Self <: LineChartSeriesOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotations(value: ChartAnnotations): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    @scala.inline
    def setCurveType(value: none | function): Self = StObject.set(x, "curveType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurveTypeUndefined: Self = StObject.set(x, "curveType", js.undefined)
    
    @scala.inline
    def setLabelInLegend(value: String): Self = StObject.set(x, "labelInLegend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelInLegendUndefined: Self = StObject.set(x, "labelInLegend", js.undefined)
    
    @scala.inline
    def setLineDashStyle(value: js.Array[Double]): Self = StObject.set(x, "lineDashStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineDashStyleUndefined: Self = StObject.set(x, "lineDashStyle", js.undefined)
    
    @scala.inline
    def setLineDashStyleVarargs(value: Double*): Self = StObject.set(x, "lineDashStyle", js.Array(value :_*))
    
    @scala.inline
    def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
    
    @scala.inline
    def setPointShape(value: ChartPointShape): Self = StObject.set(x, "pointShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointShapeUndefined: Self = StObject.set(x, "pointShape", js.undefined)
    
    @scala.inline
    def setPointSize(value: Double): Self = StObject.set(x, "pointSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointSizeUndefined: Self = StObject.set(x, "pointSize", js.undefined)
    
    @scala.inline
    def setPointsVisible(value: Boolean): Self = StObject.set(x, "pointsVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsVisibleUndefined: Self = StObject.set(x, "pointsVisible", js.undefined)
    
    @scala.inline
    def setTargetAxisIndex(value: Double): Self = StObject.set(x, "targetAxisIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetAxisIndexUndefined: Self = StObject.set(x, "targetAxisIndex", js.undefined)
    
    @scala.inline
    def setVisibleInLegend(value: Boolean): Self = StObject.set(x, "visibleInLegend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleInLegendUndefined: Self = StObject.set(x, "visibleInLegend", js.undefined)
  }
}
