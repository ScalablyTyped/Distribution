package typings.googleMaps.global.google.maps

import typings.googleMaps.google.maps.places.AutocompleteOptions
import typings.googleMaps.google.maps.places.FindPlaceFromPhoneNumberRequest
import typings.googleMaps.google.maps.places.FindPlaceFromQueryRequest
import typings.googleMaps.google.maps.places.PlaceDetailsRequest
import typings.googleMaps.google.maps.places.PlaceResult
import typings.googleMaps.google.maps.places.PlaceSearchPagination
import typings.googleMaps.google.maps.places.PlaceSearchRequest
import typings.googleMaps.google.maps.places.PlacesServiceStatus
import typings.googleMaps.google.maps.places.SearchBoxOptions
import typings.googleMaps.google.maps.places.TextSearchRequest
import typings.std.HTMLDivElement
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object places {
  
  /**
    * A widget that provides Place predictions based on a user&#39;s text input.
    * It attaches to an input element of type <code>text</code>, and listens for
    * text entry in that field. The list of predictions is presented as a
    * drop-down list, and is updated as text is entered.
    */
  @JSGlobal("google.maps.places.Autocomplete")
  @js.native
  open class Autocomplete protected ()
    extends StObject
       with typings.googleMaps.google.maps.places.Autocomplete {
    /**
      * A widget that provides Place predictions based on a user&#39;s text
      * input. It attaches to an input element of type <code>text</code>, and
      * listens for text entry in that field. The list of predictions is
      * presented as a drop-down list, and is updated as text is entered.
      * @param inputField The <code>&lt;input&gt;</code> text field to which the
      *     <code>Autocomplete</code> should be attached.
      * @param opts Options.
      */
    def this(inputField: HTMLInputElement) = this()
    def this(inputField: HTMLInputElement, opts: AutocompleteOptions) = this()
  }
  
  /**
    * Contains methods related to retrieving Autocomplete predictions.
    */
  @JSGlobal("google.maps.places.AutocompleteService")
  @js.native
  open class AutocompleteService ()
    extends StObject
       with typings.googleMaps.google.maps.places.AutocompleteService
  
  /**
    * Represents a session token used for tracking an autocomplete session, which
    * can be a series of {@link
    * google.maps.places.AutocompleteService.getPlacePredictions} calls followed
    * by a single {@link google.maps.places.PlacesService.getDetails} call.
    */
  @JSGlobal("google.maps.places.AutocompleteSessionToken")
  @js.native
  open class AutocompleteSessionToken ()
    extends StObject
       with typings.googleMaps.google.maps.places.AutocompleteSessionToken
  
  /**
    * The operational status of the Place, if it is a business, returned in a
    * PlaceResult (indicates whether the place is operational, or closed either
    * temporarily or permanently). Specify these by value, or the constant&#39;s
    * name (example: <code>&#39;OPERATIONAL&#39;</code> or
    * <code>google.maps.places.BusinessStatus.OPERATIONAL</code>).
    */
  @JSGlobal("google.maps.places.BusinessStatus")
  @js.native
  object BusinessStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.googleMaps.google.maps.places.BusinessStatus & String] = js.native
    
    /* "CLOSED_PERMANENTLY" */ val CLOSED_PERMANENTLY: typings.googleMaps.google.maps.places.BusinessStatus.CLOSED_PERMANENTLY & String = js.native
    
    /* "CLOSED_TEMPORARILY" */ val CLOSED_TEMPORARILY: typings.googleMaps.google.maps.places.BusinessStatus.CLOSED_TEMPORARILY & String = js.native
    
    /* "OPERATIONAL" */ val OPERATIONAL: typings.googleMaps.google.maps.places.BusinessStatus.OPERATIONAL & String = js.native
  }
  
  /**
    * Contains methods related to searching for places and retrieving details
    * about a place.
    */
  @JSGlobal("google.maps.places.PlacesService")
  @js.native
  open class PlacesService protected ()
    extends StObject
       with typings.googleMaps.google.maps.places.PlacesService {
    def this(attrContainer: typings.googleMaps.google.maps.Map) = this()
    /**
      * Contains methods related to searching for places and retrieving details
      * about a place.
      */
    def this(attrContainer: HTMLDivElement) = this()
    
    /**
      * Retrieves a list of places based on a phone number. In most cases there
      * should be just one item in the result list, however if the request is
      * ambiguous more than one result may be returned. The {@link
      * google.maps.places.PlaceResult}s passed to the callback are subsets of a
      * full {@link google.maps.places.PlaceResult}. Your app can get a more
      * detailed {@link google.maps.places.PlaceResult} for each place by
      * calling {@link google.maps.places.PlacesService.getDetails} and passing
      * the {@link google.maps.places.PlaceResult.place_id} for the desired
      * place.
      */
    /* CompleteClass */
    override def findPlaceFromPhoneNumber(
      request: FindPlaceFromPhoneNumberRequest,
      callback: js.Function2[/* a */ js.Array[PlaceResult] | Null, /* b */ PlacesServiceStatus, Unit]
    ): Unit = js.native
    
    /**
      * Retrieves a list of places based on a query string. In most cases there
      * should be just one item in the result list, however if the request is
      * ambiguous more than one result may be returned. The {@link
      * google.maps.places.PlaceResult}s passed to the callback are subsets of a
      * full {@link google.maps.places.PlaceResult}. Your app can get a more
      * detailed {@link google.maps.places.PlaceResult} for each place by
      * calling {@link google.maps.places.PlacesService.getDetails} and passing
      * the {@link google.maps.places.PlaceResult.place_id} for the desired
      * place.
      */
    /* CompleteClass */
    override def findPlaceFromQuery(
      request: FindPlaceFromQueryRequest,
      callback: js.Function2[/* a */ js.Array[PlaceResult] | Null, /* b */ PlacesServiceStatus, Unit]
    ): Unit = js.native
    
    /**
      * Retrieves details about the place identified by the given
      * <code>placeId</code>.
      */
    /* CompleteClass */
    override def getDetails(
      request: PlaceDetailsRequest,
      callback: js.Function2[/* a */ PlaceResult | Null, /* b */ PlacesServiceStatus, Unit]
    ): Unit = js.native
    
    /**
      * Retrieves a list of places near a particular location, based on keyword
      * or type. Location must always be specified, either by passing a
      * <code>LatLngBounds</code>, or <code>location</code> and
      * <code>radius</code> parameters. The {@link
      * google.maps.places.PlaceResult}s passed to the callback are subsets of
      * the full {@link google.maps.places.PlaceResult}. Your app can get a more
      * detailed {@link google.maps.places.PlaceResult} for each place by sending
      * a <a
      * href="https://developers.google.com/maps/documentation/javascript/places#place_details_requests">Place
      * Details request</a> passing the {@link
      * google.maps.places.PlaceResult.place_id} for the desired place.
      * The {@link google.maps.places.PlaceSearchPagination} object can be used
      * to fetch additional pages of results (null if this is the last page of
      * results or if there is only one page of results).
      */
    /* CompleteClass */
    override def nearbySearch(
      request: PlaceSearchRequest,
      callback: js.Function3[
          /* a */ js.Array[PlaceResult] | Null, 
          /* b */ PlacesServiceStatus, 
          /* c */ PlaceSearchPagination | Null, 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Retrieves a list of places based on a query string (for example,
      * &quot;pizza in New York&quot;, or &quot;shoe stores near Ottawa&quot;).
      * Location parameters are optional; when the location is specified, results
      * are only biased toward nearby results rather than restricted to places
      * inside the area. Use <code>textSearch</code> when you want to search for
      * places using an arbitrary string, and in cases where you may not want to
      * restrict search results to a particular location. The
      * <code>PlaceSearchPagination</code> object can be used to fetch additional
      * pages of results (null if this is the last page of results or if there is
      * only one page of results).
      */
    /* CompleteClass */
    override def textSearch(
      request: TextSearchRequest,
      callback: js.Function3[
          /* a */ js.Array[PlaceResult] | Null, 
          /* b */ PlacesServiceStatus, 
          /* c */ PlaceSearchPagination | Null, 
          Unit
        ]
    ): Unit = js.native
  }
  
  /**
    * The status returned by the <code>PlacesService</code> on the completion of
    * its searches. Specify these by value, or by using the constant&#39;s name.
    * For example, <code>'OK'</code> or
    * <code>google.maps.places.PlacesServiceStatus.OK</code>.
    */
  @JSGlobal("google.maps.places.PlacesServiceStatus")
  @js.native
  object PlacesServiceStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.googleMaps.google.maps.places.PlacesServiceStatus & String] = js.native
    
    /* "INVALID_REQUEST" */ val INVALID_REQUEST: typings.googleMaps.google.maps.places.PlacesServiceStatus.INVALID_REQUEST & String = js.native
    
    /* "NOT_FOUND" */ val NOT_FOUND: typings.googleMaps.google.maps.places.PlacesServiceStatus.NOT_FOUND & String = js.native
    
    /* "OK" */ val OK: typings.googleMaps.google.maps.places.PlacesServiceStatus.OK & String = js.native
    
    /* "OVER_QUERY_LIMIT" */ val OVER_QUERY_LIMIT: typings.googleMaps.google.maps.places.PlacesServiceStatus.OVER_QUERY_LIMIT & String = js.native
    
    /* "REQUEST_DENIED" */ val REQUEST_DENIED: typings.googleMaps.google.maps.places.PlacesServiceStatus.REQUEST_DENIED & String = js.native
    
    /* "UNKNOWN_ERROR" */ val UNKNOWN_ERROR: typings.googleMaps.google.maps.places.PlacesServiceStatus.UNKNOWN_ERROR & String = js.native
    
    /* "ZERO_RESULTS" */ val ZERO_RESULTS: typings.googleMaps.google.maps.places.PlacesServiceStatus.ZERO_RESULTS & String = js.native
  }
  
  /**
    * Ranking options for a PlaceSearchRequest.
    */
  @JSGlobal("google.maps.places.RankBy")
  @js.native
  object RankBy extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.googleMaps.google.maps.places.RankBy & Double] = js.native
    
    /* 0.0 */ val DISTANCE: typings.googleMaps.google.maps.places.RankBy.DISTANCE & Double = js.native
    
    /* 1.0 */ val PROMINENCE: typings.googleMaps.google.maps.places.RankBy.PROMINENCE & Double = js.native
  }
  
  /**
    * A widget that provides query predictions based on a user&#39;s text input.
    * It attaches to an input element of type <code>text</code>, and listens for
    * text entry in that field. The list of predictions is presented as a
    * drop-down list, and is updated as text is entered.
    */
  @JSGlobal("google.maps.places.SearchBox")
  @js.native
  open class SearchBox protected ()
    extends StObject
       with typings.googleMaps.google.maps.places.SearchBox {
    /**
      * A widget that provides query predictions based on a user&#39;s text
      * input. It attaches to an input element of type <code>text</code>, and
      * listens for text entry in that field. The list of predictions is
      * presented as a drop-down list, and is updated as text is entered.
      */
    def this(inputField: HTMLInputElement) = this()
    def this(inputField: HTMLInputElement, opts: SearchBoxOptions) = this()
  }
}
