package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.viz.dxChart.ChartZoomAndPanMode
import typings.devextreme.mod.DevExpress.viz.dxChart.EventKeyModifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowMouseWheel extends StObject {
  
  /**
    * Specifies whether users can use the mouse wheel to zoom the chart. Applies only if zoom is allowed for the argument or value axis.
    */
  var allowMouseWheel: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether users can use touch gestures to zoom or pan the chart. Applies only if zoom and pan are allowed for the argument or value axis.
    */
  var allowTouchGestures: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether users are allowed to zoom and/or pan the argument axis.
    */
  var argumentAxis: js.UndefOr[ChartZoomAndPanMode] = js.undefined
  
  /**
    * Configures the box that appears when users zoom the chart by selecting an area with the drag gesture. Applies only if dragToZoom is true.
    */
  var dragBoxStyle: js.UndefOr[`4`] = js.undefined
  
  /**
    * Enables users to zoom the chart by selecting an area with the drag gesture. Applies only on devices that use a mouse.
    */
  var dragToZoom: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the key that enables panning when dragToZoom is true. Applies only on devices that use a mouse.
    */
  var panKey: js.UndefOr[EventKeyModifier] = js.undefined
  
  /**
    * Specifies whether users are allowed to zoom and/or pan the value axis.
    */
  var valueAxis: js.UndefOr[ChartZoomAndPanMode] = js.undefined
}
object AllowMouseWheel {
  
  inline def apply(): AllowMouseWheel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowMouseWheel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AllowMouseWheel] (val x: Self) extends AnyVal {
    
    inline def setAllowMouseWheel(value: Boolean): Self = StObject.set(x, "allowMouseWheel", value.asInstanceOf[js.Any])
    
    inline def setAllowMouseWheelUndefined: Self = StObject.set(x, "allowMouseWheel", js.undefined)
    
    inline def setAllowTouchGestures(value: Boolean): Self = StObject.set(x, "allowTouchGestures", value.asInstanceOf[js.Any])
    
    inline def setAllowTouchGesturesUndefined: Self = StObject.set(x, "allowTouchGestures", js.undefined)
    
    inline def setArgumentAxis(value: ChartZoomAndPanMode): Self = StObject.set(x, "argumentAxis", value.asInstanceOf[js.Any])
    
    inline def setArgumentAxisUndefined: Self = StObject.set(x, "argumentAxis", js.undefined)
    
    inline def setDragBoxStyle(value: `4`): Self = StObject.set(x, "dragBoxStyle", value.asInstanceOf[js.Any])
    
    inline def setDragBoxStyleUndefined: Self = StObject.set(x, "dragBoxStyle", js.undefined)
    
    inline def setDragToZoom(value: Boolean): Self = StObject.set(x, "dragToZoom", value.asInstanceOf[js.Any])
    
    inline def setDragToZoomUndefined: Self = StObject.set(x, "dragToZoom", js.undefined)
    
    inline def setPanKey(value: EventKeyModifier): Self = StObject.set(x, "panKey", value.asInstanceOf[js.Any])
    
    inline def setPanKeyUndefined: Self = StObject.set(x, "panKey", js.undefined)
    
    inline def setValueAxis(value: ChartZoomAndPanMode): Self = StObject.set(x, "valueAxis", value.asInstanceOf[js.Any])
    
    inline def setValueAxisUndefined: Self = StObject.set(x, "valueAxis", js.undefined)
  }
}
