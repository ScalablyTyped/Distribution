package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information needed to locate, identify, or describe a place for
  * a {@link google.maps.DirectionsRequest} or {@link
  * google.maps.DistanceMatrixRequest}. In this context, &quot;place&quot;
  * means a business, point of interest, or geographic location. For fetching
  * information about a place, see {@link google.maps.places.PlacesService}.
  */
trait Place extends StObject {
  
  /**
    * The <code>LatLng</code> of the entity described by this place.
    */
  var location: js.UndefOr[LatLng | Null | LatLngLiteral] = js.undefined
  
  /**
    * The place ID of the place (such as a business or point of interest). The
    * place ID is a unique identifier of a place in the Google Maps database.
    * Note that the <code>placeId</code> is the most accurate way of
    * identifying a place. If possible, you should specify the
    * <code>placeId</code> rather than a <code>query</code>. A place ID can be
    * retrieved from any request to the Places API, such as a <a
    * href="https://developers.google.com/maps/documentation/places/web-service/search">TextSearch</a>.
    * Place IDs can also be retrieved from requests to the Geocoding API. For
    * more information, see the <a
    * href="https://developers.google.com/maps/documentation/places/web-service/place-id">overview
    * of place IDs</a>.
    */
  var placeId: js.UndefOr[String] = js.undefined
  
  /**
    * A search query describing the place (such as a business or point of
    * interest). An example query is &quot;Quay, Upper Level, Overseas
    * Passenger Terminal 5 Hickson Road, The Rocks NSW&quot;. If possible, you
    * should specify the <code>placeId</code> rather than a <code>query</code>.
    * The API does not guarantee the accuracy of resolving the query string to
    * a place. If both the <code>placeId</code> and <code>query</code> are
    * provided, an error occurs.
    */
  var query: js.UndefOr[String] = js.undefined
}
object Place {
  
  inline def apply(): Place = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Place]
  }
  
  extension [Self <: Place](x: Self) {
    
    inline def setLocation(value: LatLng | LatLngLiteral): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationNull: Self = StObject.set(x, "location", null)
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setPlaceId(value: String): Self = StObject.set(x, "placeId", value.asInstanceOf[js.Any])
    
    inline def setPlaceIdUndefined: Self = StObject.set(x, "placeId", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
