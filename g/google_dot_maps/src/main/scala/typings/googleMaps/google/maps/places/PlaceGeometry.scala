package typings.googleMaps.google.maps.places

import typings.googleMaps.google.maps.LatLng
import typings.googleMaps.google.maps.LatLngBounds
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines information about the geometry of a Place.
  */
trait PlaceGeometry extends StObject {
  
  /**
    * The Place’s position.
    */
  var location: js.UndefOr[LatLng] = js.undefined
  
  /**
    * The preferred viewport when displaying this Place on a map. This property
    * will be <code>null</code> if the preferred viewport for the Place is not
    * known. Only available with {@link
    * google.maps.places.PlacesService.getDetails}.
    */
  var viewport: js.UndefOr[LatLngBounds] = js.undefined
}
object PlaceGeometry {
  
  inline def apply(): PlaceGeometry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlaceGeometry]
  }
  
  extension [Self <: PlaceGeometry](x: Self) {
    
    inline def setLocation(value: LatLng): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setViewport(value: LatLngBounds): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
    
    inline def setViewportUndefined: Self = StObject.set(x, "viewport", js.undefined)
  }
}
