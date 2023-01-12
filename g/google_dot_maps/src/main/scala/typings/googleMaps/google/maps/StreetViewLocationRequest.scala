package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Street View request to be sent with <code>getPanorama</code>.
  * <code>StreetViewLocationRequest</code> lets you search for a Street View
  * panoroma at a specified location.
  */
trait StreetViewLocationRequest extends StObject {
  
  /**
    * Specifies the location where to search for a Street View panorama.
    */
  var location: js.UndefOr[LatLng | Null | LatLngLiteral] = js.undefined
  
  /**
    * Sets a preference for which panorama should be found within the radius:
    * the one nearest to the provided location, or the best one within the
    * radius.
    */
  var preference: js.UndefOr[StreetViewPreference | Null] = js.undefined
  
  /**
    * Sets a radius in meters in which to search for a panorama.
    * @defaultValue <code>50</code>
    */
  var radius: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Specifies the source of panoramas to search. This allows a restriction to
    * search for just outdoor panoramas for example.
    * @defaultValue {@link google.maps.StreetViewSource.DEFAULT}
    */
  var source: js.UndefOr[StreetViewSource | Null] = js.undefined
}
object StreetViewLocationRequest {
  
  inline def apply(): StreetViewLocationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreetViewLocationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StreetViewLocationRequest] (val x: Self) extends AnyVal {
    
    inline def setLocation(value: LatLng | LatLngLiteral): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationNull: Self = StObject.set(x, "location", null)
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setPreference(value: StreetViewPreference): Self = StObject.set(x, "preference", value.asInstanceOf[js.Any])
    
    inline def setPreferenceNull: Self = StObject.set(x, "preference", null)
    
    inline def setPreferenceUndefined: Self = StObject.set(x, "preference", js.undefined)
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusNull: Self = StObject.set(x, "radius", null)
    
    inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    inline def setSource(value: StreetViewSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceNull: Self = StObject.set(x, "source", null)
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
