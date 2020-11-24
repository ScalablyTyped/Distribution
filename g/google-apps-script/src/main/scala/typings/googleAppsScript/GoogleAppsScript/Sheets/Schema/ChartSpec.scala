package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartSpec extends js.Object {
  
  var altText: js.UndefOr[String] = js.native
  
  var backgroundColor: js.UndefOr[Color] = js.native
  
  var basicChart: js.UndefOr[BasicChartSpec] = js.native
  
  var bubbleChart: js.UndefOr[BubbleChartSpec] = js.native
  
  var candlestickChart: js.UndefOr[CandlestickChartSpec] = js.native
  
  var fontName: js.UndefOr[String] = js.native
  
  var hiddenDimensionStrategy: js.UndefOr[String] = js.native
  
  var histogramChart: js.UndefOr[HistogramChartSpec] = js.native
  
  var maximized: js.UndefOr[Boolean] = js.native
  
  var orgChart: js.UndefOr[OrgChartSpec] = js.native
  
  var pieChart: js.UndefOr[PieChartSpec] = js.native
  
  var subtitle: js.UndefOr[String] = js.native
  
  var subtitleTextFormat: js.UndefOr[TextFormat] = js.native
  
  var subtitleTextPosition: js.UndefOr[TextPosition] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var titleTextFormat: js.UndefOr[TextFormat] = js.native
  
  var titleTextPosition: js.UndefOr[TextPosition] = js.native
  
  var treemapChart: js.UndefOr[TreemapChartSpec] = js.native
  
  var waterfallChart: js.UndefOr[WaterfallChartSpec] = js.native
}
object ChartSpec {
  
  @scala.inline
  def apply(): ChartSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartSpec]
  }
  
  @scala.inline
  implicit class ChartSpecOps[Self <: ChartSpec] (val x: Self) extends AnyVal {
    
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
    def setAltText(value: String): Self = this.set("altText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAltText: Self = this.set("altText", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: Color): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setBasicChart(value: BasicChartSpec): Self = this.set("basicChart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBasicChart: Self = this.set("basicChart", js.undefined)
    
    @scala.inline
    def setBubbleChart(value: BubbleChartSpec): Self = this.set("bubbleChart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBubbleChart: Self = this.set("bubbleChart", js.undefined)
    
    @scala.inline
    def setCandlestickChart(value: CandlestickChartSpec): Self = this.set("candlestickChart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCandlestickChart: Self = this.set("candlestickChart", js.undefined)
    
    @scala.inline
    def setFontName(value: String): Self = this.set("fontName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontName: Self = this.set("fontName", js.undefined)
    
    @scala.inline
    def setHiddenDimensionStrategy(value: String): Self = this.set("hiddenDimensionStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHiddenDimensionStrategy: Self = this.set("hiddenDimensionStrategy", js.undefined)
    
    @scala.inline
    def setHistogramChart(value: HistogramChartSpec): Self = this.set("histogramChart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHistogramChart: Self = this.set("histogramChart", js.undefined)
    
    @scala.inline
    def setMaximized(value: Boolean): Self = this.set("maximized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximized: Self = this.set("maximized", js.undefined)
    
    @scala.inline
    def setOrgChart(value: OrgChartSpec): Self = this.set("orgChart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrgChart: Self = this.set("orgChart", js.undefined)
    
    @scala.inline
    def setPieChart(value: PieChartSpec): Self = this.set("pieChart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePieChart: Self = this.set("pieChart", js.undefined)
    
    @scala.inline
    def setSubtitle(value: String): Self = this.set("subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubtitle: Self = this.set("subtitle", js.undefined)
    
    @scala.inline
    def setSubtitleTextFormat(value: TextFormat): Self = this.set("subtitleTextFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubtitleTextFormat: Self = this.set("subtitleTextFormat", js.undefined)
    
    @scala.inline
    def setSubtitleTextPosition(value: TextPosition): Self = this.set("subtitleTextPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubtitleTextPosition: Self = this.set("subtitleTextPosition", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTitleTextFormat(value: TextFormat): Self = this.set("titleTextFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleTextFormat: Self = this.set("titleTextFormat", js.undefined)
    
    @scala.inline
    def setTitleTextPosition(value: TextPosition): Self = this.set("titleTextPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleTextPosition: Self = this.set("titleTextPosition", js.undefined)
    
    @scala.inline
    def setTreemapChart(value: TreemapChartSpec): Self = this.set("treemapChart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTreemapChart: Self = this.set("treemapChart", js.undefined)
    
    @scala.inline
    def setWaterfallChart(value: WaterfallChartSpec): Self = this.set("waterfallChart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWaterfallChart: Self = this.set("waterfallChart", js.undefined)
  }
}
