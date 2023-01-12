package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The directions response retrieved from the directions server. You can
  * render these using a {@link google.maps.DirectionsRenderer} or parse this
  * object and render it yourself. You must display the warnings and copyrights
  * as noted in the <a
  * href="https://cloud.google.com/maps-platform/terms">Google Maps Platform
  * Terms of Service</a>. Note that though this result is
  * &quot;JSON-like,&quot; it is not strictly JSON, as it indirectly includes
  * <code>LatLng</code> objects.
  */
trait DirectionsResult extends StObject {
  
  /**
    * Contains an array of available travel modes. This field is returned when
    * a request specifies a travel mode and gets no results. The array contains
    * the available travel modes in the countries of the given set of
    * waypoints. This field is not returned if one or more of the waypoints are
    * &#39;via waypoints&#39;.
    */
  var available_travel_modes: js.UndefOr[js.Array[TravelMode]] = js.undefined
  
  /**
    * An array of <code>DirectionsGeocodedWaypoint</code>s, each of which
    * contains information about the geocoding of origin, destination and
    * waypoints.
    */
  var geocoded_waypoints: js.UndefOr[js.Array[DirectionsGeocodedWaypoint]] = js.undefined
  
  /**
    * An array of <code>DirectionsRoute</code>s, each of which contains
    * information about the legs and steps of which it is composed. There will
    * only be one route unless the <code>DirectionsRequest</code> was made with
    * <code>provideRouteAlternatives</code> set to <code>true</code>.
    */
  var routes: js.Array[DirectionsRoute]
}
object DirectionsResult {
  
  inline def apply(routes: js.Array[DirectionsRoute]): DirectionsResult = {
    val __obj = js.Dynamic.literal(routes = routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DirectionsResult] (val x: Self) extends AnyVal {
    
    inline def setAvailable_travel_modes(value: js.Array[TravelMode]): Self = StObject.set(x, "available_travel_modes", value.asInstanceOf[js.Any])
    
    inline def setAvailable_travel_modesUndefined: Self = StObject.set(x, "available_travel_modes", js.undefined)
    
    inline def setAvailable_travel_modesVarargs(value: TravelMode*): Self = StObject.set(x, "available_travel_modes", js.Array(value*))
    
    inline def setGeocoded_waypoints(value: js.Array[DirectionsGeocodedWaypoint]): Self = StObject.set(x, "geocoded_waypoints", value.asInstanceOf[js.Any])
    
    inline def setGeocoded_waypointsUndefined: Self = StObject.set(x, "geocoded_waypoints", js.undefined)
    
    inline def setGeocoded_waypointsVarargs(value: DirectionsGeocodedWaypoint*): Self = StObject.set(x, "geocoded_waypoints", js.Array(value*))
    
    inline def setRoutes(value: js.Array[DirectionsRoute]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
    
    inline def setRoutesVarargs(value: DirectionsRoute*): Self = StObject.set(x, "routes", js.Array(value*))
  }
}
