package typings.googleVisualization.google.visualization

import typings.googleVisualization.googleVisualizationStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PieChartOptions extends StObject {
  
  var backgroundColor: js.UndefOr[String | ChartStrokeFill] = js.native
  
  var chartArea: js.UndefOr[ChartArea] = js.native
  
  var colors: js.UndefOr[js.Array[String]] = js.native
  
  var enableInteractivity: js.UndefOr[Boolean] = js.native
  
  var fontName: js.UndefOr[String] = js.native
  
  var fontSize: js.UndefOr[Double] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var is3D: js.UndefOr[Boolean] = js.native
  
  var legend: js.UndefOr[ChartLegend | none] = js.native
  
  var pieHole: js.UndefOr[Double] = js.native
  
  var pieResidueSliceColor: js.UndefOr[String] = js.native
  
  var pieResidueSliceLabel: js.UndefOr[String] = js.native
  
  var pieSliceBorderColor: js.UndefOr[String] = js.native
  
  var pieSliceText: js.UndefOr[String] = js.native
  
  var pieSliceTextStyle: js.UndefOr[ChartTextStyle] = js.native
  
  var pieStartAngle: js.UndefOr[Double] = js.native
  
  var reverseCategories: js.UndefOr[Boolean] = js.native
  
  var sliceVisibilityThreshold: js.UndefOr[Double] = js.native
  
  var slices: js.UndefOr[js.Any] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var titleTextStyle: js.UndefOr[ChartTextStyle] = js.native
  
  var tooltip: js.UndefOr[ChartTooltip] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object PieChartOptions {
  
  @scala.inline
  def apply(): PieChartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PieChartOptions]
  }
  
  @scala.inline
  implicit class PieChartOptionsMutableBuilder[Self <: PieChartOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: String | ChartStrokeFill): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setChartArea(value: ChartArea): Self = StObject.set(x, "chartArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChartAreaUndefined: Self = StObject.set(x, "chartArea", js.undefined)
    
    @scala.inline
    def setColors(value: js.Array[String]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    @scala.inline
    def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value :_*))
    
    @scala.inline
    def setEnableInteractivity(value: Boolean): Self = StObject.set(x, "enableInteractivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableInteractivityUndefined: Self = StObject.set(x, "enableInteractivity", js.undefined)
    
    @scala.inline
    def setFontName(value: String): Self = StObject.set(x, "fontName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontNameUndefined: Self = StObject.set(x, "fontName", js.undefined)
    
    @scala.inline
    def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setIs3D(value: Boolean): Self = StObject.set(x, "is3D", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs3DUndefined: Self = StObject.set(x, "is3D", js.undefined)
    
    @scala.inline
    def setLegend(value: ChartLegend | none): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
    
    @scala.inline
    def setPieHole(value: Double): Self = StObject.set(x, "pieHole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPieHoleUndefined: Self = StObject.set(x, "pieHole", js.undefined)
    
    @scala.inline
    def setPieResidueSliceColor(value: String): Self = StObject.set(x, "pieResidueSliceColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPieResidueSliceColorUndefined: Self = StObject.set(x, "pieResidueSliceColor", js.undefined)
    
    @scala.inline
    def setPieResidueSliceLabel(value: String): Self = StObject.set(x, "pieResidueSliceLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPieResidueSliceLabelUndefined: Self = StObject.set(x, "pieResidueSliceLabel", js.undefined)
    
    @scala.inline
    def setPieSliceBorderColor(value: String): Self = StObject.set(x, "pieSliceBorderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPieSliceBorderColorUndefined: Self = StObject.set(x, "pieSliceBorderColor", js.undefined)
    
    @scala.inline
    def setPieSliceText(value: String): Self = StObject.set(x, "pieSliceText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPieSliceTextStyle(value: ChartTextStyle): Self = StObject.set(x, "pieSliceTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPieSliceTextStyleUndefined: Self = StObject.set(x, "pieSliceTextStyle", js.undefined)
    
    @scala.inline
    def setPieSliceTextUndefined: Self = StObject.set(x, "pieSliceText", js.undefined)
    
    @scala.inline
    def setPieStartAngle(value: Double): Self = StObject.set(x, "pieStartAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPieStartAngleUndefined: Self = StObject.set(x, "pieStartAngle", js.undefined)
    
    @scala.inline
    def setReverseCategories(value: Boolean): Self = StObject.set(x, "reverseCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReverseCategoriesUndefined: Self = StObject.set(x, "reverseCategories", js.undefined)
    
    @scala.inline
    def setSliceVisibilityThreshold(value: Double): Self = StObject.set(x, "sliceVisibilityThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSliceVisibilityThresholdUndefined: Self = StObject.set(x, "sliceVisibilityThreshold", js.undefined)
    
    @scala.inline
    def setSlices(value: js.Any): Self = StObject.set(x, "slices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlicesUndefined: Self = StObject.set(x, "slices", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleTextStyle(value: ChartTextStyle): Self = StObject.set(x, "titleTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleTextStyleUndefined: Self = StObject.set(x, "titleTextStyle", js.undefined)
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTooltip(value: ChartTooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
