package typings.flot.jquery.flot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait seriesOptions extends StObject {
  
  var bars: js.UndefOr[barsOptions] = js.undefined
  
  var clickable: js.UndefOr[Boolean] = js.undefined
  
  var color: js.UndefOr[Any] = js.undefined
  
  var highlightColor: js.UndefOr[Any] = js.undefined
  
  var hoverable: js.UndefOr[Boolean] = js.undefined
  
  // color or number
  var label: js.UndefOr[String] = js.undefined
  
  var lines: js.UndefOr[linesOptions] = js.undefined
  
  var points: js.UndefOr[pointsOptions] = js.undefined
  
  var shadowSize: js.UndefOr[Double] = js.undefined
  
  var xaxis: js.UndefOr[Double] = js.undefined
  
  var yaxis: js.UndefOr[Double] = js.undefined
}
object seriesOptions {
  
  inline def apply(): seriesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[seriesOptions]
  }
  
  extension [Self <: seriesOptions](x: Self) {
    
    inline def setBars(value: barsOptions): Self = StObject.set(x, "bars", value.asInstanceOf[js.Any])
    
    inline def setBarsUndefined: Self = StObject.set(x, "bars", js.undefined)
    
    inline def setClickable(value: Boolean): Self = StObject.set(x, "clickable", value.asInstanceOf[js.Any])
    
    inline def setClickableUndefined: Self = StObject.set(x, "clickable", js.undefined)
    
    inline def setColor(value: Any): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setHighlightColor(value: Any): Self = StObject.set(x, "highlightColor", value.asInstanceOf[js.Any])
    
    inline def setHighlightColorUndefined: Self = StObject.set(x, "highlightColor", js.undefined)
    
    inline def setHoverable(value: Boolean): Self = StObject.set(x, "hoverable", value.asInstanceOf[js.Any])
    
    inline def setHoverableUndefined: Self = StObject.set(x, "hoverable", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLines(value: linesOptions): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
    
    inline def setLinesUndefined: Self = StObject.set(x, "lines", js.undefined)
    
    inline def setPoints(value: pointsOptions): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
    
    inline def setShadowSize(value: Double): Self = StObject.set(x, "shadowSize", value.asInstanceOf[js.Any])
    
    inline def setShadowSizeUndefined: Self = StObject.set(x, "shadowSize", js.undefined)
    
    inline def setXaxis(value: Double): Self = StObject.set(x, "xaxis", value.asInstanceOf[js.Any])
    
    inline def setXaxisUndefined: Self = StObject.set(x, "xaxis", js.undefined)
    
    inline def setYaxis(value: Double): Self = StObject.set(x, "yaxis", value.asInstanceOf[js.Any])
    
    inline def setYaxisUndefined: Self = StObject.set(x, "yaxis", js.undefined)
  }
}
