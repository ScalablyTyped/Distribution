package typings
package atGoogleMapsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object atGoogleMapsLibStrings {
  @js.native
  sealed trait `(cities)`
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceAutocompleteType
  
  @js.native
  sealed trait `(regions)`
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceAutocompleteType
  
  @js.native
  sealed trait APP
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceIdScope
  
  @js.native
  sealed trait APPROXIMATE
    extends atGoogleMapsLib.atGoogleMapsMod.LocationType
       with atGoogleMapsLib.atGoogleMapsMod.ReverseGeocodingLocationType
  
  @js.native
  sealed trait BUS
    extends atGoogleMapsLib.atGoogleMapsMod.VehicleType
  
  @js.native
  sealed trait CABLE_CAR
    extends atGoogleMapsLib.atGoogleMapsMod.VehicleType
  
  @js.native
  sealed trait COMMUTER_TRAIN
    extends atGoogleMapsLib.atGoogleMapsMod.VehicleType
  
  @js.native
  sealed trait FERRY
    extends atGoogleMapsLib.atGoogleMapsMod.VehicleType
  
  @js.native
  sealed trait FUNICULAR
    extends atGoogleMapsLib.atGoogleMapsMod.VehicleType
  
  @js.native
  sealed trait GEOMETRIC_CENTER
    extends atGoogleMapsLib.atGoogleMapsMod.LocationType
       with atGoogleMapsLib.atGoogleMapsMod.ReverseGeocodingLocationType
  
  @js.native
  sealed trait GONDOLA_LIFT
    extends atGoogleMapsLib.atGoogleMapsMod.VehicleType
  
  @js.native
  sealed trait GOOGLE
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceIdScope
  
  @js.native
  sealed trait HEAVY_RAIL
    extends atGoogleMapsLib.atGoogleMapsMod.VehicleType
  
  @js.native
  sealed trait HIGH_SPEED_TRAIN
    extends atGoogleMapsLib.atGoogleMapsMod.VehicleType
  
  @js.native
  sealed trait INTERCITY_BUS
    extends atGoogleMapsLib.atGoogleMapsMod.VehicleType
  
  @js.native
  sealed trait INVALID_REQUEST
    extends atGoogleMapsLib.atGoogleMapsMod.DirectionsReponseStatus
       with atGoogleMapsLib.atGoogleMapsMod.DistanceMatrixResponseTopLevelStatus
       with atGoogleMapsLib.atGoogleMapsMod.ElevationResponseStatus
       with atGoogleMapsLib.atGoogleMapsMod.GeocodingResponseStatus
       with atGoogleMapsLib.atGoogleMapsMod.PlaceAutocompleteResponseStatus
       with atGoogleMapsLib.atGoogleMapsMod.PlaceDetailsResponseStatus
       with atGoogleMapsLib.atGoogleMapsMod.QueryAutocompleteResponseStatus
       with atGoogleMapsLib.atGoogleMapsMod.ReverseGeocodingResponseStatus
       with atGoogleMapsLib.atGoogleMapsMod.SearchResponseStatus
       with atGoogleMapsLib.atGoogleMapsMod.TimeZoneResponseStatus
  
  @js.native
  sealed trait KPH
    extends atGoogleMapsLib.atGoogleMapsMod.SpeedLimitUnit
  
  @js.native
  sealed trait MAX_ELEMENTS_EXCEEDED
    extends atGoogleMapsLib.atGoogleMapsMod.DistanceMatrixResponseTopLevelStatus
  
  @js.native
  sealed trait MAX_ROUTE_LENGTH_EXCEEDED
    extends atGoogleMapsLib.atGoogleMapsMod.DistanceMatrixResponseElementLevelStatus
  
  @js.native
  sealed trait `MAX_ROUTE_LENGTH_EXCEEDED `
    extends atGoogleMapsLib.atGoogleMapsMod.DirectionsReponseStatus
  
  @js.native
  sealed trait MAX_WAYPOINTS_EXCEEDED
    extends atGoogleMapsLib.atGoogleMapsMod.DirectionsReponseStatus
  
  @js.native
  sealed trait METRO_RAIL
    extends atGoogleMapsLib.atGoogleMapsMod.VehicleType
  
  @js.native
  sealed trait MONORAIL
    extends atGoogleMapsLib.atGoogleMapsMod.VehicleType
  
  @js.native
  sealed trait MPH
    extends atGoogleMapsLib.atGoogleMapsMod.SpeedLimitUnit
  
  @js.native
  sealed trait NOT_FOUND
    extends atGoogleMapsLib.atGoogleMapsMod.DirectionsReponseStatus
       with atGoogleMapsLib.atGoogleMapsMod.DistanceMatrixResponseElementLevelStatus
       with atGoogleMapsLib.atGoogleMapsMod.PlaceDetailsResponseStatus
  
  @js.native
  sealed trait OK
    extends atGoogleMapsLib.atGoogleMapsMod.DirectionsReponseStatus
       with atGoogleMapsLib.atGoogleMapsMod.DistanceMatrixResponseElementLevelStatus
       with atGoogleMapsLib.atGoogleMapsMod.DistanceMatrixResponseTopLevelStatus
       with atGoogleMapsLib.atGoogleMapsMod.ElevationResponseStatus
       with atGoogleMapsLib.atGoogleMapsMod.GeocodedWaypointStatus
       with atGoogleMapsLib.atGoogleMapsMod.GeocodingResponseStatus
       with atGoogleMapsLib.atGoogleMapsMod.PlaceAutocompleteResponseStatus
       with atGoogleMapsLib.atGoogleMapsMod.PlaceDetailsResponseStatus
       with atGoogleMapsLib.atGoogleMapsMod.QueryAutocompleteResponseStatus
       with atGoogleMapsLib.atGoogleMapsMod.ReverseGeocodingResponseStatus
       with atGoogleMapsLib.atGoogleMapsMod.SearchResponseStatus
       with atGoogleMapsLib.atGoogleMapsMod.TimeZoneResponseStatus
  
  @js.native
  sealed trait OTHER
    extends atGoogleMapsLib.atGoogleMapsMod.VehicleType
  
  @js.native
  sealed trait OVER_DAILY_LIMIT
    extends atGoogleMapsLib.atGoogleMapsMod.DirectionsReponseStatus
       with atGoogleMapsLib.atGoogleMapsMod.DistanceMatrixResponseTopLevelStatus
       with atGoogleMapsLib.atGoogleMapsMod.ElevationResponseStatus
       with atGoogleMapsLib.atGoogleMapsMod.GeocodingResponseStatus
       with atGoogleMapsLib.atGoogleMapsMod.TimeZoneResponseStatus
  
  @js.native
  sealed trait OVER_QUERY_LIMIT
    extends atGoogleMapsLib.atGoogleMapsMod.DirectionsReponseStatus
       with atGoogleMapsLib.atGoogleMapsMod.DistanceMatrixResponseTopLevelStatus
       with atGoogleMapsLib.atGoogleMapsMod.ElevationResponseStatus
       with atGoogleMapsLib.atGoogleMapsMod.GeocodingResponseStatus
       with atGoogleMapsLib.atGoogleMapsMod.PlaceAutocompleteResponseStatus
       with atGoogleMapsLib.atGoogleMapsMod.PlaceDetailsResponseStatus
       with atGoogleMapsLib.atGoogleMapsMod.QueryAutocompleteResponseStatus
       with atGoogleMapsLib.atGoogleMapsMod.ReverseGeocodingResponseStatus
       with atGoogleMapsLib.atGoogleMapsMod.SearchResponseStatus
       with atGoogleMapsLib.atGoogleMapsMod.TimeZoneResponseStatus
  
  @js.native
  sealed trait RAIL
    extends atGoogleMapsLib.atGoogleMapsMod.VehicleType
  
  @js.native
  sealed trait RANGE_INTERPOLATED
    extends atGoogleMapsLib.atGoogleMapsMod.LocationType
       with atGoogleMapsLib.atGoogleMapsMod.ReverseGeocodingLocationType
  
  @js.native
  sealed trait REQUEST_DENIED
    extends atGoogleMapsLib.atGoogleMapsMod.DirectionsReponseStatus
       with atGoogleMapsLib.atGoogleMapsMod.DistanceMatrixResponseTopLevelStatus
       with atGoogleMapsLib.atGoogleMapsMod.ElevationResponseStatus
       with atGoogleMapsLib.atGoogleMapsMod.GeocodingResponseStatus
       with atGoogleMapsLib.atGoogleMapsMod.PlaceAutocompleteResponseStatus
       with atGoogleMapsLib.atGoogleMapsMod.PlaceDetailsResponseStatus
       with atGoogleMapsLib.atGoogleMapsMod.QueryAutocompleteResponseStatus
       with atGoogleMapsLib.atGoogleMapsMod.ReverseGeocodingResponseStatus
       with atGoogleMapsLib.atGoogleMapsMod.SearchResponseStatus
       with atGoogleMapsLib.atGoogleMapsMod.TimeZoneResponseStatus
  
  @js.native
  sealed trait ROOFTOP
    extends atGoogleMapsLib.atGoogleMapsMod.LocationType
       with atGoogleMapsLib.atGoogleMapsMod.ReverseGeocodingLocationType
  
  @js.native
  sealed trait SHARE_TAXI
    extends atGoogleMapsLib.atGoogleMapsMod.VehicleType
  
  @js.native
  sealed trait SUBWAY
    extends atGoogleMapsLib.atGoogleMapsMod.VehicleType
  
  @js.native
  sealed trait TRAM
    extends atGoogleMapsLib.atGoogleMapsMod.VehicleType
  
  @js.native
  sealed trait TROLLEYBUS
    extends atGoogleMapsLib.atGoogleMapsMod.VehicleType
  
  @js.native
  sealed trait UNKNOWN_ERROR
    extends atGoogleMapsLib.atGoogleMapsMod.DirectionsReponseStatus
       with atGoogleMapsLib.atGoogleMapsMod.DistanceMatrixResponseTopLevelStatus
       with atGoogleMapsLib.atGoogleMapsMod.ElevationResponseStatus
       with atGoogleMapsLib.atGoogleMapsMod.GeocodingResponseStatus
       with atGoogleMapsLib.atGoogleMapsMod.PlaceAutocompleteResponseStatus
       with atGoogleMapsLib.atGoogleMapsMod.PlaceDetailsResponseStatus
       with atGoogleMapsLib.atGoogleMapsMod.QueryAutocompleteResponseStatus
       with atGoogleMapsLib.atGoogleMapsMod.ReverseGeocodingResponseStatus
       with atGoogleMapsLib.atGoogleMapsMod.SearchResponseStatus
       with atGoogleMapsLib.atGoogleMapsMod.TimeZoneResponseStatus
  
  @js.native
  sealed trait ZERO_RESULTS
    extends atGoogleMapsLib.atGoogleMapsMod.DirectionsReponseStatus
       with atGoogleMapsLib.atGoogleMapsMod.DistanceMatrixResponseElementLevelStatus
       with atGoogleMapsLib.atGoogleMapsMod.GeocodedWaypointStatus
       with atGoogleMapsLib.atGoogleMapsMod.GeocodingResponseStatus
       with atGoogleMapsLib.atGoogleMapsMod.PlaceAutocompleteResponseStatus
       with atGoogleMapsLib.atGoogleMapsMod.PlaceDetailsResponseStatus
       with atGoogleMapsLib.atGoogleMapsMod.QueryAutocompleteResponseStatus
       with atGoogleMapsLib.atGoogleMapsMod.ReverseGeocodingResponseStatus
       with atGoogleMapsLib.atGoogleMapsMod.SearchResponseStatus
       with atGoogleMapsLib.atGoogleMapsMod.TimeZoneResponseStatus
  
  @js.native
  sealed trait accounting
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait address
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceAutocompleteType
  
  @js.native
  sealed trait address_component
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceDetailsRequestField
  
  @js.native
  sealed trait administrative_area_level_1
    extends atGoogleMapsLib.atGoogleMapsMod.AddressType
       with atGoogleMapsLib.atGoogleMapsMod.PlaceType2
  
  @js.native
  sealed trait administrative_area_level_2
    extends atGoogleMapsLib.atGoogleMapsMod.AddressType
       with atGoogleMapsLib.atGoogleMapsMod.PlaceType2
  
  @js.native
  sealed trait administrative_area_level_3
    extends atGoogleMapsLib.atGoogleMapsMod.AddressType
       with atGoogleMapsLib.atGoogleMapsMod.PlaceType2
  
  @js.native
  sealed trait administrative_area_level_4
    extends atGoogleMapsLib.atGoogleMapsMod.AddressType
       with atGoogleMapsLib.atGoogleMapsMod.PlaceType2
  
  @js.native
  sealed trait administrative_area_level_5
    extends atGoogleMapsLib.atGoogleMapsMod.AddressType
       with atGoogleMapsLib.atGoogleMapsMod.PlaceType2
  
  @js.native
  sealed trait adr_address
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceDetailsRequestField
  
  @js.native
  sealed trait airport
    extends atGoogleMapsLib.atGoogleMapsMod.AddressType
       with atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait alt_id
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceDetailsRequestField
  
  @js.native
  sealed trait alt_ids extends js.Object
  
  @js.native
  sealed trait amusement_park
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait appeal
    extends atGoogleMapsLib.atGoogleMapsMod.AspectRatingType
  
  @js.native
  sealed trait aquarium
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait ar
    extends atGoogleMapsLib.atGoogleMapsMod.Language
  
  @js.native
  sealed trait art_gallery
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait atm
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait atmosphere
    extends atGoogleMapsLib.atGoogleMapsMod.AspectRatingType
  
  @js.native
  sealed trait bakery
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait bank
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait bar
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait be
    extends atGoogleMapsLib.atGoogleMapsMod.Language
  
  @js.native
  sealed trait beauty_salon
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait best_guess
    extends atGoogleMapsLib.atGoogleMapsMod.TrafficModel
  
  @js.native
  sealed trait bg
    extends atGoogleMapsLib.atGoogleMapsMod.Language
  
  @js.native
  sealed trait bicycle_store
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait bicycling
    extends atGoogleMapsLib.atGoogleMapsMod.TravelMode
  
  @js.native
  sealed trait bn
    extends atGoogleMapsLib.atGoogleMapsMod.Language
  
  @js.native
  sealed trait book_store
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait bowling_alley
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait bus
    extends atGoogleMapsLib.atGoogleMapsMod.TransitMode
  
  @js.native
  sealed trait bus_station
    extends atGoogleMapsLib.atGoogleMapsMod.GeocodingAddressComponentType
       with atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait ca
    extends atGoogleMapsLib.atGoogleMapsMod.Language
  
  @js.native
  sealed trait cafe
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait campground
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait car_dealer
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait car_rental
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait car_repair
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait car_wash
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait casino
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait cdma
    extends atGoogleMapsLib.atGoogleMapsMod.RadioType
  
  @js.native
  sealed trait cemetery
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait church
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait city_hall
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait clothing_store
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait colloquial_area
    extends atGoogleMapsLib.atGoogleMapsMod.AddressType
       with atGoogleMapsLib.atGoogleMapsMod.PlaceType2
  
  @js.native
  sealed trait convenience_store
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait country
    extends atGoogleMapsLib.atGoogleMapsMod.AddressType
       with atGoogleMapsLib.atGoogleMapsMod.PlaceType2
  
  @js.native
  sealed trait courthouse
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait cs
    extends atGoogleMapsLib.atGoogleMapsMod.Language
  
  @js.native
  sealed trait da
    extends atGoogleMapsLib.atGoogleMapsMod.Language
  
  @js.native
  sealed trait dailyLimitExceeded
    extends atGoogleMapsLib.atGoogleMapsMod.GeolocationErrorReason
  
  @js.native
  sealed trait de
    extends atGoogleMapsLib.atGoogleMapsMod.Language
  
  @js.native
  sealed trait decor
    extends atGoogleMapsLib.atGoogleMapsMod.AspectRatingType
  
  @js.native
  sealed trait dentist
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait department_store
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait distance
    extends atGoogleMapsLib.atGoogleMapsMod.PlacesNearbyRanking
  
  @js.native
  sealed trait doctor
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait driving
    extends atGoogleMapsLib.atGoogleMapsMod.TravelMode
  
  @js.native
  sealed trait el
    extends atGoogleMapsLib.atGoogleMapsMod.Language
  
  @js.native
  sealed trait electrician
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait electronics_store
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait embassy
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait en
    extends atGoogleMapsLib.atGoogleMapsMod.Language
  
  @js.native
  sealed trait `en-Au`
    extends atGoogleMapsLib.atGoogleMapsMod.Language
  
  @js.native
  sealed trait `en-GB`
    extends atGoogleMapsLib.atGoogleMapsMod.Language
  
  @js.native
  sealed trait es
    extends atGoogleMapsLib.atGoogleMapsMod.Language
  
  @js.native
  sealed trait establishment
    extends atGoogleMapsLib.atGoogleMapsMod.GeocodingAddressComponentType
       with atGoogleMapsLib.atGoogleMapsMod.PlaceAutocompleteType
       with atGoogleMapsLib.atGoogleMapsMod.PlaceType2
  
  @js.native
  sealed trait eu
    extends atGoogleMapsLib.atGoogleMapsMod.Language
  
  @js.native
  sealed trait fa
    extends atGoogleMapsLib.atGoogleMapsMod.Language
  
  @js.native
  sealed trait facilities
    extends atGoogleMapsLib.atGoogleMapsMod.AspectRatingType
  
  @js.native
  sealed trait ferries
    extends atGoogleMapsLib.atGoogleMapsMod.TravelRestriction
  
  @js.native
  sealed trait ferry
    extends atGoogleMapsLib.atGoogleMapsMod.Maneuver
  
  @js.native
  sealed trait `ferry-train`
    extends atGoogleMapsLib.atGoogleMapsMod.Maneuver
  
  @js.native
  sealed trait fewer_transfers
    extends atGoogleMapsLib.atGoogleMapsMod.TransitRoutingPreference
  
  @js.native
  sealed trait fi
    extends atGoogleMapsLib.atGoogleMapsMod.Language
  
  @js.native
  sealed trait fil
    extends atGoogleMapsLib.atGoogleMapsMod.Language
  
  @js.native
  sealed trait finance
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType2
  
  @js.native
  sealed trait fire_station
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait floor
    extends atGoogleMapsLib.atGoogleMapsMod.GeocodingAddressComponentType
       with atGoogleMapsLib.atGoogleMapsMod.PlaceType2
  
  @js.native
  sealed trait florist
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait food
    extends atGoogleMapsLib.atGoogleMapsMod.AspectRatingType
       with atGoogleMapsLib.atGoogleMapsMod.PlaceType2
  
  @js.native
  sealed trait `fork-left`
    extends atGoogleMapsLib.atGoogleMapsMod.Maneuver
  
  @js.native
  sealed trait `fork-right`
    extends atGoogleMapsLib.atGoogleMapsMod.Maneuver
  
  @js.native
  sealed trait formatted_address
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceDetailsRequestField
  
  @js.native
  sealed trait formatted_phone_number
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceDetailsRequestField
  
  @js.native
  sealed trait fr
    extends atGoogleMapsLib.atGoogleMapsMod.Language
  
  @js.native
  sealed trait funeral_home
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait furniture_store
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait gas_station
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait general_contractor
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType2
  
  @js.native
  sealed trait geocode
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceAutocompleteType
       with atGoogleMapsLib.atGoogleMapsMod.PlaceType2
  
  @js.native
  sealed trait geometry
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceDetailsRequestField
  
  @js.native
  sealed trait gl
    extends atGoogleMapsLib.atGoogleMapsMod.Language
  
  @js.native
  sealed trait gsm
    extends atGoogleMapsLib.atGoogleMapsMod.RadioType
  
  @js.native
  sealed trait gu
    extends atGoogleMapsLib.atGoogleMapsMod.Language
  
  @js.native
  sealed trait gym
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait hair_care
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait hardware_store
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait health
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType2
  
  @js.native
  sealed trait hi
    extends atGoogleMapsLib.atGoogleMapsMod.Language
  
  @js.native
  sealed trait highways
    extends atGoogleMapsLib.atGoogleMapsMod.TravelRestriction
  
  @js.native
  sealed trait hindu_temple
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait home_goods_store
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait hospital
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait hr
    extends atGoogleMapsLib.atGoogleMapsMod.Language
  
  @js.native
  sealed trait hu
    extends atGoogleMapsLib.atGoogleMapsMod.Language
  
  @js.native
  sealed trait icon
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceDetailsRequestField
  
  @js.native
  sealed trait id
    extends atGoogleMapsLib.atGoogleMapsMod.Language
       with atGoogleMapsLib.atGoogleMapsMod.PlaceDetailsRequestField
  
  @js.native
  sealed trait imperial
    extends atGoogleMapsLib.atGoogleMapsMod.UnitSystem
  
  @js.native
  sealed trait indoor
    extends atGoogleMapsLib.atGoogleMapsMod.TravelRestriction
  
  @js.native
  sealed trait insurance_agency
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait international_phone_number
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceDetailsRequestField
  
  @js.native
  sealed trait intersection
    extends atGoogleMapsLib.atGoogleMapsMod.AddressType
       with atGoogleMapsLib.atGoogleMapsMod.PlaceType2
  
  @js.native
  sealed trait it
    extends atGoogleMapsLib.atGoogleMapsMod.Language
  
  @js.native
  sealed trait iw
    extends atGoogleMapsLib.atGoogleMapsMod.Language
  
  @js.native
  sealed trait ja
    extends atGoogleMapsLib.atGoogleMapsMod.Language
  
  @js.native
  sealed trait jewelry_store
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait keyInvalid
    extends atGoogleMapsLib.atGoogleMapsMod.GeolocationErrorReason
  
  @js.native
  sealed trait kk
    extends atGoogleMapsLib.atGoogleMapsMod.Language
  
  @js.native
  sealed trait kn
    extends atGoogleMapsLib.atGoogleMapsMod.Language
  
  @js.native
  sealed trait ko
    extends atGoogleMapsLib.atGoogleMapsMod.Language
  
  @js.native
  sealed trait ky
    extends atGoogleMapsLib.atGoogleMapsMod.Language
  
  @js.native
  sealed trait laundry
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait lawyer
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait less_walking
    extends atGoogleMapsLib.atGoogleMapsMod.TransitRoutingPreference
  
  @js.native
  sealed trait library
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait liquor_store
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait local_government_office
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait locality
    extends atGoogleMapsLib.atGoogleMapsMod.AddressType
       with atGoogleMapsLib.atGoogleMapsMod.PlaceType2
  
  @js.native
  sealed trait locksmith
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait lodging
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait lt
    extends atGoogleMapsLib.atGoogleMapsMod.Language
  
  @js.native
  sealed trait lte
    extends atGoogleMapsLib.atGoogleMapsMod.RadioType
  
  @js.native
  sealed trait lv
    extends atGoogleMapsLib.atGoogleMapsMod.Language
  
  @js.native
  sealed trait meal_delivery
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait meal_takeaway
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait merge
    extends atGoogleMapsLib.atGoogleMapsMod.Maneuver
  
  @js.native
  sealed trait metric
    extends atGoogleMapsLib.atGoogleMapsMod.UnitSystem
  
  @js.native
  sealed trait mk
    extends atGoogleMapsLib.atGoogleMapsMod.Language
  
  @js.native
  sealed trait ml
    extends atGoogleMapsLib.atGoogleMapsMod.Language
  
  @js.native
  sealed trait mosque
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait movie_rental
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait movie_theater
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait moving_company
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait mr
    extends atGoogleMapsLib.atGoogleMapsMod.Language
  
  @js.native
  sealed trait museum
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait my
    extends atGoogleMapsLib.atGoogleMapsMod.Language
  
  @js.native
  sealed trait name
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceDetailsRequestField
  
  @js.native
  sealed trait natural_feature
    extends atGoogleMapsLib.atGoogleMapsMod.AddressType
       with atGoogleMapsLib.atGoogleMapsMod.PlaceType2
  
  @js.native
  sealed trait neighborhood
    extends atGoogleMapsLib.atGoogleMapsMod.AddressType
       with atGoogleMapsLib.atGoogleMapsMod.PlaceType2
  
  @js.native
  sealed trait night_club
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait nl
    extends atGoogleMapsLib.atGoogleMapsMod.Language
  
  @js.native
  sealed trait no
    extends atGoogleMapsLib.atGoogleMapsMod.Language
  
  @js.native
  sealed trait notFound
    extends atGoogleMapsLib.atGoogleMapsMod.GeolocationErrorReason
  
  @js.native
  sealed trait opening_hours
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceDetailsRequestField
  
  @js.native
  sealed trait optimistic
    extends atGoogleMapsLib.atGoogleMapsMod.TrafficModel
  
  @js.native
  sealed trait overall
    extends atGoogleMapsLib.atGoogleMapsMod.AspectRatingType
  
  @js.native
  sealed trait pa
    extends atGoogleMapsLib.atGoogleMapsMod.Language
  
  @js.native
  sealed trait painter
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait park
    extends atGoogleMapsLib.atGoogleMapsMod.AddressType
       with atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait parking
    extends atGoogleMapsLib.atGoogleMapsMod.GeocodingAddressComponentType
       with atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait parseError
    extends atGoogleMapsLib.atGoogleMapsMod.GeolocationErrorReason
  
  @js.native
  sealed trait permanently_closed
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceDetailsRequestField
  
  @js.native
  sealed trait pessimistic
    extends atGoogleMapsLib.atGoogleMapsMod.TrafficModel
  
  @js.native
  sealed trait pet_store
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait pharmacy
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait phonenumber extends js.Object
  
  @js.native
  sealed trait photo
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceDetailsRequestField
  
  @js.native
  sealed trait photos extends js.Object
  
  @js.native
  sealed trait physiotherapist
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait pl
    extends atGoogleMapsLib.atGoogleMapsMod.Language
  
  @js.native
  sealed trait place_id
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceDetailsRequestField
  
  @js.native
  sealed trait place_of_worship
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType2
  
  @js.native
  sealed trait plumber
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait plus_code
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceDetailsRequestField
  
  @js.native
  sealed trait point_of_interest
    extends atGoogleMapsLib.atGoogleMapsMod.AddressType
       with atGoogleMapsLib.atGoogleMapsMod.GeocodingAddressComponentType
       with atGoogleMapsLib.atGoogleMapsMod.PlaceType2
  
  @js.native
  sealed trait police
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait political
    extends atGoogleMapsLib.atGoogleMapsMod.AddressType
       with atGoogleMapsLib.atGoogleMapsMod.PlaceType2
  
  @js.native
  sealed trait post_box
    extends atGoogleMapsLib.atGoogleMapsMod.GeocodingAddressComponentType
       with atGoogleMapsLib.atGoogleMapsMod.PlaceType2
  
  @js.native
  sealed trait post_office
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait postal_code
    extends atGoogleMapsLib.atGoogleMapsMod.AddressType
       with atGoogleMapsLib.atGoogleMapsMod.PlaceType2
  
  @js.native
  sealed trait postal_code_prefix
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType2
  
  @js.native
  sealed trait postal_code_suffix
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType2
  
  @js.native
  sealed trait postal_town
    extends atGoogleMapsLib.atGoogleMapsMod.GeocodingAddressComponentType
       with atGoogleMapsLib.atGoogleMapsMod.PlaceType2
  
  @js.native
  sealed trait premise
    extends atGoogleMapsLib.atGoogleMapsMod.AddressType
       with atGoogleMapsLib.atGoogleMapsMod.PlaceType2
  
  @js.native
  sealed trait price_level
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceDetailsRequestField
  
  @js.native
  sealed trait prominence
    extends atGoogleMapsLib.atGoogleMapsMod.PlacesNearbyRanking
  
  @js.native
  sealed trait pt
    extends atGoogleMapsLib.atGoogleMapsMod.Language
  
  @js.native
  sealed trait `pt-BR`
    extends atGoogleMapsLib.atGoogleMapsMod.Language
  
  @js.native
  sealed trait `pt-PT`
    extends atGoogleMapsLib.atGoogleMapsMod.Language
  
  @js.native
  sealed trait quality
    extends atGoogleMapsLib.atGoogleMapsMod.AspectRatingType
  
  @js.native
  sealed trait rail
    extends atGoogleMapsLib.atGoogleMapsMod.TransitMode
  
  @js.native
  sealed trait `ramp-left`
    extends atGoogleMapsLib.atGoogleMapsMod.Maneuver
  
  @js.native
  sealed trait `ramp-right`
    extends atGoogleMapsLib.atGoogleMapsMod.Maneuver
  
  @js.native
  sealed trait rating
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceDetailsRequestField
  
  @js.native
  sealed trait real_estate_agency
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait restaurant
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait review
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceDetailsRequestField
  
  @js.native
  sealed trait ro
    extends atGoogleMapsLib.atGoogleMapsMod.Language
  
  @js.native
  sealed trait roofing_contractor
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait room
    extends atGoogleMapsLib.atGoogleMapsMod.GeocodingAddressComponentType
       with atGoogleMapsLib.atGoogleMapsMod.PlaceType2
  
  @js.native
  sealed trait `roundabout-left`
    extends atGoogleMapsLib.atGoogleMapsMod.Maneuver
  
  @js.native
  sealed trait `roundabout-right`
    extends atGoogleMapsLib.atGoogleMapsMod.Maneuver
  
  @js.native
  sealed trait route
    extends atGoogleMapsLib.atGoogleMapsMod.AddressType
       with atGoogleMapsLib.atGoogleMapsMod.PlaceType2
  
  @js.native
  sealed trait ru
    extends atGoogleMapsLib.atGoogleMapsMod.Language
  
  @js.native
  sealed trait rv_park
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait school
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait scope
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceDetailsRequestField
  
  @js.native
  sealed trait service
    extends atGoogleMapsLib.atGoogleMapsMod.AspectRatingType
  
  @js.native
  sealed trait shoe_store
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait shopping_mall
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait sk
    extends atGoogleMapsLib.atGoogleMapsMod.Language
  
  @js.native
  sealed trait sl
    extends atGoogleMapsLib.atGoogleMapsMod.Language
  
  @js.native
  sealed trait spa
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait sq
    extends atGoogleMapsLib.atGoogleMapsMod.Language
  
  @js.native
  sealed trait sr
    extends atGoogleMapsLib.atGoogleMapsMod.Language
  
  @js.native
  sealed trait stadium
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait storage
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait store
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait straight
    extends atGoogleMapsLib.atGoogleMapsMod.Maneuver
  
  @js.native
  sealed trait street_address
    extends atGoogleMapsLib.atGoogleMapsMod.AddressType
       with atGoogleMapsLib.atGoogleMapsMod.PlaceType2
  
  @js.native
  sealed trait street_number
    extends atGoogleMapsLib.atGoogleMapsMod.GeocodingAddressComponentType
       with atGoogleMapsLib.atGoogleMapsMod.PlaceType2
  
  @js.native
  sealed trait sublocality
    extends atGoogleMapsLib.atGoogleMapsMod.AddressType
       with atGoogleMapsLib.atGoogleMapsMod.PlaceType2
  
  @js.native
  sealed trait sublocality_level_1
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType2
  
  @js.native
  sealed trait sublocality_level_2
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType2
  
  @js.native
  sealed trait sublocality_level_3
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType2
  
  @js.native
  sealed trait sublocality_level_4
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType2
  
  @js.native
  sealed trait sublocality_level_5
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType2
  
  @js.native
  sealed trait subpremise
    extends atGoogleMapsLib.atGoogleMapsMod.AddressType
       with atGoogleMapsLib.atGoogleMapsMod.PlaceType2
  
  @js.native
  sealed trait subway
    extends atGoogleMapsLib.atGoogleMapsMod.TransitMode
  
  @js.native
  sealed trait subway_station
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait supermarket
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait sv
    extends atGoogleMapsLib.atGoogleMapsMod.Language
  
  @js.native
  sealed trait synagogue
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait ta
    extends atGoogleMapsLib.atGoogleMapsMod.Language
  
  @js.native
  sealed trait taxi_stand
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait te
    extends atGoogleMapsLib.atGoogleMapsMod.Language
  
  @js.native
  sealed trait textquery extends js.Object
  
  @js.native
  sealed trait th
    extends atGoogleMapsLib.atGoogleMapsMod.Language
  
  @js.native
  sealed trait timeout extends js.Object
  
  @js.native
  sealed trait tl
    extends atGoogleMapsLib.atGoogleMapsMod.Language
  
  @js.native
  sealed trait tolls
    extends atGoogleMapsLib.atGoogleMapsMod.TravelRestriction
  
  @js.native
  sealed trait tr
    extends atGoogleMapsLib.atGoogleMapsMod.Language
  
  @js.native
  sealed trait train
    extends atGoogleMapsLib.atGoogleMapsMod.TransitMode
  
  @js.native
  sealed trait train_station
    extends atGoogleMapsLib.atGoogleMapsMod.GeocodingAddressComponentType
       with atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait tram
    extends atGoogleMapsLib.atGoogleMapsMod.TransitMode
  
  @js.native
  sealed trait transit
    extends atGoogleMapsLib.atGoogleMapsMod.TravelMode
  
  @js.native
  sealed trait transit_station
    extends atGoogleMapsLib.atGoogleMapsMod.GeocodingAddressComponentType
       with atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait travel_agency
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait `turn-left`
    extends atGoogleMapsLib.atGoogleMapsMod.Maneuver
  
  @js.native
  sealed trait `turn-right`
    extends atGoogleMapsLib.atGoogleMapsMod.Maneuver
  
  @js.native
  sealed trait `turn-sharp-left`
    extends atGoogleMapsLib.atGoogleMapsMod.Maneuver
  
  @js.native
  sealed trait `turn-sharp-right`
    extends atGoogleMapsLib.atGoogleMapsMod.Maneuver
  
  @js.native
  sealed trait `turn-slight-left`
    extends atGoogleMapsLib.atGoogleMapsMod.Maneuver
  
  @js.native
  sealed trait `turn-slight-right`
    extends atGoogleMapsLib.atGoogleMapsMod.Maneuver
  
  @js.native
  sealed trait `type`
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceDetailsRequestField
  
  @js.native
  sealed trait types extends js.Object
  
  @js.native
  sealed trait uk
    extends atGoogleMapsLib.atGoogleMapsMod.Language
  
  @js.native
  sealed trait url
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceDetailsRequestField
  
  @js.native
  sealed trait userRateLimitExceeded
    extends atGoogleMapsLib.atGoogleMapsMod.GeolocationErrorReason
  
  @js.native
  sealed trait user_ratings_total
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceDetailsRequestField
  
  @js.native
  sealed trait utc_offset
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceDetailsRequestField
  
  @js.native
  sealed trait `uturn-left`
    extends atGoogleMapsLib.atGoogleMapsMod.Maneuver
  
  @js.native
  sealed trait `uturn-right`
    extends atGoogleMapsLib.atGoogleMapsMod.Maneuver
  
  @js.native
  sealed trait uz
    extends atGoogleMapsLib.atGoogleMapsMod.Language
  
  @js.native
  sealed trait veterinary_care
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @js.native
  sealed trait vi
    extends atGoogleMapsLib.atGoogleMapsMod.Language
  
  @js.native
  sealed trait vicinity
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceDetailsRequestField
  
  @js.native
  sealed trait walking
    extends atGoogleMapsLib.atGoogleMapsMod.TravelMode
  
  @js.native
  sealed trait ward
    extends atGoogleMapsLib.atGoogleMapsMod.AddressType
  
  @js.native
  sealed trait wcdma
    extends atGoogleMapsLib.atGoogleMapsMod.RadioType
  
  @js.native
  sealed trait website
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceDetailsRequestField
  
  @js.native
  sealed trait `zh-CN`
    extends atGoogleMapsLib.atGoogleMapsMod.Language
  
  @js.native
  sealed trait `zh-TW`
    extends atGoogleMapsLib.atGoogleMapsMod.Language
  
  @js.native
  sealed trait zoo
    extends atGoogleMapsLib.atGoogleMapsMod.PlaceType1
  
  @scala.inline
  def `(cities)`: `(cities)` = "(cities)".asInstanceOf[`(cities)`]
  @scala.inline
  def `(regions)`: `(regions)` = "(regions)".asInstanceOf[`(regions)`]
  @scala.inline
  def APP: APP = "APP".asInstanceOf[APP]
  @scala.inline
  def APPROXIMATE: APPROXIMATE = "APPROXIMATE".asInstanceOf[APPROXIMATE]
  @scala.inline
  def BUS: BUS = "BUS".asInstanceOf[BUS]
  @scala.inline
  def CABLE_CAR: CABLE_CAR = "CABLE_CAR".asInstanceOf[CABLE_CAR]
  @scala.inline
  def COMMUTER_TRAIN: COMMUTER_TRAIN = "COMMUTER_TRAIN".asInstanceOf[COMMUTER_TRAIN]
  @scala.inline
  def FERRY: FERRY = "FERRY".asInstanceOf[FERRY]
  @scala.inline
  def FUNICULAR: FUNICULAR = "FUNICULAR".asInstanceOf[FUNICULAR]
  @scala.inline
  def GEOMETRIC_CENTER: GEOMETRIC_CENTER = "GEOMETRIC_CENTER".asInstanceOf[GEOMETRIC_CENTER]
  @scala.inline
  def GONDOLA_LIFT: GONDOLA_LIFT = "GONDOLA_LIFT".asInstanceOf[GONDOLA_LIFT]
  @scala.inline
  def GOOGLE: GOOGLE = "GOOGLE".asInstanceOf[GOOGLE]
  @scala.inline
  def HEAVY_RAIL: HEAVY_RAIL = "HEAVY_RAIL".asInstanceOf[HEAVY_RAIL]
  @scala.inline
  def HIGH_SPEED_TRAIN: HIGH_SPEED_TRAIN = "HIGH_SPEED_TRAIN".asInstanceOf[HIGH_SPEED_TRAIN]
  @scala.inline
  def INTERCITY_BUS: INTERCITY_BUS = "INTERCITY_BUS".asInstanceOf[INTERCITY_BUS]
  @scala.inline
  def INVALID_REQUEST: INVALID_REQUEST = "INVALID_REQUEST".asInstanceOf[INVALID_REQUEST]
  @scala.inline
  def KPH: KPH = "KPH".asInstanceOf[KPH]
  @scala.inline
  def MAX_ELEMENTS_EXCEEDED: MAX_ELEMENTS_EXCEEDED = "MAX_ELEMENTS_EXCEEDED".asInstanceOf[MAX_ELEMENTS_EXCEEDED]
  @scala.inline
  def MAX_ROUTE_LENGTH_EXCEEDED: MAX_ROUTE_LENGTH_EXCEEDED = "MAX_ROUTE_LENGTH_EXCEEDED".asInstanceOf[MAX_ROUTE_LENGTH_EXCEEDED]
  @scala.inline
  def `MAX_ROUTE_LENGTH_EXCEEDED `: `MAX_ROUTE_LENGTH_EXCEEDED ` = "MAX_ROUTE_LENGTH_EXCEEDED ".asInstanceOf[`MAX_ROUTE_LENGTH_EXCEEDED `]
  @scala.inline
  def MAX_WAYPOINTS_EXCEEDED: MAX_WAYPOINTS_EXCEEDED = "MAX_WAYPOINTS_EXCEEDED".asInstanceOf[MAX_WAYPOINTS_EXCEEDED]
  @scala.inline
  def METRO_RAIL: METRO_RAIL = "METRO_RAIL".asInstanceOf[METRO_RAIL]
  @scala.inline
  def MONORAIL: MONORAIL = "MONORAIL".asInstanceOf[MONORAIL]
  @scala.inline
  def MPH: MPH = "MPH".asInstanceOf[MPH]
  @scala.inline
  def NOT_FOUND: NOT_FOUND = "NOT_FOUND".asInstanceOf[NOT_FOUND]
  @scala.inline
  def OK: OK = "OK".asInstanceOf[OK]
  @scala.inline
  def OTHER: OTHER = "OTHER".asInstanceOf[OTHER]
  @scala.inline
  def OVER_DAILY_LIMIT: OVER_DAILY_LIMIT = "OVER_DAILY_LIMIT".asInstanceOf[OVER_DAILY_LIMIT]
  @scala.inline
  def OVER_QUERY_LIMIT: OVER_QUERY_LIMIT = "OVER_QUERY_LIMIT".asInstanceOf[OVER_QUERY_LIMIT]
  @scala.inline
  def RAIL: RAIL = "RAIL".asInstanceOf[RAIL]
  @scala.inline
  def RANGE_INTERPOLATED: RANGE_INTERPOLATED = "RANGE_INTERPOLATED".asInstanceOf[RANGE_INTERPOLATED]
  @scala.inline
  def REQUEST_DENIED: REQUEST_DENIED = "REQUEST_DENIED".asInstanceOf[REQUEST_DENIED]
  @scala.inline
  def ROOFTOP: ROOFTOP = "ROOFTOP".asInstanceOf[ROOFTOP]
  @scala.inline
  def SHARE_TAXI: SHARE_TAXI = "SHARE_TAXI".asInstanceOf[SHARE_TAXI]
  @scala.inline
  def SUBWAY: SUBWAY = "SUBWAY".asInstanceOf[SUBWAY]
  @scala.inline
  def TRAM: TRAM = "TRAM".asInstanceOf[TRAM]
  @scala.inline
  def TROLLEYBUS: TROLLEYBUS = "TROLLEYBUS".asInstanceOf[TROLLEYBUS]
  @scala.inline
  def UNKNOWN_ERROR: UNKNOWN_ERROR = "UNKNOWN_ERROR".asInstanceOf[UNKNOWN_ERROR]
  @scala.inline
  def ZERO_RESULTS: ZERO_RESULTS = "ZERO_RESULTS".asInstanceOf[ZERO_RESULTS]
  @scala.inline
  def accounting: accounting = "accounting".asInstanceOf[accounting]
  @scala.inline
  def address: address = "address".asInstanceOf[address]
  @scala.inline
  def address_component: address_component = "address_component".asInstanceOf[address_component]
  @scala.inline
  def administrative_area_level_1: administrative_area_level_1 = "administrative_area_level_1".asInstanceOf[administrative_area_level_1]
  @scala.inline
  def administrative_area_level_2: administrative_area_level_2 = "administrative_area_level_2".asInstanceOf[administrative_area_level_2]
  @scala.inline
  def administrative_area_level_3: administrative_area_level_3 = "administrative_area_level_3".asInstanceOf[administrative_area_level_3]
  @scala.inline
  def administrative_area_level_4: administrative_area_level_4 = "administrative_area_level_4".asInstanceOf[administrative_area_level_4]
  @scala.inline
  def administrative_area_level_5: administrative_area_level_5 = "administrative_area_level_5".asInstanceOf[administrative_area_level_5]
  @scala.inline
  def adr_address: adr_address = "adr_address".asInstanceOf[adr_address]
  @scala.inline
  def airport: airport = "airport".asInstanceOf[airport]
  @scala.inline
  def alt_id: alt_id = "alt_id".asInstanceOf[alt_id]
  @scala.inline
  def alt_ids: alt_ids = "alt_ids".asInstanceOf[alt_ids]
  @scala.inline
  def amusement_park: amusement_park = "amusement_park".asInstanceOf[amusement_park]
  @scala.inline
  def appeal: appeal = "appeal".asInstanceOf[appeal]
  @scala.inline
  def aquarium: aquarium = "aquarium".asInstanceOf[aquarium]
  @scala.inline
  def ar: ar = "ar".asInstanceOf[ar]
  @scala.inline
  def art_gallery: art_gallery = "art_gallery".asInstanceOf[art_gallery]
  @scala.inline
  def atm: atm = "atm".asInstanceOf[atm]
  @scala.inline
  def atmosphere: atmosphere = "atmosphere".asInstanceOf[atmosphere]
  @scala.inline
  def bakery: bakery = "bakery".asInstanceOf[bakery]
  @scala.inline
  def bank: bank = "bank".asInstanceOf[bank]
  @scala.inline
  def bar: bar = "bar".asInstanceOf[bar]
  @scala.inline
  def be: be = "be".asInstanceOf[be]
  @scala.inline
  def beauty_salon: beauty_salon = "beauty_salon".asInstanceOf[beauty_salon]
  @scala.inline
  def best_guess: best_guess = "best_guess".asInstanceOf[best_guess]
  @scala.inline
  def bg: bg = "bg".asInstanceOf[bg]
  @scala.inline
  def bicycle_store: bicycle_store = "bicycle_store".asInstanceOf[bicycle_store]
  @scala.inline
  def bicycling: bicycling = "bicycling".asInstanceOf[bicycling]
  @scala.inline
  def bn: bn = "bn".asInstanceOf[bn]
  @scala.inline
  def book_store: book_store = "book_store".asInstanceOf[book_store]
  @scala.inline
  def bowling_alley: bowling_alley = "bowling_alley".asInstanceOf[bowling_alley]
  @scala.inline
  def bus: bus = "bus".asInstanceOf[bus]
  @scala.inline
  def bus_station: bus_station = "bus_station".asInstanceOf[bus_station]
  @scala.inline
  def ca: ca = "ca".asInstanceOf[ca]
  @scala.inline
  def cafe: cafe = "cafe".asInstanceOf[cafe]
  @scala.inline
  def campground: campground = "campground".asInstanceOf[campground]
  @scala.inline
  def car_dealer: car_dealer = "car_dealer".asInstanceOf[car_dealer]
  @scala.inline
  def car_rental: car_rental = "car_rental".asInstanceOf[car_rental]
  @scala.inline
  def car_repair: car_repair = "car_repair".asInstanceOf[car_repair]
  @scala.inline
  def car_wash: car_wash = "car_wash".asInstanceOf[car_wash]
  @scala.inline
  def casino: casino = "casino".asInstanceOf[casino]
  @scala.inline
  def cdma: cdma = "cdma".asInstanceOf[cdma]
  @scala.inline
  def cemetery: cemetery = "cemetery".asInstanceOf[cemetery]
  @scala.inline
  def church: church = "church".asInstanceOf[church]
  @scala.inline
  def city_hall: city_hall = "city_hall".asInstanceOf[city_hall]
  @scala.inline
  def clothing_store: clothing_store = "clothing_store".asInstanceOf[clothing_store]
  @scala.inline
  def colloquial_area: colloquial_area = "colloquial_area".asInstanceOf[colloquial_area]
  @scala.inline
  def convenience_store: convenience_store = "convenience_store".asInstanceOf[convenience_store]
  @scala.inline
  def country: country = "country".asInstanceOf[country]
  @scala.inline
  def courthouse: courthouse = "courthouse".asInstanceOf[courthouse]
  @scala.inline
  def cs: cs = "cs".asInstanceOf[cs]
  @scala.inline
  def da: da = "da".asInstanceOf[da]
  @scala.inline
  def dailyLimitExceeded: dailyLimitExceeded = "dailyLimitExceeded".asInstanceOf[dailyLimitExceeded]
  @scala.inline
  def de: de = "de".asInstanceOf[de]
  @scala.inline
  def decor: decor = "decor".asInstanceOf[decor]
  @scala.inline
  def dentist: dentist = "dentist".asInstanceOf[dentist]
  @scala.inline
  def department_store: department_store = "department_store".asInstanceOf[department_store]
  @scala.inline
  def distance: distance = "distance".asInstanceOf[distance]
  @scala.inline
  def doctor: doctor = "doctor".asInstanceOf[doctor]
  @scala.inline
  def driving: driving = "driving".asInstanceOf[driving]
  @scala.inline
  def el: el = "el".asInstanceOf[el]
  @scala.inline
  def electrician: electrician = "electrician".asInstanceOf[electrician]
  @scala.inline
  def electronics_store: electronics_store = "electronics_store".asInstanceOf[electronics_store]
  @scala.inline
  def embassy: embassy = "embassy".asInstanceOf[embassy]
  @scala.inline
  def en: en = "en".asInstanceOf[en]
  @scala.inline
  def `en-Au`: `en-Au` = "en-Au".asInstanceOf[`en-Au`]
  @scala.inline
  def `en-GB`: `en-GB` = "en-GB".asInstanceOf[`en-GB`]
  @scala.inline
  def es: es = "es".asInstanceOf[es]
  @scala.inline
  def establishment: establishment = "establishment".asInstanceOf[establishment]
  @scala.inline
  def eu: eu = "eu".asInstanceOf[eu]
  @scala.inline
  def fa: fa = "fa".asInstanceOf[fa]
  @scala.inline
  def facilities: facilities = "facilities".asInstanceOf[facilities]
  @scala.inline
  def ferries: ferries = "ferries".asInstanceOf[ferries]
  @scala.inline
  def ferry: ferry = "ferry".asInstanceOf[ferry]
  @scala.inline
  def `ferry-train`: `ferry-train` = "ferry-train".asInstanceOf[`ferry-train`]
  @scala.inline
  def fewer_transfers: fewer_transfers = "fewer_transfers".asInstanceOf[fewer_transfers]
  @scala.inline
  def fi: fi = "fi".asInstanceOf[fi]
  @scala.inline
  def fil: fil = "fil".asInstanceOf[fil]
  @scala.inline
  def finance: finance = "finance".asInstanceOf[finance]
  @scala.inline
  def fire_station: fire_station = "fire_station".asInstanceOf[fire_station]
  @scala.inline
  def floor: floor = "floor".asInstanceOf[floor]
  @scala.inline
  def florist: florist = "florist".asInstanceOf[florist]
  @scala.inline
  def food: food = "food".asInstanceOf[food]
  @scala.inline
  def `fork-left`: `fork-left` = "fork-left".asInstanceOf[`fork-left`]
  @scala.inline
  def `fork-right`: `fork-right` = "fork-right".asInstanceOf[`fork-right`]
  @scala.inline
  def formatted_address: formatted_address = "formatted_address".asInstanceOf[formatted_address]
  @scala.inline
  def formatted_phone_number: formatted_phone_number = "formatted_phone_number".asInstanceOf[formatted_phone_number]
  @scala.inline
  def fr: fr = "fr".asInstanceOf[fr]
  @scala.inline
  def funeral_home: funeral_home = "funeral_home".asInstanceOf[funeral_home]
  @scala.inline
  def furniture_store: furniture_store = "furniture_store".asInstanceOf[furniture_store]
  @scala.inline
  def gas_station: gas_station = "gas_station".asInstanceOf[gas_station]
  @scala.inline
  def general_contractor: general_contractor = "general_contractor".asInstanceOf[general_contractor]
  @scala.inline
  def geocode: geocode = "geocode".asInstanceOf[geocode]
  @scala.inline
  def geometry: geometry = "geometry".asInstanceOf[geometry]
  @scala.inline
  def gl: gl = "gl".asInstanceOf[gl]
  @scala.inline
  def gsm: gsm = "gsm".asInstanceOf[gsm]
  @scala.inline
  def gu: gu = "gu".asInstanceOf[gu]
  @scala.inline
  def gym: gym = "gym".asInstanceOf[gym]
  @scala.inline
  def hair_care: hair_care = "hair_care".asInstanceOf[hair_care]
  @scala.inline
  def hardware_store: hardware_store = "hardware_store".asInstanceOf[hardware_store]
  @scala.inline
  def health: health = "health".asInstanceOf[health]
  @scala.inline
  def hi: hi = "hi".asInstanceOf[hi]
  @scala.inline
  def highways: highways = "highways".asInstanceOf[highways]
  @scala.inline
  def hindu_temple: hindu_temple = "hindu_temple".asInstanceOf[hindu_temple]
  @scala.inline
  def home_goods_store: home_goods_store = "home_goods_store".asInstanceOf[home_goods_store]
  @scala.inline
  def hospital: hospital = "hospital".asInstanceOf[hospital]
  @scala.inline
  def hr: hr = "hr".asInstanceOf[hr]
  @scala.inline
  def hu: hu = "hu".asInstanceOf[hu]
  @scala.inline
  def icon: icon = "icon".asInstanceOf[icon]
  @scala.inline
  def id: id = "id".asInstanceOf[id]
  @scala.inline
  def imperial: imperial = "imperial".asInstanceOf[imperial]
  @scala.inline
  def indoor: indoor = "indoor".asInstanceOf[indoor]
  @scala.inline
  def insurance_agency: insurance_agency = "insurance_agency".asInstanceOf[insurance_agency]
  @scala.inline
  def international_phone_number: international_phone_number = "international_phone_number".asInstanceOf[international_phone_number]
  @scala.inline
  def intersection: intersection = "intersection".asInstanceOf[intersection]
  @scala.inline
  def it: it = "it".asInstanceOf[it]
  @scala.inline
  def iw: iw = "iw".asInstanceOf[iw]
  @scala.inline
  def ja: ja = "ja".asInstanceOf[ja]
  @scala.inline
  def jewelry_store: jewelry_store = "jewelry_store".asInstanceOf[jewelry_store]
  @scala.inline
  def keyInvalid: keyInvalid = "keyInvalid".asInstanceOf[keyInvalid]
  @scala.inline
  def kk: kk = "kk".asInstanceOf[kk]
  @scala.inline
  def kn: kn = "kn".asInstanceOf[kn]
  @scala.inline
  def ko: ko = "ko".asInstanceOf[ko]
  @scala.inline
  def ky: ky = "ky".asInstanceOf[ky]
  @scala.inline
  def laundry: laundry = "laundry".asInstanceOf[laundry]
  @scala.inline
  def lawyer: lawyer = "lawyer".asInstanceOf[lawyer]
  @scala.inline
  def less_walking: less_walking = "less_walking".asInstanceOf[less_walking]
  @scala.inline
  def library: library = "library".asInstanceOf[library]
  @scala.inline
  def liquor_store: liquor_store = "liquor_store".asInstanceOf[liquor_store]
  @scala.inline
  def local_government_office: local_government_office = "local_government_office".asInstanceOf[local_government_office]
  @scala.inline
  def locality: locality = "locality".asInstanceOf[locality]
  @scala.inline
  def locksmith: locksmith = "locksmith".asInstanceOf[locksmith]
  @scala.inline
  def lodging: lodging = "lodging".asInstanceOf[lodging]
  @scala.inline
  def lt: lt = "lt".asInstanceOf[lt]
  @scala.inline
  def lte: lte = "lte".asInstanceOf[lte]
  @scala.inline
  def lv: lv = "lv".asInstanceOf[lv]
  @scala.inline
  def meal_delivery: meal_delivery = "meal_delivery".asInstanceOf[meal_delivery]
  @scala.inline
  def meal_takeaway: meal_takeaway = "meal_takeaway".asInstanceOf[meal_takeaway]
  @scala.inline
  def merge: merge = "merge".asInstanceOf[merge]
  @scala.inline
  def metric: metric = "metric".asInstanceOf[metric]
  @scala.inline
  def mk: mk = "mk".asInstanceOf[mk]
  @scala.inline
  def ml: ml = "ml".asInstanceOf[ml]
  @scala.inline
  def mosque: mosque = "mosque".asInstanceOf[mosque]
  @scala.inline
  def movie_rental: movie_rental = "movie_rental".asInstanceOf[movie_rental]
  @scala.inline
  def movie_theater: movie_theater = "movie_theater".asInstanceOf[movie_theater]
  @scala.inline
  def moving_company: moving_company = "moving_company".asInstanceOf[moving_company]
  @scala.inline
  def mr: mr = "mr".asInstanceOf[mr]
  @scala.inline
  def museum: museum = "museum".asInstanceOf[museum]
  @scala.inline
  def my: my = "my".asInstanceOf[my]
  @scala.inline
  def name: name = "name".asInstanceOf[name]
  @scala.inline
  def natural_feature: natural_feature = "natural_feature".asInstanceOf[natural_feature]
  @scala.inline
  def neighborhood: neighborhood = "neighborhood".asInstanceOf[neighborhood]
  @scala.inline
  def night_club: night_club = "night_club".asInstanceOf[night_club]
  @scala.inline
  def nl: nl = "nl".asInstanceOf[nl]
  @scala.inline
  def no: no = "no".asInstanceOf[no]
  @scala.inline
  def notFound: notFound = "notFound".asInstanceOf[notFound]
  @scala.inline
  def opening_hours: opening_hours = "opening_hours".asInstanceOf[opening_hours]
  @scala.inline
  def optimistic: optimistic = "optimistic".asInstanceOf[optimistic]
  @scala.inline
  def overall: overall = "overall".asInstanceOf[overall]
  @scala.inline
  def pa: pa = "pa".asInstanceOf[pa]
  @scala.inline
  def painter: painter = "painter".asInstanceOf[painter]
  @scala.inline
  def park: park = "park".asInstanceOf[park]
  @scala.inline
  def parking: parking = "parking".asInstanceOf[parking]
  @scala.inline
  def parseError: parseError = "parseError".asInstanceOf[parseError]
  @scala.inline
  def permanently_closed: permanently_closed = "permanently_closed".asInstanceOf[permanently_closed]
  @scala.inline
  def pessimistic: pessimistic = "pessimistic".asInstanceOf[pessimistic]
  @scala.inline
  def pet_store: pet_store = "pet_store".asInstanceOf[pet_store]
  @scala.inline
  def pharmacy: pharmacy = "pharmacy".asInstanceOf[pharmacy]
  @scala.inline
  def phonenumber: phonenumber = "phonenumber".asInstanceOf[phonenumber]
  @scala.inline
  def photo: photo = "photo".asInstanceOf[photo]
  @scala.inline
  def photos: photos = "photos".asInstanceOf[photos]
  @scala.inline
  def physiotherapist: physiotherapist = "physiotherapist".asInstanceOf[physiotherapist]
  @scala.inline
  def pl: pl = "pl".asInstanceOf[pl]
  @scala.inline
  def place_id: place_id = "place_id".asInstanceOf[place_id]
  @scala.inline
  def place_of_worship: place_of_worship = "place_of_worship".asInstanceOf[place_of_worship]
  @scala.inline
  def plumber: plumber = "plumber".asInstanceOf[plumber]
  @scala.inline
  def plus_code: plus_code = "plus_code".asInstanceOf[plus_code]
  @scala.inline
  def point_of_interest: point_of_interest = "point_of_interest".asInstanceOf[point_of_interest]
  @scala.inline
  def police: police = "police".asInstanceOf[police]
  @scala.inline
  def political: political = "political".asInstanceOf[political]
  @scala.inline
  def post_box: post_box = "post_box".asInstanceOf[post_box]
  @scala.inline
  def post_office: post_office = "post_office".asInstanceOf[post_office]
  @scala.inline
  def postal_code: postal_code = "postal_code".asInstanceOf[postal_code]
  @scala.inline
  def postal_code_prefix: postal_code_prefix = "postal_code_prefix".asInstanceOf[postal_code_prefix]
  @scala.inline
  def postal_code_suffix: postal_code_suffix = "postal_code_suffix".asInstanceOf[postal_code_suffix]
  @scala.inline
  def postal_town: postal_town = "postal_town".asInstanceOf[postal_town]
  @scala.inline
  def premise: premise = "premise".asInstanceOf[premise]
  @scala.inline
  def price_level: price_level = "price_level".asInstanceOf[price_level]
  @scala.inline
  def prominence: prominence = "prominence".asInstanceOf[prominence]
  @scala.inline
  def pt: pt = "pt".asInstanceOf[pt]
  @scala.inline
  def `pt-BR`: `pt-BR` = "pt-BR".asInstanceOf[`pt-BR`]
  @scala.inline
  def `pt-PT`: `pt-PT` = "pt-PT".asInstanceOf[`pt-PT`]
  @scala.inline
  def quality: quality = "quality".asInstanceOf[quality]
  @scala.inline
  def rail: rail = "rail".asInstanceOf[rail]
  @scala.inline
  def `ramp-left`: `ramp-left` = "ramp-left".asInstanceOf[`ramp-left`]
  @scala.inline
  def `ramp-right`: `ramp-right` = "ramp-right".asInstanceOf[`ramp-right`]
  @scala.inline
  def rating: rating = "rating".asInstanceOf[rating]
  @scala.inline
  def real_estate_agency: real_estate_agency = "real_estate_agency".asInstanceOf[real_estate_agency]
  @scala.inline
  def restaurant: restaurant = "restaurant".asInstanceOf[restaurant]
  @scala.inline
  def review: review = "review".asInstanceOf[review]
  @scala.inline
  def ro: ro = "ro".asInstanceOf[ro]
  @scala.inline
  def roofing_contractor: roofing_contractor = "roofing_contractor".asInstanceOf[roofing_contractor]
  @scala.inline
  def room: room = "room".asInstanceOf[room]
  @scala.inline
  def `roundabout-left`: `roundabout-left` = "roundabout-left".asInstanceOf[`roundabout-left`]
  @scala.inline
  def `roundabout-right`: `roundabout-right` = "roundabout-right".asInstanceOf[`roundabout-right`]
  @scala.inline
  def route: route = "route".asInstanceOf[route]
  @scala.inline
  def ru: ru = "ru".asInstanceOf[ru]
  @scala.inline
  def rv_park: rv_park = "rv_park".asInstanceOf[rv_park]
  @scala.inline
  def school: school = "school".asInstanceOf[school]
  @scala.inline
  def scope: scope = "scope".asInstanceOf[scope]
  @scala.inline
  def service: service = "service".asInstanceOf[service]
  @scala.inline
  def shoe_store: shoe_store = "shoe_store".asInstanceOf[shoe_store]
  @scala.inline
  def shopping_mall: shopping_mall = "shopping_mall".asInstanceOf[shopping_mall]
  @scala.inline
  def sk: sk = "sk".asInstanceOf[sk]
  @scala.inline
  def sl: sl = "sl".asInstanceOf[sl]
  @scala.inline
  def spa: spa = "spa".asInstanceOf[spa]
  @scala.inline
  def sq: sq = "sq".asInstanceOf[sq]
  @scala.inline
  def sr: sr = "sr".asInstanceOf[sr]
  @scala.inline
  def stadium: stadium = "stadium".asInstanceOf[stadium]
  @scala.inline
  def storage: storage = "storage".asInstanceOf[storage]
  @scala.inline
  def store: store = "store".asInstanceOf[store]
  @scala.inline
  def straight: straight = "straight".asInstanceOf[straight]
  @scala.inline
  def street_address: street_address = "street_address".asInstanceOf[street_address]
  @scala.inline
  def street_number: street_number = "street_number".asInstanceOf[street_number]
  @scala.inline
  def sublocality: sublocality = "sublocality".asInstanceOf[sublocality]
  @scala.inline
  def sublocality_level_1: sublocality_level_1 = "sublocality_level_1".asInstanceOf[sublocality_level_1]
  @scala.inline
  def sublocality_level_2: sublocality_level_2 = "sublocality_level_2".asInstanceOf[sublocality_level_2]
  @scala.inline
  def sublocality_level_3: sublocality_level_3 = "sublocality_level_3".asInstanceOf[sublocality_level_3]
  @scala.inline
  def sublocality_level_4: sublocality_level_4 = "sublocality_level_4".asInstanceOf[sublocality_level_4]
  @scala.inline
  def sublocality_level_5: sublocality_level_5 = "sublocality_level_5".asInstanceOf[sublocality_level_5]
  @scala.inline
  def subpremise: subpremise = "subpremise".asInstanceOf[subpremise]
  @scala.inline
  def subway: subway = "subway".asInstanceOf[subway]
  @scala.inline
  def subway_station: subway_station = "subway_station".asInstanceOf[subway_station]
  @scala.inline
  def supermarket: supermarket = "supermarket".asInstanceOf[supermarket]
  @scala.inline
  def sv: sv = "sv".asInstanceOf[sv]
  @scala.inline
  def synagogue: synagogue = "synagogue".asInstanceOf[synagogue]
  @scala.inline
  def ta: ta = "ta".asInstanceOf[ta]
  @scala.inline
  def taxi_stand: taxi_stand = "taxi_stand".asInstanceOf[taxi_stand]
  @scala.inline
  def te: te = "te".asInstanceOf[te]
  @scala.inline
  def textquery: textquery = "textquery".asInstanceOf[textquery]
  @scala.inline
  def th: th = "th".asInstanceOf[th]
  @scala.inline
  def timeout: timeout = "timeout".asInstanceOf[timeout]
  @scala.inline
  def tl: tl = "tl".asInstanceOf[tl]
  @scala.inline
  def tolls: tolls = "tolls".asInstanceOf[tolls]
  @scala.inline
  def tr: tr = "tr".asInstanceOf[tr]
  @scala.inline
  def train: train = "train".asInstanceOf[train]
  @scala.inline
  def train_station: train_station = "train_station".asInstanceOf[train_station]
  @scala.inline
  def tram: tram = "tram".asInstanceOf[tram]
  @scala.inline
  def transit: transit = "transit".asInstanceOf[transit]
  @scala.inline
  def transit_station: transit_station = "transit_station".asInstanceOf[transit_station]
  @scala.inline
  def travel_agency: travel_agency = "travel_agency".asInstanceOf[travel_agency]
  @scala.inline
  def `turn-left`: `turn-left` = "turn-left".asInstanceOf[`turn-left`]
  @scala.inline
  def `turn-right`: `turn-right` = "turn-right".asInstanceOf[`turn-right`]
  @scala.inline
  def `turn-sharp-left`: `turn-sharp-left` = "turn-sharp-left".asInstanceOf[`turn-sharp-left`]
  @scala.inline
  def `turn-sharp-right`: `turn-sharp-right` = "turn-sharp-right".asInstanceOf[`turn-sharp-right`]
  @scala.inline
  def `turn-slight-left`: `turn-slight-left` = "turn-slight-left".asInstanceOf[`turn-slight-left`]
  @scala.inline
  def `turn-slight-right`: `turn-slight-right` = "turn-slight-right".asInstanceOf[`turn-slight-right`]
  @scala.inline
  def `type`: `type` = "type".asInstanceOf[`type`]
  @scala.inline
  def types: types = "types".asInstanceOf[types]
  @scala.inline
  def uk: uk = "uk".asInstanceOf[uk]
  @scala.inline
  def url: url = "url".asInstanceOf[url]
  @scala.inline
  def userRateLimitExceeded: userRateLimitExceeded = "userRateLimitExceeded".asInstanceOf[userRateLimitExceeded]
  @scala.inline
  def user_ratings_total: user_ratings_total = "user_ratings_total".asInstanceOf[user_ratings_total]
  @scala.inline
  def utc_offset: utc_offset = "utc_offset".asInstanceOf[utc_offset]
  @scala.inline
  def `uturn-left`: `uturn-left` = "uturn-left".asInstanceOf[`uturn-left`]
  @scala.inline
  def `uturn-right`: `uturn-right` = "uturn-right".asInstanceOf[`uturn-right`]
  @scala.inline
  def uz: uz = "uz".asInstanceOf[uz]
  @scala.inline
  def veterinary_care: veterinary_care = "veterinary_care".asInstanceOf[veterinary_care]
  @scala.inline
  def vi: vi = "vi".asInstanceOf[vi]
  @scala.inline
  def vicinity: vicinity = "vicinity".asInstanceOf[vicinity]
  @scala.inline
  def walking: walking = "walking".asInstanceOf[walking]
  @scala.inline
  def ward: ward = "ward".asInstanceOf[ward]
  @scala.inline
  def wcdma: wcdma = "wcdma".asInstanceOf[wcdma]
  @scala.inline
  def website: website = "website".asInstanceOf[website]
  @scala.inline
  def `zh-CN`: `zh-CN` = "zh-CN".asInstanceOf[`zh-CN`]
  @scala.inline
  def `zh-TW`: `zh-TW` = "zh-TW".asInstanceOf[`zh-TW`]
  @scala.inline
  def zoo: zoo = "zoo".asInstanceOf[zoo]
}

