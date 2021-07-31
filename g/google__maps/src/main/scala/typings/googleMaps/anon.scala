package typings.googleMaps

import typings.googleMaps.mod.AddressGeometry
import typings.googleMaps.mod.AlternativePlaceId
import typings.googleMaps.mod.GeolocationErrorReason
import typings.googleMaps.mod.LatLngLiteralVerbose
import typings.googleMaps.mod.OpeningHours
import typings.googleMaps.mod.PlaceIdScope
import typings.googleMaps.mod.PlacePhoto
import typings.googleMaps.mod.PlaceType1
import typings.googleMaps.mod.PlaceType2
import typings.googleMaps.mod.PlusCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Code extends StObject {
    
    /** This is the same as the HTTP status of the response. */
    var code: Double
    
    /**
      * A list of errors which occurred. Each error contains an identifier for the type of error (the `reason`)
      * and a short description (the `message`).
      */
    var errors: js.Array[Domain]
    
    /** A short description of the error. */
    var message: String
  }
  object Code {
    
    @scala.inline
    def apply(code: Double, errors: js.Array[Domain], message: String): Code = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[Code]
    }
    
    @scala.inline
    implicit class CodeMutableBuilder[Self <: Code] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrors(value: js.Array[Domain]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorsVarargs(value: Domain*): Self = StObject.set(x, "errors", js.Array(value :_*))
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  trait Domain extends StObject {
    
    var domain: String
    
    var message: String
    
    var reason: GeolocationErrorReason
  }
  object Domain {
    
    @scala.inline
    def apply(domain: String, message: String, reason: GeolocationErrorReason): Domain = {
      val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
      __obj.asInstanceOf[Domain]
    }
    
    @scala.inline
    implicit class DomainMutableBuilder[Self <: Domain] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReason(value: GeolocationErrorReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    }
  }
  
  trait Location extends StObject {
    
    /** Contains a `latitude` and `longitude` value. */
    var location: LatLngLiteralVerbose
    
    /**
      * An integer that indicates the corresponding value in the original request.
      * Each point in the request maps to at most two segmentsin the response:
      *  - If there are no nearby roads, no segment is returned.
      *  - If the nearest road is one-way, one segment is returned.
      *  - If the nearest road is bidirectional, two segments are returned.
      */
    var originalIndex: Double
    
    /**
      * A unique identifier for a place. All place IDs returned by the Roads API correspond to road segments.
      * Place IDs can be used with other Google APIs, including the Places SDK and the Maps JavaScript API.
      * For example, if you need to get road names for the snapped points returned by the Roads API,
      * you can pass the `placeId` to the Places SDK or the Geocoding API. Within the Roads API,
      * you can pass the `placeId` in a speed limits request to determine the speed limit along that road segment.
      */
    var placeId: String
  }
  object Location {
    
    @scala.inline
    def apply(location: LatLngLiteralVerbose, originalIndex: Double, placeId: String): Location = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], originalIndex = originalIndex.asInstanceOf[js.Any], placeId = placeId.asInstanceOf[js.Any])
      __obj.asInstanceOf[Location]
    }
    
    @scala.inline
    implicit class LocationMutableBuilder[Self <: Location] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocation(value: LatLngLiteralVerbose): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalIndex(value: Double): Self = StObject.set(x, "originalIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceId(value: String): Self = StObject.set(x, "placeId", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@google/maps.@google/maps.PlaceSearchResult> */
  trait PartialPlaceSearchResult extends StObject {
    
    var alt_ids: js.UndefOr[js.Array[AlternativePlaceId]] = js.undefined
    
    var formatted_address: js.UndefOr[String] = js.undefined
    
    var geometry: js.UndefOr[AddressGeometry] = js.undefined
    
    var icon: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var opening_hours: js.UndefOr[OpeningHours] = js.undefined
    
    var permanently_closed: js.UndefOr[Boolean] = js.undefined
    
    var photos: js.UndefOr[js.Array[PlacePhoto]] = js.undefined
    
    var place_id: js.UndefOr[String] = js.undefined
    
    var plus_code: js.UndefOr[PlusCode] = js.undefined
    
    var price_level: js.UndefOr[Double] = js.undefined
    
    var rating: js.UndefOr[Double] = js.undefined
    
    var scope: js.UndefOr[PlaceIdScope] = js.undefined
    
    var types: js.UndefOr[js.Array[PlaceType1 | PlaceType2]] = js.undefined
    
    var vicinity: js.UndefOr[String] = js.undefined
  }
  object PartialPlaceSearchResult {
    
    @scala.inline
    def apply(): PartialPlaceSearchResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialPlaceSearchResult]
    }
    
    @scala.inline
    implicit class PartialPlaceSearchResultMutableBuilder[Self <: PartialPlaceSearchResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlt_ids(value: js.Array[AlternativePlaceId]): Self = StObject.set(x, "alt_ids", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlt_idsUndefined: Self = StObject.set(x, "alt_ids", js.undefined)
      
      @scala.inline
      def setAlt_idsVarargs(value: AlternativePlaceId*): Self = StObject.set(x, "alt_ids", js.Array(value :_*))
      
      @scala.inline
      def setFormatted_address(value: String): Self = StObject.set(x, "formatted_address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatted_addressUndefined: Self = StObject.set(x, "formatted_address", js.undefined)
      
      @scala.inline
      def setGeometry(value: AddressGeometry): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeometryUndefined: Self = StObject.set(x, "geometry", js.undefined)
      
      @scala.inline
      def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOpening_hours(value: OpeningHours): Self = StObject.set(x, "opening_hours", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpening_hoursUndefined: Self = StObject.set(x, "opening_hours", js.undefined)
      
      @scala.inline
      def setPermanently_closed(value: Boolean): Self = StObject.set(x, "permanently_closed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPermanently_closedUndefined: Self = StObject.set(x, "permanently_closed", js.undefined)
      
      @scala.inline
      def setPhotos(value: js.Array[PlacePhoto]): Self = StObject.set(x, "photos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhotosUndefined: Self = StObject.set(x, "photos", js.undefined)
      
      @scala.inline
      def setPhotosVarargs(value: PlacePhoto*): Self = StObject.set(x, "photos", js.Array(value :_*))
      
      @scala.inline
      def setPlace_id(value: String): Self = StObject.set(x, "place_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlace_idUndefined: Self = StObject.set(x, "place_id", js.undefined)
      
      @scala.inline
      def setPlus_code(value: PlusCode): Self = StObject.set(x, "plus_code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlus_codeUndefined: Self = StObject.set(x, "plus_code", js.undefined)
      
      @scala.inline
      def setPrice_level(value: Double): Self = StObject.set(x, "price_level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrice_levelUndefined: Self = StObject.set(x, "price_level", js.undefined)
      
      @scala.inline
      def setRating(value: Double): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRatingUndefined: Self = StObject.set(x, "rating", js.undefined)
      
      @scala.inline
      def setScope(value: PlaceIdScope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      @scala.inline
      def setTypes(value: js.Array[PlaceType1 | PlaceType2]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
      
      @scala.inline
      def setTypesVarargs(value: (PlaceType1 | PlaceType2)*): Self = StObject.set(x, "types", js.Array(value :_*))
      
      @scala.inline
      def setVicinity(value: String): Self = StObject.set(x, "vicinity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVicinityUndefined: Self = StObject.set(x, "vicinity", js.undefined)
    }
  }
  
  trait Points extends StObject {
    
    var points: String
  }
  object Points {
    
    @scala.inline
    def apply(points: String): Points = {
      val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
      __obj.asInstanceOf[Points]
    }
    
    @scala.inline
    implicit class PointsMutableBuilder[Self <: Points] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPoints(value: String): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    }
  }
}
