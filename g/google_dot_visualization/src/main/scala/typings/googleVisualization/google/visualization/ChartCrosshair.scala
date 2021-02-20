package typings.googleVisualization.google.visualization

import typings.googleVisualization.anon.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartCrosshair extends StObject {
  
  var color: js.UndefOr[String] = js.native
  
  var focused: js.UndefOr[Color] = js.native
  
  var opacity: js.UndefOr[Double] = js.native
  
  var orientation: js.UndefOr[ChartOrientation] = js.native
  
  var selected: js.UndefOr[Color] = js.native
  
  var trigger: js.UndefOr[String] = js.native
}
object ChartCrosshair {
  
  @scala.inline
  def apply(): ChartCrosshair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartCrosshair]
  }
  
  @scala.inline
  implicit class ChartCrosshairMutableBuilder[Self <: ChartCrosshair] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setFocused(value: Color): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusedUndefined: Self = StObject.set(x, "focused", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setOrientation(value: ChartOrientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    @scala.inline
    def setSelected(value: Color): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    @scala.inline
    def setTrigger(value: String): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
  }
}
