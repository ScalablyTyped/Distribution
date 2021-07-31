package typings.devextreme.anon

import typings.devextreme.devextremeStrings.alt
import typings.devextreme.devextremeStrings.both
import typings.devextreme.devextremeStrings.ctrl
import typings.devextreme.devextremeStrings.meta
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.pan
import typings.devextreme.devextremeStrings.shift
import typings.devextreme.devextremeStrings.zoom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowMouseWheel extends StObject {
  
  var allowMouseWheel: js.UndefOr[Boolean] = js.undefined
  
  var allowTouchGestures: js.UndefOr[Boolean] = js.undefined
  
  var argumentAxis: js.UndefOr[both | none | pan | zoom] = js.undefined
  
  var dragBoxStyle: js.UndefOr[Opacity] = js.undefined
  
  var dragToZoom: js.UndefOr[Boolean] = js.undefined
  
  var panKey: js.UndefOr[alt | ctrl | meta | shift] = js.undefined
  
  var valueAxis: js.UndefOr[both | none | pan | zoom] = js.undefined
}
object AllowMouseWheel {
  
  @scala.inline
  def apply(): AllowMouseWheel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowMouseWheel]
  }
  
  @scala.inline
  implicit class AllowMouseWheelMutableBuilder[Self <: AllowMouseWheel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowMouseWheel(value: Boolean): Self = StObject.set(x, "allowMouseWheel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowMouseWheelUndefined: Self = StObject.set(x, "allowMouseWheel", js.undefined)
    
    @scala.inline
    def setAllowTouchGestures(value: Boolean): Self = StObject.set(x, "allowTouchGestures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowTouchGesturesUndefined: Self = StObject.set(x, "allowTouchGestures", js.undefined)
    
    @scala.inline
    def setArgumentAxis(value: both | none | pan | zoom): Self = StObject.set(x, "argumentAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgumentAxisUndefined: Self = StObject.set(x, "argumentAxis", js.undefined)
    
    @scala.inline
    def setDragBoxStyle(value: Opacity): Self = StObject.set(x, "dragBoxStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragBoxStyleUndefined: Self = StObject.set(x, "dragBoxStyle", js.undefined)
    
    @scala.inline
    def setDragToZoom(value: Boolean): Self = StObject.set(x, "dragToZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragToZoomUndefined: Self = StObject.set(x, "dragToZoom", js.undefined)
    
    @scala.inline
    def setPanKey(value: alt | ctrl | meta | shift): Self = StObject.set(x, "panKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanKeyUndefined: Self = StObject.set(x, "panKey", js.undefined)
    
    @scala.inline
    def setValueAxis(value: both | none | pan | zoom): Self = StObject.set(x, "valueAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueAxisUndefined: Self = StObject.set(x, "valueAxis", js.undefined)
  }
}
