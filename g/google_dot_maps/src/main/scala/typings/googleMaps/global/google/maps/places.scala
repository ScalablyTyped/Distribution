package typings.googleMaps.global.google.maps

import typings.googleMaps.anon.Places
import typings.googleMaps.google.maps.MapsEventListener
import typings.googleMaps.google.maps.places.AutocompleteOptions
import typings.googleMaps.google.maps.places.FindPlaceFromPhoneNumberRequest
import typings.googleMaps.google.maps.places.FindPlaceFromQueryRequest
import typings.googleMaps.google.maps.places.PlaceAutocompleteElementOptions
import typings.googleMaps.google.maps.places.PlaceDetailsRequest
import typings.googleMaps.google.maps.places.PlaceOptions
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
  
  @JSGlobal("google.maps.places.AddressComponent")
  @js.native
  open class AddressComponent ()
    extends StObject
       with typings.googleMaps.google.maps.places.AddressComponent {
    
    /**
      * The full text of the address component.
      */
    /* CompleteClass */
    var longText: String | Null = js.native
    
    /**
      * The abbreviated, short text of the given address component.
      */
    /* CompleteClass */
    var shortText: String | Null = js.native
    
    /**
      * An array of strings denoting the type of this address component. A list
      * of valid types can be found <a
      * href="https://developers.google.com/maps/documentation/javascript/geocoding#GeocodingAddressTypes">here</a>.
      */
    /* CompleteClass */
    var types: js.Array[String] = js.native
  }
  
  @JSGlobal("google.maps.places.Attribution")
  @js.native
  open class Attribution ()
    extends StObject
       with typings.googleMaps.google.maps.places.Attribution {
    
    /**
      * Attribution text to be displayed for this Place result.
      */
    /* CompleteClass */
    var provider: String | Null = js.native
    
    /* CompleteClass */
    var providerURI: String | Null = js.native
  }
  
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
      *
      * Access by calling `const {Autocomplete} = await
      * google.maps.importLibrary("places")`. See
      * https://developers.google.com/maps/documentation/javascript/libraries.
      * @param inputField The <code>&lt;input&gt;</code> text field to which the
      *     <code>Autocomplete</code> should be attached.
      * @param opts Options.
      */
    def this(inputField: HTMLInputElement) = this()
    def this(inputField: HTMLInputElement, opts: AutocompleteOptions) = this()
  }
  
  @JSGlobal("google.maps.places.AutocompleteService")
  @js.native
  open class AutocompleteService ()
    extends StObject
       with typings.googleMaps.google.maps.places.AutocompleteService
  
  @JSGlobal("google.maps.places.AutocompleteSessionToken")
  @js.native
  open class AutocompleteSessionToken ()
    extends StObject
       with typings.googleMaps.google.maps.places.AutocompleteSessionToken
  
  @JSGlobal("google.maps.places.BusinessStatus")
  @js.native
  object BusinessStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.googleMaps.google.maps.places.BusinessStatus & String] = js.native
    
    /* "CLOSED_PERMANENTLY" */ val CLOSED_PERMANENTLY: typings.googleMaps.google.maps.places.BusinessStatus.CLOSED_PERMANENTLY & String = js.native
    
    /* "CLOSED_TEMPORARILY" */ val CLOSED_TEMPORARILY: typings.googleMaps.google.maps.places.BusinessStatus.CLOSED_TEMPORARILY & String = js.native
    
    /* "OPERATIONAL" */ val OPERATIONAL: typings.googleMaps.google.maps.places.BusinessStatus.OPERATIONAL & String = js.native
  }
  
  @JSGlobal("google.maps.places.OpeningHours")
  @js.native
  open class OpeningHours ()
    extends StObject
       with typings.googleMaps.google.maps.places.OpeningHours {
    
    /**
      * Opening periods covering each day of the week, starting from Sunday, in
      * chronological order. Does not include days where the Place is not open.
      */
    /* CompleteClass */
    var periods: js.Array[typings.googleMaps.google.maps.places.OpeningHoursPeriod] = js.native
    
    /**
      * An array of seven strings representing the formatted opening hours for
      * each day of the week. The Places Service will format and localize the
      * opening hours appropriately for the current language. The ordering of the
      * elements in this array depends on the language. Some languages start the
      * week on Monday, while others start on Sunday.
      */
    /* CompleteClass */
    var weekdayDescriptions: js.Array[String] = js.native
  }
  
  @JSGlobal("google.maps.places.OpeningHoursPeriod")
  @js.native
  open class OpeningHoursPeriod ()
    extends StObject
       with typings.googleMaps.google.maps.places.OpeningHoursPeriod {
    
    /**
      * The closing time for the Place.
      */
    /* CompleteClass */
    var close: typings.googleMaps.google.maps.places.OpeningHoursPoint | Null = js.native
    
    /**
      * The opening time for the Place.
      */
    /* CompleteClass */
    var open: typings.googleMaps.google.maps.places.OpeningHoursPoint = js.native
  }
  
  @JSGlobal("google.maps.places.OpeningHoursPoint")
  @js.native
  open class OpeningHoursPoint ()
    extends StObject
       with typings.googleMaps.google.maps.places.OpeningHoursPoint {
    
    /**
      * The day of the week, as a number in the range [0, 6], starting on Sunday.
      * For example, 2 means Tuesday.
      */
    /* CompleteClass */
    var day: Double = js.native
    
    /**
      * The hour of the OpeningHoursPoint.time as a number, in the range [0, 23].
      * This will be reported in the Place’s time zone.
      */
    /* CompleteClass */
    var hour: Double = js.native
    
    /**
      * The minute of the OpeningHoursPoint.time as a number, in the range [0,
      * 59]. This will be reported in the Place’s time zone.
      */
    /* CompleteClass */
    var minute: Double = js.native
  }
  
  @JSGlobal("google.maps.places.Photo")
  @js.native
  open class Photo ()
    extends StObject
       with typings.googleMaps.google.maps.places.Photo
  
  @JSGlobal("google.maps.places.PhotoAttribution")
  @js.native
  open class PhotoAttribution ()
    extends StObject
       with typings.googleMaps.google.maps.places.PhotoAttribution {
    
    /**
      * Attribution text to be displayed for this Photo result.
      */
    /* CompleteClass */
    var author: String = js.native
    
    /* CompleteClass */
    var authorURI: String | Null = js.native
  }
  
  @JSGlobal("google.maps.places.Place")
  @js.native
  open class Place protected ()
    extends StObject
       with typings.googleMaps.google.maps.places.Place {
    /**
      * Available only in the v=beta channel: https://goo.gle/3oAthT3.
      *
      *
      * Access by calling `const {Place} = await
      * google.maps.importLibrary("places")`. See
      * https://developers.google.com/maps/documentation/javascript/libraries.
      */
    def this(options: PlaceOptions) = this()
  }
  /* static members */
  object Place {
    
    @JSGlobal("google.maps.places.Place")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Available only in the v=beta channel: https://goo.gle/3oAthT3.
      * Searches for a place based on the given phone number. Returns an array
      * due to rare cases where multiple places may share a phone number.
      * @param request The request containing the phone number and requested
      *     fields.
      */
    inline def findPlaceFromPhoneNumber(request: FindPlaceFromPhoneNumberRequest): js.Promise[Places] = ^.asInstanceOf[js.Dynamic].applyDynamic("findPlaceFromPhoneNumber")(request.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Places]]
    
    /**
      * Available only in the v=beta channel: https://goo.gle/3oAthT3.
      * Searches for a place based on the given text query. Returns an array due
      * to cases where the query is mildly ambiguous, and more than one place
      * gets returned. This method is <em>not</em> intended for searches where
      * multiple results are expected.
      * @param request The request containing the text query and requested
      *     fields.
      */
    inline def findPlaceFromQuery(request: FindPlaceFromQueryRequest): js.Promise[Places] = ^.asInstanceOf[js.Dynamic].applyDynamic("findPlaceFromQuery")(request.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Places]]
  }
  
  @JSGlobal("google.maps.places.PlaceAutocompleteElement")
  @js.native
  open class PlaceAutocompleteElement protected ()
    extends StObject
       with typings.googleMaps.google.maps.places.PlaceAutocompleteElement {
    /**
      * Available only in the v=alpha channel: https://goo.gle/js-alpha-channel.
      *
      * Implementation of AutocompleteView for Places API
      *
      * Access by calling `const {PlaceAutocompleteElement} = await
      * google.maps.importLibrary("places")`. See
      * https://developers.google.com/maps/documentation/javascript/libraries.
      */
    def this(options: PlaceAutocompleteElementOptions) = this()
    
    /**
      * Adds the given listener function to the given event name.
      */
    /* CompleteClass */
    override def addListener(eventName: String, handler: js.Function): MapsEventListener = js.native
    
    /**
      * The input element to show autocompletions for.
      */
    /* CompleteClass */
    var inputElement: HTMLInputElement = js.native
  }
  
  @JSGlobal("google.maps.places.PlacesService")
  @js.native
  open class PlacesService protected ()
    extends StObject
       with typings.googleMaps.google.maps.places.PlacesService {
    def this(attrContainer: typings.googleMaps.google.maps.Map) = this()
    /**
      * Contains methods related to searching for places and retrieving details
      * about a place.
      *
      * Access by calling `const {PlacesService} = await
      * google.maps.importLibrary("places")`. See
      * https://developers.google.com/maps/documentation/javascript/libraries.
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
  
  @JSGlobal("google.maps.places.PlusCode")
  @js.native
  open class PlusCode ()
    extends StObject
       with typings.googleMaps.google.maps.places.PlusCode {
    
    /**
      * A plus code with a 1/8000th of a degree by 1/8000th of a degree area
      * where the first four characters (the area code) are dropped and replaced
      * with a locality description. For example, &quot;9G8F+5W Zurich,
      * Switzerland&quot;.
      */
    /* CompleteClass */
    var compoundCode: String | Null = js.native
    
    /**
      * A plus code with a 1/8000th of a degree by 1/8000th of a degree area. For
      * example, &quot;8FVC9G8F+5W&quot;.
      */
    /* CompleteClass */
    var globalCode: String | Null = js.native
  }
  
  @JSGlobal("google.maps.places.PriceLevel")
  @js.native
  object PriceLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.googleMaps.google.maps.places.PriceLevel & String] = js.native
    
    /* "EXPENSIVE" */ val EXPENSIVE: typings.googleMaps.google.maps.places.PriceLevel.EXPENSIVE & String = js.native
    
    /* "FREE" */ val FREE: typings.googleMaps.google.maps.places.PriceLevel.FREE & String = js.native
    
    /* "INEXPENSIVE" */ val INEXPENSIVE: typings.googleMaps.google.maps.places.PriceLevel.INEXPENSIVE & String = js.native
    
    /* "MODERATE" */ val MODERATE: typings.googleMaps.google.maps.places.PriceLevel.MODERATE & String = js.native
    
    /* "VERY_EXPENSIVE" */ val VERY_EXPENSIVE: typings.googleMaps.google.maps.places.PriceLevel.VERY_EXPENSIVE & String = js.native
  }
  
  @JSGlobal("google.maps.places.RankBy")
  @js.native
  object RankBy extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.googleMaps.google.maps.places.RankBy & Double] = js.native
    
    /* 0.0 */ val DISTANCE: typings.googleMaps.google.maps.places.RankBy.DISTANCE & Double = js.native
    
    /* 1.0 */ val PROMINENCE: typings.googleMaps.google.maps.places.RankBy.PROMINENCE & Double = js.native
  }
  
  @JSGlobal("google.maps.places.Review")
  @js.native
  open class Review ()
    extends StObject
       with typings.googleMaps.google.maps.places.Review {
    
    /**
      * The name of the reviewer.
      */
    /* CompleteClass */
    var author: String | Null = js.native
    
    /**
      * A URL to the reviwer&#39;s profile image.
      */
    /* CompleteClass */
    var authorPhotoURI: String | Null = js.native
    
    /**
      * A URL to the reviewer&#39;s profile.
      */
    /* CompleteClass */
    var authorURI: String | Null = js.native
    
    /* CompleteClass */
    var publishTime: js.Date | Null = js.native
    
    /**
      * The rating of this review, a number between 1.0 and 5.0 (inclusive).
      */
    /* CompleteClass */
    var rating: Double | Null = js.native
    
    /**
      * A string of formatted recent time, expressing the review time relative to
      * the current time in a form appropriate for the language and country. For
      * example
      * `&quot;a month ago&quot;&#39;.
      */
    /* CompleteClass */
    var relativePublishTimeDescription: String | Null = js.native
    
    /**
      * The text of a review.
      */
    /* CompleteClass */
    var text: String | Null = js.native
    
    /**
      * An IETF language code indicating the language in which this review is
      * written. Note that this code includes only the main language tag without
      * any secondary tag indicating country or region. For example, all the
      * English reviews are tagged as <code>'en'</code> rather than
      * &#39;en-AU&#39; or
      * &#39;en-UK&#39;.
      */
    /* CompleteClass */
    var textLanguageCode: String | Null = js.native
  }
  
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
      *
      * Access by calling `const {SearchBox} = await
      * google.maps.importLibrary("places")`. See
      * https://developers.google.com/maps/documentation/javascript/libraries.
      */
    def this(inputField: HTMLInputElement) = this()
    def this(inputField: HTMLInputElement, opts: SearchBoxOptions) = this()
  }
}
