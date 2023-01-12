package typings.googleVisualization.google.visualization

import typings.googleVisualization.anon.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartCrosshair extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
  
  var focused: js.UndefOr[Color] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var orientation: js.UndefOr[ChartOrientation] = js.undefined
  
  var selected: js.UndefOr[Color] = js.undefined
  
  var trigger: js.UndefOr[String] = js.undefined
}
object ChartCrosshair {
  
  inline def apply(): ChartCrosshair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartCrosshair]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChartCrosshair] (val x: Self) extends AnyVal {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setFocused(value: Color): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
    
    inline def setFocusedUndefined: Self = StObject.set(x, "focused", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setOrientation(value: ChartOrientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setSelected(value: Color): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    inline def setTrigger(value: String): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
    
    inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
  }
}
