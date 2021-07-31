package typings.googleVisualization.google.visualization

import typings.googleVisualization.googleVisualizationStrings.newRow
import typings.googleVisualization.googleVisualizationStrings.sameRow
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnnotationChartOptions extends StObject {
  
  var allValuesSuffix: js.UndefOr[String] = js.undefined
  
  var allowHtml: js.UndefOr[Boolean] = js.undefined
  
  var annotationsWidth: js.UndefOr[Double] = js.undefined
  
  var colors: js.UndefOr[js.Array[String]] = js.undefined
  
  var dateFormat: js.UndefOr[String] = js.undefined
  
  var displayAnnotations: js.UndefOr[Boolean] = js.undefined
  
  var displayAnnotationsFilter: js.UndefOr[Boolean] = js.undefined
  
  var displayDateBarSeparator: js.UndefOr[Boolean] = js.undefined
  
  var displayExactValues: js.UndefOr[Boolean] = js.undefined
  
  var displayLegendDots: js.UndefOr[Boolean] = js.undefined
  
  var displayLegendValues: js.UndefOr[Boolean] = js.undefined
  
  var displayRangeSelector: js.UndefOr[Boolean] = js.undefined
  
  var displayZoomButtons: js.UndefOr[Boolean] = js.undefined
  
  var fill: js.UndefOr[Double] = js.undefined
  
  var legendPosition: js.UndefOr[sameRow | newRow] = js.undefined
  
  var max: js.UndefOr[Double] = js.undefined
  
  var min: js.UndefOr[Double] = js.undefined
  
  var numberFormats: js.UndefOr[js.Any] = js.undefined
  
  var scaleColumns: js.UndefOr[js.Array[Double]] = js.undefined
  
  var scaleFormat: js.UndefOr[String] = js.undefined
  
  var scaleType: js.UndefOr[String] = js.undefined
  
  var thickness: js.UndefOr[Double] = js.undefined
  
  var zoomEndTime: js.UndefOr[Date] = js.undefined
  
  var zoomStartTime: js.UndefOr[Date] = js.undefined
}
object AnnotationChartOptions {
  
  @scala.inline
  def apply(): AnnotationChartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationChartOptions]
  }
  
  @scala.inline
  implicit class AnnotationChartOptionsMutableBuilder[Self <: AnnotationChartOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllValuesSuffix(value: String): Self = StObject.set(x, "allValuesSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllValuesSuffixUndefined: Self = StObject.set(x, "allValuesSuffix", js.undefined)
    
    @scala.inline
    def setAllowHtml(value: Boolean): Self = StObject.set(x, "allowHtml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowHtmlUndefined: Self = StObject.set(x, "allowHtml", js.undefined)
    
    @scala.inline
    def setAnnotationsWidth(value: Double): Self = StObject.set(x, "annotationsWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationsWidthUndefined: Self = StObject.set(x, "annotationsWidth", js.undefined)
    
    @scala.inline
    def setColors(value: js.Array[String]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    @scala.inline
    def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value :_*))
    
    @scala.inline
    def setDateFormat(value: String): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateFormatUndefined: Self = StObject.set(x, "dateFormat", js.undefined)
    
    @scala.inline
    def setDisplayAnnotations(value: Boolean): Self = StObject.set(x, "displayAnnotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayAnnotationsFilter(value: Boolean): Self = StObject.set(x, "displayAnnotationsFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayAnnotationsFilterUndefined: Self = StObject.set(x, "displayAnnotationsFilter", js.undefined)
    
    @scala.inline
    def setDisplayAnnotationsUndefined: Self = StObject.set(x, "displayAnnotations", js.undefined)
    
    @scala.inline
    def setDisplayDateBarSeparator(value: Boolean): Self = StObject.set(x, "displayDateBarSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayDateBarSeparatorUndefined: Self = StObject.set(x, "displayDateBarSeparator", js.undefined)
    
    @scala.inline
    def setDisplayExactValues(value: Boolean): Self = StObject.set(x, "displayExactValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayExactValuesUndefined: Self = StObject.set(x, "displayExactValues", js.undefined)
    
    @scala.inline
    def setDisplayLegendDots(value: Boolean): Self = StObject.set(x, "displayLegendDots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayLegendDotsUndefined: Self = StObject.set(x, "displayLegendDots", js.undefined)
    
    @scala.inline
    def setDisplayLegendValues(value: Boolean): Self = StObject.set(x, "displayLegendValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayLegendValuesUndefined: Self = StObject.set(x, "displayLegendValues", js.undefined)
    
    @scala.inline
    def setDisplayRangeSelector(value: Boolean): Self = StObject.set(x, "displayRangeSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayRangeSelectorUndefined: Self = StObject.set(x, "displayRangeSelector", js.undefined)
    
    @scala.inline
    def setDisplayZoomButtons(value: Boolean): Self = StObject.set(x, "displayZoomButtons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayZoomButtonsUndefined: Self = StObject.set(x, "displayZoomButtons", js.undefined)
    
    @scala.inline
    def setFill(value: Double): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setLegendPosition(value: sameRow | newRow): Self = StObject.set(x, "legendPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegendPositionUndefined: Self = StObject.set(x, "legendPosition", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setNumberFormats(value: js.Any): Self = StObject.set(x, "numberFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberFormatsUndefined: Self = StObject.set(x, "numberFormats", js.undefined)
    
    @scala.inline
    def setScaleColumns(value: js.Array[Double]): Self = StObject.set(x, "scaleColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleColumnsUndefined: Self = StObject.set(x, "scaleColumns", js.undefined)
    
    @scala.inline
    def setScaleColumnsVarargs(value: Double*): Self = StObject.set(x, "scaleColumns", js.Array(value :_*))
    
    @scala.inline
    def setScaleFormat(value: String): Self = StObject.set(x, "scaleFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleFormatUndefined: Self = StObject.set(x, "scaleFormat", js.undefined)
    
    @scala.inline
    def setScaleType(value: String): Self = StObject.set(x, "scaleType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleTypeUndefined: Self = StObject.set(x, "scaleType", js.undefined)
    
    @scala.inline
    def setThickness(value: Double): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThicknessUndefined: Self = StObject.set(x, "thickness", js.undefined)
    
    @scala.inline
    def setZoomEndTime(value: Date): Self = StObject.set(x, "zoomEndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomEndTimeUndefined: Self = StObject.set(x, "zoomEndTime", js.undefined)
    
    @scala.inline
    def setZoomStartTime(value: Date): Self = StObject.set(x, "zoomStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomStartTimeUndefined: Self = StObject.set(x, "zoomStartTime", js.undefined)
  }
}
