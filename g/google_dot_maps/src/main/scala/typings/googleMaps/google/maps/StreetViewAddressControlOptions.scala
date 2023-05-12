package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreetViewAddressControlOptions extends StObject {
  
  /**
    * Position id. This id is used to specify the position of the control on
    * the map. The default position is <code>TOP_LEFT</code>.
    */
  var position: js.UndefOr[Null | ControlPosition] = js.undefined
}
object StreetViewAddressControlOptions {
  
  inline def apply(): StreetViewAddressControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreetViewAddressControlOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StreetViewAddressControlOptions] (val x: Self) extends AnyVal {
    
    inline def setPosition(value: ControlPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionNull: Self = StObject.set(x, "position", null)
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
