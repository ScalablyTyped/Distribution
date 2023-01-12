package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Details about the departure, arrival, and mode of transit used in this
  * step.
  */
trait TransitDetails extends StObject {
  
  /**
    * The arrival stop of this transit step.
    */
  var arrival_stop: TransitStop
  
  /**
    * The arrival time of this step, specified as a Time object.
    */
  var arrival_time: Time
  
  /**
    * The departure stop of this transit step.
    */
  var departure_stop: TransitStop
  
  /**
    * The departure time of this step, specified as a Time object.
    */
  var departure_time: Time
  
  /**
    * The direction in which to travel on this line, as it is marked on the
    * vehicle or at the departure stop.
    */
  var headsign: String
  
  /**
    * The expected number of seconds between equivalent vehicles at this stop.
    */
  var headway: Double
  
  /**
    * Details about the transit line used in this step.
    */
  var line: TransitLine
  
  /**
    * The number of stops on this step. Includes the arrival stop, but not the
    * departure stop.
    */
  var num_stops: Double
  
  /**
    * The text that appears in schedules and sign boards to identify a transit
    * trip to passengers, for example, to identify train numbers for commuter
    * rail trips. The text uniquely identifies a trip within a service day.
    */
  var trip_short_name: String
}
object TransitDetails {
  
  inline def apply(
    arrival_stop: TransitStop,
    arrival_time: Time,
    departure_stop: TransitStop,
    departure_time: Time,
    headsign: String,
    headway: Double,
    line: TransitLine,
    num_stops: Double,
    trip_short_name: String
  ): TransitDetails = {
    val __obj = js.Dynamic.literal(arrival_stop = arrival_stop.asInstanceOf[js.Any], arrival_time = arrival_time.asInstanceOf[js.Any], departure_stop = departure_stop.asInstanceOf[js.Any], departure_time = departure_time.asInstanceOf[js.Any], headsign = headsign.asInstanceOf[js.Any], headway = headway.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], num_stops = num_stops.asInstanceOf[js.Any], trip_short_name = trip_short_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransitDetails] (val x: Self) extends AnyVal {
    
    inline def setArrival_stop(value: TransitStop): Self = StObject.set(x, "arrival_stop", value.asInstanceOf[js.Any])
    
    inline def setArrival_time(value: Time): Self = StObject.set(x, "arrival_time", value.asInstanceOf[js.Any])
    
    inline def setDeparture_stop(value: TransitStop): Self = StObject.set(x, "departure_stop", value.asInstanceOf[js.Any])
    
    inline def setDeparture_time(value: Time): Self = StObject.set(x, "departure_time", value.asInstanceOf[js.Any])
    
    inline def setHeadsign(value: String): Self = StObject.set(x, "headsign", value.asInstanceOf[js.Any])
    
    inline def setHeadway(value: Double): Self = StObject.set(x, "headway", value.asInstanceOf[js.Any])
    
    inline def setLine(value: TransitLine): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setNum_stops(value: Double): Self = StObject.set(x, "num_stops", value.asInstanceOf[js.Any])
    
    inline def setTrip_short_name(value: String): Self = StObject.set(x, "trip_short_name", value.asInstanceOf[js.Any])
  }
}
