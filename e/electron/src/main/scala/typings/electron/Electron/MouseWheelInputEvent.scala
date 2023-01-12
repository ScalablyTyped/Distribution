package typings.electron.Electron

import typings.electron.electronStrings.mouseWheel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MouseWheelInputEvent
  extends StObject
     with MouseInputEvent {
  
  // Docs: https://electronjs.org/docs/api/structures/mouse-wheel-input-event
  var accelerationRatioX: js.UndefOr[Double] = js.undefined
  
  var accelerationRatioY: js.UndefOr[Double] = js.undefined
  
  var canScroll: js.UndefOr[Boolean] = js.undefined
  
  var deltaX: js.UndefOr[Double] = js.undefined
  
  var deltaY: js.UndefOr[Double] = js.undefined
  
  var hasPreciseScrollingDeltas: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The type of the event, can be `mouseWheel`.
    */
  @JSName("type")
  var type_MouseWheelInputEvent: mouseWheel
  
  var wheelTicksX: js.UndefOr[Double] = js.undefined
  
  var wheelTicksY: js.UndefOr[Double] = js.undefined
}
object MouseWheelInputEvent {
  
  inline def apply(x: Double, y: Double): MouseWheelInputEvent = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("mouseWheel")
    __obj.asInstanceOf[MouseWheelInputEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MouseWheelInputEvent] (val x: Self) extends AnyVal {
    
    inline def setAccelerationRatioX(value: Double): Self = StObject.set(x, "accelerationRatioX", value.asInstanceOf[js.Any])
    
    inline def setAccelerationRatioXUndefined: Self = StObject.set(x, "accelerationRatioX", js.undefined)
    
    inline def setAccelerationRatioY(value: Double): Self = StObject.set(x, "accelerationRatioY", value.asInstanceOf[js.Any])
    
    inline def setAccelerationRatioYUndefined: Self = StObject.set(x, "accelerationRatioY", js.undefined)
    
    inline def setCanScroll(value: Boolean): Self = StObject.set(x, "canScroll", value.asInstanceOf[js.Any])
    
    inline def setCanScrollUndefined: Self = StObject.set(x, "canScroll", js.undefined)
    
    inline def setDeltaX(value: Double): Self = StObject.set(x, "deltaX", value.asInstanceOf[js.Any])
    
    inline def setDeltaXUndefined: Self = StObject.set(x, "deltaX", js.undefined)
    
    inline def setDeltaY(value: Double): Self = StObject.set(x, "deltaY", value.asInstanceOf[js.Any])
    
    inline def setDeltaYUndefined: Self = StObject.set(x, "deltaY", js.undefined)
    
    inline def setHasPreciseScrollingDeltas(value: Boolean): Self = StObject.set(x, "hasPreciseScrollingDeltas", value.asInstanceOf[js.Any])
    
    inline def setHasPreciseScrollingDeltasUndefined: Self = StObject.set(x, "hasPreciseScrollingDeltas", js.undefined)
    
    inline def setType(value: mouseWheel): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWheelTicksX(value: Double): Self = StObject.set(x, "wheelTicksX", value.asInstanceOf[js.Any])
    
    inline def setWheelTicksXUndefined: Self = StObject.set(x, "wheelTicksX", js.undefined)
    
    inline def setWheelTicksY(value: Double): Self = StObject.set(x, "wheelTicksY", value.asInstanceOf[js.Any])
    
    inline def setWheelTicksYUndefined: Self = StObject.set(x, "wheelTicksY", js.undefined)
  }
}
