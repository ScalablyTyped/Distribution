package typings.googleMaps.google.maps.journeySharing

import typings.googleMaps.google.maps.LatLngLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Available only in the v=beta channel: https://goo.gle/3oAthT3.
  * VehicleWaypoint type.
  */
trait VehicleWaypoint extends StObject {
  
  /**
    * The path distance between the previous waypoint (or the vehicle&#39;s
    * current location, if this waypoint is the first in the list of waypoints)
    * to this waypoint in meters.
    */
  var distanceMeters: Double | Null
  
  /**
    * Travel time between the previous waypoint (or the vehicle&#39;s current
    * location, if this waypoint is the first in the list of waypoints) to this
    * waypoint in milliseconds.
    */
  var durationMillis: Double | Null
  
  /**
    * The location of the waypoint.
    */
  var location: LatLngLiteral | Null
  
  /**
    * The path from the previous waypoint (or the vehicle&#39;s current
    * location, if this waypoint is the first in the list of waypoints) to this
    * waypoint.
    */
  var path: js.Array[LatLngLiteral] | Null
}
object VehicleWaypoint {
  
  inline def apply(): VehicleWaypoint = {
    val __obj = js.Dynamic.literal(distanceMeters = null, durationMillis = null, location = null, path = null)
    __obj.asInstanceOf[VehicleWaypoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VehicleWaypoint] (val x: Self) extends AnyVal {
    
    inline def setDistanceMeters(value: Double): Self = StObject.set(x, "distanceMeters", value.asInstanceOf[js.Any])
    
    inline def setDistanceMetersNull: Self = StObject.set(x, "distanceMeters", null)
    
    inline def setDurationMillis(value: Double): Self = StObject.set(x, "durationMillis", value.asInstanceOf[js.Any])
    
    inline def setDurationMillisNull: Self = StObject.set(x, "durationMillis", null)
    
    inline def setLocation(value: LatLngLiteral): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationNull: Self = StObject.set(x, "location", null)
    
    inline def setPath(value: js.Array[LatLngLiteral]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathNull: Self = StObject.set(x, "path", null)
    
    inline def setPathVarargs(value: LatLngLiteral*): Self = StObject.set(x, "path", js.Array(value*))
  }
}
