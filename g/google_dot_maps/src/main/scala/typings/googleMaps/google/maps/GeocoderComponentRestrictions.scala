package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * <code>GeocoderComponentRestrictions</code> represents a set of filters that
  * resolve to a specific area. For details on how this works, see <a
  * href="https://developers.google.com/maps/documentation/javascript/geocoding#ComponentFiltering">
  * Geocoding Component Filtering</a>.
  */
trait GeocoderComponentRestrictions extends StObject {
  
  /**
    * Matches all the <code>administrative_area levels</code>. Optional.
    */
  var administrativeArea: js.UndefOr[String] = js.undefined
  
  /**
    * Matches a country name or a two letter ISO 3166-1 country code. Optional.
    */
  var country: js.UndefOr[String] = js.undefined
  
  /**
    * Matches against both <code>locality</code> and <code>sublocality</code>
    * types. Optional.
    */
  var locality: js.UndefOr[String] = js.undefined
  
  /**
    * Matches <code>postal_code</code> and <code>postal_code_prefix</code>.
    * Optional.
    */
  var postalCode: js.UndefOr[String] = js.undefined
  
  /**
    * Matches the long or short name of a <code>route</code>. Optional.
    */
  var route: js.UndefOr[String] = js.undefined
}
object GeocoderComponentRestrictions {
  
  inline def apply(): GeocoderComponentRestrictions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeocoderComponentRestrictions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GeocoderComponentRestrictions] (val x: Self) extends AnyVal {
    
    inline def setAdministrativeArea(value: String): Self = StObject.set(x, "administrativeArea", value.asInstanceOf[js.Any])
    
    inline def setAdministrativeAreaUndefined: Self = StObject.set(x, "administrativeArea", js.undefined)
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setLocality(value: String): Self = StObject.set(x, "locality", value.asInstanceOf[js.Any])
    
    inline def setLocalityUndefined: Self = StObject.set(x, "locality", js.undefined)
    
    inline def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    inline def setPostalCodeUndefined: Self = StObject.set(x, "postalCode", js.undefined)
    
    inline def setRoute(value: String): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    
    inline def setRouteUndefined: Self = StObject.set(x, "route", js.undefined)
  }
}
