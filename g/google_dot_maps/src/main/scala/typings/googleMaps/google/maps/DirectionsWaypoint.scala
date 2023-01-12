package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A <code>DirectionsWaypoint</code> represents a location between origin and
  * destination through which the trip should be routed.
  */
trait DirectionsWaypoint extends StObject {
  
  /**
    * Waypoint location. Can be an address string, a <code>LatLng</code>, or a
    * <code>Place</code>. Optional.
    */
  var location: js.UndefOr[String | LatLng | LatLngLiteral | Place] = js.undefined
  
  /**
    * If <code>true</code>, indicates that this waypoint is a stop between the
    * origin and destination. This has the effect of splitting the route into
    * two legs. If <code>false</code>, indicates that the route should be
    * biased to go through this waypoint, but not split into two legs. This is
    * useful if you want to create a route in response to the user dragging
    * waypoints on a map.
    * @defaultValue <code>true</code>
    */
  var stopover: js.UndefOr[Boolean] = js.undefined
}
object DirectionsWaypoint {
  
  inline def apply(): DirectionsWaypoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectionsWaypoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DirectionsWaypoint] (val x: Self) extends AnyVal {
    
    inline def setLocation(value: String | LatLng | LatLngLiteral | Place): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setStopover(value: Boolean): Self = StObject.set(x, "stopover", value.asInstanceOf[js.Any])
    
    inline def setStopoverUndefined: Self = StObject.set(x, "stopover", js.undefined)
  }
}
