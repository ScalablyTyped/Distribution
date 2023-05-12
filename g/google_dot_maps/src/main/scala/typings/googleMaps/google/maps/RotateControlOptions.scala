package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RotateControlOptions extends StObject {
  
  /**
    * Position id. Used to specify the position of the control on the map. The
    * default position is <code>TOP_LEFT</code>.
    */
  var position: js.UndefOr[ControlPosition | Null] = js.undefined
}
object RotateControlOptions {
  
  inline def apply(): RotateControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RotateControlOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RotateControlOptions] (val x: Self) extends AnyVal {
    
    inline def setPosition(value: ControlPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionNull: Self = StObject.set(x, "position", null)
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
