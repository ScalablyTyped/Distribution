package typings.googleVisualization.google.visualization

import typings.googleVisualization.googleVisualizationStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PieChartOptions extends js.Object {
  
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
  implicit class PieChartOptionsOps[Self <: PieChartOptions] (val x: Self) extends AnyVal {
    
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
    def setBackgroundColor(value: String | ChartStrokeFill): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setChartArea(value: ChartArea): Self = this.set("chartArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChartArea: Self = this.set("chartArea", js.undefined)
    
    @scala.inline
    def setColorsVarargs(value: String*): Self = this.set("colors", js.Array(value :_*))
    
    @scala.inline
    def setColors(value: js.Array[String]): Self = this.set("colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    
    @scala.inline
    def setEnableInteractivity(value: Boolean): Self = this.set("enableInteractivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableInteractivity: Self = this.set("enableInteractivity", js.undefined)
    
    @scala.inline
    def setFontName(value: String): Self = this.set("fontName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontName: Self = this.set("fontName", js.undefined)
    
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setIs3D(value: Boolean): Self = this.set("is3D", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIs3D: Self = this.set("is3D", js.undefined)
    
    @scala.inline
    def setLegend(value: ChartLegend | none): Self = this.set("legend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegend: Self = this.set("legend", js.undefined)
    
    @scala.inline
    def setPieHole(value: Double): Self = this.set("pieHole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePieHole: Self = this.set("pieHole", js.undefined)
    
    @scala.inline
    def setPieResidueSliceColor(value: String): Self = this.set("pieResidueSliceColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePieResidueSliceColor: Self = this.set("pieResidueSliceColor", js.undefined)
    
    @scala.inline
    def setPieResidueSliceLabel(value: String): Self = this.set("pieResidueSliceLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePieResidueSliceLabel: Self = this.set("pieResidueSliceLabel", js.undefined)
    
    @scala.inline
    def setPieSliceBorderColor(value: String): Self = this.set("pieSliceBorderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePieSliceBorderColor: Self = this.set("pieSliceBorderColor", js.undefined)
    
    @scala.inline
    def setPieSliceText(value: String): Self = this.set("pieSliceText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePieSliceText: Self = this.set("pieSliceText", js.undefined)
    
    @scala.inline
    def setPieSliceTextStyle(value: ChartTextStyle): Self = this.set("pieSliceTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePieSliceTextStyle: Self = this.set("pieSliceTextStyle", js.undefined)
    
    @scala.inline
    def setPieStartAngle(value: Double): Self = this.set("pieStartAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePieStartAngle: Self = this.set("pieStartAngle", js.undefined)
    
    @scala.inline
    def setReverseCategories(value: Boolean): Self = this.set("reverseCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReverseCategories: Self = this.set("reverseCategories", js.undefined)
    
    @scala.inline
    def setSliceVisibilityThreshold(value: Double): Self = this.set("sliceVisibilityThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSliceVisibilityThreshold: Self = this.set("sliceVisibilityThreshold", js.undefined)
    
    @scala.inline
    def setSlices(value: js.Any): Self = this.set("slices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlices: Self = this.set("slices", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTitleTextStyle(value: ChartTextStyle): Self = this.set("titleTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleTextStyle: Self = this.set("titleTextStyle", js.undefined)
    
    @scala.inline
    def setTooltip(value: ChartTooltip): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
