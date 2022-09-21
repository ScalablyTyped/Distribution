package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MapsNetworkErrorEndpoint extends StObject
/**
  * Identifiers for API endpoints used by {@link google.maps.MapsNetworkError}
  * instances.
  */
@JSGlobal("google.maps.MapsNetworkErrorEndpoint")
@js.native
object MapsNetworkErrorEndpoint extends StObject {
  
  /**
    * Identifies the Routes API within the Directions API.
    */
  @js.native
  sealed trait DIRECTIONS_ROUTE
    extends StObject
       with MapsNetworkErrorEndpoint
  
  /**
    * Identifies the DistanceMatrix API.
    */
  @js.native
  sealed trait DISTANCE_MATRIX
    extends StObject
       with MapsNetworkErrorEndpoint
  
  /**
    * Identifies the getElevationsAlongPath API within the Elevation API.
    */
  @js.native
  sealed trait ELEVATION_ALONG_PATH
    extends StObject
       with MapsNetworkErrorEndpoint
  
  /**
    * Identifies the getElevationForLocations API within the Elevation API.
    */
  @js.native
  sealed trait ELEVATION_LOCATIONS
    extends StObject
       with MapsNetworkErrorEndpoint
  
  /**
    * Identifies the Get DeliveryVehicle API within Fleet Engine.
    */
  @js.native
  sealed trait FLEET_ENGINE_GET_DELIVERY_VEHICLE
    extends StObject
       with MapsNetworkErrorEndpoint
  
  /**
    * Identifies the Get Trip API within Fleet Engine.
    */
  @js.native
  sealed trait FLEET_ENGINE_GET_TRIP
    extends StObject
       with MapsNetworkErrorEndpoint
  
  /**
    * Identifies the Get Vehicle API within Fleet Engine.
    */
  @js.native
  sealed trait FLEET_ENGINE_GET_VEHICLE
    extends StObject
       with MapsNetworkErrorEndpoint
  
  /**
    * Identifies the List DeliveryVehicles API within Fleet Engine.
    */
  @js.native
  sealed trait FLEET_ENGINE_LIST_DELIVERY_VEHICLES
    extends StObject
       with MapsNetworkErrorEndpoint
  
  /**
    * Identifies the List Tasks API within Fleet Engine.
    */
  @js.native
  sealed trait FLEET_ENGINE_LIST_TASKS
    extends StObject
       with MapsNetworkErrorEndpoint
  
  /**
    * Identifies the List Vehicles API within Fleet Engine.
    */
  @js.native
  sealed trait FLEET_ENGINE_LIST_VEHICLES
    extends StObject
       with MapsNetworkErrorEndpoint
  
  /**
    * Identifies the Search Tasks API within Fleet Engine.
    */
  @js.native
  sealed trait FLEET_ENGINE_SEARCH_TASKS
    extends StObject
       with MapsNetworkErrorEndpoint
  
  /**
    * Identifies the geocode API within the Geocoder.
    */
  @js.native
  sealed trait GEOCODER_GEOCODE
    extends StObject
       with MapsNetworkErrorEndpoint
  
  /**
    * Identifies the MaximumZoomImageryService API within the Maps API.
    */
  @js.native
  sealed trait MAPS_MAX_ZOOM
    extends StObject
       with MapsNetworkErrorEndpoint
  
  /**
    * Identifies the Autocomplete API within the Places API.
    */
  @js.native
  sealed trait PLACES_AUTOCOMPLETE
    extends StObject
       with MapsNetworkErrorEndpoint
  
  /**
    * Identifies the Details API within the Places API.
    */
  @js.native
  sealed trait PLACES_DETAILS
    extends StObject
       with MapsNetworkErrorEndpoint
  
  /**
    * Identifies the findPlaceFromPhoneNumber API within the Places API.
    */
  @js.native
  sealed trait PLACES_FIND_PLACE_FROM_PHONE_NUMBER
    extends StObject
       with MapsNetworkErrorEndpoint
  
  /**
    * Identifies the findPlaceFromQuery API within the Places API.
    */
  @js.native
  sealed trait PLACES_FIND_PLACE_FROM_QUERY
    extends StObject
       with MapsNetworkErrorEndpoint
  
  /**
    * Identifies the Gateway API within the Places API.
    */
  @js.native
  sealed trait PLACES_GATEWAY
    extends StObject
       with MapsNetworkErrorEndpoint
  
  /**
    * Identifies the LocalContextSearch API within the Places API.
    */
  @js.native
  sealed trait PLACES_LOCAL_CONTEXT_SEARCH
    extends StObject
       with MapsNetworkErrorEndpoint
  
  /**
    * Identifies the NearbySearch API within the Places API.
    */
  @js.native
  sealed trait PLACES_NEARBY_SEARCH
    extends StObject
       with MapsNetworkErrorEndpoint
  
  /**
    * Identifies the getPanorama method within the Streetview service.
    */
  @js.native
  sealed trait STREETVIEW_GET_PANORAMA
    extends StObject
       with MapsNetworkErrorEndpoint
}
