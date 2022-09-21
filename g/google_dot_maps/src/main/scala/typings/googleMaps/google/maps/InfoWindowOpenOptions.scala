package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for opening an InfoWindow
  */
trait InfoWindowOpenOptions extends StObject {
  
  /**
    * The anchor to which this InfoWindow will be positioned. If the anchor is
    * non-null, the InfoWindow will be positioned at the top-center of the
    * anchor. The InfoWindow will be rendered on the same map or panorama as
    * the anchor <strong>(when available)</strong>.
    */
  var anchor: js.UndefOr[MVCObject | Null] = js.undefined
  
  /**
    * The map or panorama on which to render this InfoWindow.
    */
  var map: js.UndefOr[Map | Null | StreetViewPanorama] = js.undefined
  
  /**
    * Whether or not focus should be moved inside the InfoWindow when it is
    * opened. When this property is unset or when it is set to
    * <code>null</code> or <code>undefined</code>, a heuristic is used to
    * decide whether or not focus should be moved. It is recommended to
    * explicitly set this property to fit your needs as the heuristic is
    * subject to change and may not work well for all use cases.
    */
  var shouldFocus: js.UndefOr[Boolean | Null] = js.undefined
}
object InfoWindowOpenOptions {
  
  inline def apply(): InfoWindowOpenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InfoWindowOpenOptions]
  }
  
  extension [Self <: InfoWindowOpenOptions](x: Self) {
    
    inline def setAnchor(value: MVCObject): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    inline def setAnchorNull: Self = StObject.set(x, "anchor", null)
    
    inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    inline def setMap(value: Map | StreetViewPanorama): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapNull: Self = StObject.set(x, "map", null)
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    inline def setShouldFocus(value: Boolean): Self = StObject.set(x, "shouldFocus", value.asInstanceOf[js.Any])
    
    inline def setShouldFocusNull: Self = StObject.set(x, "shouldFocus", null)
    
    inline def setShouldFocusUndefined: Self = StObject.set(x, "shouldFocus", js.undefined)
  }
}
