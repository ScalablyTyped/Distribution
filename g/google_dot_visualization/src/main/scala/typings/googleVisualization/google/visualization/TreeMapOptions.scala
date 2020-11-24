package typings.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeMapOptions extends js.Object {
  
  var fontColor: js.UndefOr[String] = js.native
  
  var fontFamily: js.UndefOr[String] = js.native
  
  var fontSize: js.UndefOr[Double] = js.native
  
  var forceIFrame: js.UndefOr[Boolean] = js.native
  
  var headerColor: js.UndefOr[String] = js.native
  
  var headerHeight: js.UndefOr[Double] = js.native
  
  var headerHighlightColor: js.UndefOr[String] = js.native
  
  var hintOpacity: js.UndefOr[Double] = js.native
  
  var maxColor: js.UndefOr[String] = js.native
  
  var maxColorValue: js.UndefOr[Double] = js.native
  
  var maxDepth: js.UndefOr[Double] = js.native
  
  var maxHighlightColor: js.UndefOr[String] = js.native
  
  var maxPostDepth: js.UndefOr[Double] = js.native
  
  var midColor: js.UndefOr[String] = js.native
  
  var midHighlightColor: js.UndefOr[String] = js.native
  
  var minColor: js.UndefOr[String] = js.native
  
  var minColorValue: js.UndefOr[Double] = js.native
  
  var minHighlightColor: js.UndefOr[String] = js.native
  
  var showScale: js.UndefOr[Boolean] = js.native
  
  var showTooltips: js.UndefOr[Boolean] = js.native
  
  var textStyle: js.UndefOr[ChartTextStyle] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var titleTextStyle: js.UndefOr[ChartTextStyle] = js.native
  
  var useWeightedAverageForAggregation: js.UndefOr[Boolean] = js.native
}
object TreeMapOptions {
  
  @scala.inline
  def apply(): TreeMapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeMapOptions]
  }
  
  @scala.inline
  implicit class TreeMapOptionsOps[Self <: TreeMapOptions] (val x: Self) extends AnyVal {
    
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
    def setFontColor(value: String): Self = this.set("fontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontColor: Self = this.set("fontColor", js.undefined)
    
    @scala.inline
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    
    @scala.inline
    def setForceIFrame(value: Boolean): Self = this.set("forceIFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceIFrame: Self = this.set("forceIFrame", js.undefined)
    
    @scala.inline
    def setHeaderColor(value: String): Self = this.set("headerColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderColor: Self = this.set("headerColor", js.undefined)
    
    @scala.inline
    def setHeaderHeight(value: Double): Self = this.set("headerHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderHeight: Self = this.set("headerHeight", js.undefined)
    
    @scala.inline
    def setHeaderHighlightColor(value: String): Self = this.set("headerHighlightColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderHighlightColor: Self = this.set("headerHighlightColor", js.undefined)
    
    @scala.inline
    def setHintOpacity(value: Double): Self = this.set("hintOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHintOpacity: Self = this.set("hintOpacity", js.undefined)
    
    @scala.inline
    def setMaxColor(value: String): Self = this.set("maxColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxColor: Self = this.set("maxColor", js.undefined)
    
    @scala.inline
    def setMaxColorValue(value: Double): Self = this.set("maxColorValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxColorValue: Self = this.set("maxColorValue", js.undefined)
    
    @scala.inline
    def setMaxDepth(value: Double): Self = this.set("maxDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDepth: Self = this.set("maxDepth", js.undefined)
    
    @scala.inline
    def setMaxHighlightColor(value: String): Self = this.set("maxHighlightColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxHighlightColor: Self = this.set("maxHighlightColor", js.undefined)
    
    @scala.inline
    def setMaxPostDepth(value: Double): Self = this.set("maxPostDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxPostDepth: Self = this.set("maxPostDepth", js.undefined)
    
    @scala.inline
    def setMidColor(value: String): Self = this.set("midColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMidColor: Self = this.set("midColor", js.undefined)
    
    @scala.inline
    def setMidHighlightColor(value: String): Self = this.set("midHighlightColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMidHighlightColor: Self = this.set("midHighlightColor", js.undefined)
    
    @scala.inline
    def setMinColor(value: String): Self = this.set("minColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinColor: Self = this.set("minColor", js.undefined)
    
    @scala.inline
    def setMinColorValue(value: Double): Self = this.set("minColorValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinColorValue: Self = this.set("minColorValue", js.undefined)
    
    @scala.inline
    def setMinHighlightColor(value: String): Self = this.set("minHighlightColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinHighlightColor: Self = this.set("minHighlightColor", js.undefined)
    
    @scala.inline
    def setShowScale(value: Boolean): Self = this.set("showScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowScale: Self = this.set("showScale", js.undefined)
    
    @scala.inline
    def setShowTooltips(value: Boolean): Self = this.set("showTooltips", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowTooltips: Self = this.set("showTooltips", js.undefined)
    
    @scala.inline
    def setTextStyle(value: ChartTextStyle): Self = this.set("textStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextStyle: Self = this.set("textStyle", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTitleTextStyle(value: ChartTextStyle): Self = this.set("titleTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleTextStyle: Self = this.set("titleTextStyle", js.undefined)
    
    @scala.inline
    def setUseWeightedAverageForAggregation(value: Boolean): Self = this.set("useWeightedAverageForAggregation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseWeightedAverageForAggregation: Self = this.set("useWeightedAverageForAggregation", js.undefined)
  }
}
