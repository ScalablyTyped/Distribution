package typings.googleMaps.google.maps.journeySharing

import typings.googleMaps.google.maps.MarkerOptions
import typings.googleMaps.google.maps.Marker_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TripWaypointMarkerCustomizationFunctionParams
  extends StObject
     with TripMarkerCustomizationFunctionParams {
  
  /**
    * The 0-based waypoint index associated with this marker. Use this index
    * on {@link google.maps.journeySharing.Trip.remainingWaypoints} to retrieve
    * information about the waypoint.
    */
  var waypointIndex: Double
}
object TripWaypointMarkerCustomizationFunctionParams {
  
  inline def apply(defaultOptions: MarkerOptions, isNew: Boolean, marker: Marker_, trip: Trip, waypointIndex: Double): TripWaypointMarkerCustomizationFunctionParams = {
    val __obj = js.Dynamic.literal(defaultOptions = defaultOptions.asInstanceOf[js.Any], isNew = isNew.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any], trip = trip.asInstanceOf[js.Any], waypointIndex = waypointIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[TripWaypointMarkerCustomizationFunctionParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TripWaypointMarkerCustomizationFunctionParams] (val x: Self) extends AnyVal {
    
    inline def setWaypointIndex(value: Double): Self = StObject.set(x, "waypointIndex", value.asInstanceOf[js.Any])
  }
}
