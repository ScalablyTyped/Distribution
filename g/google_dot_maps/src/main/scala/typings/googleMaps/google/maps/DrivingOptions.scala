package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configures the <code><a
  * href="#DirectionsRequest">DirectionsRequest</a></code> when the travel mode
  * is set to <code>DRIVING</code>.
  */
trait DrivingOptions extends StObject {
  
  /**
    * The desired departure time for the route, specified as a
    * <code>Date</code> object. The <code>Date</code> object measures time in
    * milliseconds since 1 January 1970. This must be specified for a
    * <code>DrivingOptions</code> to be valid. The departure time must be set
    * to the current time or some time in the future. It cannot be in the past.
    */
  var departureTime: js.Date
  
  /**
    * The preferred assumption to use when predicting duration in traffic. The
    * default is <code>BEST_GUESS</code>.
    */
  var trafficModel: js.UndefOr[TrafficModel] = js.undefined
}
object DrivingOptions {
  
  inline def apply(departureTime: js.Date): DrivingOptions = {
    val __obj = js.Dynamic.literal(departureTime = departureTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrivingOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DrivingOptions] (val x: Self) extends AnyVal {
    
    inline def setDepartureTime(value: js.Date): Self = StObject.set(x, "departureTime", value.asInstanceOf[js.Any])
    
    inline def setTrafficModel(value: TrafficModel): Self = StObject.set(x, "trafficModel", value.asInstanceOf[js.Any])
    
    inline def setTrafficModelUndefined: Self = StObject.set(x, "trafficModel", js.undefined)
  }
}
