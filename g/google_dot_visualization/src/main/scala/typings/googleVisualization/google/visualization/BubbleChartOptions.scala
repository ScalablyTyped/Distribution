package typings.googleVisualization.google.visualization

import typings.googleVisualization.googleVisualizationStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BubbleChartOptions extends StObject {
  
  var animation: js.UndefOr[TransitionAnimation] = js.undefined
  
  var axisTitlesPosition: js.UndefOr[ChartAxisTitlesPosition] = js.undefined
  
  var backgroundColor: js.UndefOr[String | ChartStrokeFill] = js.undefined
  
  var bubble: js.UndefOr[ChartBubble] = js.undefined
  
  var chartArea: js.UndefOr[ChartArea] = js.undefined
  
  var colorAxis: js.UndefOr[ChartColorAxis] = js.undefined
  
  var colors: js.UndefOr[js.Array[String]] = js.undefined
  
  var enableInteractivity: js.UndefOr[Boolean] = js.undefined
  
  var explorer: js.UndefOr[ChartExplorer] = js.undefined
  
  var fontName: js.UndefOr[String] = js.undefined
  
  var fontSize: js.UndefOr[Double] = js.undefined
  
  var forceIFrame: js.UndefOr[Boolean] = js.undefined
  
  var hAxis: js.UndefOr[ChartAxis] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var legend: js.UndefOr[ChartLegend | none] = js.undefined
  
  var selectionMode: js.UndefOr[ChartSelectionMode] = js.undefined
  
  var series: js.UndefOr[Any] = js.undefined
  
  var sizeAxis: js.UndefOr[ChartSizeAxis] = js.undefined
  
  var sortBubblesBySize: js.UndefOr[Boolean] = js.undefined
  
  var theme: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var titlePosition: js.UndefOr[String] = js.undefined
  
  var titleTextStyle: js.UndefOr[ChartTextStyle] = js.undefined
  
  var tooltip: js.UndefOr[ChartTooltip] = js.undefined
  
  var vAxis: js.UndefOr[ChartAxis] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object BubbleChartOptions {
  
  inline def apply(): BubbleChartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BubbleChartOptions]
  }
  
  extension [Self <: BubbleChartOptions](x: Self) {
    
    inline def setAnimation(value: TransitionAnimation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setAxisTitlesPosition(value: ChartAxisTitlesPosition): Self = StObject.set(x, "axisTitlesPosition", value.asInstanceOf[js.Any])
    
    inline def setAxisTitlesPositionUndefined: Self = StObject.set(x, "axisTitlesPosition", js.undefined)
    
    inline def setBackgroundColor(value: String | ChartStrokeFill): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBubble(value: ChartBubble): Self = StObject.set(x, "bubble", value.asInstanceOf[js.Any])
    
    inline def setBubbleUndefined: Self = StObject.set(x, "bubble", js.undefined)
    
    inline def setChartArea(value: ChartArea): Self = StObject.set(x, "chartArea", value.asInstanceOf[js.Any])
    
    inline def setChartAreaUndefined: Self = StObject.set(x, "chartArea", js.undefined)
    
    inline def setColorAxis(value: ChartColorAxis): Self = StObject.set(x, "colorAxis", value.asInstanceOf[js.Any])
    
    inline def setColorAxisUndefined: Self = StObject.set(x, "colorAxis", js.undefined)
    
    inline def setColors(value: js.Array[String]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value*))
    
    inline def setEnableInteractivity(value: Boolean): Self = StObject.set(x, "enableInteractivity", value.asInstanceOf[js.Any])
    
    inline def setEnableInteractivityUndefined: Self = StObject.set(x, "enableInteractivity", js.undefined)
    
    inline def setExplorer(value: ChartExplorer): Self = StObject.set(x, "explorer", value.asInstanceOf[js.Any])
    
    inline def setExplorerUndefined: Self = StObject.set(x, "explorer", js.undefined)
    
    inline def setFontName(value: String): Self = StObject.set(x, "fontName", value.asInstanceOf[js.Any])
    
    inline def setFontNameUndefined: Self = StObject.set(x, "fontName", js.undefined)
    
    inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setForceIFrame(value: Boolean): Self = StObject.set(x, "forceIFrame", value.asInstanceOf[js.Any])
    
    inline def setForceIFrameUndefined: Self = StObject.set(x, "forceIFrame", js.undefined)
    
    inline def setHAxis(value: ChartAxis): Self = StObject.set(x, "hAxis", value.asInstanceOf[js.Any])
    
    inline def setHAxisUndefined: Self = StObject.set(x, "hAxis", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setLegend(value: ChartLegend | none): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    
    inline def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
    
    inline def setSelectionMode(value: ChartSelectionMode): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
    
    inline def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
    
    inline def setSeries(value: Any): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    inline def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    inline def setSizeAxis(value: ChartSizeAxis): Self = StObject.set(x, "sizeAxis", value.asInstanceOf[js.Any])
    
    inline def setSizeAxisUndefined: Self = StObject.set(x, "sizeAxis", js.undefined)
    
    inline def setSortBubblesBySize(value: Boolean): Self = StObject.set(x, "sortBubblesBySize", value.asInstanceOf[js.Any])
    
    inline def setSortBubblesBySizeUndefined: Self = StObject.set(x, "sortBubblesBySize", js.undefined)
    
    inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitlePosition(value: String): Self = StObject.set(x, "titlePosition", value.asInstanceOf[js.Any])
    
    inline def setTitlePositionUndefined: Self = StObject.set(x, "titlePosition", js.undefined)
    
    inline def setTitleTextStyle(value: ChartTextStyle): Self = StObject.set(x, "titleTextStyle", value.asInstanceOf[js.Any])
    
    inline def setTitleTextStyleUndefined: Self = StObject.set(x, "titleTextStyle", js.undefined)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTooltip(value: ChartTooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    inline def setVAxis(value: ChartAxis): Self = StObject.set(x, "vAxis", value.asInstanceOf[js.Any])
    
    inline def setVAxisUndefined: Self = StObject.set(x, "vAxis", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
