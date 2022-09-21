package typings.googleVisualization.google.visualization

import typings.googleVisualization.googleVisualizationStrings.newRow
import typings.googleVisualization.googleVisualizationStrings.sameRow
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
  
  var numberFormats: js.UndefOr[Any] = js.undefined
  
  var scaleColumns: js.UndefOr[js.Array[Double]] = js.undefined
  
  var scaleFormat: js.UndefOr[String] = js.undefined
  
  var scaleType: js.UndefOr[String] = js.undefined
  
  var thickness: js.UndefOr[Double] = js.undefined
  
  var zoomEndTime: js.UndefOr[js.Date] = js.undefined
  
  var zoomStartTime: js.UndefOr[js.Date] = js.undefined
}
object AnnotationChartOptions {
  
  inline def apply(): AnnotationChartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationChartOptions]
  }
  
  extension [Self <: AnnotationChartOptions](x: Self) {
    
    inline def setAllValuesSuffix(value: String): Self = StObject.set(x, "allValuesSuffix", value.asInstanceOf[js.Any])
    
    inline def setAllValuesSuffixUndefined: Self = StObject.set(x, "allValuesSuffix", js.undefined)
    
    inline def setAllowHtml(value: Boolean): Self = StObject.set(x, "allowHtml", value.asInstanceOf[js.Any])
    
    inline def setAllowHtmlUndefined: Self = StObject.set(x, "allowHtml", js.undefined)
    
    inline def setAnnotationsWidth(value: Double): Self = StObject.set(x, "annotationsWidth", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsWidthUndefined: Self = StObject.set(x, "annotationsWidth", js.undefined)
    
    inline def setColors(value: js.Array[String]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value*))
    
    inline def setDateFormat(value: String): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
    
    inline def setDateFormatUndefined: Self = StObject.set(x, "dateFormat", js.undefined)
    
    inline def setDisplayAnnotations(value: Boolean): Self = StObject.set(x, "displayAnnotations", value.asInstanceOf[js.Any])
    
    inline def setDisplayAnnotationsFilter(value: Boolean): Self = StObject.set(x, "displayAnnotationsFilter", value.asInstanceOf[js.Any])
    
    inline def setDisplayAnnotationsFilterUndefined: Self = StObject.set(x, "displayAnnotationsFilter", js.undefined)
    
    inline def setDisplayAnnotationsUndefined: Self = StObject.set(x, "displayAnnotations", js.undefined)
    
    inline def setDisplayDateBarSeparator(value: Boolean): Self = StObject.set(x, "displayDateBarSeparator", value.asInstanceOf[js.Any])
    
    inline def setDisplayDateBarSeparatorUndefined: Self = StObject.set(x, "displayDateBarSeparator", js.undefined)
    
    inline def setDisplayExactValues(value: Boolean): Self = StObject.set(x, "displayExactValues", value.asInstanceOf[js.Any])
    
    inline def setDisplayExactValuesUndefined: Self = StObject.set(x, "displayExactValues", js.undefined)
    
    inline def setDisplayLegendDots(value: Boolean): Self = StObject.set(x, "displayLegendDots", value.asInstanceOf[js.Any])
    
    inline def setDisplayLegendDotsUndefined: Self = StObject.set(x, "displayLegendDots", js.undefined)
    
    inline def setDisplayLegendValues(value: Boolean): Self = StObject.set(x, "displayLegendValues", value.asInstanceOf[js.Any])
    
    inline def setDisplayLegendValuesUndefined: Self = StObject.set(x, "displayLegendValues", js.undefined)
    
    inline def setDisplayRangeSelector(value: Boolean): Self = StObject.set(x, "displayRangeSelector", value.asInstanceOf[js.Any])
    
    inline def setDisplayRangeSelectorUndefined: Self = StObject.set(x, "displayRangeSelector", js.undefined)
    
    inline def setDisplayZoomButtons(value: Boolean): Self = StObject.set(x, "displayZoomButtons", value.asInstanceOf[js.Any])
    
    inline def setDisplayZoomButtonsUndefined: Self = StObject.set(x, "displayZoomButtons", js.undefined)
    
    inline def setFill(value: Double): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setLegendPosition(value: sameRow | newRow): Self = StObject.set(x, "legendPosition", value.asInstanceOf[js.Any])
    
    inline def setLegendPositionUndefined: Self = StObject.set(x, "legendPosition", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setNumberFormats(value: Any): Self = StObject.set(x, "numberFormats", value.asInstanceOf[js.Any])
    
    inline def setNumberFormatsUndefined: Self = StObject.set(x, "numberFormats", js.undefined)
    
    inline def setScaleColumns(value: js.Array[Double]): Self = StObject.set(x, "scaleColumns", value.asInstanceOf[js.Any])
    
    inline def setScaleColumnsUndefined: Self = StObject.set(x, "scaleColumns", js.undefined)
    
    inline def setScaleColumnsVarargs(value: Double*): Self = StObject.set(x, "scaleColumns", js.Array(value*))
    
    inline def setScaleFormat(value: String): Self = StObject.set(x, "scaleFormat", value.asInstanceOf[js.Any])
    
    inline def setScaleFormatUndefined: Self = StObject.set(x, "scaleFormat", js.undefined)
    
    inline def setScaleType(value: String): Self = StObject.set(x, "scaleType", value.asInstanceOf[js.Any])
    
    inline def setScaleTypeUndefined: Self = StObject.set(x, "scaleType", js.undefined)
    
    inline def setThickness(value: Double): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
    
    inline def setThicknessUndefined: Self = StObject.set(x, "thickness", js.undefined)
    
    inline def setZoomEndTime(value: js.Date): Self = StObject.set(x, "zoomEndTime", value.asInstanceOf[js.Any])
    
    inline def setZoomEndTimeUndefined: Self = StObject.set(x, "zoomEndTime", js.undefined)
    
    inline def setZoomStartTime(value: js.Date): Self = StObject.set(x, "zoomStartTime", value.asInstanceOf[js.Any])
    
    inline def setZoomStartTimeUndefined: Self = StObject.set(x, "zoomStartTime", js.undefined)
  }
}
