package typings.googleapis.civicinfoV2Mod.civicinfoV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGeocodingSummary extends StObject {
  
  /**
    * Represents the best estimate of whether or not the input address was fully understood and the address is correctly componentized. Mirrors the same-name field in geostore.staging.AddressLinkupScoringProto.
    */
  var addressUnderstood: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The ID of the FeatureProto returned by the geocoder
    */
  var featureId: js.UndefOr[SchemaFeatureIdProto] = js.undefined
  
  /**
    * The feature type for the FeatureProto returned by the geocoder
    */
  var featureType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Precision of the center point (lat/long) of the geocoded FeatureProto
    */
  var positionPrecisionMeters: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The query sent to the geocoder
    */
  var queryString: js.UndefOr[String | Null] = js.undefined
}
object SchemaGeocodingSummary {
  
  inline def apply(): SchemaGeocodingSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGeocodingSummary]
  }
  
  extension [Self <: SchemaGeocodingSummary](x: Self) {
    
    inline def setAddressUnderstood(value: Boolean): Self = StObject.set(x, "addressUnderstood", value.asInstanceOf[js.Any])
    
    inline def setAddressUnderstoodNull: Self = StObject.set(x, "addressUnderstood", null)
    
    inline def setAddressUnderstoodUndefined: Self = StObject.set(x, "addressUnderstood", js.undefined)
    
    inline def setFeatureId(value: SchemaFeatureIdProto): Self = StObject.set(x, "featureId", value.asInstanceOf[js.Any])
    
    inline def setFeatureIdUndefined: Self = StObject.set(x, "featureId", js.undefined)
    
    inline def setFeatureType(value: String): Self = StObject.set(x, "featureType", value.asInstanceOf[js.Any])
    
    inline def setFeatureTypeNull: Self = StObject.set(x, "featureType", null)
    
    inline def setFeatureTypeUndefined: Self = StObject.set(x, "featureType", js.undefined)
    
    inline def setPositionPrecisionMeters(value: Double): Self = StObject.set(x, "positionPrecisionMeters", value.asInstanceOf[js.Any])
    
    inline def setPositionPrecisionMetersNull: Self = StObject.set(x, "positionPrecisionMeters", null)
    
    inline def setPositionPrecisionMetersUndefined: Self = StObject.set(x, "positionPrecisionMeters", js.undefined)
    
    inline def setQueryString(value: String): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
    
    inline def setQueryStringNull: Self = StObject.set(x, "queryString", null)
    
    inline def setQueryStringUndefined: Self = StObject.set(x, "queryString", js.undefined)
  }
}
