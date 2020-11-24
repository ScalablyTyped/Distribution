package typings.googleVisualization.google.visualization

import typings.googleVisualization.googleVisualizationStrings.newRow
import typings.googleVisualization.googleVisualizationStrings.sameRow
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnnotationChartOptions extends js.Object {
  
  var allValuesSuffix: js.UndefOr[String] = js.native
  
  var allowHtml: js.UndefOr[Boolean] = js.native
  
  var annotationsWidth: js.UndefOr[Double] = js.native
  
  var colors: js.UndefOr[js.Array[String]] = js.native
  
  var dateFormat: js.UndefOr[String] = js.native
  
  var displayAnnotations: js.UndefOr[Boolean] = js.native
  
  var displayAnnotationsFilter: js.UndefOr[Boolean] = js.native
  
  var displayDateBarSeparator: js.UndefOr[Boolean] = js.native
  
  var displayExactValues: js.UndefOr[Boolean] = js.native
  
  var displayLegendDots: js.UndefOr[Boolean] = js.native
  
  var displayLegendValues: js.UndefOr[Boolean] = js.native
  
  var displayRangeSelector: js.UndefOr[Boolean] = js.native
  
  var displayZoomButtons: js.UndefOr[Boolean] = js.native
  
  var fill: js.UndefOr[Double] = js.native
  
  var legendPosition: js.UndefOr[sameRow | newRow] = js.native
  
  var max: js.UndefOr[Double] = js.native
  
  var min: js.UndefOr[Double] = js.native
  
  var numberFormats: js.UndefOr[js.Any] = js.native
  
  var scaleColumns: js.UndefOr[js.Array[Double]] = js.native
  
  var scaleFormat: js.UndefOr[String] = js.native
  
  var scaleType: js.UndefOr[String] = js.native
  
  var thickness: js.UndefOr[Double] = js.native
  
  var zoomEndTime: js.UndefOr[Date] = js.native
  
  var zoomStartTime: js.UndefOr[Date] = js.native
}
object AnnotationChartOptions {
  
  @scala.inline
  def apply(): AnnotationChartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationChartOptions]
  }
  
  @scala.inline
  implicit class AnnotationChartOptionsOps[Self <: AnnotationChartOptions] (val x: Self) extends AnyVal {
    
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
    def setAllValuesSuffix(value: String): Self = this.set("allValuesSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllValuesSuffix: Self = this.set("allValuesSuffix", js.undefined)
    
    @scala.inline
    def setAllowHtml(value: Boolean): Self = this.set("allowHtml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowHtml: Self = this.set("allowHtml", js.undefined)
    
    @scala.inline
    def setAnnotationsWidth(value: Double): Self = this.set("annotationsWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotationsWidth: Self = this.set("annotationsWidth", js.undefined)
    
    @scala.inline
    def setColorsVarargs(value: String*): Self = this.set("colors", js.Array(value :_*))
    
    @scala.inline
    def setColors(value: js.Array[String]): Self = this.set("colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    
    @scala.inline
    def setDateFormat(value: String): Self = this.set("dateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateFormat: Self = this.set("dateFormat", js.undefined)
    
    @scala.inline
    def setDisplayAnnotations(value: Boolean): Self = this.set("displayAnnotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayAnnotations: Self = this.set("displayAnnotations", js.undefined)
    
    @scala.inline
    def setDisplayAnnotationsFilter(value: Boolean): Self = this.set("displayAnnotationsFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayAnnotationsFilter: Self = this.set("displayAnnotationsFilter", js.undefined)
    
    @scala.inline
    def setDisplayDateBarSeparator(value: Boolean): Self = this.set("displayDateBarSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayDateBarSeparator: Self = this.set("displayDateBarSeparator", js.undefined)
    
    @scala.inline
    def setDisplayExactValues(value: Boolean): Self = this.set("displayExactValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayExactValues: Self = this.set("displayExactValues", js.undefined)
    
    @scala.inline
    def setDisplayLegendDots(value: Boolean): Self = this.set("displayLegendDots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayLegendDots: Self = this.set("displayLegendDots", js.undefined)
    
    @scala.inline
    def setDisplayLegendValues(value: Boolean): Self = this.set("displayLegendValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayLegendValues: Self = this.set("displayLegendValues", js.undefined)
    
    @scala.inline
    def setDisplayRangeSelector(value: Boolean): Self = this.set("displayRangeSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayRangeSelector: Self = this.set("displayRangeSelector", js.undefined)
    
    @scala.inline
    def setDisplayZoomButtons(value: Boolean): Self = this.set("displayZoomButtons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayZoomButtons: Self = this.set("displayZoomButtons", js.undefined)
    
    @scala.inline
    def setFill(value: Double): Self = this.set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    
    @scala.inline
    def setLegendPosition(value: sameRow | newRow): Self = this.set("legendPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegendPosition: Self = this.set("legendPosition", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setNumberFormats(value: js.Any): Self = this.set("numberFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberFormats: Self = this.set("numberFormats", js.undefined)
    
    @scala.inline
    def setScaleColumnsVarargs(value: Double*): Self = this.set("scaleColumns", js.Array(value :_*))
    
    @scala.inline
    def setScaleColumns(value: js.Array[Double]): Self = this.set("scaleColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleColumns: Self = this.set("scaleColumns", js.undefined)
    
    @scala.inline
    def setScaleFormat(value: String): Self = this.set("scaleFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleFormat: Self = this.set("scaleFormat", js.undefined)
    
    @scala.inline
    def setScaleType(value: String): Self = this.set("scaleType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleType: Self = this.set("scaleType", js.undefined)
    
    @scala.inline
    def setThickness(value: Double): Self = this.set("thickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThickness: Self = this.set("thickness", js.undefined)
    
    @scala.inline
    def setZoomEndTime(value: Date): Self = this.set("zoomEndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomEndTime: Self = this.set("zoomEndTime", js.undefined)
    
    @scala.inline
    def setZoomStartTime(value: Date): Self = this.set("zoomStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomStartTime: Self = this.set("zoomStartTime", js.undefined)
  }
}
