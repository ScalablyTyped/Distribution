package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDslGeoDistanceQueryKeys
  extends StObject
     with QueryDslQueryBase {
  
  var distance: js.UndefOr[Distance] = js.undefined
  
  var distance_type: js.UndefOr[GeoDistanceType] = js.undefined
  
  var validation_method: js.UndefOr[QueryDslGeoValidationMethod] = js.undefined
}
object QueryDslGeoDistanceQueryKeys {
  
  inline def apply(): QueryDslGeoDistanceQueryKeys = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryDslGeoDistanceQueryKeys]
  }
  
  extension [Self <: QueryDslGeoDistanceQueryKeys](x: Self) {
    
    inline def setDistance(value: Distance): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
    
    inline def setDistance_type(value: GeoDistanceType): Self = StObject.set(x, "distance_type", value.asInstanceOf[js.Any])
    
    inline def setDistance_typeUndefined: Self = StObject.set(x, "distance_type", js.undefined)
    
    inline def setValidation_method(value: QueryDslGeoValidationMethod): Self = StObject.set(x, "validation_method", value.asInstanceOf[js.Any])
    
    inline def setValidation_methodUndefined: Self = StObject.set(x, "validation_method", js.undefined)
  }
}
