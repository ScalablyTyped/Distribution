package typings.googleMaps.google.maps.places

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlacesService extends StObject {
  
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
  def findPlaceFromPhoneNumber(
    request: FindPlaceFromPhoneNumberRequest,
    callback: js.Function2[/* a */ js.Array[PlaceResult] | Null, /* b */ PlacesServiceStatus, Unit]
  ): Unit
  
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
  def findPlaceFromQuery(
    request: FindPlaceFromQueryRequest,
    callback: js.Function2[/* a */ js.Array[PlaceResult] | Null, /* b */ PlacesServiceStatus, Unit]
  ): Unit
  
  /**
    * Retrieves details about the place identified by the given
    * <code>placeId</code>.
    */
  def getDetails(
    request: PlaceDetailsRequest,
    callback: js.Function2[/* a */ PlaceResult | Null, /* b */ PlacesServiceStatus, Unit]
  ): Unit
  
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
  def nearbySearch(
    request: PlaceSearchRequest,
    callback: js.Function3[
      /* a */ js.Array[PlaceResult] | Null, 
      /* b */ PlacesServiceStatus, 
      /* c */ PlaceSearchPagination | Null, 
      Unit
    ]
  ): Unit
  
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
  def textSearch(
    request: TextSearchRequest,
    callback: js.Function3[
      /* a */ js.Array[PlaceResult] | Null, 
      /* b */ PlacesServiceStatus, 
      /* c */ PlaceSearchPagination | Null, 
      Unit
    ]
  ): Unit
}
object PlacesService {
  
  inline def apply(
    findPlaceFromPhoneNumber: (FindPlaceFromPhoneNumberRequest, js.Function2[/* a */ js.Array[PlaceResult] | Null, /* b */ PlacesServiceStatus, Unit]) => Unit,
    findPlaceFromQuery: (FindPlaceFromQueryRequest, js.Function2[/* a */ js.Array[PlaceResult] | Null, /* b */ PlacesServiceStatus, Unit]) => Unit,
    getDetails: (PlaceDetailsRequest, js.Function2[/* a */ PlaceResult | Null, /* b */ PlacesServiceStatus, Unit]) => Unit,
    nearbySearch: (PlaceSearchRequest, js.Function3[
      /* a */ js.Array[PlaceResult] | Null, 
      /* b */ PlacesServiceStatus, 
      /* c */ PlaceSearchPagination | Null, 
      Unit
    ]) => Unit,
    textSearch: (TextSearchRequest, js.Function3[
      /* a */ js.Array[PlaceResult] | Null, 
      /* b */ PlacesServiceStatus, 
      /* c */ PlaceSearchPagination | Null, 
      Unit
    ]) => Unit
  ): PlacesService = {
    val __obj = js.Dynamic.literal(findPlaceFromPhoneNumber = js.Any.fromFunction2(findPlaceFromPhoneNumber), findPlaceFromQuery = js.Any.fromFunction2(findPlaceFromQuery), getDetails = js.Any.fromFunction2(getDetails), nearbySearch = js.Any.fromFunction2(nearbySearch), textSearch = js.Any.fromFunction2(textSearch))
    __obj.asInstanceOf[PlacesService]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlacesService] (val x: Self) extends AnyVal {
    
    inline def setFindPlaceFromPhoneNumber(
      value: (FindPlaceFromPhoneNumberRequest, js.Function2[/* a */ js.Array[PlaceResult] | Null, /* b */ PlacesServiceStatus, Unit]) => Unit
    ): Self = StObject.set(x, "findPlaceFromPhoneNumber", js.Any.fromFunction2(value))
    
    inline def setFindPlaceFromQuery(
      value: (FindPlaceFromQueryRequest, js.Function2[/* a */ js.Array[PlaceResult] | Null, /* b */ PlacesServiceStatus, Unit]) => Unit
    ): Self = StObject.set(x, "findPlaceFromQuery", js.Any.fromFunction2(value))
    
    inline def setGetDetails(
      value: (PlaceDetailsRequest, js.Function2[/* a */ PlaceResult | Null, /* b */ PlacesServiceStatus, Unit]) => Unit
    ): Self = StObject.set(x, "getDetails", js.Any.fromFunction2(value))
    
    inline def setNearbySearch(
      value: (PlaceSearchRequest, js.Function3[
          /* a */ js.Array[PlaceResult] | Null, 
          /* b */ PlacesServiceStatus, 
          /* c */ PlaceSearchPagination | Null, 
          Unit
        ]) => Unit
    ): Self = StObject.set(x, "nearbySearch", js.Any.fromFunction2(value))
    
    inline def setTextSearch(
      value: (TextSearchRequest, js.Function3[
          /* a */ js.Array[PlaceResult] | Null, 
          /* b */ PlacesServiceStatus, 
          /* c */ PlaceSearchPagination | Null, 
          Unit
        ]) => Unit
    ): Self = StObject.set(x, "textSearch", js.Any.fromFunction2(value))
  }
}
