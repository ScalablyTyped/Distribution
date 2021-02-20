package typings.googleMaps.mod

import typings.googleMaps.googleMapsStrings.now
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectionsRequest extends StObject {
  
  /**
    * If set to `true`, specifies that the Directions service may provide more than one route alternative in the response.
    * Note that providing route alternatives may increase the response time from the server.
    */
  var alternatives: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies the desired time of arrival for transit directions, in seconds since midnight, January 1, 1970 UTC.
    * You can specify either `departure_time` or `arrival_time`, but not both.
    * Note that `arrival_time` must be specified as an integer.
    */
  var arrival_time: js.UndefOr[Date | Double] = js.native
  
  /** Indicates that the calculated route(s) should avoid the indicated features. */
  var avoid: js.UndefOr[js.Array[TravelRestriction]] = js.native
  
  /**
    * Specifies the desired time of departure. You can specify the time as an integer in seconds since midnight, January 1, 1970 UTC.
    * Alternatively, you can specify a value of `now`, which sets the departure time to the current time (correct to the nearest second).
    *
    * The departure time may be specified in two cases:
    *  - For requests where the travel mode is transit: You can optionally specify one of `departure_time` or `arrival_time`.
    *    If neither time is specified, the `departure_time` defaults to now (that is, the departure time defaults to the current time).
    *  - For requests where the travel mode is driving: You can specify the `departure_time` to receive a route and trip duration
    *    (response field: `duration_in_traffic`) that take traffic conditions into account.
    *    This option is only available if the request contains a valid API key, or a valid Google Maps APIs Premium Plan client ID
    *    and signature. The `departure_time` must be set to the current time or some time in the future. It cannot be in the past.
    */
  var departure_time: js.UndefOr[Date | Double | now] = js.native
  
  /**
    * The address, textual latitude/longitude value, or place ID to which you wish to calculate directions.
    * The options for the `destination` parameter are the same as for the `origin` parameter, described above
    */
  var destination: LatLng = js.native
  
  /**
    * The language in which to return results.
    *
    *  - If `language` is not supplied, the API attempts to use the preferred language as specified in the `Accept-Language` header,
    *    or the native language of the domain from which the request is sent.
    *  - The API does its best to provide a street address that is readable for both the user and locals. To achieve that goal,
    *    it returns street addresses in the local language, transliterated to a script readable by the user if necessary,
    *    observing the preferred language. All other addresses are returned in the preferred language.
    *    Address components are all returned in the same language, which is chosen from the first component.
    *  - If a name is not available in the preferred language, the API uses the closest match.
    *  - The preferred language has a small influence on the set of results that the API chooses to return,
    *    and the order in which they are returned. The geocoder interprets abbreviations differently depending on language,
    *    such as the abbreviations for street types, or synonyms that may be valid in one language but not in another.
    *    For example, utca and tér are synonyms for street in Hungarian.
    */
  var language: js.UndefOr[Language] = js.native
  
  /**
    * Specifies the mode of transport to use when calculating directions
    *
    * @default TravelMode.driving
    */
  var mode: js.UndefOr[TravelMode] = js.native
  
  /** Wherever to optimize the provided route by rearranging the waypoints in a more efficient order. */
  var optimize: js.UndefOr[Boolean] = js.native
  
  /**
    * The address, textual latitude/longitude value, or place ID from which you wish to calculate directions.
    *  - If you pass an address, the Directions service geocodes the string and converts it to a latitude/longitude coordinate
    *    to calculate directions. This coordinate may be different from that returned by the Geocoding API, for example a building
    *    entrance rather than its center.
    *
    *    `origin=24+Sussex+Drive+Ottawa+ON`
    *
    *  - If you pass coordinates, they are used unchanged to calculate directions. Ensure that no space exists between the latitude
    *    and longitude values.
    *
    *    `origin=41.43206,-81.38992`
    *
    *  - Place IDs must be prefixed with `place_id:`. The place ID may only be specified if the request includes an API key or a
    *    Google Maps APIs Premium Plan client ID. You can retrieve place IDs from the Geocoding API and the Places SDK
    *    (including Place Autocomplete). For an example using place IDs from Place Autocomplete, see [Place Autocomplete and
    *    Directions](https://developers.google.com/maps/documentation/javascript/examples/places-autocomplete-directions).
    *
    *    `origin=place_id:ChIJ3S-JXmauEmsRUcIaWtf4MzE`
    */
  var origin: LatLng = js.native
  
  /** Specifies the region code, specified as a ccTLD ("top-level domain") two-character value. */
  var region: js.UndefOr[String] = js.native
  
  /**
    * Specifies the assumptions to use when calculating time in traffic.
    * This setting affects the value returned in the `duration_in_traffic` field in the response, which contains the predicted time
    * in traffic based on historical averages. The `traffic_model` parameter may only be specified for driving directions
    * where the request includes a `departure_time`, and only if the request includes an API key or a Google Maps APIs Premium Plan client ID.
    *
    * The default value of `best_guess` will give the most useful predictions for the vast majority of use cases.
    * It is possible the `best_guess` travel time prediction may be *shorter* than `optimistic`, or alternatively,
    * *longer* than `pessimistic`, due to the way the `best_guess` prediction model integrates live traffic information.
    *
    * @default TrafficModel.best_guess
    */
  var traffic_model: js.UndefOr[TrafficModel] = js.native
  
  /**
    * Specifies one or more preferred modes of transit.
    * This parameter may only be specified for transit directions, and only if the request includes an API key or
    * a Google Maps APIs Premium Plan client ID.
    */
  var transit_mode: js.UndefOr[js.Array[TransitMode]] = js.native
  
  /**
    * Specifies preferences for transit routes.
    * Using this parameter, you can bias the options returned, rather than accepting the default best route chosen by the API.
    * This parameter may only be specified for transit directions, and only if the request includes an API key or
    * a Google Maps APIs Premium Plan client ID.
    */
  var transit_routing_preference: js.UndefOr[TransitRoutingPreference] = js.native
  
  /** Specifies the unit system to use when displaying results. */
  var units: js.UndefOr[UnitSystem] = js.native
  
  /**
    * Specifies an array of waypoints.
    * Waypoints alter a route by routing it through the specified location(s).
    * A waypoint is specified as a latitude/longitude coordinate, an encoded polyline, a place ID, or an address which will be geocoded.
    * Encoded polylines must be prefixed with `enc:` and followed by a colon (`:`). Place IDs must be prefixed with `place_id:`.
    * The place ID may only be specified if the request includes an API key or a Google Maps APIs Premium Plan client ID.
    * Waypoints are only supported for driving, walking and bicycling directions.
    */
  var waypoints: js.UndefOr[js.Array[LatLng]] = js.native
}
object DirectionsRequest {
  
  @scala.inline
  def apply(destination: LatLng, origin: LatLng): DirectionsRequest = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionsRequest]
  }
  
  @scala.inline
  implicit class DirectionsRequestMutableBuilder[Self <: DirectionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlternatives(value: Boolean): Self = StObject.set(x, "alternatives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlternativesUndefined: Self = StObject.set(x, "alternatives", js.undefined)
    
    @scala.inline
    def setArrival_time(value: Date | Double): Self = StObject.set(x, "arrival_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrival_timeUndefined: Self = StObject.set(x, "arrival_time", js.undefined)
    
    @scala.inline
    def setAvoid(value: js.Array[TravelRestriction]): Self = StObject.set(x, "avoid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvoidUndefined: Self = StObject.set(x, "avoid", js.undefined)
    
    @scala.inline
    def setAvoidVarargs(value: TravelRestriction*): Self = StObject.set(x, "avoid", js.Array(value :_*))
    
    @scala.inline
    def setDeparture_time(value: Date | Double | now): Self = StObject.set(x, "departure_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeparture_timeUndefined: Self = StObject.set(x, "departure_time", js.undefined)
    
    @scala.inline
    def setDestination(value: LatLng): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage(value: Language): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setMode(value: TravelMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setOptimize(value: Boolean): Self = StObject.set(x, "optimize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptimizeUndefined: Self = StObject.set(x, "optimize", js.undefined)
    
    @scala.inline
    def setOrigin(value: LatLng): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    @scala.inline
    def setTraffic_model(value: TrafficModel): Self = StObject.set(x, "traffic_model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTraffic_modelUndefined: Self = StObject.set(x, "traffic_model", js.undefined)
    
    @scala.inline
    def setTransit_mode(value: js.Array[TransitMode]): Self = StObject.set(x, "transit_mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransit_modeUndefined: Self = StObject.set(x, "transit_mode", js.undefined)
    
    @scala.inline
    def setTransit_modeVarargs(value: TransitMode*): Self = StObject.set(x, "transit_mode", js.Array(value :_*))
    
    @scala.inline
    def setTransit_routing_preference(value: TransitRoutingPreference): Self = StObject.set(x, "transit_routing_preference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransit_routing_preferenceUndefined: Self = StObject.set(x, "transit_routing_preference", js.undefined)
    
    @scala.inline
    def setUnits(value: UnitSystem): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitsUndefined: Self = StObject.set(x, "units", js.undefined)
    
    @scala.inline
    def setWaypoints(value: js.Array[LatLng]): Self = StObject.set(x, "waypoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaypointsUndefined: Self = StObject.set(x, "waypoints", js.undefined)
    
    @scala.inline
    def setWaypointsVarargs(value: LatLng*): Self = StObject.set(x, "waypoints", js.Array(value :_*))
  }
}
