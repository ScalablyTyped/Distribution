package typings
package atGoogleMapsLib.mapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleMapsClient extends js.Object {
  /**
    * The Directions API is a service that calculates directions between locations using an HTTP request.
    *
    * With the Directions API, you can:
    *  - Search for directions for several modes of transportation, including transit, driving, walking or cycling.
    *  - Return multi-part directions using a series of waypoints.
    *  - Specify origins, destinations, and waypoints as text strings
    *    (e.g. "Chicago, IL" or "Darwin, NT, Australia"), or as latitude/longitude coordinates, or as place IDs.
    *
    * The API returns the most efficient routes when calculating directions. Travel time is the primary factor optimized,
    * but the API may also take into account other factors such as distance, number of turns and many more when deciding
    * which route is the most efficient.
    *
    * **Tip:** Calculating directions is a time and resource intensive task. Whenever possible, use the service to calculate
    * known addresses ahead of time and store the results in a
    * [**temporary cache**](https://developers.google.com/maps/documentation/directions/policies#pre-fetching-caching-or-storage-of-content)
    * of your own design.
    *
    * **Note:** This service is not designed to respond in real time to user input. For dynamic directions calculations
    * (for example, within a user interface element), consult the documentation for the
    * [Maps JavaScript API Directions Service](https://developers.google.com/maps/documentation/javascript/directions)
    *
    * @see https://developers.google.com/maps/documentation/directions/intro
    */
  @JSName("directions")
  var directions_Original: GoogleMapsClientEndpoint[DirectionsRequest, DirectionsResponse] = js.native
  /**
    * The Distance Matrix API is a service that provides travel distance and time for a matrix of origins and destinations.
    * The API returns information based on the recommended route between start and end points, as calculated by the Google Maps API,
    * and consists of rows containing duration and distance values for each pair.
    *
    * @see https://developers.google.com/maps/documentation/distance-matrix/intro
    */
  @JSName("distanceMatrix")
  var distanceMatrix_Original: GoogleMapsClientEndpoint[DistanceMatrixRequest, DistanceMatrixResponse] = js.native
  /**
    * You may request sampled elevation data along paths, allowing you to calculate elevation changes along routes.
    * With the Elevation API, you can develop hiking and biking applications, positioning applications,
    * or low resolution surveying applications.
    *
    * @see https://developers.google.com/maps/documentation/elevation/intro
    */
  @JSName("elevationAlongPath")
  var elevationAlongPath_Original: GoogleMapsClientEndpoint[ElevationAlongPathRequest, ElevationResponse] = js.native
  /**
    * The Elevation API provides a simple interface to query locations on the earth for elevation data. With the Elevation API,
    * you can develop hiking and biking applications, positioning applications, or low resolution surveying applications.
    *
    * Elevation data is available for all locations on the surface of the earth, including depth locations on the ocean floor
    * (which return negative values). In those cases where Google does not possess exact elevation measurements at the precise
    * location you request, the service interpolates and returns an averaged value using the four nearest locations.
    * Elevation values are expressed relative to local mean sea level (LMSL).
    *
    * You access the Elevation API through an HTTP interface. Users of the Maps JavaScript API may also access this API directly
    * by using the `ElevationService()` object.
    * (See [Elevation Service](https://developers.google.com/maps/documentation/javascript/elevation) for more information.)
    *
    * @see https://developers.google.com/maps/documentation/elevation/intro
    */
  @JSName("elevation")
  var elevation_Original: GoogleMapsClientEndpoint[ElevationRequest, ElevationResponse] = js.native
  /**
    * The Places API allows you to query for place information on a variety of categories, such as: establishments,
    * prominent points of interest, geographic locations, and more. You can search for places either by proximity or a text string.
    * A Place Search returns a list of places along with summary information about each place; additional information is available
    * via a [Place Details](https://developers.google.com/places/web-service/details) query.
    *
    * A Find Place request takes a text input, and returns a place.
    * The text input can be any kind of Places data, for example, a name, address, or phone number.
    *
    * @see https://developers.google.com/places/web-service/search#FindPlaceRequests
    */
  @JSName("findPlace")
  var findPlace_Original: GoogleMapsClientEndpoint[FindPlaceRequest, FindPlaceFromTextResponse] = js.native
  /**
    * **Geocoding** is the process of converting addresses (like "1600 Amphitheatre Parkway, Mountain View, CA")
    * into geographic coordinates (like latitude 37.423021 and longitude -122.083739),
    * which you can use to place markers on a map, or position the map.
    *
    * **Note:** This service is generally designed for geocoding static (known in advance) addresses for placement
    * of application content on a map; this service is not designed to respond in real time to user input.
    * For dynamic geocoding (for example, within a user interface element), consult the documentation for the
    * [Maps JavaScript API client geocoder](https://developers.google.com/maps/documentation/javascript/geocoding) and/or the
    * [Google Play services Location APIs](https://developer.android.com/google/play-services/location.html).
    *
    * **Tip:** Geocoding is a time and resource intensive task. Whenever possible, pre-geocode known addresses
    * (using the Geocoding API described here or another geocoding service), and store your results in a
    * [**temporary cache**](https://developers.google.com/maps/documentation/geocoding/policies#pre-fetching-caching-or-storage-of-content)
    * of your own design.
    *
    * @see https://developers.google.com/maps/documentation/geocoding/intro#GeocodingRequests
    */
  @JSName("geocode")
  var geocode_Original: GoogleMapsClientEndpoint[GeocodingRequest, GeocodingResponse[GeocodingResponseStatus]] = js.native
  /**
    * The Geolocation API returns a location and accuracy radius based on information about cell towers and WiFi nodes
    * that the mobile client can detect. This document describes the protocol used to send this data to the server and
    * to return a response to the client.
    *
    * @see https://developers.google.com/maps/documentation/geolocation/intro
    */
  @JSName("geolocate")
  var geolocate_Original: GoogleMapsClientEndpoint[GeolocationRequest, GeolocationResponse] = js.native
  /**
    * The Roads API takes up to 100 independent coordinates, and returns the closest road segment for each point.
    * The points passed do not need to be part of a continuous path.
    *
    * If you are working with sequential GPS points, use [Snap to Roads](https://developers.google.com/maps/documentation/roads/snap).
    *
    * @see https://developers.google.com/maps/documentation/roads/nearest
    */
  @JSName("nearestRoads")
  var nearestRoads_Original: GoogleMapsClientEndpoint[NearestRoadsRequest, NearestRoadsResponse] = js.native
  /**
    * Once you have a `place_id` from a Place Search, you can request more details about a particular establishment
    * or point of interest by initiating a Place Details request. A Place Details request returns more comprehensive
    * information about the indicated place such as its complete address, phone number, user rating and reviews.
    *
    * @see https://developers.google.com/places/web-service/details
    */
  @JSName("place")
  var place_Original: GoogleMapsClientEndpoint[PlaceDetailsRequest, PlaceDetailsResponse] = js.native
  /**
    * The Place Autocomplete service is a web service that returns place predictions in response to an HTTP request.
    * The request specifies a textual search string and optional geographic bounds.
    * The service can be used to provide autocomplete functionality for text-based geographic searches,
    * by returning places such as businesses, addresses and points of interest as a user types.
    *
    * @see https://developers.google.com/places/web-service/autocomplete
    */
  @JSName("placesAutoComplete")
  var placesAutoComplete_Original: GoogleMapsClientEndpoint[PlaceAutocompleteRequest, PlaceAutocompleteResponse] = js.native
  /**
    * A Nearby Search lets you search for places within a specified area.
    * You can refine your search request by supplying keywords or specifying the type of place you are searching for.
    *
    * @see https://developers.google.com/places/web-service/search#PlaceSearchRequests
    */
  @JSName("placesNearby")
  var placesNearby_Original: GoogleMapsClientEndpoint[PlacesNearbyRequest, PlaceSearchResponse] = js.native
  /**
    * The Place Photo service, part of the Places API, is a read- only API that allows you to add high quality photographic content
    * to your application. The Place Photo service gives you access to the millions of photos stored in the Places database.
    * When you get place information using a Place Details request, photo references will be returned for relevant photographic content.
    * The Nearby Search and Text Search requests also return a single photo reference per place, when relevant.
    * Using the Photo service you can then access the referenced photos and resize the image to the optimal size for your application.
    *
    * @see https://developers.google.com/places/web-service/photos
    */
  @JSName("placesPhoto")
  var placesPhoto_Original: GoogleMapsClientEndpoint[PlacePhotoRequest, PlacePhotoResponse] = js.native
  /**
    * The Query Autocomplete service can be used to provide a query prediction for text-based geographic searches,
    * by returning suggested queries as you type.
    *
    * The Query Autocomplete service allows you to add on-the-fly geographic query predictions to your application.
    * Instead of searching for a specific location, a user can type in a categorical search, such as "pizza near New York"
    * and the service responds with a list of suggested queries matching the string. As the Query Autocomplete service can match
    * on both full words and substrings, applications can send queries as the user types to provide on-the-fly predictions.
    *
    * @see https://developers.google.com/places/web-service/query
    */
  @JSName("placesQueryAutoComplete")
  var placesQueryAutoComplete_Original: GoogleMapsClientEndpoint[QueryAutocompleteRequest, QueryAutocompleteResponse] = js.native
  /**
    * The Google Places API Radar Search Service allows you to search for up to 200 places at once,
    * but with less detail than is typically returned from a Text Search or Nearby Search request.
    * With Radar Search, you can create applications that help users identify specific areas of interest within a geographic area.
    *
    * The search response will include up to 200 places, and will include only the following information about each place:
    *  - The `geometry` field containing geographic coordinates.
    *  - The `place_id`, which you can use in a Place Details request to get more information about the place.
    *
    * @deprecated Radar search is deprecated as of June 30, 2018. After that time, this feature will no longer be available.
    *
    * @see https://developers.google.com/places/web-service/search#RadarSearchRequests
    */
  @JSName("placesRadar")
  var placesRadar_Original: GoogleMapsClientEndpoint[PlaceRadarRequest, PlaceSearchResponse] = js.native
  /**
    * The Google Places API Text Search Service is a web service that returns information about a set of places
    * based on a string — for example "pizza in New York" or "shoe stores near Ottawa" or "123 Main Street".
    * The service responds with a list of places matching the text string and any location bias that has been set.
    *
    * The service is especially useful for making
    * [ambiguous address queries](https://developers.google.com/maps/documentation/geocoding/best-practices) in an automated system,
    * and non-address components of the string may match businesses as well as addresses.
    * Examples of ambiguous address queries are incomplete addresses, poorly formatted addresses,
    * or a request that includes non-address components such as business names.
    *
    * The search response will include a list of places. You can send a Place Details request
    * for more information about any of the places in the response.
    *
    * @see https://developers.google.com/places/web-service/search#TextSearchRequests
    */
  @JSName("places")
  var places_Original: GoogleMapsClientEndpoint[PlacesRequest, PlaceSearchResponse] = js.native
  /**
    * Reverse geocoding is the process of converting geographic coordinates into a human-readable address.
    *
    * @see https://developers.google.com/maps/documentation/geocoding/intro#ReverseGeocoding
    */
  @JSName("reverseGeocode")
  var reverseGeocode_Original: GoogleMapsClientEndpoint[ReverseGeocodingRequest, ReverseGeocodingResponse] = js.native
  /**
    * The Roads API takes up to 100 GPS points collected along a route, and returns a similar set of data,
    * with the points snapped to the most likely roads the vehicle was traveling along.
    * Optionally, you can request that the points be interpolated, resulting in a path that smoothly follows the geometry of the road.
    *
    * @see https://developers.google.com/maps/documentation/roads/snap
    */
  @JSName("snapToRoads")
  var snapToRoads_Original: GoogleMapsClientEndpoint[SnapToRoadsRequest, SnapToRoadsResponse] = js.native
  /**
    * The Roads API returns the posted speed limit for a given road segment.
    * In the case of road segments with variable speed limits, the default speed limit for the segment is returned.
    *
    * The accuracy of speed limit data returned by the Roads API cannot be guaranteed.
    * The speed limit data provided is not real-time, and may be estimated, inaccurate, incomplete, and/or outdated.
    * You may report inaccuracies in our speed limit data by filing a case in the
    * [Google Cloud Support Portal](https://developers.google.com/maps/premium/support#support_portal).
    *
    * @see https://developers.google.com/maps/documentation/roads/speed-limits
    */
  @JSName("snappedSpeedLimits")
  var snappedSpeedLimits_Original: GoogleMapsClientEndpoint[SnappedSpeedLimitsRequest, SpeedLimitsResponse] = js.native
  /**
    * The Roads API returns the posted speed limit for a given road segment.
    * In the case of road segments with variable speed limits, the default speed limit for the segment is returned.
    *
    * The accuracy of speed limit data returned by the Roads API cannot be guaranteed.
    * The speed limit data provided is not real-time, and may be estimated, inaccurate, incomplete, and/or outdated.
    * You may report inaccuracies in our speed limit data by filing a case in the
    * [Google Cloud Support Portal](https://developers.google.com/maps/premium/support#support_portal).
    *
    * @see https://developers.google.com/maps/documentation/roads/speed-limits
    */
  @JSName("speedLimits")
  var speedLimits_Original: GoogleMapsClientEndpoint[SpeedLimitsRequest, SpeedLimitsResponse] = js.native
  /**
    * The Time Zone API provides a simple interface to request the time zone for locations on the surface of the earth,
    * as well as the time offset from UTC for each of those locations. You request the time zone information for
    * a specific latitude/longitude pair and date. The API returns the name of that time zone, the time offset from UTC,
    * and the daylight savings offset.
    *
    * @see https://developers.google.com/maps/documentation/timezone/intro
    */
  @JSName("timezone")
  var timezone_Original: GoogleMapsClientEndpoint[TimeZoneRequest, TimeZoneResponse] = js.native
  /**
    * The Directions API is a service that calculates directions between locations using an HTTP request.
    *
    * With the Directions API, you can:
    *  - Search for directions for several modes of transportation, including transit, driving, walking or cycling.
    *  - Return multi-part directions using a series of waypoints.
    *  - Specify origins, destinations, and waypoints as text strings
    *    (e.g. "Chicago, IL" or "Darwin, NT, Australia"), or as latitude/longitude coordinates, or as place IDs.
    *
    * The API returns the most efficient routes when calculating directions. Travel time is the primary factor optimized,
    * but the API may also take into account other factors such as distance, number of turns and many more when deciding
    * which route is the most efficient.
    *
    * **Tip:** Calculating directions is a time and resource intensive task. Whenever possible, use the service to calculate
    * known addresses ahead of time and store the results in a
    * [**temporary cache**](https://developers.google.com/maps/documentation/directions/policies#pre-fetching-caching-or-storage-of-content)
    * of your own design.
    *
    * **Note:** This service is not designed to respond in real time to user input. For dynamic directions calculations
    * (for example, within a user interface element), consult the documentation for the
    * [Maps JavaScript API Directions Service](https://developers.google.com/maps/documentation/javascript/directions)
    *
    * @see https://developers.google.com/maps/documentation/directions/intro
    */
  def directions(query: DirectionsRequest): RequestHandle[DirectionsResponse] = js.native
  def directions(query: DirectionsRequest, callback: ResponseCallback[DirectionsResponse]): RequestHandle[DirectionsResponse] = js.native
  /**
    * The Distance Matrix API is a service that provides travel distance and time for a matrix of origins and destinations.
    * The API returns information based on the recommended route between start and end points, as calculated by the Google Maps API,
    * and consists of rows containing duration and distance values for each pair.
    *
    * @see https://developers.google.com/maps/documentation/distance-matrix/intro
    */
  def distanceMatrix(query: DistanceMatrixRequest): RequestHandle[DistanceMatrixResponse] = js.native
  def distanceMatrix(query: DistanceMatrixRequest, callback: ResponseCallback[DistanceMatrixResponse]): RequestHandle[DistanceMatrixResponse] = js.native
  /**
    * The Elevation API provides a simple interface to query locations on the earth for elevation data. With the Elevation API,
    * you can develop hiking and biking applications, positioning applications, or low resolution surveying applications.
    *
    * Elevation data is available for all locations on the surface of the earth, including depth locations on the ocean floor
    * (which return negative values). In those cases where Google does not possess exact elevation measurements at the precise
    * location you request, the service interpolates and returns an averaged value using the four nearest locations.
    * Elevation values are expressed relative to local mean sea level (LMSL).
    *
    * You access the Elevation API through an HTTP interface. Users of the Maps JavaScript API may also access this API directly
    * by using the `ElevationService()` object.
    * (See [Elevation Service](https://developers.google.com/maps/documentation/javascript/elevation) for more information.)
    *
    * @see https://developers.google.com/maps/documentation/elevation/intro
    */
  def elevation(query: ElevationRequest): RequestHandle[ElevationResponse] = js.native
  def elevation(query: ElevationRequest, callback: ResponseCallback[ElevationResponse]): RequestHandle[ElevationResponse] = js.native
  /**
    * You may request sampled elevation data along paths, allowing you to calculate elevation changes along routes.
    * With the Elevation API, you can develop hiking and biking applications, positioning applications,
    * or low resolution surveying applications.
    *
    * @see https://developers.google.com/maps/documentation/elevation/intro
    */
  def elevationAlongPath(query: ElevationAlongPathRequest): RequestHandle[ElevationResponse] = js.native
  def elevationAlongPath(query: ElevationAlongPathRequest, callback: ResponseCallback[ElevationResponse]): RequestHandle[ElevationResponse] = js.native
  /**
    * The Places API allows you to query for place information on a variety of categories, such as: establishments,
    * prominent points of interest, geographic locations, and more. You can search for places either by proximity or a text string.
    * A Place Search returns a list of places along with summary information about each place; additional information is available
    * via a [Place Details](https://developers.google.com/places/web-service/details) query.
    *
    * A Find Place request takes a text input, and returns a place.
    * The text input can be any kind of Places data, for example, a name, address, or phone number.
    *
    * @see https://developers.google.com/places/web-service/search#FindPlaceRequests
    */
  def findPlace(query: FindPlaceRequest): RequestHandle[FindPlaceFromTextResponse] = js.native
  def findPlace(query: FindPlaceRequest, callback: ResponseCallback[FindPlaceFromTextResponse]): RequestHandle[FindPlaceFromTextResponse] = js.native
  /**
    * **Geocoding** is the process of converting addresses (like "1600 Amphitheatre Parkway, Mountain View, CA")
    * into geographic coordinates (like latitude 37.423021 and longitude -122.083739),
    * which you can use to place markers on a map, or position the map.
    *
    * **Note:** This service is generally designed for geocoding static (known in advance) addresses for placement
    * of application content on a map; this service is not designed to respond in real time to user input.
    * For dynamic geocoding (for example, within a user interface element), consult the documentation for the
    * [Maps JavaScript API client geocoder](https://developers.google.com/maps/documentation/javascript/geocoding) and/or the
    * [Google Play services Location APIs](https://developer.android.com/google/play-services/location.html).
    *
    * **Tip:** Geocoding is a time and resource intensive task. Whenever possible, pre-geocode known addresses
    * (using the Geocoding API described here or another geocoding service), and store your results in a
    * [**temporary cache**](https://developers.google.com/maps/documentation/geocoding/policies#pre-fetching-caching-or-storage-of-content)
    * of your own design.
    *
    * @see https://developers.google.com/maps/documentation/geocoding/intro#GeocodingRequests
    */
  def geocode(query: GeocodingRequest): RequestHandle[GeocodingResponse[GeocodingResponseStatus]] = js.native
  def geocode(query: GeocodingRequest, callback: ResponseCallback[GeocodingResponse[GeocodingResponseStatus]]): RequestHandle[GeocodingResponse[GeocodingResponseStatus]] = js.native
  /**
    * The Geolocation API returns a location and accuracy radius based on information about cell towers and WiFi nodes
    * that the mobile client can detect. This document describes the protocol used to send this data to the server and
    * to return a response to the client.
    *
    * @see https://developers.google.com/maps/documentation/geolocation/intro
    */
  def geolocate(query: GeolocationRequest): RequestHandle[GeolocationResponse] = js.native
  def geolocate(query: GeolocationRequest, callback: ResponseCallback[GeolocationResponse]): RequestHandle[GeolocationResponse] = js.native
  /**
    * The Roads API takes up to 100 independent coordinates, and returns the closest road segment for each point.
    * The points passed do not need to be part of a continuous path.
    *
    * If you are working with sequential GPS points, use [Snap to Roads](https://developers.google.com/maps/documentation/roads/snap).
    *
    * @see https://developers.google.com/maps/documentation/roads/nearest
    */
  def nearestRoads(query: NearestRoadsRequest): RequestHandle[NearestRoadsResponse] = js.native
  def nearestRoads(query: NearestRoadsRequest, callback: ResponseCallback[NearestRoadsResponse]): RequestHandle[NearestRoadsResponse] = js.native
  /**
    * Once you have a `place_id` from a Place Search, you can request more details about a particular establishment
    * or point of interest by initiating a Place Details request. A Place Details request returns more comprehensive
    * information about the indicated place such as its complete address, phone number, user rating and reviews.
    *
    * @see https://developers.google.com/places/web-service/details
    */
  def place(query: PlaceDetailsRequest): RequestHandle[PlaceDetailsResponse] = js.native
  def place(query: PlaceDetailsRequest, callback: ResponseCallback[PlaceDetailsResponse]): RequestHandle[PlaceDetailsResponse] = js.native
  /**
    * The Google Places API Text Search Service is a web service that returns information about a set of places
    * based on a string — for example "pizza in New York" or "shoe stores near Ottawa" or "123 Main Street".
    * The service responds with a list of places matching the text string and any location bias that has been set.
    *
    * The service is especially useful for making
    * [ambiguous address queries](https://developers.google.com/maps/documentation/geocoding/best-practices) in an automated system,
    * and non-address components of the string may match businesses as well as addresses.
    * Examples of ambiguous address queries are incomplete addresses, poorly formatted addresses,
    * or a request that includes non-address components such as business names.
    *
    * The search response will include a list of places. You can send a Place Details request
    * for more information about any of the places in the response.
    *
    * @see https://developers.google.com/places/web-service/search#TextSearchRequests
    */
  def places(query: PlacesRequest): RequestHandle[PlaceSearchResponse] = js.native
  def places(query: PlacesRequest, callback: ResponseCallback[PlaceSearchResponse]): RequestHandle[PlaceSearchResponse] = js.native
  /**
    * The Place Autocomplete service is a web service that returns place predictions in response to an HTTP request.
    * The request specifies a textual search string and optional geographic bounds.
    * The service can be used to provide autocomplete functionality for text-based geographic searches,
    * by returning places such as businesses, addresses and points of interest as a user types.
    *
    * @see https://developers.google.com/places/web-service/autocomplete
    */
  def placesAutoComplete(query: PlaceAutocompleteRequest): RequestHandle[PlaceAutocompleteResponse] = js.native
  def placesAutoComplete(query: PlaceAutocompleteRequest, callback: ResponseCallback[PlaceAutocompleteResponse]): RequestHandle[PlaceAutocompleteResponse] = js.native
  /**
    * A Nearby Search lets you search for places within a specified area.
    * You can refine your search request by supplying keywords or specifying the type of place you are searching for.
    *
    * @see https://developers.google.com/places/web-service/search#PlaceSearchRequests
    */
  def placesNearby(query: PlacesNearbyRequest): RequestHandle[PlaceSearchResponse] = js.native
  def placesNearby(query: PlacesNearbyRequest, callback: ResponseCallback[PlaceSearchResponse]): RequestHandle[PlaceSearchResponse] = js.native
  /**
    * The Place Photo service, part of the Places API, is a read- only API that allows you to add high quality photographic content
    * to your application. The Place Photo service gives you access to the millions of photos stored in the Places database.
    * When you get place information using a Place Details request, photo references will be returned for relevant photographic content.
    * The Nearby Search and Text Search requests also return a single photo reference per place, when relevant.
    * Using the Photo service you can then access the referenced photos and resize the image to the optimal size for your application.
    *
    * @see https://developers.google.com/places/web-service/photos
    */
  def placesPhoto(query: PlacePhotoRequest): RequestHandle[PlacePhotoResponse] = js.native
  def placesPhoto(query: PlacePhotoRequest, callback: ResponseCallback[PlacePhotoResponse]): RequestHandle[PlacePhotoResponse] = js.native
  /**
    * The Query Autocomplete service can be used to provide a query prediction for text-based geographic searches,
    * by returning suggested queries as you type.
    *
    * The Query Autocomplete service allows you to add on-the-fly geographic query predictions to your application.
    * Instead of searching for a specific location, a user can type in a categorical search, such as "pizza near New York"
    * and the service responds with a list of suggested queries matching the string. As the Query Autocomplete service can match
    * on both full words and substrings, applications can send queries as the user types to provide on-the-fly predictions.
    *
    * @see https://developers.google.com/places/web-service/query
    */
  def placesQueryAutoComplete(query: QueryAutocompleteRequest): RequestHandle[QueryAutocompleteResponse] = js.native
  def placesQueryAutoComplete(query: QueryAutocompleteRequest, callback: ResponseCallback[QueryAutocompleteResponse]): RequestHandle[QueryAutocompleteResponse] = js.native
  /**
    * The Google Places API Radar Search Service allows you to search for up to 200 places at once,
    * but with less detail than is typically returned from a Text Search or Nearby Search request.
    * With Radar Search, you can create applications that help users identify specific areas of interest within a geographic area.
    *
    * The search response will include up to 200 places, and will include only the following information about each place:
    *  - The `geometry` field containing geographic coordinates.
    *  - The `place_id`, which you can use in a Place Details request to get more information about the place.
    *
    * @deprecated Radar search is deprecated as of June 30, 2018. After that time, this feature will no longer be available.
    *
    * @see https://developers.google.com/places/web-service/search#RadarSearchRequests
    */
  def placesRadar(query: PlaceRadarRequest): RequestHandle[PlaceSearchResponse] = js.native
  def placesRadar(query: PlaceRadarRequest, callback: ResponseCallback[PlaceSearchResponse]): RequestHandle[PlaceSearchResponse] = js.native
  /**
    * Reverse geocoding is the process of converting geographic coordinates into a human-readable address.
    *
    * @see https://developers.google.com/maps/documentation/geocoding/intro#ReverseGeocoding
    */
  def reverseGeocode(query: ReverseGeocodingRequest): RequestHandle[ReverseGeocodingResponse] = js.native
  def reverseGeocode(query: ReverseGeocodingRequest, callback: ResponseCallback[ReverseGeocodingResponse]): RequestHandle[ReverseGeocodingResponse] = js.native
  /**
    * The Roads API takes up to 100 GPS points collected along a route, and returns a similar set of data,
    * with the points snapped to the most likely roads the vehicle was traveling along.
    * Optionally, you can request that the points be interpolated, resulting in a path that smoothly follows the geometry of the road.
    *
    * @see https://developers.google.com/maps/documentation/roads/snap
    */
  def snapToRoads(query: SnapToRoadsRequest): RequestHandle[SnapToRoadsResponse] = js.native
  def snapToRoads(query: SnapToRoadsRequest, callback: ResponseCallback[SnapToRoadsResponse]): RequestHandle[SnapToRoadsResponse] = js.native
  /**
    * The Roads API returns the posted speed limit for a given road segment.
    * In the case of road segments with variable speed limits, the default speed limit for the segment is returned.
    *
    * The accuracy of speed limit data returned by the Roads API cannot be guaranteed.
    * The speed limit data provided is not real-time, and may be estimated, inaccurate, incomplete, and/or outdated.
    * You may report inaccuracies in our speed limit data by filing a case in the
    * [Google Cloud Support Portal](https://developers.google.com/maps/premium/support#support_portal).
    *
    * @see https://developers.google.com/maps/documentation/roads/speed-limits
    */
  def snappedSpeedLimits(query: SnappedSpeedLimitsRequest): RequestHandle[SpeedLimitsResponse] = js.native
  def snappedSpeedLimits(query: SnappedSpeedLimitsRequest, callback: ResponseCallback[SpeedLimitsResponse]): RequestHandle[SpeedLimitsResponse] = js.native
  /**
    * The Roads API returns the posted speed limit for a given road segment.
    * In the case of road segments with variable speed limits, the default speed limit for the segment is returned.
    *
    * The accuracy of speed limit data returned by the Roads API cannot be guaranteed.
    * The speed limit data provided is not real-time, and may be estimated, inaccurate, incomplete, and/or outdated.
    * You may report inaccuracies in our speed limit data by filing a case in the
    * [Google Cloud Support Portal](https://developers.google.com/maps/premium/support#support_portal).
    *
    * @see https://developers.google.com/maps/documentation/roads/speed-limits
    */
  def speedLimits(query: SpeedLimitsRequest): RequestHandle[SpeedLimitsResponse] = js.native
  def speedLimits(query: SpeedLimitsRequest, callback: ResponseCallback[SpeedLimitsResponse]): RequestHandle[SpeedLimitsResponse] = js.native
  /**
    * The Time Zone API provides a simple interface to request the time zone for locations on the surface of the earth,
    * as well as the time offset from UTC for each of those locations. You request the time zone information for
    * a specific latitude/longitude pair and date. The API returns the name of that time zone, the time offset from UTC,
    * and the daylight savings offset.
    *
    * @see https://developers.google.com/maps/documentation/timezone/intro
    */
  def timezone(query: TimeZoneRequest): RequestHandle[TimeZoneResponse] = js.native
  def timezone(query: TimeZoneRequest, callback: ResponseCallback[TimeZoneResponse]): RequestHandle[TimeZoneResponse] = js.native
}

