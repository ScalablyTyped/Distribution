package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapRestriction extends StObject {
  
  /**
    * When set, a user can only pan and zoom inside the given bounds. Bounds
    * can restrict both longitude and latitude, or can restrict latitude only.
    * For latitude-only bounds use west and east longitudes of -180 and 180,
    * respectively, for example, <code>latLngBounds: {north: northLat, south:
    * southLat, west: -180, east: 180}</code>.
    */
  var latLngBounds: LatLngBounds | LatLngBoundsLiteral
  
  /**
    * Bounds can be made more restrictive by setting the
    * <code>strictBounds</code> flag to <code>true</code>. This reduces how far
    * a user can zoom out, ensuring that everything outside of the restricted
    * bounds stays hidden. The default is <code>false</code>, meaning that a
    * user can zoom out until the entire bounded area is in view, possibly
    * including areas outside the bounded area.
    */
  var strictBounds: js.UndefOr[Boolean] = js.undefined
}
object MapRestriction {
  
  inline def apply(latLngBounds: LatLngBounds | LatLngBoundsLiteral): MapRestriction = {
    val __obj = js.Dynamic.literal(latLngBounds = latLngBounds.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapRestriction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MapRestriction] (val x: Self) extends AnyVal {
    
    inline def setLatLngBounds(value: LatLngBounds | LatLngBoundsLiteral): Self = StObject.set(x, "latLngBounds", value.asInstanceOf[js.Any])
    
    inline def setStrictBounds(value: Boolean): Self = StObject.set(x, "strictBounds", value.asInstanceOf[js.Any])
    
    inline def setStrictBoundsUndefined: Self = StObject.set(x, "strictBounds", js.undefined)
  }
}
