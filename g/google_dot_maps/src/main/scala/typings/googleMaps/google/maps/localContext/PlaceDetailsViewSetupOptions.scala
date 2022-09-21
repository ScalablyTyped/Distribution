package typings.googleMaps.google.maps.localContext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Setup options for the place details. Read more about <a
  * href="https://developers.google.com/maps/documentation/javascript/local-context/set-options#setting_layout_and_visibility">setting
  * layout and visibility</a>.
  */
trait PlaceDetailsViewSetupOptions extends StObject {
  
  var hidesOnMapClick: js.UndefOr[Boolean] = js.undefined
  
  var layoutMode: js.UndefOr[PlaceDetailsLayoutMode | Null] = js.undefined
  
  /**
    * Ignored when <code>layoutMode:INFO_WINDOW</code>. If not passed, a
    * position will be determined automatically based on the
    * <code>layoutMode</code>.
    */
  var position: js.UndefOr[PlaceDetailsPosition | Null] = js.undefined
}
object PlaceDetailsViewSetupOptions {
  
  inline def apply(): PlaceDetailsViewSetupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlaceDetailsViewSetupOptions]
  }
  
  extension [Self <: PlaceDetailsViewSetupOptions](x: Self) {
    
    inline def setHidesOnMapClick(value: Boolean): Self = StObject.set(x, "hidesOnMapClick", value.asInstanceOf[js.Any])
    
    inline def setHidesOnMapClickUndefined: Self = StObject.set(x, "hidesOnMapClick", js.undefined)
    
    inline def setLayoutMode(value: PlaceDetailsLayoutMode): Self = StObject.set(x, "layoutMode", value.asInstanceOf[js.Any])
    
    inline def setLayoutModeNull: Self = StObject.set(x, "layoutMode", null)
    
    inline def setLayoutModeUndefined: Self = StObject.set(x, "layoutMode", js.undefined)
    
    inline def setPosition(value: PlaceDetailsPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionNull: Self = StObject.set(x, "position", null)
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
