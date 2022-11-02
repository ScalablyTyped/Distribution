package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Available only in the v=beta channel: https://goo.gle/3oAthT3.
  * An interface representing a feature with a place ID which includes features
  * of type {@link google.maps.FeatureType.ADMINISTRATIVE_AREA_LEVEL_1}, {@link
  * google.maps.FeatureType.ADMINISTRATIVE_AREA_LEVEL_2}, {@link
  * google.maps.FeatureType.ADMINISTRATIVE_AREA_LEVEL_3}, {@link
  * google.maps.FeatureType.ADMINISTRATIVE_AREA_LEVEL_4}, {@link
  * google.maps.FeatureType.COUNTRY}, {@link
  * google.maps.FeatureType.LOCALITY}, {@link
  * google.maps.FeatureType.NEIGHBORHOOD}, {@link
  * google.maps.FeatureType.POSTAL_CODE}, and {@link
  * google.maps.FeatureType.SUBLOCALITY_LEVEL_1}.
  */
trait PlaceFeature
  extends StObject
     with Feature {
  
  /**
    * The display name.
    */
  var displayName: String
  
  /**
    * The {@link google.maps.places.PlaceResult.place_id}.
    */
  var placeId: String
}
object PlaceFeature {
  
  inline def apply(displayName: String, featureType: FeatureType, placeId: String): PlaceFeature = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], featureType = featureType.asInstanceOf[js.Any], placeId = placeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaceFeature]
  }
  
  extension [Self <: PlaceFeature](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setPlaceId(value: String): Self = StObject.set(x, "placeId", value.asInstanceOf[js.Any])
  }
}
