package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A distance matrix query sent by the <code>DistanceMatrixService</code>
  * containing arrays of origin and destination locations, and various options
  * for computing metrics.
  */
trait DistanceMatrixRequest extends StObject {
  
  /**
    * If <code>true</code>, instructs the Distance Matrix service to avoid
    * ferries where possible. Optional.
    */
  var avoidFerries: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If <code>true</code>, instructs the Distance Matrix service to avoid
    * highways where possible. Optional.
    */
  var avoidHighways: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If <code>true</code>, instructs the Distance Matrix service to avoid toll
    * roads where possible. Optional.
    */
  var avoidTolls: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An array containing destination address strings, or <code>LatLng</code>,
    * or <code>Place</code> objects, to which to calculate distance and time.
    * Required.
    */
  var destinations: js.Array[String | LatLng | LatLngLiteral | Place]
  
  /**
    * Settings that apply only to requests where <code>travelMode</code> is
    * <code>DRIVING</code>. This object will have no effect for other travel
    * modes.
    */
  var drivingOptions: js.UndefOr[DrivingOptions] = js.undefined
  
  /**
    * Available only in the v=beta channel: https://goo.gle/3oAthT3.
    * A language identifier for the language in which results should be
    * returned, when possible. See the <a
    * href="https://developers.google.com/maps/faq#languagesupport">list of
    * supported languages</a>.
    */
  var language: js.UndefOr[Null | String] = js.undefined
  
  /**
    * An array containing origin address strings, or <code>LatLng</code>, or
    * <code>Place</code> objects, from which to calculate distance and time.
    * Required.
    */
  var origins: js.Array[String | LatLng | LatLngLiteral | Place]
  
  /**
    * Region code used as a bias for geocoding requests. The region code
    * accepts a <a
    * href="https://en.wikipedia.org/wiki/List_of_Internet_top-level_domains#Country_code_top-level_domains">ccTLD
    * (&quot;top-level domain&quot;)</a> two-character value. Most ccTLD codes
    * are identical to ISO 3166-1 codes, with some notable exceptions. For
    * example, the United Kingdom&#39;s ccTLD is &quot;uk&quot;
    * (<code>.co.uk</code>) while its ISO 3166-1 code is &quot;gb&quot;
    * (technically for the entity of &quot;The United Kingdom of Great Britain
    * and Northern Ireland&quot;).
    */
  var region: js.UndefOr[Null | String] = js.undefined
  
  /**
    * Settings that apply only to requests where <code>travelMode</code> is
    * TRANSIT. This object will have no effect for other travel modes.
    */
  var transitOptions: js.UndefOr[TransitOptions] = js.undefined
  
  /**
    * Type of routing requested. Required.
    */
  var travelMode: TravelMode
  
  /**
    * Preferred unit system to use when displaying distance. Optional; defaults
    * to metric.
    */
  var unitSystem: js.UndefOr[UnitSystem] = js.undefined
}
object DistanceMatrixRequest {
  
  inline def apply(
    destinations: js.Array[String | LatLng | LatLngLiteral | Place],
    origins: js.Array[String | LatLng | LatLngLiteral | Place],
    travelMode: TravelMode
  ): DistanceMatrixRequest = {
    val __obj = js.Dynamic.literal(destinations = destinations.asInstanceOf[js.Any], origins = origins.asInstanceOf[js.Any], travelMode = travelMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistanceMatrixRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DistanceMatrixRequest] (val x: Self) extends AnyVal {
    
    inline def setAvoidFerries(value: Boolean): Self = StObject.set(x, "avoidFerries", value.asInstanceOf[js.Any])
    
    inline def setAvoidFerriesUndefined: Self = StObject.set(x, "avoidFerries", js.undefined)
    
    inline def setAvoidHighways(value: Boolean): Self = StObject.set(x, "avoidHighways", value.asInstanceOf[js.Any])
    
    inline def setAvoidHighwaysUndefined: Self = StObject.set(x, "avoidHighways", js.undefined)
    
    inline def setAvoidTolls(value: Boolean): Self = StObject.set(x, "avoidTolls", value.asInstanceOf[js.Any])
    
    inline def setAvoidTollsUndefined: Self = StObject.set(x, "avoidTolls", js.undefined)
    
    inline def setDestinations(value: js.Array[String | LatLng | LatLngLiteral | Place]): Self = StObject.set(x, "destinations", value.asInstanceOf[js.Any])
    
    inline def setDestinationsVarargs(value: (String | LatLng | LatLngLiteral | Place)*): Self = StObject.set(x, "destinations", js.Array(value*))
    
    inline def setDrivingOptions(value: DrivingOptions): Self = StObject.set(x, "drivingOptions", value.asInstanceOf[js.Any])
    
    inline def setDrivingOptionsUndefined: Self = StObject.set(x, "drivingOptions", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageNull: Self = StObject.set(x, "language", null)
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setOrigins(value: js.Array[String | LatLng | LatLngLiteral | Place]): Self = StObject.set(x, "origins", value.asInstanceOf[js.Any])
    
    inline def setOriginsVarargs(value: (String | LatLng | LatLngLiteral | Place)*): Self = StObject.set(x, "origins", js.Array(value*))
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionNull: Self = StObject.set(x, "region", null)
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setTransitOptions(value: TransitOptions): Self = StObject.set(x, "transitOptions", value.asInstanceOf[js.Any])
    
    inline def setTransitOptionsUndefined: Self = StObject.set(x, "transitOptions", js.undefined)
    
    inline def setTravelMode(value: TravelMode): Self = StObject.set(x, "travelMode", value.asInstanceOf[js.Any])
    
    inline def setUnitSystem(value: UnitSystem): Self = StObject.set(x, "unitSystem", value.asInstanceOf[js.Any])
    
    inline def setUnitSystemUndefined: Self = StObject.set(x, "unitSystem", js.undefined)
  }
}
