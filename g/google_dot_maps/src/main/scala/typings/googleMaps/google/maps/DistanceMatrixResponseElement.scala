package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DistanceMatrixResponseElement extends StObject {
  
  /**
    * The distance for this origin-destination pairing. This property may be
    * undefined as the distance may be unknown.
    */
  var distance: Distance
  
  /**
    * The duration for this origin-destination pairing. This property may be
    * undefined as the duration may be unknown.
    */
  var duration: Duration
  
  /**
    * The duration for this origin-destination pairing, taking into account the
    * traffic conditions indicated by the <code>trafficModel</code> property.
    * This property may be <code>undefined</code> as the duration may be
    * unknown. Only available to Premium Plan customers when
    * <code>drivingOptions</code> is defined when making the request.
    */
  var duration_in_traffic: Duration
  
  /**
    * The total fare for this origin-destination pairing. Only applicable to
    * transit requests.
    */
  var fare: TransitFare
  
  /**
    * The status of this particular origin-destination pairing.
    */
  var status: DistanceMatrixElementStatus
}
object DistanceMatrixResponseElement {
  
  inline def apply(
    distance: Distance,
    duration: Duration,
    duration_in_traffic: Duration,
    fare: TransitFare,
    status: DistanceMatrixElementStatus
  ): DistanceMatrixResponseElement = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], duration_in_traffic = duration_in_traffic.asInstanceOf[js.Any], fare = fare.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistanceMatrixResponseElement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DistanceMatrixResponseElement] (val x: Self) extends AnyVal {
    
    inline def setDistance(value: Distance): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: Duration): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDuration_in_traffic(value: Duration): Self = StObject.set(x, "duration_in_traffic", value.asInstanceOf[js.Any])
    
    inline def setFare(value: TransitFare): Self = StObject.set(x, "fare", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: DistanceMatrixElementStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
