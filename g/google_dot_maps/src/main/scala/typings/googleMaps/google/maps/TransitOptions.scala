package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitOptions extends StObject {
  
  /**
    * The desired arrival time for the route, specified as a Date object. The
    * Date object measures time in milliseconds since 1 January 1970. If
    * arrival time is specified, departure time is ignored.
    */
  var arrivalTime: js.UndefOr[js.Date | Null] = js.undefined
  
  /**
    * The desired departure time for the route, specified as a Date object. The
    * Date object measures time in milliseconds since 1 January 1970. If
    * neither departure time nor arrival time is specified, the time is assumed
    * to be &quot;now&quot;.
    */
  var departureTime: js.UndefOr[js.Date | Null] = js.undefined
  
  /**
    * One or more preferred modes of transit, such as bus or train. If no
    * preference is given, the API returns the default best route.
    */
  var modes: js.UndefOr[js.Array[TransitMode] | Null] = js.undefined
  
  /**
    * A preference that can bias the choice of transit route, such as less
    * walking. If no preference is given, the API returns the default best
    * route.
    */
  var routingPreference: js.UndefOr[TransitRoutePreference | Null] = js.undefined
}
object TransitOptions {
  
  inline def apply(): TransitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransitOptions] (val x: Self) extends AnyVal {
    
    inline def setArrivalTime(value: js.Date): Self = StObject.set(x, "arrivalTime", value.asInstanceOf[js.Any])
    
    inline def setArrivalTimeNull: Self = StObject.set(x, "arrivalTime", null)
    
    inline def setArrivalTimeUndefined: Self = StObject.set(x, "arrivalTime", js.undefined)
    
    inline def setDepartureTime(value: js.Date): Self = StObject.set(x, "departureTime", value.asInstanceOf[js.Any])
    
    inline def setDepartureTimeNull: Self = StObject.set(x, "departureTime", null)
    
    inline def setDepartureTimeUndefined: Self = StObject.set(x, "departureTime", js.undefined)
    
    inline def setModes(value: js.Array[TransitMode]): Self = StObject.set(x, "modes", value.asInstanceOf[js.Any])
    
    inline def setModesNull: Self = StObject.set(x, "modes", null)
    
    inline def setModesUndefined: Self = StObject.set(x, "modes", js.undefined)
    
    inline def setModesVarargs(value: TransitMode*): Self = StObject.set(x, "modes", js.Array(value*))
    
    inline def setRoutingPreference(value: TransitRoutePreference): Self = StObject.set(x, "routingPreference", value.asInstanceOf[js.Any])
    
    inline def setRoutingPreferenceNull: Self = StObject.set(x, "routingPreference", null)
    
    inline def setRoutingPreferenceUndefined: Self = StObject.set(x, "routingPreference", js.undefined)
  }
}
