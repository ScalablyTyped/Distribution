package typings.flot.jquery.flot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait seriesOptions extends StObject {
  
  var bars: js.UndefOr[barsOptions] = js.native
  
  var clickable: js.UndefOr[Boolean] = js.native
  
  var color: js.UndefOr[js.Any] = js.native
  
  var highlightColor: js.UndefOr[js.Any] = js.native
  
  var hoverable: js.UndefOr[Boolean] = js.native
  
  // color or number
  var label: js.UndefOr[String] = js.native
  
  var lines: js.UndefOr[linesOptions] = js.native
  
  var points: js.UndefOr[pointsOptions] = js.native
  
  var shadowSize: js.UndefOr[Double] = js.native
  
  var xaxis: js.UndefOr[Double] = js.native
  
  var yaxis: js.UndefOr[Double] = js.native
}
object seriesOptions {
  
  @scala.inline
  def apply(): seriesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[seriesOptions]
  }
  
  @scala.inline
  implicit class seriesOptionsMutableBuilder[Self <: seriesOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBars(value: barsOptions): Self = StObject.set(x, "bars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBarsUndefined: Self = StObject.set(x, "bars", js.undefined)
    
    @scala.inline
    def setClickable(value: Boolean): Self = StObject.set(x, "clickable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickableUndefined: Self = StObject.set(x, "clickable", js.undefined)
    
    @scala.inline
    def setColor(value: js.Any): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setHighlightColor(value: js.Any): Self = StObject.set(x, "highlightColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightColorUndefined: Self = StObject.set(x, "highlightColor", js.undefined)
    
    @scala.inline
    def setHoverable(value: Boolean): Self = StObject.set(x, "hoverable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverableUndefined: Self = StObject.set(x, "hoverable", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setLines(value: linesOptions): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinesUndefined: Self = StObject.set(x, "lines", js.undefined)
    
    @scala.inline
    def setPoints(value: pointsOptions): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
    
    @scala.inline
    def setShadowSize(value: Double): Self = StObject.set(x, "shadowSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowSizeUndefined: Self = StObject.set(x, "shadowSize", js.undefined)
    
    @scala.inline
    def setXaxis(value: Double): Self = StObject.set(x, "xaxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXaxisUndefined: Self = StObject.set(x, "xaxis", js.undefined)
    
    @scala.inline
    def setYaxis(value: Double): Self = StObject.set(x, "yaxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYaxisUndefined: Self = StObject.set(x, "yaxis", js.undefined)
  }
}
