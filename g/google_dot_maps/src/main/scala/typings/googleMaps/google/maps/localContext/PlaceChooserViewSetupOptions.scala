package typings.googleMaps.google.maps.localContext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Setup options for the place chooser. Read more about <a
  * href="https://developers.google.com/maps/documentation/javascript/local-context/set-options#setting_layout_and_visibility">setting
  * layout and visibility</a>.
  */
trait PlaceChooserViewSetupOptions extends StObject {
  
  var layoutMode: js.UndefOr[PlaceChooserLayoutMode | Null] = js.undefined
  
  /**
    * Ignored when <code>layoutMode:HIDDEN</code>. If not passed, a position
    * will be determined automatically based on the <code>layoutMode</code>.
    */
  var position: js.UndefOr[PlaceChooserPosition | Null] = js.undefined
}
object PlaceChooserViewSetupOptions {
  
  inline def apply(): PlaceChooserViewSetupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlaceChooserViewSetupOptions]
  }
  
  extension [Self <: PlaceChooserViewSetupOptions](x: Self) {
    
    inline def setLayoutMode(value: PlaceChooserLayoutMode): Self = StObject.set(x, "layoutMode", value.asInstanceOf[js.Any])
    
    inline def setLayoutModeNull: Self = StObject.set(x, "layoutMode", null)
    
    inline def setLayoutModeUndefined: Self = StObject.set(x, "layoutMode", js.undefined)
    
    inline def setPosition(value: PlaceChooserPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionNull: Self = StObject.set(x, "position", null)
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
