package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for the rendering of the pan control.
  */
trait PanControlOptions extends StObject {
  
  /**
    * Position id. Used to specify the position of the control on the map.
    * @defaultValue {@link google.maps.ControlPosition.TOP_LEFT}
    */
  var position: js.UndefOr[ControlPosition | Null] = js.undefined
}
object PanControlOptions {
  
  inline def apply(): PanControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PanControlOptions]
  }
  
  extension [Self <: PanControlOptions](x: Self) {
    
    inline def setPosition(value: ControlPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionNull: Self = StObject.set(x, "position", null)
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
