package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for the rendering of the motion tracking control.
  */
trait MotionTrackingControlOptions extends StObject {
  
  /**
    * Position id. This is used to specify the position of this control on the
    * panorama. The default position is <code>RIGHT_BOTTOM</code>.
    */
  var position: js.UndefOr[ControlPosition | Null] = js.undefined
}
object MotionTrackingControlOptions {
  
  inline def apply(): MotionTrackingControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MotionTrackingControlOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MotionTrackingControlOptions] (val x: Self) extends AnyVal {
    
    inline def setPosition(value: ControlPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionNull: Self = StObject.set(x, "position", null)
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
