package typings.googleVisualization.google.visualization

import typings.googleVisualization.googleVisualizationStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoChartOptions extends StObject {
  
  var backgroundColor: js.UndefOr[String | ChartStrokeFill] = js.undefined
  
  var colorAxis: js.UndefOr[ChartColorAxis] = js.undefined
  
  var datalessRegionColor: js.UndefOr[String] = js.undefined
  
  var defaultColor: js.UndefOr[String] = js.undefined
  
  var displayMode: js.UndefOr[String] = js.undefined
  
  var enableRegionInteractivity: js.UndefOr[Boolean] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var keepAspectRatio: js.UndefOr[Boolean] = js.undefined
  
  var legend: js.UndefOr[ChartLegend | none] = js.undefined
  
  var magnifyingGlass: js.UndefOr[GeoChartMagnifyingGlass] = js.undefined
  
  var markerOpacity: js.UndefOr[Double] = js.undefined
  
  var region: js.UndefOr[String] = js.undefined
  
  var resolution: js.UndefOr[String] = js.undefined
  
  var sizeAxis: js.UndefOr[ChartSizeAxis] = js.undefined
  
  var tooltip: js.UndefOr[ChartTooltip] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object GeoChartOptions {
  
  inline def apply(): GeoChartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeoChartOptions]
  }
  
  extension [Self <: GeoChartOptions](x: Self) {
    
    inline def setBackgroundColor(value: String | ChartStrokeFill): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setColorAxis(value: ChartColorAxis): Self = StObject.set(x, "colorAxis", value.asInstanceOf[js.Any])
    
    inline def setColorAxisUndefined: Self = StObject.set(x, "colorAxis", js.undefined)
    
    inline def setDatalessRegionColor(value: String): Self = StObject.set(x, "datalessRegionColor", value.asInstanceOf[js.Any])
    
    inline def setDatalessRegionColorUndefined: Self = StObject.set(x, "datalessRegionColor", js.undefined)
    
    inline def setDefaultColor(value: String): Self = StObject.set(x, "defaultColor", value.asInstanceOf[js.Any])
    
    inline def setDefaultColorUndefined: Self = StObject.set(x, "defaultColor", js.undefined)
    
    inline def setDisplayMode(value: String): Self = StObject.set(x, "displayMode", value.asInstanceOf[js.Any])
    
    inline def setDisplayModeUndefined: Self = StObject.set(x, "displayMode", js.undefined)
    
    inline def setEnableRegionInteractivity(value: Boolean): Self = StObject.set(x, "enableRegionInteractivity", value.asInstanceOf[js.Any])
    
    inline def setEnableRegionInteractivityUndefined: Self = StObject.set(x, "enableRegionInteractivity", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setKeepAspectRatio(value: Boolean): Self = StObject.set(x, "keepAspectRatio", value.asInstanceOf[js.Any])
    
    inline def setKeepAspectRatioUndefined: Self = StObject.set(x, "keepAspectRatio", js.undefined)
    
    inline def setLegend(value: ChartLegend | none): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    
    inline def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
    
    inline def setMagnifyingGlass(value: GeoChartMagnifyingGlass): Self = StObject.set(x, "magnifyingGlass", value.asInstanceOf[js.Any])
    
    inline def setMagnifyingGlassUndefined: Self = StObject.set(x, "magnifyingGlass", js.undefined)
    
    inline def setMarkerOpacity(value: Double): Self = StObject.set(x, "markerOpacity", value.asInstanceOf[js.Any])
    
    inline def setMarkerOpacityUndefined: Self = StObject.set(x, "markerOpacity", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setResolution(value: String): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    inline def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
    
    inline def setSizeAxis(value: ChartSizeAxis): Self = StObject.set(x, "sizeAxis", value.asInstanceOf[js.Any])
    
    inline def setSizeAxisUndefined: Self = StObject.set(x, "sizeAxis", js.undefined)
    
    inline def setTooltip(value: ChartTooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
