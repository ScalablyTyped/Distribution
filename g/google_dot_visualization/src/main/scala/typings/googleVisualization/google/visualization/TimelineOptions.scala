package typings.googleVisualization.google.visualization

import typings.googleVisualization.anon.BarLabelStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimelineOptions extends StObject {
  
  var avoidOverlappingGridLines: js.UndefOr[Boolean] = js.undefined
  
  var backgroundColor: js.UndefOr[String | ChartStrokeFill] = js.undefined
  
  var colors: js.UndefOr[js.Array[String]] = js.undefined
  
  var enableInteractivity: js.UndefOr[Boolean] = js.undefined
  
  var forceIFrame: js.UndefOr[Boolean] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var timeline: js.UndefOr[BarLabelStyle] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object TimelineOptions {
  
  @scala.inline
  def apply(): TimelineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimelineOptions]
  }
  
  @scala.inline
  implicit class TimelineOptionsMutableBuilder[Self <: TimelineOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvoidOverlappingGridLines(value: Boolean): Self = StObject.set(x, "avoidOverlappingGridLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvoidOverlappingGridLinesUndefined: Self = StObject.set(x, "avoidOverlappingGridLines", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: String | ChartStrokeFill): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setColors(value: js.Array[String]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    @scala.inline
    def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value :_*))
    
    @scala.inline
    def setEnableInteractivity(value: Boolean): Self = StObject.set(x, "enableInteractivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableInteractivityUndefined: Self = StObject.set(x, "enableInteractivity", js.undefined)
    
    @scala.inline
    def setForceIFrame(value: Boolean): Self = StObject.set(x, "forceIFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceIFrameUndefined: Self = StObject.set(x, "forceIFrame", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setTimeline(value: BarLabelStyle): Self = StObject.set(x, "timeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimelineUndefined: Self = StObject.set(x, "timeline", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
