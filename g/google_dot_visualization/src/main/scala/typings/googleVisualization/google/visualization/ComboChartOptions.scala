package typings.googleVisualization.google.visualization

import typings.googleVisualization.googleVisualizationStrings.function
import typings.googleVisualization.googleVisualizationStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComboChartOptions extends StObject {
  
  var aggregationTarget: js.UndefOr[String] = js.undefined
  
  var animation: js.UndefOr[TransitionAnimation] = js.undefined
  
  var annotations: js.UndefOr[ChartAnnotations] = js.undefined
  
  var areaOpacity: js.UndefOr[Double] = js.undefined
  
  var axisTitlesPosition: js.UndefOr[ChartAxisTitlesPosition] = js.undefined
  
  var backgroundColor: js.UndefOr[String | ChartStrokeFill] = js.undefined
  
  var bar: js.UndefOr[GroupWidth] = js.undefined
  
  var candlestick: js.UndefOr[Candlestick] = js.undefined
  
  var chartArea: js.UndefOr[ChartArea] = js.undefined
  
  var colors: js.UndefOr[js.Array[String]] = js.undefined
  
  var crosshair: js.UndefOr[ChartCrosshair] = js.undefined
  
  var curveType: js.UndefOr[none | function] = js.undefined
  
  var dataOpacity: js.UndefOr[Double] = js.undefined
  
  var enableInteractivity: js.UndefOr[Boolean] = js.undefined
  
  var focusTarget: js.UndefOr[String] = js.undefined
  
  var fontName: js.UndefOr[String] = js.undefined
  
  var fontSize: js.UndefOr[Double] = js.undefined
  
  var forceIFrame: js.UndefOr[Boolean] = js.undefined
  
  var hAxis: js.UndefOr[ChartAxis] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var interpolateNulls: js.UndefOr[Boolean] = js.undefined
  
  var isStacked: js.UndefOr[Boolean] = js.undefined
  
  var legend: js.UndefOr[ChartLegend | none] = js.undefined
  
  var lineDashStyle: js.UndefOr[js.Array[Double]] = js.undefined
  
  var lineWidth: js.UndefOr[Double] = js.undefined
  
  var orientation: js.UndefOr[ChartOrientation] = js.undefined
  
  var pointShape: js.UndefOr[ChartPointShape] = js.undefined
  
  var pointSize: js.UndefOr[Double] = js.undefined
  
  var pointsVisible: js.UndefOr[Boolean] = js.undefined
  
  var reverseCategories: js.UndefOr[Boolean] = js.undefined
  
  var selectionMode: js.UndefOr[ChartSelectionMode] = js.undefined
  
  var series: js.UndefOr[js.Any] = js.undefined
  
  var seriesType: js.UndefOr[String] = js.undefined
  
  var theme: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var titlePosition: js.UndefOr[String] = js.undefined
  
  var titleTextStyle: js.UndefOr[ChartTextStyle] = js.undefined
  
  var tooltip: js.UndefOr[ChartTooltip] = js.undefined
  
  var vAxes: js.UndefOr[js.Any] = js.undefined
  
  var vAxis: js.UndefOr[ChartAxis] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object ComboChartOptions {
  
  inline def apply(): ComboChartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComboChartOptions]
  }
  
  extension [Self <: ComboChartOptions](x: Self) {
    
    inline def setAggregationTarget(value: String): Self = StObject.set(x, "aggregationTarget", value.asInstanceOf[js.Any])
    
    inline def setAggregationTargetUndefined: Self = StObject.set(x, "aggregationTarget", js.undefined)
    
    inline def setAnimation(value: TransitionAnimation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setAnnotations(value: ChartAnnotations): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    inline def setAreaOpacity(value: Double): Self = StObject.set(x, "areaOpacity", value.asInstanceOf[js.Any])
    
    inline def setAreaOpacityUndefined: Self = StObject.set(x, "areaOpacity", js.undefined)
    
    inline def setAxisTitlesPosition(value: ChartAxisTitlesPosition): Self = StObject.set(x, "axisTitlesPosition", value.asInstanceOf[js.Any])
    
    inline def setAxisTitlesPositionUndefined: Self = StObject.set(x, "axisTitlesPosition", js.undefined)
    
    inline def setBackgroundColor(value: String | ChartStrokeFill): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBar(value: GroupWidth): Self = StObject.set(x, "bar", value.asInstanceOf[js.Any])
    
    inline def setBarUndefined: Self = StObject.set(x, "bar", js.undefined)
    
    inline def setCandlestick(value: Candlestick): Self = StObject.set(x, "candlestick", value.asInstanceOf[js.Any])
    
    inline def setCandlestickUndefined: Self = StObject.set(x, "candlestick", js.undefined)
    
    inline def setChartArea(value: ChartArea): Self = StObject.set(x, "chartArea", value.asInstanceOf[js.Any])
    
    inline def setChartAreaUndefined: Self = StObject.set(x, "chartArea", js.undefined)
    
    inline def setColors(value: js.Array[String]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value :_*))
    
    inline def setCrosshair(value: ChartCrosshair): Self = StObject.set(x, "crosshair", value.asInstanceOf[js.Any])
    
    inline def setCrosshairUndefined: Self = StObject.set(x, "crosshair", js.undefined)
    
    inline def setCurveType(value: none | function): Self = StObject.set(x, "curveType", value.asInstanceOf[js.Any])
    
    inline def setCurveTypeUndefined: Self = StObject.set(x, "curveType", js.undefined)
    
    inline def setDataOpacity(value: Double): Self = StObject.set(x, "dataOpacity", value.asInstanceOf[js.Any])
    
    inline def setDataOpacityUndefined: Self = StObject.set(x, "dataOpacity", js.undefined)
    
    inline def setEnableInteractivity(value: Boolean): Self = StObject.set(x, "enableInteractivity", value.asInstanceOf[js.Any])
    
    inline def setEnableInteractivityUndefined: Self = StObject.set(x, "enableInteractivity", js.undefined)
    
    inline def setFocusTarget(value: String): Self = StObject.set(x, "focusTarget", value.asInstanceOf[js.Any])
    
    inline def setFocusTargetUndefined: Self = StObject.set(x, "focusTarget", js.undefined)
    
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
    
    inline def setInterpolateNulls(value: Boolean): Self = StObject.set(x, "interpolateNulls", value.asInstanceOf[js.Any])
    
    inline def setInterpolateNullsUndefined: Self = StObject.set(x, "interpolateNulls", js.undefined)
    
    inline def setIsStacked(value: Boolean): Self = StObject.set(x, "isStacked", value.asInstanceOf[js.Any])
    
    inline def setIsStackedUndefined: Self = StObject.set(x, "isStacked", js.undefined)
    
    inline def setLegend(value: ChartLegend | none): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    
    inline def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
    
    inline def setLineDashStyle(value: js.Array[Double]): Self = StObject.set(x, "lineDashStyle", value.asInstanceOf[js.Any])
    
    inline def setLineDashStyleUndefined: Self = StObject.set(x, "lineDashStyle", js.undefined)
    
    inline def setLineDashStyleVarargs(value: Double*): Self = StObject.set(x, "lineDashStyle", js.Array(value :_*))
    
    inline def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    inline def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
    
    inline def setOrientation(value: ChartOrientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setPointShape(value: ChartPointShape): Self = StObject.set(x, "pointShape", value.asInstanceOf[js.Any])
    
    inline def setPointShapeUndefined: Self = StObject.set(x, "pointShape", js.undefined)
    
    inline def setPointSize(value: Double): Self = StObject.set(x, "pointSize", value.asInstanceOf[js.Any])
    
    inline def setPointSizeUndefined: Self = StObject.set(x, "pointSize", js.undefined)
    
    inline def setPointsVisible(value: Boolean): Self = StObject.set(x, "pointsVisible", value.asInstanceOf[js.Any])
    
    inline def setPointsVisibleUndefined: Self = StObject.set(x, "pointsVisible", js.undefined)
    
    inline def setReverseCategories(value: Boolean): Self = StObject.set(x, "reverseCategories", value.asInstanceOf[js.Any])
    
    inline def setReverseCategoriesUndefined: Self = StObject.set(x, "reverseCategories", js.undefined)
    
    inline def setSelectionMode(value: ChartSelectionMode): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
    
    inline def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
    
    inline def setSeries(value: js.Any): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    inline def setSeriesType(value: String): Self = StObject.set(x, "seriesType", value.asInstanceOf[js.Any])
    
    inline def setSeriesTypeUndefined: Self = StObject.set(x, "seriesType", js.undefined)
    
    inline def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
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
    
    inline def setVAxes(value: js.Any): Self = StObject.set(x, "vAxes", value.asInstanceOf[js.Any])
    
    inline def setVAxesUndefined: Self = StObject.set(x, "vAxes", js.undefined)
    
    inline def setVAxis(value: ChartAxis): Self = StObject.set(x, "vAxis", value.asInstanceOf[js.Any])
    
    inline def setVAxisUndefined: Self = StObject.set(x, "vAxis", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
