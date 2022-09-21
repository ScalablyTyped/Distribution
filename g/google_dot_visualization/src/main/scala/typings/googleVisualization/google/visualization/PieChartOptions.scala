package typings.googleVisualization.google.visualization

import typings.googleVisualization.googleVisualizationStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PieChartOptions extends StObject {
  
  var backgroundColor: js.UndefOr[String | ChartStrokeFill] = js.undefined
  
  var chartArea: js.UndefOr[ChartArea] = js.undefined
  
  var colors: js.UndefOr[js.Array[String]] = js.undefined
  
  var enableInteractivity: js.UndefOr[Boolean] = js.undefined
  
  var fontName: js.UndefOr[String] = js.undefined
  
  var fontSize: js.UndefOr[Double] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var is3D: js.UndefOr[Boolean] = js.undefined
  
  var legend: js.UndefOr[PieChartLegend | none] = js.undefined
  
  var pieHole: js.UndefOr[Double] = js.undefined
  
  var pieResidueSliceColor: js.UndefOr[String] = js.undefined
  
  var pieResidueSliceLabel: js.UndefOr[String] = js.undefined
  
  var pieSliceBorderColor: js.UndefOr[String] = js.undefined
  
  var pieSliceText: js.UndefOr[String] = js.undefined
  
  var pieSliceTextStyle: js.UndefOr[ChartTextStyle] = js.undefined
  
  var pieStartAngle: js.UndefOr[Double] = js.undefined
  
  var reverseCategories: js.UndefOr[Boolean] = js.undefined
  
  var sliceVisibilityThreshold: js.UndefOr[Double] = js.undefined
  
  var slices: js.UndefOr[Any] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var titleTextStyle: js.UndefOr[ChartTextStyle] = js.undefined
  
  var tooltip: js.UndefOr[ChartTooltip] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object PieChartOptions {
  
  inline def apply(): PieChartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PieChartOptions]
  }
  
  extension [Self <: PieChartOptions](x: Self) {
    
    inline def setBackgroundColor(value: String | ChartStrokeFill): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setChartArea(value: ChartArea): Self = StObject.set(x, "chartArea", value.asInstanceOf[js.Any])
    
    inline def setChartAreaUndefined: Self = StObject.set(x, "chartArea", js.undefined)
    
    inline def setColors(value: js.Array[String]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value*))
    
    inline def setEnableInteractivity(value: Boolean): Self = StObject.set(x, "enableInteractivity", value.asInstanceOf[js.Any])
    
    inline def setEnableInteractivityUndefined: Self = StObject.set(x, "enableInteractivity", js.undefined)
    
    inline def setFontName(value: String): Self = StObject.set(x, "fontName", value.asInstanceOf[js.Any])
    
    inline def setFontNameUndefined: Self = StObject.set(x, "fontName", js.undefined)
    
    inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setIs3D(value: Boolean): Self = StObject.set(x, "is3D", value.asInstanceOf[js.Any])
    
    inline def setIs3DUndefined: Self = StObject.set(x, "is3D", js.undefined)
    
    inline def setLegend(value: PieChartLegend | none): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    
    inline def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
    
    inline def setPieHole(value: Double): Self = StObject.set(x, "pieHole", value.asInstanceOf[js.Any])
    
    inline def setPieHoleUndefined: Self = StObject.set(x, "pieHole", js.undefined)
    
    inline def setPieResidueSliceColor(value: String): Self = StObject.set(x, "pieResidueSliceColor", value.asInstanceOf[js.Any])
    
    inline def setPieResidueSliceColorUndefined: Self = StObject.set(x, "pieResidueSliceColor", js.undefined)
    
    inline def setPieResidueSliceLabel(value: String): Self = StObject.set(x, "pieResidueSliceLabel", value.asInstanceOf[js.Any])
    
    inline def setPieResidueSliceLabelUndefined: Self = StObject.set(x, "pieResidueSliceLabel", js.undefined)
    
    inline def setPieSliceBorderColor(value: String): Self = StObject.set(x, "pieSliceBorderColor", value.asInstanceOf[js.Any])
    
    inline def setPieSliceBorderColorUndefined: Self = StObject.set(x, "pieSliceBorderColor", js.undefined)
    
    inline def setPieSliceText(value: String): Self = StObject.set(x, "pieSliceText", value.asInstanceOf[js.Any])
    
    inline def setPieSliceTextStyle(value: ChartTextStyle): Self = StObject.set(x, "pieSliceTextStyle", value.asInstanceOf[js.Any])
    
    inline def setPieSliceTextStyleUndefined: Self = StObject.set(x, "pieSliceTextStyle", js.undefined)
    
    inline def setPieSliceTextUndefined: Self = StObject.set(x, "pieSliceText", js.undefined)
    
    inline def setPieStartAngle(value: Double): Self = StObject.set(x, "pieStartAngle", value.asInstanceOf[js.Any])
    
    inline def setPieStartAngleUndefined: Self = StObject.set(x, "pieStartAngle", js.undefined)
    
    inline def setReverseCategories(value: Boolean): Self = StObject.set(x, "reverseCategories", value.asInstanceOf[js.Any])
    
    inline def setReverseCategoriesUndefined: Self = StObject.set(x, "reverseCategories", js.undefined)
    
    inline def setSliceVisibilityThreshold(value: Double): Self = StObject.set(x, "sliceVisibilityThreshold", value.asInstanceOf[js.Any])
    
    inline def setSliceVisibilityThresholdUndefined: Self = StObject.set(x, "sliceVisibilityThreshold", js.undefined)
    
    inline def setSlices(value: Any): Self = StObject.set(x, "slices", value.asInstanceOf[js.Any])
    
    inline def setSlicesUndefined: Self = StObject.set(x, "slices", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleTextStyle(value: ChartTextStyle): Self = StObject.set(x, "titleTextStyle", value.asInstanceOf[js.Any])
    
    inline def setTitleTextStyleUndefined: Self = StObject.set(x, "titleTextStyle", js.undefined)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTooltip(value: ChartTooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
