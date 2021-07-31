package typings.googleMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleMapsClient extends StObject {
  
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
  def directions(query: DirectionsRequest): RequestHandle[DirectionsResponse]
  def directions(query: DirectionsRequest, callback: ResponseCallback[DirectionsResponse]): RequestHandle[DirectionsResponse]
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
  var directions_Original: GoogleMapsClientEndpoint[DirectionsRequest, DirectionsResponse]
  
  /**
    * The Distance Matrix API is a service that provides travel distance and time for a matrix of origins and destinations.
    * The API returns information based on the recommended route between start and end points, as calculated by the Google Maps API,
    * and consists of rows containing duration and distance values for each pair.
    *
    * @see https://developers.google.com/maps/documentation/distance-matrix/intro
    */
  def distanceMatrix(query: DistanceMatrixRequest): RequestHandle[DistanceMatrixResponse]
  def distanceMatrix(query: DistanceMatrixRequest, callback: ResponseCallback[DistanceMatrixResponse]): RequestHandle[DistanceMatrixResponse]
  /**
    * The Distance Matrix API is a service that provides travel distance and time for a matrix of origins and destinations.
    * The API returns information based on the recommended route between start and end points, as calculated by the Google Maps API,
    * and consists of rows containing duration and distance values for each pair.
    *
    * @see https://developers.google.com/maps/documentation/distance-matrix/intro
    */
  @JSName("distanceMatrix")
  var distanceMatrix_Original: GoogleMapsClientEndpoint[DistanceMatrixRequest, DistanceMatrixResponse]
  
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
  def elevation(query: ElevationRequest): RequestHandle[ElevationResponse]
  def elevation(query: ElevationRequest, callback: ResponseCallback[ElevationResponse]): RequestHandle[ElevationResponse]
  
  /**
    * You may request sampled elevation data along paths, allowing you to calculate elevation changes along routes.
    * With the Elevation API, you can develop hiking and biking applications, positioning applications,
    * or low resolution surveying applications.
    *
    * @see https://developers.google.com/maps/documentation/elevation/intro
    */
  def elevationAlongPath(query: ElevationAlongPathRequest): RequestHandle[ElevationResponse]
  def elevationAlongPath(query: ElevationAlongPathRequest, callback: ResponseCallback[ElevationResponse]): RequestHandle[ElevationResponse]
  /**
    * You may request sampled elevation data along paths, allowing you to calculate elevation changes along routes.
    * With the Elevation API, you can develop hiking and biking applications, positioning applications,
    * or low resolution surveying applications.
    *
    * @see https://developers.google.com/maps/documentation/elevation/intro
    */
  @JSName("elevationAlongPath")
  var elevationAlongPath_Original: GoogleMapsClientEndpoint[ElevationAlongPathRequest, ElevationResponse]
  
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
  var elevation_Original: GoogleMapsClientEndpoint[ElevationRequest, ElevationResponse]
  
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
  def findPlace(query: FindPlaceRequest): RequestHandle[FindPlaceFromTextResponse]
  def findPlace(query: FindPlaceRequest, callback: ResponseCallback[FindPlaceFromTextResponse]): RequestHandle[FindPlaceFromTextResponse]
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
  var findPlace_Original: GoogleMapsClientEndpoint[FindPlaceRequest, FindPlaceFromTextResponse]
  
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
  def geocode(query: GeocodingRequest): RequestHandle[GeocodingResponse[GeocodingResponseStatus]]
  def geocode(query: GeocodingRequest, callback: ResponseCallback[GeocodingResponse[GeocodingResponseStatus]]): RequestHandle[GeocodingResponse[GeocodingResponseStatus]]
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
  var geocode_Original: GoogleMapsClientEndpoint[GeocodingRequest, GeocodingResponse[GeocodingResponseStatus]]
  
  /**
    * The Geolocation API returns a location and accuracy radius based on information about cell towers and WiFi nodes
    * that the mobile client can detect. This document describes the protocol used to send this data to the server and
    * to return a response to the client.
    *
    * @see https://developers.google.com/maps/documentation/geolocation/intro
    */
  def geolocate(query: GeolocationRequest): RequestHandle[GeolocationResponse]
  def geolocate(query: GeolocationRequest, callback: ResponseCallback[GeolocationResponse]): RequestHandle[GeolocationResponse]
  /**
    * The Geolocation API returns a location and accuracy radius based on information about cell towers and WiFi nodes
    * that the mobile client can detect. This document describes the protocol used to send this data to the server and
    * to return a response to the client.
    *
    * @see https://developers.google.com/maps/documentation/geolocation/intro
    */
  @JSName("geolocate")
  var geolocate_Original: GoogleMapsClientEndpoint[GeolocationRequest, GeolocationResponse]
  
  /**
    * The Roads API takes up to 100 independent coordinates, and returns the closest road segment for each point.
    * The points passed do not need to be part of a continuous path.
    *
    * If you are working with sequential GPS points, use [Snap to Roads](https://developers.google.com/maps/documentation/roads/snap).
    *
    * @see https://developers.google.com/maps/documentation/roads/nearest
    */
  def nearestRoads(query: NearestRoadsRequest): RequestHandle[NearestRoadsResponse]
  def nearestRoads(query: NearestRoadsRequest, callback: ResponseCallback[NearestRoadsResponse]): RequestHandle[NearestRoadsResponse]
  /**
    * The Roads API takes up to 100 independent coordinates, and returns the closest road segment for each point.
    * The points passed do not need to be part of a continuous path.
    *
    * If you are working with sequential GPS points, use [Snap to Roads](https://developers.google.com/maps/documentation/roads/snap).
    *
    * @see https://developers.google.com/maps/documentation/roads/nearest
    */
  @JSName("nearestRoads")
  var nearestRoads_Original: GoogleMapsClientEndpoint[NearestRoadsRequest, NearestRoadsResponse]
  
  /**
    * Once you have a `place_id` from a Place Search, you can request more details about a particular establishment
    * or point of interest by initiating a Place Details request. A Place Details request returns more comprehensive
    * information about the indicated place such as its complete address, phone number, user rating and reviews.
    *
    * @see https://developers.google.com/places/web-service/details
    */
  def place(query: PlaceDetailsRequest): RequestHandle[PlaceDetailsResponse]
  def place(query: PlaceDetailsRequest, callback: ResponseCallback[PlaceDetailsResponse]): RequestHandle[PlaceDetailsResponse]
  /**
    * Once you have a `place_id` from a Place Search, you can request more details about a particular establishment
    * or point of interest by initiating a Place Details request. A Place Details request returns more comprehensive
    * information about the indicated place such as its complete address, phone number, user rating and reviews.
    *
    * @see https://developers.google.com/places/web-service/details
    */
  @JSName("place")
  var place_Original: GoogleMapsClientEndpoint[PlaceDetailsRequest, PlaceDetailsResponse]
  
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
  def places(query: PlacesRequest): RequestHandle[PlaceSearchResponse]
  def places(query: PlacesRequest, callback: ResponseCallback[PlaceSearchResponse]): RequestHandle[PlaceSearchResponse]
  
  /**
    * The Place Autocomplete service is a web service that returns place predictions in response to an HTTP request.
    * The request specifies a textual search string and optional geographic bounds.
    * The service can be used to provide autocomplete functionality for text-based geographic searches,
    * by returning places such as businesses, addresses and points of interest as a user types.
    *
    * @see https://developers.google.com/places/web-service/autocomplete
    */
  def placesAutoComplete(query: PlaceAutocompleteRequest): RequestHandle[PlaceAutocompleteResponse]
  def placesAutoComplete(query: PlaceAutocompleteRequest, callback: ResponseCallback[PlaceAutocompleteResponse]): RequestHandle[PlaceAutocompleteResponse]
  /**
    * The Place Autocomplete service is a web service that returns place predictions in response to an HTTP request.
    * The request specifies a textual search string and optional geographic bounds.
    * The service can be used to provide autocomplete functionality for text-based geographic searches,
    * by returning places such as businesses, addresses and points of interest as a user types.
    *
    * @see https://developers.google.com/places/web-service/autocomplete
    */
  @JSName("placesAutoComplete")
  var placesAutoComplete_Original: GoogleMapsClientEndpoint[PlaceAutocompleteRequest, PlaceAutocompleteResponse]
  
  /**
    * A Nearby Search lets you search for places within a specified area.
    * You can refine your search request by supplying keywords or specifying the type of place you are searching for.
    *
    * @see https://developers.google.com/places/web-service/search#PlaceSearchRequests
    */
  def placesNearby(query: PlacesNearbyRequest): RequestHandle[PlaceSearchResponse]
  def placesNearby(query: PlacesNearbyRequest, callback: ResponseCallback[PlaceSearchResponse]): RequestHandle[PlaceSearchResponse]
  /**
    * A Nearby Search lets you search for places within a specified area.
    * You can refine your search request by supplying keywords or specifying the type of place you are searching for.
    *
    * @see https://developers.google.com/places/web-service/search#PlaceSearchRequests
    */
  @JSName("placesNearby")
  var placesNearby_Original: GoogleMapsClientEndpoint[PlacesNearbyRequest, PlaceSearchResponse]
  
  /**
    * The Place Photo service, part of the Places API, is a read- only API that allows you to add high quality photographic content
    * to your application. The Place Photo service gives you access to the millions of photos stored in the Places database.
    * When you get place information using a Place Details request, photo references will be returned for relevant photographic content.
    * The Nearby Search and Text Search requests also return a single photo reference per place, when relevant.
    * Using the Photo service you can then access the referenced photos and resize the image to the optimal size for your application.
    *
    * @see https://developers.google.com/places/web-service/photos
    */
  def placesPhoto(query: PlacePhotoRequest): RequestHandle[PlacePhotoResponse]
  def placesPhoto(query: PlacePhotoRequest, callback: ResponseCallback[PlacePhotoResponse]): RequestHandle[PlacePhotoResponse]
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
  var placesPhoto_Original: GoogleMapsClientEndpoint[PlacePhotoRequest, PlacePhotoResponse]
  
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
  def placesQueryAutoComplete(query: QueryAutocompleteRequest): RequestHandle[QueryAutocompleteResponse]
  def placesQueryAutoComplete(query: QueryAutocompleteRequest, callback: ResponseCallback[QueryAutocompleteResponse]): RequestHandle[QueryAutocompleteResponse]
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
  var placesQueryAutoComplete_Original: GoogleMapsClientEndpoint[QueryAutocompleteRequest, QueryAutocompleteResponse]
  
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
  def placesRadar(query: PlaceRadarRequest): RequestHandle[PlaceSearchResponse]
  def placesRadar(query: PlaceRadarRequest, callback: ResponseCallback[PlaceSearchResponse]): RequestHandle[PlaceSearchResponse]
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
  var placesRadar_Original: GoogleMapsClientEndpoint[PlaceRadarRequest, PlaceSearchResponse]
  
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
  var places_Original: GoogleMapsClientEndpoint[PlacesRequest, PlaceSearchResponse]
  
  /**
    * Reverse geocoding is the process of converting geographic coordinates into a human-readable address.
    *
    * @see https://developers.google.com/maps/documentation/geocoding/intro#ReverseGeocoding
    */
  def reverseGeocode(query: ReverseGeocodingRequest): RequestHandle[ReverseGeocodingResponse]
  def reverseGeocode(query: ReverseGeocodingRequest, callback: ResponseCallback[ReverseGeocodingResponse]): RequestHandle[ReverseGeocodingResponse]
  /**
    * Reverse geocoding is the process of converting geographic coordinates into a human-readable address.
    *
    * @see https://developers.google.com/maps/documentation/geocoding/intro#ReverseGeocoding
    */
  @JSName("reverseGeocode")
  var reverseGeocode_Original: GoogleMapsClientEndpoint[ReverseGeocodingRequest, ReverseGeocodingResponse]
  
  /**
    * The Roads API takes up to 100 GPS points collected along a route, and returns a similar set of data,
    * with the points snapped to the most likely roads the vehicle was traveling along.
    * Optionally, you can request that the points be interpolated, resulting in a path that smoothly follows the geometry of the road.
    *
    * @see https://developers.google.com/maps/documentation/roads/snap
    */
  def snapToRoads(query: SnapToRoadsRequest): RequestHandle[SnapToRoadsResponse]
  def snapToRoads(query: SnapToRoadsRequest, callback: ResponseCallback[SnapToRoadsResponse]): RequestHandle[SnapToRoadsResponse]
  /**
    * The Roads API takes up to 100 GPS points collected along a route, and returns a similar set of data,
    * with the points snapped to the most likely roads the vehicle was traveling along.
    * Optionally, you can request that the points be interpolated, resulting in a path that smoothly follows the geometry of the road.
    *
    * @see https://developers.google.com/maps/documentation/roads/snap
    */
  @JSName("snapToRoads")
  var snapToRoads_Original: GoogleMapsClientEndpoint[SnapToRoadsRequest, SnapToRoadsResponse]
  
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
  def snappedSpeedLimits(query: SnappedSpeedLimitsRequest): RequestHandle[SpeedLimitsResponse]
  def snappedSpeedLimits(query: SnappedSpeedLimitsRequest, callback: ResponseCallback[SpeedLimitsResponse]): RequestHandle[SpeedLimitsResponse]
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
  var snappedSpeedLimits_Original: GoogleMapsClientEndpoint[SnappedSpeedLimitsRequest, SpeedLimitsResponse]
  
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
  def speedLimits(query: SpeedLimitsRequest): RequestHandle[SpeedLimitsResponse]
  def speedLimits(query: SpeedLimitsRequest, callback: ResponseCallback[SpeedLimitsResponse]): RequestHandle[SpeedLimitsResponse]
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
  var speedLimits_Original: GoogleMapsClientEndpoint[SpeedLimitsRequest, SpeedLimitsResponse]
  
  /**
    * The Time Zone API provides a simple interface to request the time zone for locations on the surface of the earth,
    * as well as the time offset from UTC for each of those locations. You request the time zone information for
    * a specific latitude/longitude pair and date. The API returns the name of that time zone, the time offset from UTC,
    * and the daylight savings offset.
    *
    * @see https://developers.google.com/maps/documentation/timezone/intro
    */
  def timezone(query: TimeZoneRequest): RequestHandle[TimeZoneResponse]
  def timezone(query: TimeZoneRequest, callback: ResponseCallback[TimeZoneResponse]): RequestHandle[TimeZoneResponse]
  /**
    * The Time Zone API provides a simple interface to request the time zone for locations on the surface of the earth,
    * as well as the time offset from UTC for each of those locations. You request the time zone information for
    * a specific latitude/longitude pair and date. The API returns the name of that time zone, the time offset from UTC,
    * and the daylight savings offset.
    *
    * @see https://developers.google.com/maps/documentation/timezone/intro
    */
  @JSName("timezone")
  var timezone_Original: GoogleMapsClientEndpoint[TimeZoneRequest, TimeZoneResponse]
}
object GoogleMapsClient {
  
  @scala.inline
  def apply(
    directions: (DirectionsRequest, /* callback */ js.UndefOr[ResponseCallback[DirectionsResponse]]) => RequestHandle[DirectionsResponse],
    distanceMatrix: (DistanceMatrixRequest, /* callback */ js.UndefOr[ResponseCallback[DistanceMatrixResponse]]) => RequestHandle[DistanceMatrixResponse],
    elevation: (ElevationRequest, /* callback */ js.UndefOr[ResponseCallback[ElevationResponse]]) => RequestHandle[ElevationResponse],
    elevationAlongPath: (ElevationAlongPathRequest, /* callback */ js.UndefOr[ResponseCallback[ElevationResponse]]) => RequestHandle[ElevationResponse],
    findPlace: (FindPlaceRequest, /* callback */ js.UndefOr[ResponseCallback[FindPlaceFromTextResponse]]) => RequestHandle[FindPlaceFromTextResponse],
    geocode: (GeocodingRequest, /* callback */ js.UndefOr[ResponseCallback[GeocodingResponse[GeocodingResponseStatus]]]) => RequestHandle[GeocodingResponse[GeocodingResponseStatus]],
    geolocate: (GeolocationRequest, /* callback */ js.UndefOr[ResponseCallback[GeolocationResponse]]) => RequestHandle[GeolocationResponse],
    nearestRoads: (NearestRoadsRequest, /* callback */ js.UndefOr[ResponseCallback[NearestRoadsResponse]]) => RequestHandle[NearestRoadsResponse],
    place: (PlaceDetailsRequest, /* callback */ js.UndefOr[ResponseCallback[PlaceDetailsResponse]]) => RequestHandle[PlaceDetailsResponse],
    places: (PlacesRequest, /* callback */ js.UndefOr[ResponseCallback[PlaceSearchResponse]]) => RequestHandle[PlaceSearchResponse],
    placesAutoComplete: (PlaceAutocompleteRequest, /* callback */ js.UndefOr[ResponseCallback[PlaceAutocompleteResponse]]) => RequestHandle[PlaceAutocompleteResponse],
    placesNearby: (PlacesNearbyRequest, /* callback */ js.UndefOr[ResponseCallback[PlaceSearchResponse]]) => RequestHandle[PlaceSearchResponse],
    placesPhoto: (PlacePhotoRequest, /* callback */ js.UndefOr[ResponseCallback[PlacePhotoResponse]]) => RequestHandle[PlacePhotoResponse],
    placesQueryAutoComplete: (QueryAutocompleteRequest, /* callback */ js.UndefOr[ResponseCallback[QueryAutocompleteResponse]]) => RequestHandle[QueryAutocompleteResponse],
    placesRadar: (PlaceRadarRequest, /* callback */ js.UndefOr[ResponseCallback[PlaceSearchResponse]]) => RequestHandle[PlaceSearchResponse],
    reverseGeocode: (ReverseGeocodingRequest, /* callback */ js.UndefOr[ResponseCallback[ReverseGeocodingResponse]]) => RequestHandle[ReverseGeocodingResponse],
    snapToRoads: (SnapToRoadsRequest, /* callback */ js.UndefOr[ResponseCallback[SnapToRoadsResponse]]) => RequestHandle[SnapToRoadsResponse],
    snappedSpeedLimits: (SnappedSpeedLimitsRequest, /* callback */ js.UndefOr[ResponseCallback[SpeedLimitsResponse]]) => RequestHandle[SpeedLimitsResponse],
    speedLimits: (SpeedLimitsRequest, /* callback */ js.UndefOr[ResponseCallback[SpeedLimitsResponse]]) => RequestHandle[SpeedLimitsResponse],
    timezone: (TimeZoneRequest, /* callback */ js.UndefOr[ResponseCallback[TimeZoneResponse]]) => RequestHandle[TimeZoneResponse]
  ): GoogleMapsClient = {
    val __obj = js.Dynamic.literal(directions = js.Any.fromFunction2(directions), distanceMatrix = js.Any.fromFunction2(distanceMatrix), elevation = js.Any.fromFunction2(elevation), elevationAlongPath = js.Any.fromFunction2(elevationAlongPath), findPlace = js.Any.fromFunction2(findPlace), geocode = js.Any.fromFunction2(geocode), geolocate = js.Any.fromFunction2(geolocate), nearestRoads = js.Any.fromFunction2(nearestRoads), place = js.Any.fromFunction2(place), places = js.Any.fromFunction2(places), placesAutoComplete = js.Any.fromFunction2(placesAutoComplete), placesNearby = js.Any.fromFunction2(placesNearby), placesPhoto = js.Any.fromFunction2(placesPhoto), placesQueryAutoComplete = js.Any.fromFunction2(placesQueryAutoComplete), placesRadar = js.Any.fromFunction2(placesRadar), reverseGeocode = js.Any.fromFunction2(reverseGeocode), snapToRoads = js.Any.fromFunction2(snapToRoads), snappedSpeedLimits = js.Any.fromFunction2(snappedSpeedLimits), speedLimits = js.Any.fromFunction2(speedLimits), timezone = js.Any.fromFunction2(timezone))
    __obj.asInstanceOf[GoogleMapsClient]
  }
  
  @scala.inline
  implicit class GoogleMapsClientMutableBuilder[Self <: GoogleMapsClient] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirections(
      value: (DirectionsRequest, /* callback */ js.UndefOr[ResponseCallback[DirectionsResponse]]) => RequestHandle[DirectionsResponse]
    ): Self = StObject.set(x, "directions", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDistanceMatrix(
      value: (DistanceMatrixRequest, /* callback */ js.UndefOr[ResponseCallback[DistanceMatrixResponse]]) => RequestHandle[DistanceMatrixResponse]
    ): Self = StObject.set(x, "distanceMatrix", js.Any.fromFunction2(value))
    
    @scala.inline
    def setElevation(
      value: (ElevationRequest, /* callback */ js.UndefOr[ResponseCallback[ElevationResponse]]) => RequestHandle[ElevationResponse]
    ): Self = StObject.set(x, "elevation", js.Any.fromFunction2(value))
    
    @scala.inline
    def setElevationAlongPath(
      value: (ElevationAlongPathRequest, /* callback */ js.UndefOr[ResponseCallback[ElevationResponse]]) => RequestHandle[ElevationResponse]
    ): Self = StObject.set(x, "elevationAlongPath", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFindPlace(
      value: (FindPlaceRequest, /* callback */ js.UndefOr[ResponseCallback[FindPlaceFromTextResponse]]) => RequestHandle[FindPlaceFromTextResponse]
    ): Self = StObject.set(x, "findPlace", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGeocode(
      value: (GeocodingRequest, /* callback */ js.UndefOr[ResponseCallback[GeocodingResponse[GeocodingResponseStatus]]]) => RequestHandle[GeocodingResponse[GeocodingResponseStatus]]
    ): Self = StObject.set(x, "geocode", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGeolocate(
      value: (GeolocationRequest, /* callback */ js.UndefOr[ResponseCallback[GeolocationResponse]]) => RequestHandle[GeolocationResponse]
    ): Self = StObject.set(x, "geolocate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setNearestRoads(
      value: (NearestRoadsRequest, /* callback */ js.UndefOr[ResponseCallback[NearestRoadsResponse]]) => RequestHandle[NearestRoadsResponse]
    ): Self = StObject.set(x, "nearestRoads", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPlace(
      value: (PlaceDetailsRequest, /* callback */ js.UndefOr[ResponseCallback[PlaceDetailsResponse]]) => RequestHandle[PlaceDetailsResponse]
    ): Self = StObject.set(x, "place", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPlaces(
      value: (PlacesRequest, /* callback */ js.UndefOr[ResponseCallback[PlaceSearchResponse]]) => RequestHandle[PlaceSearchResponse]
    ): Self = StObject.set(x, "places", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPlacesAutoComplete(
      value: (PlaceAutocompleteRequest, /* callback */ js.UndefOr[ResponseCallback[PlaceAutocompleteResponse]]) => RequestHandle[PlaceAutocompleteResponse]
    ): Self = StObject.set(x, "placesAutoComplete", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPlacesNearby(
      value: (PlacesNearbyRequest, /* callback */ js.UndefOr[ResponseCallback[PlaceSearchResponse]]) => RequestHandle[PlaceSearchResponse]
    ): Self = StObject.set(x, "placesNearby", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPlacesPhoto(
      value: (PlacePhotoRequest, /* callback */ js.UndefOr[ResponseCallback[PlacePhotoResponse]]) => RequestHandle[PlacePhotoResponse]
    ): Self = StObject.set(x, "placesPhoto", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPlacesQueryAutoComplete(
      value: (QueryAutocompleteRequest, /* callback */ js.UndefOr[ResponseCallback[QueryAutocompleteResponse]]) => RequestHandle[QueryAutocompleteResponse]
    ): Self = StObject.set(x, "placesQueryAutoComplete", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPlacesRadar(
      value: (PlaceRadarRequest, /* callback */ js.UndefOr[ResponseCallback[PlaceSearchResponse]]) => RequestHandle[PlaceSearchResponse]
    ): Self = StObject.set(x, "placesRadar", js.Any.fromFunction2(value))
    
    @scala.inline
    def setReverseGeocode(
      value: (ReverseGeocodingRequest, /* callback */ js.UndefOr[ResponseCallback[ReverseGeocodingResponse]]) => RequestHandle[ReverseGeocodingResponse]
    ): Self = StObject.set(x, "reverseGeocode", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSnapToRoads(
      value: (SnapToRoadsRequest, /* callback */ js.UndefOr[ResponseCallback[SnapToRoadsResponse]]) => RequestHandle[SnapToRoadsResponse]
    ): Self = StObject.set(x, "snapToRoads", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSnappedSpeedLimits(
      value: (SnappedSpeedLimitsRequest, /* callback */ js.UndefOr[ResponseCallback[SpeedLimitsResponse]]) => RequestHandle[SpeedLimitsResponse]
    ): Self = StObject.set(x, "snappedSpeedLimits", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSpeedLimits(
      value: (SpeedLimitsRequest, /* callback */ js.UndefOr[ResponseCallback[SpeedLimitsResponse]]) => RequestHandle[SpeedLimitsResponse]
    ): Self = StObject.set(x, "speedLimits", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTimezone(
      value: (TimeZoneRequest, /* callback */ js.UndefOr[ResponseCallback[TimeZoneResponse]]) => RequestHandle[TimeZoneResponse]
    ): Self = StObject.set(x, "timezone", js.Any.fromFunction2(value))
  }
}
