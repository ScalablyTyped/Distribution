package typings.googleVisualization.google.visualization

import typings.googleVisualization.googleVisualizationStrings.function
import typings.googleVisualization.googleVisualizationStrings.none
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
  implicit class LineChartSeriesOptionsOps[Self <: LineChartSeriesOptions] (val x: Self) extends AnyVal {
    
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
    def setAnnotations(value: ChartAnnotations): Self = this.set("annotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotations: Self = this.set("annotations", js.undefined)
    
    @scala.inline
    def setCurveType(value: none | function): Self = this.set("curveType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurveType: Self = this.set("curveType", js.undefined)
    
    @scala.inline
    def setLabelInLegend(value: String): Self = this.set("labelInLegend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelInLegend: Self = this.set("labelInLegend", js.undefined)
    
    @scala.inline
    def setLineDashStyleVarargs(value: Double*): Self = this.set("lineDashStyle", js.Array(value :_*))
    
    @scala.inline
    def setLineDashStyle(value: js.Array[Double]): Self = this.set("lineDashStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineDashStyle: Self = this.set("lineDashStyle", js.undefined)
    
    @scala.inline
    def setLineWidth(value: Double): Self = this.set("lineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineWidth: Self = this.set("lineWidth", js.undefined)
    
    @scala.inline
    def setPointShape(value: ChartPointShape): Self = this.set("pointShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointShape: Self = this.set("pointShape", js.undefined)
    
    @scala.inline
    def setPointSize(value: Double): Self = this.set("pointSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointSize: Self = this.set("pointSize", js.undefined)
    
    @scala.inline
    def setPointsVisible(value: Boolean): Self = this.set("pointsVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointsVisible: Self = this.set("pointsVisible", js.undefined)
    
    @scala.inline
    def setTargetAxisIndex(value: Double): Self = this.set("targetAxisIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetAxisIndex: Self = this.set("targetAxisIndex", js.undefined)
    
    @scala.inline
    def setVisibleInLegend(value: Boolean): Self = this.set("visibleInLegend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibleInLegend: Self = this.set("visibleInLegend", js.undefined)
  }
}
