package typings.googleVisualization.google.visualization

import typings.googleVisualization.googleVisualizationStrings.absolute
import typings.googleVisualization.googleVisualizationStrings.none
import typings.googleVisualization.googleVisualizationStrings.percent
import typings.googleVisualization.googleVisualizationStrings.relative
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AreaChartOptions extends StObject {
  
  var aggregationTarget: js.UndefOr[String] = js.native
  
  var animation: js.UndefOr[TransitionAnimation] = js.native
  
  var annotations: js.UndefOr[ChartAnnotations] = js.native
  
  var areaOpacity: js.UndefOr[Double] = js.native
  
  var axisTitlesPosition: js.UndefOr[ChartAxisTitlesPosition] = js.native
  
  var backgroundColor: js.UndefOr[String | ChartStrokeFill] = js.native
  
  var chartArea: js.UndefOr[ChartArea] = js.native
  
  var colors: js.UndefOr[js.Array[String]] = js.native
  
  var crosshair: js.UndefOr[ChartCrosshair] = js.native
  
  var dataOpacity: js.UndefOr[Double] = js.native
  
  var enableInteractivity: js.UndefOr[Boolean] = js.native
  
  var explorer: js.UndefOr[ChartExplorer] = js.native
  
  var focusTarget: js.UndefOr[String] = js.native
  
  var fontName: js.UndefOr[String] = js.native
  
  var fontSize: js.UndefOr[Double] = js.native
  
  var hAxis: js.UndefOr[ChartAxis] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var interpolateNulls: js.UndefOr[Boolean] = js.native
  
  var isStacked: js.UndefOr[Boolean | percent | relative | absolute] = js.native
  
  var legend: js.UndefOr[ChartLegend | none] = js.native
  
  var lineWidth: js.UndefOr[Double] = js.native
  
  var orientation: js.UndefOr[ChartOrientation] = js.native
  
  var pointSize: js.UndefOr[Double] = js.native
  
  var reverseCategories: js.UndefOr[Boolean] = js.native
  
  var selectionMode: js.UndefOr[ChartSelectionMode] = js.native
  
  var series: js.UndefOr[js.Any] = js.native
  
  var theme: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var titlePosition: js.UndefOr[String] = js.native
  
  var titleTextStyle: js.UndefOr[ChartTextStyle] = js.native
  
  var tooltip: js.UndefOr[ChartTooltip] = js.native
  
  var vAxes: js.UndefOr[js.Any] = js.native
  
  var vAxis: js.UndefOr[ChartAxis] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object AreaChartOptions {
  
  @scala.inline
  def apply(): AreaChartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AreaChartOptions]
  }
  
  @scala.inline
  implicit class AreaChartOptionsMutableBuilder[Self <: AreaChartOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAggregationTarget(value: String): Self = StObject.set(x, "aggregationTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregationTargetUndefined: Self = StObject.set(x, "aggregationTarget", js.undefined)
    
    @scala.inline
    def setAnimation(value: TransitionAnimation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    @scala.inline
    def setAnnotations(value: ChartAnnotations): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    @scala.inline
    def setAreaOpacity(value: Double): Self = StObject.set(x, "areaOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAreaOpacityUndefined: Self = StObject.set(x, "areaOpacity", js.undefined)
    
    @scala.inline
    def setAxisTitlesPosition(value: ChartAxisTitlesPosition): Self = StObject.set(x, "axisTitlesPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisTitlesPositionUndefined: Self = StObject.set(x, "axisTitlesPosition", js.undefined)
    
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
    def setCrosshair(value: ChartCrosshair): Self = StObject.set(x, "crosshair", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrosshairUndefined: Self = StObject.set(x, "crosshair", js.undefined)
    
    @scala.inline
    def setDataOpacity(value: Double): Self = StObject.set(x, "dataOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataOpacityUndefined: Self = StObject.set(x, "dataOpacity", js.undefined)
    
    @scala.inline
    def setEnableInteractivity(value: Boolean): Self = StObject.set(x, "enableInteractivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableInteractivityUndefined: Self = StObject.set(x, "enableInteractivity", js.undefined)
    
    @scala.inline
    def setExplorer(value: ChartExplorer): Self = StObject.set(x, "explorer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExplorerUndefined: Self = StObject.set(x, "explorer", js.undefined)
    
    @scala.inline
    def setFocusTarget(value: String): Self = StObject.set(x, "focusTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusTargetUndefined: Self = StObject.set(x, "focusTarget", js.undefined)
    
    @scala.inline
    def setFontName(value: String): Self = StObject.set(x, "fontName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontNameUndefined: Self = StObject.set(x, "fontName", js.undefined)
    
    @scala.inline
    def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    @scala.inline
    def setHAxis(value: ChartAxis): Self = StObject.set(x, "hAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHAxisUndefined: Self = StObject.set(x, "hAxis", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setInterpolateNulls(value: Boolean): Self = StObject.set(x, "interpolateNulls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterpolateNullsUndefined: Self = StObject.set(x, "interpolateNulls", js.undefined)
    
    @scala.inline
    def setIsStacked(value: Boolean | percent | relative | absolute): Self = StObject.set(x, "isStacked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsStackedUndefined: Self = StObject.set(x, "isStacked", js.undefined)
    
    @scala.inline
    def setLegend(value: ChartLegend | none): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
    
    @scala.inline
    def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
    
    @scala.inline
    def setOrientation(value: ChartOrientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    @scala.inline
    def setPointSize(value: Double): Self = StObject.set(x, "pointSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointSizeUndefined: Self = StObject.set(x, "pointSize", js.undefined)
    
    @scala.inline
    def setReverseCategories(value: Boolean): Self = StObject.set(x, "reverseCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReverseCategoriesUndefined: Self = StObject.set(x, "reverseCategories", js.undefined)
    
    @scala.inline
    def setSelectionMode(value: ChartSelectionMode): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
    
    @scala.inline
    def setSeries(value: js.Any): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    @scala.inline
    def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitlePosition(value: String): Self = StObject.set(x, "titlePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitlePositionUndefined: Self = StObject.set(x, "titlePosition", js.undefined)
    
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
    def setVAxes(value: js.Any): Self = StObject.set(x, "vAxes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVAxesUndefined: Self = StObject.set(x, "vAxes", js.undefined)
    
    @scala.inline
    def setVAxis(value: ChartAxis): Self = StObject.set(x, "vAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVAxisUndefined: Self = StObject.set(x, "vAxis", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
