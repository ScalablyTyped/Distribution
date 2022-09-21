package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for the rendering of the Street View pegman control on the map.
  */
trait StreetViewControlOptions extends StObject {
  
  /**
    * Position id. Used to specify the position of the control on the map. The
    * default position is embedded within the navigation (zoom and pan)
    * controls. If this position is empty or the same as that specified in the
    * <code>zoomControlOptions</code> or <code>panControlOptions</code>, the
    * Street View control will be displayed as part of the navigation controls.
    * Otherwise, it will be displayed separately.
    */
  var position: js.UndefOr[ControlPosition | Null] = js.undefined
}
object StreetViewControlOptions {
  
  inline def apply(): StreetViewControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreetViewControlOptions]
  }
  
  extension [Self <: StreetViewControlOptions](x: Self) {
    
    inline def setPosition(value: ControlPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionNull: Self = StObject.set(x, "position", null)
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
