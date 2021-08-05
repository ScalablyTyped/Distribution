package typings.fpsmeter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FPSMeterOptions extends StObject {
  
  // Meter right offset.
  var bottom: js.UndefOr[String] = js.undefined
  
  // Toggle between show 'fps' and 'ms' on this event.
  var decimals: js.UndefOr[Double] = js.undefined
  
  // Allow themes to use coloring by FPS heat. 0 FPS = red, maxFps = green.
  var graph: js.UndefOr[Double] = js.undefined
  
  // Meter theme. Build in: 'dark', 'light', 'transparent', 'colorful'.
  var heat: js.UndefOr[Double] = js.undefined
  
  // Whether to show history graph.
  var history: js.UndefOr[Double] = js.undefined
  
  var interval: js.UndefOr[Double] = js.undefined
  
  // Meter Z index.
  var left: js.UndefOr[String] = js.undefined
  
  // Meter bottom offset.
  var margin: js.UndefOr[String] = js.undefined
  
  // Number of decimals in FPS number. 1 = 59.9, 2 = 59.94, ...
  var maxFps: js.UndefOr[Double] = js.undefined
  
  // Minimal tick reporting interval in milliseconds.
  var position: js.UndefOr[String] = js.undefined
  
  // Meter top offset.
  var right: js.UndefOr[String] = js.undefined
  
  // Spike smoothing strength. 1 means no smoothing.
  var show: js.UndefOr[String] = js.undefined
  
  // Update interval in milliseconds.
  var smoothing: js.UndefOr[Double] = js.undefined
  
  // Meter margin. Helps with centering the counter when left: 50%;
  var theme: js.UndefOr[String] = js.undefined
  
  // Max expected FPS value.
  var threshold: js.UndefOr[Double] = js.undefined
  
  // Whether to show 'fps', or 'ms' = frame duration in milliseconds.
  var toggleOn: js.UndefOr[String] = js.undefined
  
  // Meter left offset.
  var top: js.UndefOr[String] = js.undefined
  
  // Meter position.
  var zIndex: js.UndefOr[Double] = js.undefined
}
object FPSMeterOptions {
  
  inline def apply(): FPSMeterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FPSMeterOptions]
  }
  
  extension [Self <: FPSMeterOptions](x: Self) {
    
    inline def setBottom(value: String): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    inline def setDecimals(value: Double): Self = StObject.set(x, "decimals", value.asInstanceOf[js.Any])
    
    inline def setDecimalsUndefined: Self = StObject.set(x, "decimals", js.undefined)
    
    inline def setGraph(value: Double): Self = StObject.set(x, "graph", value.asInstanceOf[js.Any])
    
    inline def setGraphUndefined: Self = StObject.set(x, "graph", js.undefined)
    
    inline def setHeat(value: Double): Self = StObject.set(x, "heat", value.asInstanceOf[js.Any])
    
    inline def setHeatUndefined: Self = StObject.set(x, "heat", js.undefined)
    
    inline def setHistory(value: Double): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    inline def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
    
    inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    inline def setLeft(value: String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setMargin(value: String): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setMaxFps(value: Double): Self = StObject.set(x, "maxFps", value.asInstanceOf[js.Any])
    
    inline def setMaxFpsUndefined: Self = StObject.set(x, "maxFps", js.undefined)
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setRight(value: String): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    inline def setShow(value: String): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    inline def setSmoothing(value: Double): Self = StObject.set(x, "smoothing", value.asInstanceOf[js.Any])
    
    inline def setSmoothingUndefined: Self = StObject.set(x, "smoothing", js.undefined)
    
    inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    
    inline def setToggleOn(value: String): Self = StObject.set(x, "toggleOn", value.asInstanceOf[js.Any])
    
    inline def setToggleOnUndefined: Self = StObject.set(x, "toggleOn", js.undefined)
    
    inline def setTop(value: String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
