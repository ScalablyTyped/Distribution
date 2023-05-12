package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaceFeature
  extends StObject
     with Feature {
  
  /**
    * Fetches a <code>Place</code> for this <code>PlaceFeature</code>. In the
    * resulting <code>Place</code> object, the <code>id</code> and the
    * <code>displayName</code> properties will be populated. The display name
    * will be in the language the end user sees on the map. (Additional fields
    * can be subsequently requested via <code>Place.fetchFields()</code>
    * subject to normal Places API enablement and billing.) Do not call this
    * from a <code>FeatureStyleFunction</code> since only synchronous
    * FeatureStyleFunctions are supported. The promise is rejected if there was
    * an error fetching the <code>Place</code>.
    */
  def fetchPlace(): js.Promise[typings.googleMaps.google.maps.places.Place]
  
  /**
    * The {@link google.maps.places.PlaceResult.place_id}.
    */
  var placeId: String
}
object PlaceFeature {
  
  inline def apply(
    featureType: FeatureType,
    fetchPlace: () => js.Promise[typings.googleMaps.google.maps.places.Place],
    placeId: String
  ): PlaceFeature = {
    val __obj = js.Dynamic.literal(featureType = featureType.asInstanceOf[js.Any], fetchPlace = js.Any.fromFunction0(fetchPlace), placeId = placeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaceFeature]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlaceFeature] (val x: Self) extends AnyVal {
    
    inline def setFetchPlace(value: () => js.Promise[typings.googleMaps.google.maps.places.Place]): Self = StObject.set(x, "fetchPlace", js.Any.fromFunction0(value))
    
    inline def setPlaceId(value: String): Self = StObject.set(x, "placeId", value.asInstanceOf[js.Any])
  }
}
