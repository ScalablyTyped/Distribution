package typings.framerMotion.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DOMVisualElementOptions extends StObject {
  
  /**
    * Allow `transform` to be set as `"none"` if all transforms are their default
    * values. Switching to this removes the element as a GPU layer which can lead to subtle
    * graphical shifts.
    *
    * @public
    */
  var allowTransformNone: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Allow this element to be GPU-accelerated. We currently enable this by
    * adding a `translateZ(0)`.
    *
    * @public
    */
  var enableHardwareAcceleration: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A function that can map a page point between spaces. Used by Framer
    * to support dragging and layout animations within scaled space.
    *
    * @public
    */
  var transformPagePoint: js.UndefOr[TransformPoint] = js.undefined
}
object DOMVisualElementOptions {
  
  inline def apply(): DOMVisualElementOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DOMVisualElementOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DOMVisualElementOptions] (val x: Self) extends AnyVal {
    
    inline def setAllowTransformNone(value: Boolean): Self = StObject.set(x, "allowTransformNone", value.asInstanceOf[js.Any])
    
    inline def setAllowTransformNoneUndefined: Self = StObject.set(x, "allowTransformNone", js.undefined)
    
    inline def setEnableHardwareAcceleration(value: Boolean): Self = StObject.set(x, "enableHardwareAcceleration", value.asInstanceOf[js.Any])
    
    inline def setEnableHardwareAccelerationUndefined: Self = StObject.set(x, "enableHardwareAcceleration", js.undefined)
    
    inline def setTransformPagePoint(value: /* point */ Point => Point): Self = StObject.set(x, "transformPagePoint", js.Any.fromFunction1(value))
    
    inline def setTransformPagePointUndefined: Self = StObject.set(x, "transformPagePoint", js.undefined)
  }
}
