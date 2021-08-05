package typings.googleMaps

import typings.googleMaps.mod.AddressType
import typings.googleMaps.mod.AspectRatingType
import typings.googleMaps.mod.DirectionsReponseStatus
import typings.googleMaps.mod.DistanceMatrixResponseElementLevelStatus
import typings.googleMaps.mod.DistanceMatrixResponseTopLevelStatus
import typings.googleMaps.mod.ElevationResponseStatus
import typings.googleMaps.mod.GeocodedWaypointStatus
import typings.googleMaps.mod.GeocodingAddressComponentType
import typings.googleMaps.mod.GeocodingResponseStatus
import typings.googleMaps.mod.GeolocationErrorReason
import typings.googleMaps.mod.Language
import typings.googleMaps.mod.LocationType
import typings.googleMaps.mod.Maneuver
import typings.googleMaps.mod.PlaceAutocompleteResponseStatus
import typings.googleMaps.mod.PlaceAutocompleteType
import typings.googleMaps.mod.PlaceDetailsRequestField
import typings.googleMaps.mod.PlaceDetailsResponseStatus
import typings.googleMaps.mod.PlaceIdScope
import typings.googleMaps.mod.PlaceType1
import typings.googleMaps.mod.PlaceType2
import typings.googleMaps.mod.PlacesNearbyRanking
import typings.googleMaps.mod.QueryAutocompleteResponseStatus
import typings.googleMaps.mod.RadioType
import typings.googleMaps.mod.ReverseGeocodingLocationType
import typings.googleMaps.mod.ReverseGeocodingResponseStatus
import typings.googleMaps.mod.SearchResponseStatus
import typings.googleMaps.mod.SpeedLimitUnit
import typings.googleMaps.mod.TimeZoneResponseStatus
import typings.googleMaps.mod.TrafficModel
import typings.googleMaps.mod.TransitMode
import typings.googleMaps.mod.TransitRoutingPreference
import typings.googleMaps.mod.TravelMode
import typings.googleMaps.mod.TravelRestriction
import typings.googleMaps.mod.UnitSystem
import typings.googleMaps.mod.VehicleType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object googleMapsStrings {
  
  @js.native
  sealed trait APP
    extends StObject
       with PlaceIdScope
  inline def APP: APP = "APP".asInstanceOf[APP]
  
  @js.native
  sealed trait APPROXIMATE
    extends StObject
       with LocationType
       with ReverseGeocodingLocationType
  inline def APPROXIMATE: APPROXIMATE = "APPROXIMATE".asInstanceOf[APPROXIMATE]
  
  @js.native
  sealed trait BUS
    extends StObject
       with VehicleType
  inline def BUS: BUS = "BUS".asInstanceOf[BUS]
  
  @js.native
  sealed trait CABLE_CAR
    extends StObject
       with VehicleType
  inline def CABLE_CAR: CABLE_CAR = "CABLE_CAR".asInstanceOf[CABLE_CAR]
  
  @js.native
  sealed trait COMMUTER_TRAIN
    extends StObject
       with VehicleType
  inline def COMMUTER_TRAIN: COMMUTER_TRAIN = "COMMUTER_TRAIN".asInstanceOf[COMMUTER_TRAIN]
  
  @js.native
  sealed trait FERRY
    extends StObject
       with VehicleType
  inline def FERRY: FERRY = "FERRY".asInstanceOf[FERRY]
  
  @js.native
  sealed trait FUNICULAR
    extends StObject
       with VehicleType
  inline def FUNICULAR: FUNICULAR = "FUNICULAR".asInstanceOf[FUNICULAR]
  
  @js.native
  sealed trait GEOMETRIC_CENTER
    extends StObject
       with LocationType
       with ReverseGeocodingLocationType
  inline def GEOMETRIC_CENTER: GEOMETRIC_CENTER = "GEOMETRIC_CENTER".asInstanceOf[GEOMETRIC_CENTER]
  
  @js.native
  sealed trait GONDOLA_LIFT
    extends StObject
       with VehicleType
  inline def GONDOLA_LIFT: GONDOLA_LIFT = "GONDOLA_LIFT".asInstanceOf[GONDOLA_LIFT]
  
  @js.native
  sealed trait GOOGLE
    extends StObject
       with PlaceIdScope
  inline def GOOGLE: GOOGLE = "GOOGLE".asInstanceOf[GOOGLE]
  
  @js.native
  sealed trait HEAVY_RAIL
    extends StObject
       with VehicleType
  inline def HEAVY_RAIL: HEAVY_RAIL = "HEAVY_RAIL".asInstanceOf[HEAVY_RAIL]
  
  @js.native
  sealed trait HIGH_SPEED_TRAIN
    extends StObject
       with VehicleType
  inline def HIGH_SPEED_TRAIN: HIGH_SPEED_TRAIN = "HIGH_SPEED_TRAIN".asInstanceOf[HIGH_SPEED_TRAIN]
  
  @js.native
  sealed trait INTERCITY_BUS
    extends StObject
       with VehicleType
  inline def INTERCITY_BUS: INTERCITY_BUS = "INTERCITY_BUS".asInstanceOf[INTERCITY_BUS]
  
  @js.native
  sealed trait INVALID_REQUEST
    extends StObject
       with DirectionsReponseStatus
       with DistanceMatrixResponseTopLevelStatus
       with ElevationResponseStatus
       with GeocodingResponseStatus
       with PlaceAutocompleteResponseStatus
       with PlaceDetailsResponseStatus
       with QueryAutocompleteResponseStatus
       with ReverseGeocodingResponseStatus
       with SearchResponseStatus
       with TimeZoneResponseStatus
  inline def INVALID_REQUEST: INVALID_REQUEST = "INVALID_REQUEST".asInstanceOf[INVALID_REQUEST]
  
  @js.native
  sealed trait KPH
    extends StObject
       with SpeedLimitUnit
  inline def KPH: KPH = "KPH".asInstanceOf[KPH]
  
  @js.native
  sealed trait LeftparenthesiscitiesRightparenthesis
    extends StObject
       with PlaceAutocompleteType
  inline def LeftparenthesiscitiesRightparenthesis: LeftparenthesiscitiesRightparenthesis = "(cities)".asInstanceOf[LeftparenthesiscitiesRightparenthesis]
  
  @js.native
  sealed trait LeftparenthesisregionsRightparenthesis
    extends StObject
       with PlaceAutocompleteType
  inline def LeftparenthesisregionsRightparenthesis: LeftparenthesisregionsRightparenthesis = "(regions)".asInstanceOf[LeftparenthesisregionsRightparenthesis]
  
  @js.native
  sealed trait MAX_ELEMENTS_EXCEEDED
    extends StObject
       with DistanceMatrixResponseTopLevelStatus
  inline def MAX_ELEMENTS_EXCEEDED: MAX_ELEMENTS_EXCEEDED = "MAX_ELEMENTS_EXCEEDED".asInstanceOf[MAX_ELEMENTS_EXCEEDED]
  
  @js.native
  sealed trait MAX_ROUTE_LENGTH_EXCEEDED
    extends StObject
       with DistanceMatrixResponseElementLevelStatus
  inline def MAX_ROUTE_LENGTH_EXCEEDED: MAX_ROUTE_LENGTH_EXCEEDED = "MAX_ROUTE_LENGTH_EXCEEDED".asInstanceOf[MAX_ROUTE_LENGTH_EXCEEDED]
  
  @js.native
  sealed trait `MAX_ROUTE_LENGTH_EXCEEDED `
    extends StObject
       with DirectionsReponseStatus
  inline def `MAX_ROUTE_LENGTH_EXCEEDED `: `MAX_ROUTE_LENGTH_EXCEEDED ` = ("MAX_ROUTE_LENGTH_EXCEEDED ").asInstanceOf[`MAX_ROUTE_LENGTH_EXCEEDED `]
  
  @js.native
  sealed trait MAX_WAYPOINTS_EXCEEDED
    extends StObject
       with DirectionsReponseStatus
  inline def MAX_WAYPOINTS_EXCEEDED: MAX_WAYPOINTS_EXCEEDED = "MAX_WAYPOINTS_EXCEEDED".asInstanceOf[MAX_WAYPOINTS_EXCEEDED]
  
  @js.native
  sealed trait METRO_RAIL
    extends StObject
       with VehicleType
  inline def METRO_RAIL: METRO_RAIL = "METRO_RAIL".asInstanceOf[METRO_RAIL]
  
  @js.native
  sealed trait MONORAIL
    extends StObject
       with VehicleType
  inline def MONORAIL: MONORAIL = "MONORAIL".asInstanceOf[MONORAIL]
  
  @js.native
  sealed trait MPH
    extends StObject
       with SpeedLimitUnit
  inline def MPH: MPH = "MPH".asInstanceOf[MPH]
  
  @js.native
  sealed trait NOT_FOUND
    extends StObject
       with DirectionsReponseStatus
       with DistanceMatrixResponseElementLevelStatus
       with PlaceDetailsResponseStatus
  inline def NOT_FOUND: NOT_FOUND = "NOT_FOUND".asInstanceOf[NOT_FOUND]
  
  @js.native
  sealed trait OK
    extends StObject
       with DirectionsReponseStatus
       with DistanceMatrixResponseElementLevelStatus
       with DistanceMatrixResponseTopLevelStatus
       with ElevationResponseStatus
       with GeocodedWaypointStatus
       with GeocodingResponseStatus
       with PlaceAutocompleteResponseStatus
       with PlaceDetailsResponseStatus
       with QueryAutocompleteResponseStatus
       with ReverseGeocodingResponseStatus
       with SearchResponseStatus
       with TimeZoneResponseStatus
  inline def OK: OK = "OK".asInstanceOf[OK]
  
  @js.native
  sealed trait OTHER
    extends StObject
       with VehicleType
  inline def OTHER: OTHER = "OTHER".asInstanceOf[OTHER]
  
  @js.native
  sealed trait OVER_DAILY_LIMIT
    extends StObject
       with DirectionsReponseStatus
       with DistanceMatrixResponseTopLevelStatus
       with ElevationResponseStatus
       with GeocodingResponseStatus
       with TimeZoneResponseStatus
  inline def OVER_DAILY_LIMIT: OVER_DAILY_LIMIT = "OVER_DAILY_LIMIT".asInstanceOf[OVER_DAILY_LIMIT]
  
  @js.native
  sealed trait OVER_QUERY_LIMIT
    extends StObject
       with DirectionsReponseStatus
       with DistanceMatrixResponseTopLevelStatus
       with ElevationResponseStatus
       with GeocodingResponseStatus
       with PlaceAutocompleteResponseStatus
       with PlaceDetailsResponseStatus
       with QueryAutocompleteResponseStatus
       with ReverseGeocodingResponseStatus
       with SearchResponseStatus
       with TimeZoneResponseStatus
  inline def OVER_QUERY_LIMIT: OVER_QUERY_LIMIT = "OVER_QUERY_LIMIT".asInstanceOf[OVER_QUERY_LIMIT]
  
  @js.native
  sealed trait RAIL
    extends StObject
       with VehicleType
  inline def RAIL: RAIL = "RAIL".asInstanceOf[RAIL]
  
  @js.native
  sealed trait RANGE_INTERPOLATED
    extends StObject
       with LocationType
       with ReverseGeocodingLocationType
  inline def RANGE_INTERPOLATED: RANGE_INTERPOLATED = "RANGE_INTERPOLATED".asInstanceOf[RANGE_INTERPOLATED]
  
  @js.native
  sealed trait REQUEST_DENIED
    extends StObject
       with DirectionsReponseStatus
       with DistanceMatrixResponseTopLevelStatus
       with ElevationResponseStatus
       with GeocodingResponseStatus
       with PlaceAutocompleteResponseStatus
       with PlaceDetailsResponseStatus
       with QueryAutocompleteResponseStatus
       with ReverseGeocodingResponseStatus
       with SearchResponseStatus
       with TimeZoneResponseStatus
  inline def REQUEST_DENIED: REQUEST_DENIED = "REQUEST_DENIED".asInstanceOf[REQUEST_DENIED]
  
  @js.native
  sealed trait ROOFTOP
    extends StObject
       with LocationType
       with ReverseGeocodingLocationType
  inline def ROOFTOP: ROOFTOP = "ROOFTOP".asInstanceOf[ROOFTOP]
  
  @js.native
  sealed trait SHARE_TAXI
    extends StObject
       with VehicleType
  inline def SHARE_TAXI: SHARE_TAXI = "SHARE_TAXI".asInstanceOf[SHARE_TAXI]
  
  @js.native
  sealed trait SUBWAY
    extends StObject
       with VehicleType
  inline def SUBWAY: SUBWAY = "SUBWAY".asInstanceOf[SUBWAY]
  
  @js.native
  sealed trait TRAM
    extends StObject
       with VehicleType
  inline def TRAM: TRAM = "TRAM".asInstanceOf[TRAM]
  
  @js.native
  sealed trait TROLLEYBUS
    extends StObject
       with VehicleType
  inline def TROLLEYBUS: TROLLEYBUS = "TROLLEYBUS".asInstanceOf[TROLLEYBUS]
  
  @js.native
  sealed trait UNKNOWN_ERROR
    extends StObject
       with DirectionsReponseStatus
       with DistanceMatrixResponseTopLevelStatus
       with ElevationResponseStatus
       with GeocodingResponseStatus
       with PlaceAutocompleteResponseStatus
       with PlaceDetailsResponseStatus
       with QueryAutocompleteResponseStatus
       with ReverseGeocodingResponseStatus
       with SearchResponseStatus
       with TimeZoneResponseStatus
  inline def UNKNOWN_ERROR: UNKNOWN_ERROR = "UNKNOWN_ERROR".asInstanceOf[UNKNOWN_ERROR]
  
  @js.native
  sealed trait ZERO_RESULTS
    extends StObject
       with DirectionsReponseStatus
       with DistanceMatrixResponseElementLevelStatus
       with GeocodedWaypointStatus
       with GeocodingResponseStatus
       with PlaceAutocompleteResponseStatus
       with PlaceDetailsResponseStatus
       with QueryAutocompleteResponseStatus
       with ReverseGeocodingResponseStatus
       with SearchResponseStatus
       with TimeZoneResponseStatus
  inline def ZERO_RESULTS: ZERO_RESULTS = "ZERO_RESULTS".asInstanceOf[ZERO_RESULTS]
  
  @js.native
  sealed trait accounting
    extends StObject
       with PlaceType1
  inline def accounting: accounting = "accounting".asInstanceOf[accounting]
  
  @js.native
  sealed trait address
    extends StObject
       with PlaceAutocompleteType
  inline def address: address = "address".asInstanceOf[address]
  
  @js.native
  sealed trait address_component
    extends StObject
       with PlaceDetailsRequestField
  inline def address_component: address_component = "address_component".asInstanceOf[address_component]
  
  @js.native
  sealed trait administrative_area_level_1
    extends StObject
       with AddressType
       with PlaceType2
  inline def administrative_area_level_1: administrative_area_level_1 = "administrative_area_level_1".asInstanceOf[administrative_area_level_1]
  
  @js.native
  sealed trait administrative_area_level_2
    extends StObject
       with AddressType
       with PlaceType2
  inline def administrative_area_level_2: administrative_area_level_2 = "administrative_area_level_2".asInstanceOf[administrative_area_level_2]
  
  @js.native
  sealed trait administrative_area_level_3
    extends StObject
       with AddressType
       with PlaceType2
  inline def administrative_area_level_3: administrative_area_level_3 = "administrative_area_level_3".asInstanceOf[administrative_area_level_3]
  
  @js.native
  sealed trait administrative_area_level_4
    extends StObject
       with AddressType
       with PlaceType2
  inline def administrative_area_level_4: administrative_area_level_4 = "administrative_area_level_4".asInstanceOf[administrative_area_level_4]
  
  @js.native
  sealed trait administrative_area_level_5
    extends StObject
       with AddressType
       with PlaceType2
  inline def administrative_area_level_5: administrative_area_level_5 = "administrative_area_level_5".asInstanceOf[administrative_area_level_5]
  
  @js.native
  sealed trait adr_address
    extends StObject
       with PlaceDetailsRequestField
  inline def adr_address: adr_address = "adr_address".asInstanceOf[adr_address]
  
  @js.native
  sealed trait airport
    extends StObject
       with AddressType
       with PlaceType1
  inline def airport: airport = "airport".asInstanceOf[airport]
  
  @js.native
  sealed trait alt_id
    extends StObject
       with PlaceDetailsRequestField
  inline def alt_id: alt_id = "alt_id".asInstanceOf[alt_id]
  
  @js.native
  sealed trait alt_ids extends StObject
  inline def alt_ids: alt_ids = "alt_ids".asInstanceOf[alt_ids]
  
  @js.native
  sealed trait amusement_park
    extends StObject
       with PlaceType1
  inline def amusement_park: amusement_park = "amusement_park".asInstanceOf[amusement_park]
  
  @js.native
  sealed trait appeal
    extends StObject
       with AspectRatingType
  inline def appeal: appeal = "appeal".asInstanceOf[appeal]
  
  @js.native
  sealed trait aquarium
    extends StObject
       with PlaceType1
  inline def aquarium: aquarium = "aquarium".asInstanceOf[aquarium]
  
  @js.native
  sealed trait ar
    extends StObject
       with Language
  inline def ar: ar = "ar".asInstanceOf[ar]
  
  @js.native
  sealed trait art_gallery
    extends StObject
       with PlaceType1
  inline def art_gallery: art_gallery = "art_gallery".asInstanceOf[art_gallery]
  
  @js.native
  sealed trait atm
    extends StObject
       with PlaceType1
  inline def atm: atm = "atm".asInstanceOf[atm]
  
  @js.native
  sealed trait atmosphere
    extends StObject
       with AspectRatingType
  inline def atmosphere: atmosphere = "atmosphere".asInstanceOf[atmosphere]
  
  @js.native
  sealed trait bakery
    extends StObject
       with PlaceType1
  inline def bakery: bakery = "bakery".asInstanceOf[bakery]
  
  @js.native
  sealed trait bank
    extends StObject
       with PlaceType1
  inline def bank: bank = "bank".asInstanceOf[bank]
  
  @js.native
  sealed trait bar
    extends StObject
       with PlaceType1
  inline def bar: bar = "bar".asInstanceOf[bar]
  
  @js.native
  sealed trait be
    extends StObject
       with Language
  inline def be: be = "be".asInstanceOf[be]
  
  @js.native
  sealed trait beauty_salon
    extends StObject
       with PlaceType1
  inline def beauty_salon: beauty_salon = "beauty_salon".asInstanceOf[beauty_salon]
  
  @js.native
  sealed trait best_guess
    extends StObject
       with TrafficModel
  inline def best_guess: best_guess = "best_guess".asInstanceOf[best_guess]
  
  @js.native
  sealed trait bg
    extends StObject
       with Language
  inline def bg: bg = "bg".asInstanceOf[bg]
  
  @js.native
  sealed trait bicycle_store
    extends StObject
       with PlaceType1
  inline def bicycle_store: bicycle_store = "bicycle_store".asInstanceOf[bicycle_store]
  
  @js.native
  sealed trait bicycling
    extends StObject
       with TravelMode
  inline def bicycling: bicycling = "bicycling".asInstanceOf[bicycling]
  
  @js.native
  sealed trait bn
    extends StObject
       with Language
  inline def bn: bn = "bn".asInstanceOf[bn]
  
  @js.native
  sealed trait book_store
    extends StObject
       with PlaceType1
  inline def book_store: book_store = "book_store".asInstanceOf[book_store]
  
  @js.native
  sealed trait bowling_alley
    extends StObject
       with PlaceType1
  inline def bowling_alley: bowling_alley = "bowling_alley".asInstanceOf[bowling_alley]
  
  @js.native
  sealed trait bus_
    extends StObject
       with TransitMode
  inline def bus_ : bus_ = "bus".asInstanceOf[bus_]
  
  @js.native
  sealed trait bus_station
    extends StObject
       with GeocodingAddressComponentType
       with PlaceType1
  inline def bus_station: bus_station = "bus_station".asInstanceOf[bus_station]
  
  @js.native
  sealed trait ca
    extends StObject
       with Language
  inline def ca: ca = "ca".asInstanceOf[ca]
  
  @js.native
  sealed trait cafe
    extends StObject
       with PlaceType1
  inline def cafe: cafe = "cafe".asInstanceOf[cafe]
  
  @js.native
  sealed trait campground
    extends StObject
       with PlaceType1
  inline def campground: campground = "campground".asInstanceOf[campground]
  
  @js.native
  sealed trait car_dealer
    extends StObject
       with PlaceType1
  inline def car_dealer: car_dealer = "car_dealer".asInstanceOf[car_dealer]
  
  @js.native
  sealed trait car_rental
    extends StObject
       with PlaceType1
  inline def car_rental: car_rental = "car_rental".asInstanceOf[car_rental]
  
  @js.native
  sealed trait car_repair
    extends StObject
       with PlaceType1
  inline def car_repair: car_repair = "car_repair".asInstanceOf[car_repair]
  
  @js.native
  sealed trait car_wash
    extends StObject
       with PlaceType1
  inline def car_wash: car_wash = "car_wash".asInstanceOf[car_wash]
  
  @js.native
  sealed trait casino
    extends StObject
       with PlaceType1
  inline def casino: casino = "casino".asInstanceOf[casino]
  
  @js.native
  sealed trait cdma
    extends StObject
       with RadioType
  inline def cdma: cdma = "cdma".asInstanceOf[cdma]
  
  @js.native
  sealed trait cemetery
    extends StObject
       with PlaceType1
  inline def cemetery: cemetery = "cemetery".asInstanceOf[cemetery]
  
  @js.native
  sealed trait church
    extends StObject
       with PlaceType1
  inline def church: church = "church".asInstanceOf[church]
  
  @js.native
  sealed trait city_hall
    extends StObject
       with PlaceType1
  inline def city_hall: city_hall = "city_hall".asInstanceOf[city_hall]
  
  @js.native
  sealed trait clothing_store
    extends StObject
       with PlaceType1
  inline def clothing_store: clothing_store = "clothing_store".asInstanceOf[clothing_store]
  
  @js.native
  sealed trait colloquial_area
    extends StObject
       with AddressType
       with PlaceType2
  inline def colloquial_area: colloquial_area = "colloquial_area".asInstanceOf[colloquial_area]
  
  @js.native
  sealed trait convenience_store
    extends StObject
       with PlaceType1
  inline def convenience_store: convenience_store = "convenience_store".asInstanceOf[convenience_store]
  
  @js.native
  sealed trait country
    extends StObject
       with AddressType
       with PlaceType2
  inline def country: country = "country".asInstanceOf[country]
  
  @js.native
  sealed trait courthouse
    extends StObject
       with PlaceType1
  inline def courthouse: courthouse = "courthouse".asInstanceOf[courthouse]
  
  @js.native
  sealed trait cs
    extends StObject
       with Language
  inline def cs: cs = "cs".asInstanceOf[cs]
  
  @js.native
  sealed trait da
    extends StObject
       with Language
  inline def da: da = "da".asInstanceOf[da]
  
  @js.native
  sealed trait dailyLimitExceeded
    extends StObject
       with GeolocationErrorReason
  inline def dailyLimitExceeded: dailyLimitExceeded = "dailyLimitExceeded".asInstanceOf[dailyLimitExceeded]
  
  @js.native
  sealed trait de
    extends StObject
       with Language
  inline def de: de = "de".asInstanceOf[de]
  
  @js.native
  sealed trait decor
    extends StObject
       with AspectRatingType
  inline def decor: decor = "decor".asInstanceOf[decor]
  
  @js.native
  sealed trait dentist
    extends StObject
       with PlaceType1
  inline def dentist: dentist = "dentist".asInstanceOf[dentist]
  
  @js.native
  sealed trait department_store
    extends StObject
       with PlaceType1
  inline def department_store: department_store = "department_store".asInstanceOf[department_store]
  
  @js.native
  sealed trait distance
    extends StObject
       with PlacesNearbyRanking
  inline def distance: distance = "distance".asInstanceOf[distance]
  
  @js.native
  sealed trait doctor
    extends StObject
       with PlaceType1
  inline def doctor: doctor = "doctor".asInstanceOf[doctor]
  
  @js.native
  sealed trait driving
    extends StObject
       with TravelMode
  inline def driving: driving = "driving".asInstanceOf[driving]
  
  @js.native
  sealed trait el
    extends StObject
       with Language
  inline def el: el = "el".asInstanceOf[el]
  
  @js.native
  sealed trait electrician
    extends StObject
       with PlaceType1
  inline def electrician: electrician = "electrician".asInstanceOf[electrician]
  
  @js.native
  sealed trait electronics_store
    extends StObject
       with PlaceType1
  inline def electronics_store: electronics_store = "electronics_store".asInstanceOf[electronics_store]
  
  @js.native
  sealed trait embassy
    extends StObject
       with PlaceType1
  inline def embassy: embassy = "embassy".asInstanceOf[embassy]
  
  @js.native
  sealed trait en
    extends StObject
       with Language
  inline def en: en = "en".asInstanceOf[en]
  
  @js.native
  sealed trait `en-Au`
    extends StObject
       with Language
  inline def `en-Au`: `en-Au` = "en-Au".asInstanceOf[`en-Au`]
  
  @js.native
  sealed trait `en-GB`
    extends StObject
       with Language
  inline def `en-GB`: `en-GB` = "en-GB".asInstanceOf[`en-GB`]
  
  @js.native
  sealed trait es
    extends StObject
       with Language
  inline def es: es = "es".asInstanceOf[es]
  
  @js.native
  sealed trait establishment
    extends StObject
       with GeocodingAddressComponentType
       with PlaceAutocompleteType
       with PlaceType2
  inline def establishment: establishment = "establishment".asInstanceOf[establishment]
  
  @js.native
  sealed trait eu
    extends StObject
       with Language
  inline def eu: eu = "eu".asInstanceOf[eu]
  
  @js.native
  sealed trait fa
    extends StObject
       with Language
  inline def fa: fa = "fa".asInstanceOf[fa]
  
  @js.native
  sealed trait facilities
    extends StObject
       with AspectRatingType
  inline def facilities: facilities = "facilities".asInstanceOf[facilities]
  
  @js.native
  sealed trait ferries
    extends StObject
       with TravelRestriction
  inline def ferries: ferries = "ferries".asInstanceOf[ferries]
  
  @js.native
  sealed trait `ferry-train`
    extends StObject
       with Maneuver
  inline def `ferry-train`: `ferry-train` = "ferry-train".asInstanceOf[`ferry-train`]
  
  @js.native
  sealed trait ferry_
    extends StObject
       with Maneuver
  inline def ferry_ : ferry_ = "ferry".asInstanceOf[ferry_]
  
  @js.native
  sealed trait fewer_transfers
    extends StObject
       with TransitRoutingPreference
  inline def fewer_transfers: fewer_transfers = "fewer_transfers".asInstanceOf[fewer_transfers]
  
  @js.native
  sealed trait fi
    extends StObject
       with Language
  inline def fi: fi = "fi".asInstanceOf[fi]
  
  @js.native
  sealed trait fil
    extends StObject
       with Language
  inline def fil: fil = "fil".asInstanceOf[fil]
  
  @js.native
  sealed trait finance
    extends StObject
       with PlaceType2
  inline def finance: finance = "finance".asInstanceOf[finance]
  
  @js.native
  sealed trait fire_station
    extends StObject
       with PlaceType1
  inline def fire_station: fire_station = "fire_station".asInstanceOf[fire_station]
  
  @js.native
  sealed trait floor
    extends StObject
       with GeocodingAddressComponentType
       with PlaceType2
  inline def floor: floor = "floor".asInstanceOf[floor]
  
  @js.native
  sealed trait florist
    extends StObject
       with PlaceType1
  inline def florist: florist = "florist".asInstanceOf[florist]
  
  @js.native
  sealed trait food
    extends StObject
       with AspectRatingType
       with PlaceType2
  inline def food: food = "food".asInstanceOf[food]
  
  @js.native
  sealed trait `fork-left`
    extends StObject
       with Maneuver
  inline def `fork-left`: `fork-left` = "fork-left".asInstanceOf[`fork-left`]
  
  @js.native
  sealed trait `fork-right`
    extends StObject
       with Maneuver
  inline def `fork-right`: `fork-right` = "fork-right".asInstanceOf[`fork-right`]
  
  @js.native
  sealed trait formatted_address
    extends StObject
       with PlaceDetailsRequestField
  inline def formatted_address: formatted_address = "formatted_address".asInstanceOf[formatted_address]
  
  @js.native
  sealed trait formatted_phone_number
    extends StObject
       with PlaceDetailsRequestField
  inline def formatted_phone_number: formatted_phone_number = "formatted_phone_number".asInstanceOf[formatted_phone_number]
  
  @js.native
  sealed trait fr
    extends StObject
       with Language
  inline def fr: fr = "fr".asInstanceOf[fr]
  
  @js.native
  sealed trait funeral_home
    extends StObject
       with PlaceType1
  inline def funeral_home: funeral_home = "funeral_home".asInstanceOf[funeral_home]
  
  @js.native
  sealed trait furniture_store
    extends StObject
       with PlaceType1
  inline def furniture_store: furniture_store = "furniture_store".asInstanceOf[furniture_store]
  
  @js.native
  sealed trait gas_station
    extends StObject
       with PlaceType1
  inline def gas_station: gas_station = "gas_station".asInstanceOf[gas_station]
  
  @js.native
  sealed trait general_contractor
    extends StObject
       with PlaceType2
  inline def general_contractor: general_contractor = "general_contractor".asInstanceOf[general_contractor]
  
  @js.native
  sealed trait geocode
    extends StObject
       with PlaceAutocompleteType
       with PlaceType2
  inline def geocode: geocode = "geocode".asInstanceOf[geocode]
  
  @js.native
  sealed trait geometry
    extends StObject
       with PlaceDetailsRequestField
  inline def geometry: geometry = "geometry".asInstanceOf[geometry]
  
  @js.native
  sealed trait gl
    extends StObject
       with Language
  inline def gl: gl = "gl".asInstanceOf[gl]
  
  @js.native
  sealed trait gsm
    extends StObject
       with RadioType
  inline def gsm: gsm = "gsm".asInstanceOf[gsm]
  
  @js.native
  sealed trait gu
    extends StObject
       with Language
  inline def gu: gu = "gu".asInstanceOf[gu]
  
  @js.native
  sealed trait gym
    extends StObject
       with PlaceType1
  inline def gym: gym = "gym".asInstanceOf[gym]
  
  @js.native
  sealed trait hair_care
    extends StObject
       with PlaceType1
  inline def hair_care: hair_care = "hair_care".asInstanceOf[hair_care]
  
  @js.native
  sealed trait hardware_store
    extends StObject
       with PlaceType1
  inline def hardware_store: hardware_store = "hardware_store".asInstanceOf[hardware_store]
  
  @js.native
  sealed trait health
    extends StObject
       with PlaceType2
  inline def health: health = "health".asInstanceOf[health]
  
  @js.native
  sealed trait hi
    extends StObject
       with Language
  inline def hi: hi = "hi".asInstanceOf[hi]
  
  @js.native
  sealed trait highways
    extends StObject
       with TravelRestriction
  inline def highways: highways = "highways".asInstanceOf[highways]
  
  @js.native
  sealed trait hindu_temple
    extends StObject
       with PlaceType1
  inline def hindu_temple: hindu_temple = "hindu_temple".asInstanceOf[hindu_temple]
  
  @js.native
  sealed trait home_goods_store
    extends StObject
       with PlaceType1
  inline def home_goods_store: home_goods_store = "home_goods_store".asInstanceOf[home_goods_store]
  
  @js.native
  sealed trait hospital
    extends StObject
       with PlaceType1
  inline def hospital: hospital = "hospital".asInstanceOf[hospital]
  
  @js.native
  sealed trait hr
    extends StObject
       with Language
  inline def hr: hr = "hr".asInstanceOf[hr]
  
  @js.native
  sealed trait hu
    extends StObject
       with Language
  inline def hu: hu = "hu".asInstanceOf[hu]
  
  @js.native
  sealed trait icon
    extends StObject
       with PlaceDetailsRequestField
  inline def icon: icon = "icon".asInstanceOf[icon]
  
  @js.native
  sealed trait id
    extends StObject
       with Language
       with PlaceDetailsRequestField
  inline def id: id = "id".asInstanceOf[id]
  
  @js.native
  sealed trait imperial
    extends StObject
       with UnitSystem
  inline def imperial: imperial = "imperial".asInstanceOf[imperial]
  
  @js.native
  sealed trait indoor
    extends StObject
       with TravelRestriction
  inline def indoor: indoor = "indoor".asInstanceOf[indoor]
  
  @js.native
  sealed trait insurance_agency
    extends StObject
       with PlaceType1
  inline def insurance_agency: insurance_agency = "insurance_agency".asInstanceOf[insurance_agency]
  
  @js.native
  sealed trait international_phone_number
    extends StObject
       with PlaceDetailsRequestField
  inline def international_phone_number: international_phone_number = "international_phone_number".asInstanceOf[international_phone_number]
  
  @js.native
  sealed trait intersection
    extends StObject
       with AddressType
       with PlaceType2
  inline def intersection: intersection = "intersection".asInstanceOf[intersection]
  
  @js.native
  sealed trait it
    extends StObject
       with Language
  inline def it: it = "it".asInstanceOf[it]
  
  @js.native
  sealed trait iw
    extends StObject
       with Language
  inline def iw: iw = "iw".asInstanceOf[iw]
  
  @js.native
  sealed trait ja
    extends StObject
       with Language
  inline def ja: ja = "ja".asInstanceOf[ja]
  
  @js.native
  sealed trait jewelry_store
    extends StObject
       with PlaceType1
  inline def jewelry_store: jewelry_store = "jewelry_store".asInstanceOf[jewelry_store]
  
  @js.native
  sealed trait keyInvalid
    extends StObject
       with GeolocationErrorReason
  inline def keyInvalid: keyInvalid = "keyInvalid".asInstanceOf[keyInvalid]
  
  @js.native
  sealed trait kk
    extends StObject
       with Language
  inline def kk: kk = "kk".asInstanceOf[kk]
  
  @js.native
  sealed trait kn
    extends StObject
       with Language
  inline def kn: kn = "kn".asInstanceOf[kn]
  
  @js.native
  sealed trait ko
    extends StObject
       with Language
  inline def ko: ko = "ko".asInstanceOf[ko]
  
  @js.native
  sealed trait ky
    extends StObject
       with Language
  inline def ky: ky = "ky".asInstanceOf[ky]
  
  @js.native
  sealed trait laundry
    extends StObject
       with PlaceType1
  inline def laundry: laundry = "laundry".asInstanceOf[laundry]
  
  @js.native
  sealed trait lawyer
    extends StObject
       with PlaceType1
  inline def lawyer: lawyer = "lawyer".asInstanceOf[lawyer]
  
  @js.native
  sealed trait less_walking
    extends StObject
       with TransitRoutingPreference
  inline def less_walking: less_walking = "less_walking".asInstanceOf[less_walking]
  
  @js.native
  sealed trait library
    extends StObject
       with PlaceType1
  inline def library: library = "library".asInstanceOf[library]
  
  @js.native
  sealed trait liquor_store
    extends StObject
       with PlaceType1
  inline def liquor_store: liquor_store = "liquor_store".asInstanceOf[liquor_store]
  
  @js.native
  sealed trait local_government_office
    extends StObject
       with PlaceType1
  inline def local_government_office: local_government_office = "local_government_office".asInstanceOf[local_government_office]
  
  @js.native
  sealed trait locality
    extends StObject
       with AddressType
       with PlaceType2
  inline def locality: locality = "locality".asInstanceOf[locality]
  
  @js.native
  sealed trait locksmith
    extends StObject
       with PlaceType1
  inline def locksmith: locksmith = "locksmith".asInstanceOf[locksmith]
  
  @js.native
  sealed trait lodging
    extends StObject
       with PlaceType1
  inline def lodging: lodging = "lodging".asInstanceOf[lodging]
  
  @js.native
  sealed trait lt
    extends StObject
       with Language
  inline def lt: lt = "lt".asInstanceOf[lt]
  
  @js.native
  sealed trait lte
    extends StObject
       with RadioType
  inline def lte: lte = "lte".asInstanceOf[lte]
  
  @js.native
  sealed trait lv
    extends StObject
       with Language
  inline def lv: lv = "lv".asInstanceOf[lv]
  
  @js.native
  sealed trait meal_delivery
    extends StObject
       with PlaceType1
  inline def meal_delivery: meal_delivery = "meal_delivery".asInstanceOf[meal_delivery]
  
  @js.native
  sealed trait meal_takeaway
    extends StObject
       with PlaceType1
  inline def meal_takeaway: meal_takeaway = "meal_takeaway".asInstanceOf[meal_takeaway]
  
  @js.native
  sealed trait merge
    extends StObject
       with Maneuver
  inline def merge: merge = "merge".asInstanceOf[merge]
  
  @js.native
  sealed trait metric
    extends StObject
       with UnitSystem
  inline def metric: metric = "metric".asInstanceOf[metric]
  
  @js.native
  sealed trait mk
    extends StObject
       with Language
  inline def mk: mk = "mk".asInstanceOf[mk]
  
  @js.native
  sealed trait ml
    extends StObject
       with Language
  inline def ml: ml = "ml".asInstanceOf[ml]
  
  @js.native
  sealed trait mosque
    extends StObject
       with PlaceType1
  inline def mosque: mosque = "mosque".asInstanceOf[mosque]
  
  @js.native
  sealed trait movie_rental
    extends StObject
       with PlaceType1
  inline def movie_rental: movie_rental = "movie_rental".asInstanceOf[movie_rental]
  
  @js.native
  sealed trait movie_theater
    extends StObject
       with PlaceType1
  inline def movie_theater: movie_theater = "movie_theater".asInstanceOf[movie_theater]
  
  @js.native
  sealed trait moving_company
    extends StObject
       with PlaceType1
  inline def moving_company: moving_company = "moving_company".asInstanceOf[moving_company]
  
  @js.native
  sealed trait mr
    extends StObject
       with Language
  inline def mr: mr = "mr".asInstanceOf[mr]
  
  @js.native
  sealed trait museum
    extends StObject
       with PlaceType1
  inline def museum: museum = "museum".asInstanceOf[museum]
  
  @js.native
  sealed trait my
    extends StObject
       with Language
  inline def my: my = "my".asInstanceOf[my]
  
  @js.native
  sealed trait name
    extends StObject
       with PlaceDetailsRequestField
  inline def name: name = "name".asInstanceOf[name]
  
  @js.native
  sealed trait natural_feature
    extends StObject
       with AddressType
       with PlaceType2
  inline def natural_feature: natural_feature = "natural_feature".asInstanceOf[natural_feature]
  
  @js.native
  sealed trait neighborhood
    extends StObject
       with AddressType
       with PlaceType2
  inline def neighborhood: neighborhood = "neighborhood".asInstanceOf[neighborhood]
  
  @js.native
  sealed trait night_club
    extends StObject
       with PlaceType1
  inline def night_club: night_club = "night_club".asInstanceOf[night_club]
  
  @js.native
  sealed trait nl
    extends StObject
       with Language
  inline def nl: nl = "nl".asInstanceOf[nl]
  
  @js.native
  sealed trait no
    extends StObject
       with Language
  inline def no: no = "no".asInstanceOf[no]
  
  @js.native
  sealed trait notFound
    extends StObject
       with GeolocationErrorReason
  inline def notFound: notFound = "notFound".asInstanceOf[notFound]
  
  @js.native
  sealed trait now extends StObject
  inline def now: now = "now".asInstanceOf[now]
  
  @js.native
  sealed trait opening_hours
    extends StObject
       with PlaceDetailsRequestField
  inline def opening_hours: opening_hours = "opening_hours".asInstanceOf[opening_hours]
  
  @js.native
  sealed trait optimistic
    extends StObject
       with TrafficModel
  inline def optimistic: optimistic = "optimistic".asInstanceOf[optimistic]
  
  @js.native
  sealed trait overall
    extends StObject
       with AspectRatingType
  inline def overall: overall = "overall".asInstanceOf[overall]
  
  @js.native
  sealed trait pa
    extends StObject
       with Language
  inline def pa: pa = "pa".asInstanceOf[pa]
  
  @js.native
  sealed trait painter
    extends StObject
       with PlaceType1
  inline def painter: painter = "painter".asInstanceOf[painter]
  
  @js.native
  sealed trait park
    extends StObject
       with AddressType
       with PlaceType1
  inline def park: park = "park".asInstanceOf[park]
  
  @js.native
  sealed trait parking
    extends StObject
       with GeocodingAddressComponentType
       with PlaceType1
  inline def parking: parking = "parking".asInstanceOf[parking]
  
  @js.native
  sealed trait parseError
    extends StObject
       with GeolocationErrorReason
  inline def parseError: parseError = "parseError".asInstanceOf[parseError]
  
  @js.native
  sealed trait permanently_closed
    extends StObject
       with PlaceDetailsRequestField
  inline def permanently_closed: permanently_closed = "permanently_closed".asInstanceOf[permanently_closed]
  
  @js.native
  sealed trait pessimistic
    extends StObject
       with TrafficModel
  inline def pessimistic: pessimistic = "pessimistic".asInstanceOf[pessimistic]
  
  @js.native
  sealed trait pet_store
    extends StObject
       with PlaceType1
  inline def pet_store: pet_store = "pet_store".asInstanceOf[pet_store]
  
  @js.native
  sealed trait pharmacy
    extends StObject
       with PlaceType1
  inline def pharmacy: pharmacy = "pharmacy".asInstanceOf[pharmacy]
  
  @js.native
  sealed trait phonenumber extends StObject
  inline def phonenumber: phonenumber = "phonenumber".asInstanceOf[phonenumber]
  
  @js.native
  sealed trait photo
    extends StObject
       with PlaceDetailsRequestField
  inline def photo: photo = "photo".asInstanceOf[photo]
  
  @js.native
  sealed trait photos extends StObject
  inline def photos: photos = "photos".asInstanceOf[photos]
  
  @js.native
  sealed trait physiotherapist
    extends StObject
       with PlaceType1
  inline def physiotherapist: physiotherapist = "physiotherapist".asInstanceOf[physiotherapist]
  
  @js.native
  sealed trait pl
    extends StObject
       with Language
  inline def pl: pl = "pl".asInstanceOf[pl]
  
  @js.native
  sealed trait place_id
    extends StObject
       with PlaceDetailsRequestField
  inline def place_id: place_id = "place_id".asInstanceOf[place_id]
  
  @js.native
  sealed trait place_of_worship
    extends StObject
       with PlaceType2
  inline def place_of_worship: place_of_worship = "place_of_worship".asInstanceOf[place_of_worship]
  
  @js.native
  sealed trait plumber
    extends StObject
       with PlaceType1
  inline def plumber: plumber = "plumber".asInstanceOf[plumber]
  
  @js.native
  sealed trait plus_code
    extends StObject
       with PlaceDetailsRequestField
  inline def plus_code: plus_code = "plus_code".asInstanceOf[plus_code]
  
  @js.native
  sealed trait point_of_interest
    extends StObject
       with AddressType
       with GeocodingAddressComponentType
       with PlaceType2
  inline def point_of_interest: point_of_interest = "point_of_interest".asInstanceOf[point_of_interest]
  
  @js.native
  sealed trait police
    extends StObject
       with PlaceType1
  inline def police: police = "police".asInstanceOf[police]
  
  @js.native
  sealed trait political
    extends StObject
       with AddressType
       with PlaceType2
  inline def political: political = "political".asInstanceOf[political]
  
  @js.native
  sealed trait post_box
    extends StObject
       with GeocodingAddressComponentType
       with PlaceType2
  inline def post_box: post_box = "post_box".asInstanceOf[post_box]
  
  @js.native
  sealed trait post_office
    extends StObject
       with PlaceType1
  inline def post_office: post_office = "post_office".asInstanceOf[post_office]
  
  @js.native
  sealed trait postal_code
    extends StObject
       with AddressType
       with PlaceType2
  inline def postal_code: postal_code = "postal_code".asInstanceOf[postal_code]
  
  @js.native
  sealed trait postal_code_prefix
    extends StObject
       with PlaceType2
  inline def postal_code_prefix: postal_code_prefix = "postal_code_prefix".asInstanceOf[postal_code_prefix]
  
  @js.native
  sealed trait postal_code_suffix
    extends StObject
       with PlaceType2
  inline def postal_code_suffix: postal_code_suffix = "postal_code_suffix".asInstanceOf[postal_code_suffix]
  
  @js.native
  sealed trait postal_town
    extends StObject
       with GeocodingAddressComponentType
       with PlaceType2
  inline def postal_town: postal_town = "postal_town".asInstanceOf[postal_town]
  
  @js.native
  sealed trait premise
    extends StObject
       with AddressType
       with PlaceType2
  inline def premise: premise = "premise".asInstanceOf[premise]
  
  @js.native
  sealed trait price_level
    extends StObject
       with PlaceDetailsRequestField
  inline def price_level: price_level = "price_level".asInstanceOf[price_level]
  
  @js.native
  sealed trait prominence
    extends StObject
       with PlacesNearbyRanking
  inline def prominence: prominence = "prominence".asInstanceOf[prominence]
  
  @js.native
  sealed trait pt
    extends StObject
       with Language
  inline def pt: pt = "pt".asInstanceOf[pt]
  
  @js.native
  sealed trait `pt-BR`
    extends StObject
       with Language
  inline def `pt-BR`: `pt-BR` = "pt-BR".asInstanceOf[`pt-BR`]
  
  @js.native
  sealed trait `pt-PT`
    extends StObject
       with Language
  inline def `pt-PT`: `pt-PT` = "pt-PT".asInstanceOf[`pt-PT`]
  
  @js.native
  sealed trait quality
    extends StObject
       with AspectRatingType
  inline def quality: quality = "quality".asInstanceOf[quality]
  
  @js.native
  sealed trait rail_
    extends StObject
       with TransitMode
  inline def rail_ : rail_ = "rail".asInstanceOf[rail_]
  
  @js.native
  sealed trait `ramp-left`
    extends StObject
       with Maneuver
  inline def `ramp-left`: `ramp-left` = "ramp-left".asInstanceOf[`ramp-left`]
  
  @js.native
  sealed trait `ramp-right`
    extends StObject
       with Maneuver
  inline def `ramp-right`: `ramp-right` = "ramp-right".asInstanceOf[`ramp-right`]
  
  @js.native
  sealed trait rating
    extends StObject
       with PlaceDetailsRequestField
  inline def rating: rating = "rating".asInstanceOf[rating]
  
  @js.native
  sealed trait real_estate_agency
    extends StObject
       with PlaceType1
  inline def real_estate_agency: real_estate_agency = "real_estate_agency".asInstanceOf[real_estate_agency]
  
  @js.native
  sealed trait restaurant
    extends StObject
       with PlaceType1
  inline def restaurant: restaurant = "restaurant".asInstanceOf[restaurant]
  
  @js.native
  sealed trait review
    extends StObject
       with PlaceDetailsRequestField
  inline def review: review = "review".asInstanceOf[review]
  
  @js.native
  sealed trait ro
    extends StObject
       with Language
  inline def ro: ro = "ro".asInstanceOf[ro]
  
  @js.native
  sealed trait roofing_contractor
    extends StObject
       with PlaceType1
  inline def roofing_contractor: roofing_contractor = "roofing_contractor".asInstanceOf[roofing_contractor]
  
  @js.native
  sealed trait room
    extends StObject
       with GeocodingAddressComponentType
       with PlaceType2
  inline def room: room = "room".asInstanceOf[room]
  
  @js.native
  sealed trait `roundabout-left`
    extends StObject
       with Maneuver
  inline def `roundabout-left`: `roundabout-left` = "roundabout-left".asInstanceOf[`roundabout-left`]
  
  @js.native
  sealed trait `roundabout-right`
    extends StObject
       with Maneuver
  inline def `roundabout-right`: `roundabout-right` = "roundabout-right".asInstanceOf[`roundabout-right`]
  
  @js.native
  sealed trait route
    extends StObject
       with AddressType
       with PlaceType2
  inline def route: route = "route".asInstanceOf[route]
  
  @js.native
  sealed trait ru
    extends StObject
       with Language
  inline def ru: ru = "ru".asInstanceOf[ru]
  
  @js.native
  sealed trait rv_park
    extends StObject
       with PlaceType1
  inline def rv_park: rv_park = "rv_park".asInstanceOf[rv_park]
  
  @js.native
  sealed trait school
    extends StObject
       with PlaceType1
  inline def school: school = "school".asInstanceOf[school]
  
  @js.native
  sealed trait scope
    extends StObject
       with PlaceDetailsRequestField
  inline def scope: scope = "scope".asInstanceOf[scope]
  
  @js.native
  sealed trait service
    extends StObject
       with AspectRatingType
  inline def service: service = "service".asInstanceOf[service]
  
  @js.native
  sealed trait shoe_store
    extends StObject
       with PlaceType1
  inline def shoe_store: shoe_store = "shoe_store".asInstanceOf[shoe_store]
  
  @js.native
  sealed trait shopping_mall
    extends StObject
       with PlaceType1
  inline def shopping_mall: shopping_mall = "shopping_mall".asInstanceOf[shopping_mall]
  
  @js.native
  sealed trait sk
    extends StObject
       with Language
  inline def sk: sk = "sk".asInstanceOf[sk]
  
  @js.native
  sealed trait sl
    extends StObject
       with Language
  inline def sl: sl = "sl".asInstanceOf[sl]
  
  @js.native
  sealed trait spa
    extends StObject
       with PlaceType1
  inline def spa: spa = "spa".asInstanceOf[spa]
  
  @js.native
  sealed trait sq
    extends StObject
       with Language
  inline def sq: sq = "sq".asInstanceOf[sq]
  
  @js.native
  sealed trait sr
    extends StObject
       with Language
  inline def sr: sr = "sr".asInstanceOf[sr]
  
  @js.native
  sealed trait stadium
    extends StObject
       with PlaceType1
  inline def stadium: stadium = "stadium".asInstanceOf[stadium]
  
  @js.native
  sealed trait storage
    extends StObject
       with PlaceType1
  inline def storage: storage = "storage".asInstanceOf[storage]
  
  @js.native
  sealed trait store
    extends StObject
       with PlaceType1
  inline def store: store = "store".asInstanceOf[store]
  
  @js.native
  sealed trait straight
    extends StObject
       with Maneuver
  inline def straight: straight = "straight".asInstanceOf[straight]
  
  @js.native
  sealed trait street_address
    extends StObject
       with GeocodingAddressComponentType
       with PlaceType2
  inline def street_address: street_address = "street_address".asInstanceOf[street_address]
  
  @js.native
  sealed trait street_number
    extends StObject
       with PlaceType2
  inline def street_number: street_number = "street_number".asInstanceOf[street_number]
  
  @js.native
  sealed trait sublocality
    extends StObject
       with AddressType
       with PlaceType2
  inline def sublocality: sublocality = "sublocality".asInstanceOf[sublocality]
  
  @js.native
  sealed trait sublocality_level_1
    extends StObject
       with PlaceType2
  inline def sublocality_level_1: sublocality_level_1 = "sublocality_level_1".asInstanceOf[sublocality_level_1]
  
  @js.native
  sealed trait sublocality_level_2
    extends StObject
       with PlaceType2
  inline def sublocality_level_2: sublocality_level_2 = "sublocality_level_2".asInstanceOf[sublocality_level_2]
  
  @js.native
  sealed trait sublocality_level_3
    extends StObject
       with PlaceType2
  inline def sublocality_level_3: sublocality_level_3 = "sublocality_level_3".asInstanceOf[sublocality_level_3]
  
  @js.native
  sealed trait sublocality_level_4
    extends StObject
       with PlaceType2
  inline def sublocality_level_4: sublocality_level_4 = "sublocality_level_4".asInstanceOf[sublocality_level_4]
  
  @js.native
  sealed trait sublocality_level_5
    extends StObject
       with PlaceType2
  inline def sublocality_level_5: sublocality_level_5 = "sublocality_level_5".asInstanceOf[sublocality_level_5]
  
  @js.native
  sealed trait subpremise
    extends StObject
       with AddressType
       with PlaceType2
  inline def subpremise: subpremise = "subpremise".asInstanceOf[subpremise]
  
  @js.native
  sealed trait subway_
    extends StObject
       with TransitMode
  inline def subway_ : subway_ = "subway".asInstanceOf[subway_]
  
  @js.native
  sealed trait subway_station
    extends StObject
       with PlaceType1
  inline def subway_station: subway_station = "subway_station".asInstanceOf[subway_station]
  
  @js.native
  sealed trait supermarket
    extends StObject
       with PlaceType1
  inline def supermarket: supermarket = "supermarket".asInstanceOf[supermarket]
  
  @js.native
  sealed trait sv
    extends StObject
       with Language
  inline def sv: sv = "sv".asInstanceOf[sv]
  
  @js.native
  sealed trait synagogue
    extends StObject
       with PlaceType1
  inline def synagogue: synagogue = "synagogue".asInstanceOf[synagogue]
  
  @js.native
  sealed trait ta
    extends StObject
       with Language
  inline def ta: ta = "ta".asInstanceOf[ta]
  
  @js.native
  sealed trait taxi_stand
    extends StObject
       with PlaceType1
  inline def taxi_stand: taxi_stand = "taxi_stand".asInstanceOf[taxi_stand]
  
  @js.native
  sealed trait te
    extends StObject
       with Language
  inline def te: te = "te".asInstanceOf[te]
  
  @js.native
  sealed trait textquery extends StObject
  inline def textquery: textquery = "textquery".asInstanceOf[textquery]
  
  @js.native
  sealed trait th
    extends StObject
       with Language
  inline def th: th = "th".asInstanceOf[th]
  
  @js.native
  sealed trait timeout extends StObject
  inline def timeout: timeout = "timeout".asInstanceOf[timeout]
  
  @js.native
  sealed trait tl
    extends StObject
       with Language
  inline def tl: tl = "tl".asInstanceOf[tl]
  
  @js.native
  sealed trait tolls
    extends StObject
       with TravelRestriction
  inline def tolls: tolls = "tolls".asInstanceOf[tolls]
  
  @js.native
  sealed trait tr
    extends StObject
       with Language
  inline def tr: tr = "tr".asInstanceOf[tr]
  
  @js.native
  sealed trait train
    extends StObject
       with TransitMode
  inline def train: train = "train".asInstanceOf[train]
  
  @js.native
  sealed trait train_station
    extends StObject
       with GeocodingAddressComponentType
       with PlaceType1
  inline def train_station: train_station = "train_station".asInstanceOf[train_station]
  
  @js.native
  sealed trait tram_
    extends StObject
       with TransitMode
  inline def tram_ : tram_ = "tram".asInstanceOf[tram_]
  
  @js.native
  sealed trait transit
    extends StObject
       with TravelMode
  inline def transit: transit = "transit".asInstanceOf[transit]
  
  @js.native
  sealed trait transit_station
    extends StObject
       with GeocodingAddressComponentType
       with PlaceType1
  inline def transit_station: transit_station = "transit_station".asInstanceOf[transit_station]
  
  @js.native
  sealed trait travel_agency
    extends StObject
       with PlaceType1
  inline def travel_agency: travel_agency = "travel_agency".asInstanceOf[travel_agency]
  
  @js.native
  sealed trait `turn-left`
    extends StObject
       with Maneuver
  inline def `turn-left`: `turn-left` = "turn-left".asInstanceOf[`turn-left`]
  
  @js.native
  sealed trait `turn-right`
    extends StObject
       with Maneuver
  inline def `turn-right`: `turn-right` = "turn-right".asInstanceOf[`turn-right`]
  
  @js.native
  sealed trait `turn-sharp-left`
    extends StObject
       with Maneuver
  inline def `turn-sharp-left`: `turn-sharp-left` = "turn-sharp-left".asInstanceOf[`turn-sharp-left`]
  
  @js.native
  sealed trait `turn-sharp-right`
    extends StObject
       with Maneuver
  inline def `turn-sharp-right`: `turn-sharp-right` = "turn-sharp-right".asInstanceOf[`turn-sharp-right`]
  
  @js.native
  sealed trait `turn-slight-left`
    extends StObject
       with Maneuver
  inline def `turn-slight-left`: `turn-slight-left` = "turn-slight-left".asInstanceOf[`turn-slight-left`]
  
  @js.native
  sealed trait `turn-slight-right`
    extends StObject
       with Maneuver
  inline def `turn-slight-right`: `turn-slight-right` = "turn-slight-right".asInstanceOf[`turn-slight-right`]
  
  @js.native
  sealed trait `type`
    extends StObject
       with PlaceDetailsRequestField
  inline def `type`: `type` = "type".asInstanceOf[`type`]
  
  @js.native
  sealed trait types extends StObject
  inline def types: types = "types".asInstanceOf[types]
  
  @js.native
  sealed trait uk
    extends StObject
       with Language
  inline def uk: uk = "uk".asInstanceOf[uk]
  
  @js.native
  sealed trait url
    extends StObject
       with PlaceDetailsRequestField
  inline def url: url = "url".asInstanceOf[url]
  
  @js.native
  sealed trait userRateLimitExceeded
    extends StObject
       with GeolocationErrorReason
  inline def userRateLimitExceeded: userRateLimitExceeded = "userRateLimitExceeded".asInstanceOf[userRateLimitExceeded]
  
  @js.native
  sealed trait user_ratings_total
    extends StObject
       with PlaceDetailsRequestField
  inline def user_ratings_total: user_ratings_total = "user_ratings_total".asInstanceOf[user_ratings_total]
  
  @js.native
  sealed trait utc_offset
    extends StObject
       with PlaceDetailsRequestField
  inline def utc_offset: utc_offset = "utc_offset".asInstanceOf[utc_offset]
  
  @js.native
  sealed trait `uturn-left`
    extends StObject
       with Maneuver
  inline def `uturn-left`: `uturn-left` = "uturn-left".asInstanceOf[`uturn-left`]
  
  @js.native
  sealed trait `uturn-right`
    extends StObject
       with Maneuver
  inline def `uturn-right`: `uturn-right` = "uturn-right".asInstanceOf[`uturn-right`]
  
  @js.native
  sealed trait uz
    extends StObject
       with Language
  inline def uz: uz = "uz".asInstanceOf[uz]
  
  @js.native
  sealed trait veterinary_care
    extends StObject
       with PlaceType1
  inline def veterinary_care: veterinary_care = "veterinary_care".asInstanceOf[veterinary_care]
  
  @js.native
  sealed trait vi
    extends StObject
       with Language
  inline def vi: vi = "vi".asInstanceOf[vi]
  
  @js.native
  sealed trait vicinity
    extends StObject
       with PlaceDetailsRequestField
  inline def vicinity: vicinity = "vicinity".asInstanceOf[vicinity]
  
  @js.native
  sealed trait walking
    extends StObject
       with TravelMode
  inline def walking: walking = "walking".asInstanceOf[walking]
  
  @js.native
  sealed trait ward
    extends StObject
       with AddressType
  inline def ward: ward = "ward".asInstanceOf[ward]
  
  @js.native
  sealed trait wcdma
    extends StObject
       with RadioType
  inline def wcdma: wcdma = "wcdma".asInstanceOf[wcdma]
  
  @js.native
  sealed trait website
    extends StObject
       with PlaceDetailsRequestField
  inline def website: website = "website".asInstanceOf[website]
  
  @js.native
  sealed trait `zh-CN`
    extends StObject
       with Language
  inline def `zh-CN`: `zh-CN` = "zh-CN".asInstanceOf[`zh-CN`]
  
  @js.native
  sealed trait `zh-TW`
    extends StObject
       with Language
  inline def `zh-TW`: `zh-TW` = "zh-TW".asInstanceOf[`zh-TW`]
  
  @js.native
  sealed trait zoo
    extends StObject
       with PlaceType1
  inline def zoo: zoo = "zoo".asInstanceOf[zoo]
}
