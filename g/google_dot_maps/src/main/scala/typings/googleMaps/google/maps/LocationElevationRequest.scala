package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An elevation request sent by the <code>ElevationService</code> containing
  * the list of discrete coordinates (<code>LatLng</code>s) for which to return
  * elevation data.
  */
trait LocationElevationRequest extends StObject {
  
  /**
    * The discrete locations for which to retrieve elevations.
    */
  var locations: js.UndefOr[Null | (js.Array[LatLng | LatLngLiteral])] = js.undefined
}
object LocationElevationRequest {
  
  inline def apply(): LocationElevationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationElevationRequest]
  }
  
  extension [Self <: LocationElevationRequest](x: Self) {
    
    inline def setLocations(value: js.Array[LatLng | LatLngLiteral]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    inline def setLocationsNull: Self = StObject.set(x, "locations", null)
    
    inline def setLocationsUndefined: Self = StObject.set(x, "locations", js.undefined)
    
    inline def setLocationsVarargs(value: (LatLng | LatLngLiteral)*): Self = StObject.set(x, "locations", js.Array(value*))
  }
}
