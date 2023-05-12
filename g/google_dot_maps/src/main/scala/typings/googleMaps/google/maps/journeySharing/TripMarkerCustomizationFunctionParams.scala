package typings.googleMaps.google.maps.journeySharing

import typings.googleMaps.google.maps.MarkerOptions
import typings.googleMaps.google.maps.Marker_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TripMarkerCustomizationFunctionParams
  extends StObject
     with MarkerCustomizationFunctionParams {
  
  /**
    * The trip associated with this marker. <br><br>For information about the
    * vehicle servicing this trip, use {@link
    * google.maps.journeySharing.Trip.latestVehicleLocationUpdate} and {@link
    * google.maps.journeySharing.Trip.remainingWaypoints}.
    */
  var trip: Trip
}
object TripMarkerCustomizationFunctionParams {
  
  inline def apply(defaultOptions: MarkerOptions, isNew: Boolean, marker: Marker_, trip: Trip): TripMarkerCustomizationFunctionParams = {
    val __obj = js.Dynamic.literal(defaultOptions = defaultOptions.asInstanceOf[js.Any], isNew = isNew.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any], trip = trip.asInstanceOf[js.Any])
    __obj.asInstanceOf[TripMarkerCustomizationFunctionParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TripMarkerCustomizationFunctionParams] (val x: Self) extends AnyVal {
    
    inline def setTrip(value: Trip): Self = StObject.set(x, "trip", value.asInstanceOf[js.Any])
  }
}
