package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectionsRequest extends StObject {
  
  /**
    * If <code>true</code>, instructs the Directions service to avoid ferries
    * where possible. Optional.
    */
  var avoidFerries: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If <code>true</code>, instructs the Directions service to avoid highways
    * where possible. Optional.
    */
  var avoidHighways: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If <code>true</code>, instructs the Directions service to avoid toll
    * roads where possible. Optional.
    */
  var avoidTolls: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Location of destination. This can be specified as either a string to be
    * geocoded, or a <code>LatLng</code>, or a <code>Place</code>. Required.
    */
  var destination: String | LatLng | Place | LatLngLiteral
  
  /**
    * Settings that apply only to requests where <code>travelMode</code> is
    * <code>DRIVING</code>. This object will have no effect for other travel
    * modes.
    */
  var drivingOptions: js.UndefOr[DrivingOptions] = js.undefined
  
  /**
    * A language identifier for the language in which results should be
    * returned, when possible. See the <a
    * href="https://developers.google.com/maps/faq#languagesupport">list of
    * supported languages</a>.
    */
  var language: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If set to <code>true</code>, the <code>DirectionsService</code> will
    * attempt to re-order the supplied intermediate waypoints to minimize
    * overall cost of the route. If waypoints are optimized, inspect
    * <code>DirectionsRoute.waypoint_order</code> in the response to determine
    * the new ordering.
    */
  var optimizeWaypoints: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Location of origin. This can be specified as either a string to be
    * geocoded, or a <code>LatLng</code>, or a <code>Place</code>. Required.
    */
  var origin: String | LatLng | Place | LatLngLiteral
  
  /**
    * Whether or not route alternatives should be provided. Optional.
    */
  var provideRouteAlternatives: js.UndefOr[Boolean] = js.undefined
  
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
  var region: js.UndefOr[String | Null] = js.undefined
  
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
    * Preferred unit system to use when displaying distance.
    * @defaultValue The unit system used in the country of origin.
    */
  var unitSystem: js.UndefOr[UnitSystem] = js.undefined
  
  /**
    * Array of intermediate waypoints. Directions are calculated from the
    * origin to the destination by way of each waypoint in this array. See the
    * <a
    * href="https://developers.google.com/maps/documentation/javascript/directions#UsageLimits">
    * developer&#39;s guide</a> for the maximum number of waypoints allowed.
    * Waypoints are not supported for transit directions. Optional.
    */
  var waypoints: js.UndefOr[js.Array[DirectionsWaypoint]] = js.undefined
}
object DirectionsRequest {
  
  inline def apply(
    destination: String | LatLng | Place | LatLngLiteral,
    origin: String | LatLng | Place | LatLngLiteral,
    travelMode: TravelMode
  ): DirectionsRequest = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], travelMode = travelMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DirectionsRequest] (val x: Self) extends AnyVal {
    
    inline def setAvoidFerries(value: Boolean): Self = StObject.set(x, "avoidFerries", value.asInstanceOf[js.Any])
    
    inline def setAvoidFerriesUndefined: Self = StObject.set(x, "avoidFerries", js.undefined)
    
    inline def setAvoidHighways(value: Boolean): Self = StObject.set(x, "avoidHighways", value.asInstanceOf[js.Any])
    
    inline def setAvoidHighwaysUndefined: Self = StObject.set(x, "avoidHighways", js.undefined)
    
    inline def setAvoidTolls(value: Boolean): Self = StObject.set(x, "avoidTolls", value.asInstanceOf[js.Any])
    
    inline def setAvoidTollsUndefined: Self = StObject.set(x, "avoidTolls", js.undefined)
    
    inline def setDestination(value: String | LatLng | Place | LatLngLiteral): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDrivingOptions(value: DrivingOptions): Self = StObject.set(x, "drivingOptions", value.asInstanceOf[js.Any])
    
    inline def setDrivingOptionsUndefined: Self = StObject.set(x, "drivingOptions", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageNull: Self = StObject.set(x, "language", null)
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setOptimizeWaypoints(value: Boolean): Self = StObject.set(x, "optimizeWaypoints", value.asInstanceOf[js.Any])
    
    inline def setOptimizeWaypointsUndefined: Self = StObject.set(x, "optimizeWaypoints", js.undefined)
    
    inline def setOrigin(value: String | LatLng | Place | LatLngLiteral): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setProvideRouteAlternatives(value: Boolean): Self = StObject.set(x, "provideRouteAlternatives", value.asInstanceOf[js.Any])
    
    inline def setProvideRouteAlternativesUndefined: Self = StObject.set(x, "provideRouteAlternatives", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionNull: Self = StObject.set(x, "region", null)
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setTransitOptions(value: TransitOptions): Self = StObject.set(x, "transitOptions", value.asInstanceOf[js.Any])
    
    inline def setTransitOptionsUndefined: Self = StObject.set(x, "transitOptions", js.undefined)
    
    inline def setTravelMode(value: TravelMode): Self = StObject.set(x, "travelMode", value.asInstanceOf[js.Any])
    
    inline def setUnitSystem(value: UnitSystem): Self = StObject.set(x, "unitSystem", value.asInstanceOf[js.Any])
    
    inline def setUnitSystemUndefined: Self = StObject.set(x, "unitSystem", js.undefined)
    
    inline def setWaypoints(value: js.Array[DirectionsWaypoint]): Self = StObject.set(x, "waypoints", value.asInstanceOf[js.Any])
    
    inline def setWaypointsUndefined: Self = StObject.set(x, "waypoints", js.undefined)
    
    inline def setWaypointsVarargs(value: DirectionsWaypoint*): Self = StObject.set(x, "waypoints", js.Array(value*))
  }
}
