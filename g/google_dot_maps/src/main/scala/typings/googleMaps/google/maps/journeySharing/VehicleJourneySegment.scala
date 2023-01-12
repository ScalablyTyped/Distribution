package typings.googleMaps.google.maps.journeySharing

import typings.googleMaps.google.maps.LatLngLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Available only in the v=beta channel: https://goo.gle/3oAthT3.
  * VehicleJourneySegment type
  */
trait VehicleJourneySegment extends StObject {
  
  /**
    * The travel distance from the previous stop to this stop, in meters.
    */
  var distanceMeters: Double | Null
  
  /**
    * The travel time from the previous stop to this stop, in milliseconds.
    */
  var durationMillis: Double | Null
  
  /**
    * The extra travel time due to the durations of the stop&#39;s tasks, in
    * milliseconds.
    */
  var extraDurationMillis: Double | Null
  
  /**
    * The actual stop location.
    */
  var location: LatLngLiteral | Null
  
  /**
    * The path from the previous stop to this stop.
    */
  var path: js.Array[LatLngLiteral] | Null
}
object VehicleJourneySegment {
  
  inline def apply(): VehicleJourneySegment = {
    val __obj = js.Dynamic.literal(distanceMeters = null, durationMillis = null, extraDurationMillis = null, location = null, path = null)
    __obj.asInstanceOf[VehicleJourneySegment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VehicleJourneySegment] (val x: Self) extends AnyVal {
    
    inline def setDistanceMeters(value: Double): Self = StObject.set(x, "distanceMeters", value.asInstanceOf[js.Any])
    
    inline def setDistanceMetersNull: Self = StObject.set(x, "distanceMeters", null)
    
    inline def setDurationMillis(value: Double): Self = StObject.set(x, "durationMillis", value.asInstanceOf[js.Any])
    
    inline def setDurationMillisNull: Self = StObject.set(x, "durationMillis", null)
    
    inline def setExtraDurationMillis(value: Double): Self = StObject.set(x, "extraDurationMillis", value.asInstanceOf[js.Any])
    
    inline def setExtraDurationMillisNull: Self = StObject.set(x, "extraDurationMillis", null)
    
    inline def setLocation(value: LatLngLiteral): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationNull: Self = StObject.set(x, "location", null)
    
    inline def setPath(value: js.Array[LatLngLiteral]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathNull: Self = StObject.set(x, "path", null)
    
    inline def setPathVarargs(value: LatLngLiteral*): Self = StObject.set(x, "path", js.Array(value*))
  }
}
