package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreemapChartSpec extends js.Object {
  
  var colorData: js.UndefOr[ChartData] = js.native
  
  var colorScale: js.UndefOr[TreemapChartColorScale] = js.native
  
  var headerColor: js.UndefOr[Color] = js.native
  
  var hideTooltips: js.UndefOr[Boolean] = js.native
  
  var hintedLevels: js.UndefOr[Double] = js.native
  
  var labels: js.UndefOr[ChartData] = js.native
  
  var levels: js.UndefOr[Double] = js.native
  
  var maxValue: js.UndefOr[Double] = js.native
  
  var minValue: js.UndefOr[Double] = js.native
  
  var parentLabels: js.UndefOr[ChartData] = js.native
  
  var sizeData: js.UndefOr[ChartData] = js.native
  
  var textFormat: js.UndefOr[TextFormat] = js.native
}
object TreemapChartSpec {
  
  @scala.inline
  def apply(): TreemapChartSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreemapChartSpec]
  }
  
  @scala.inline
  implicit class TreemapChartSpecOps[Self <: TreemapChartSpec] (val x: Self) extends AnyVal {
    
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
    def setColorData(value: ChartData): Self = this.set("colorData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorData: Self = this.set("colorData", js.undefined)
    
    @scala.inline
    def setColorScale(value: TreemapChartColorScale): Self = this.set("colorScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorScale: Self = this.set("colorScale", js.undefined)
    
    @scala.inline
    def setHeaderColor(value: Color): Self = this.set("headerColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderColor: Self = this.set("headerColor", js.undefined)
    
    @scala.inline
    def setHideTooltips(value: Boolean): Self = this.set("hideTooltips", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideTooltips: Self = this.set("hideTooltips", js.undefined)
    
    @scala.inline
    def setHintedLevels(value: Double): Self = this.set("hintedLevels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHintedLevels: Self = this.set("hintedLevels", js.undefined)
    
    @scala.inline
    def setLabels(value: ChartData): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setLevels(value: Double): Self = this.set("levels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevels: Self = this.set("levels", js.undefined)
    
    @scala.inline
    def setMaxValue(value: Double): Self = this.set("maxValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxValue: Self = this.set("maxValue", js.undefined)
    
    @scala.inline
    def setMinValue(value: Double): Self = this.set("minValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinValue: Self = this.set("minValue", js.undefined)
    
    @scala.inline
    def setParentLabels(value: ChartData): Self = this.set("parentLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentLabels: Self = this.set("parentLabels", js.undefined)
    
    @scala.inline
    def setSizeData(value: ChartData): Self = this.set("sizeData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizeData: Self = this.set("sizeData", js.undefined)
    
    @scala.inline
    def setTextFormat(value: TextFormat): Self = this.set("textFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextFormat: Self = this.set("textFormat", js.undefined)
  }
}
