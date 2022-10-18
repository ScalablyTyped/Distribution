package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDslGeoPolygonQueryKeys
  extends StObject
     with QueryDslQueryBase {
  
  var ignore_unmapped: js.UndefOr[Boolean] = js.undefined
  
  var validation_method: js.UndefOr[QueryDslGeoValidationMethod] = js.undefined
}
object QueryDslGeoPolygonQueryKeys {
  
  inline def apply(): QueryDslGeoPolygonQueryKeys = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryDslGeoPolygonQueryKeys]
  }
  
  extension [Self <: QueryDslGeoPolygonQueryKeys](x: Self) {
    
    inline def setIgnore_unmapped(value: Boolean): Self = StObject.set(x, "ignore_unmapped", value.asInstanceOf[js.Any])
    
    inline def setIgnore_unmappedUndefined: Self = StObject.set(x, "ignore_unmapped", js.undefined)
    
    inline def setValidation_method(value: QueryDslGeoValidationMethod): Self = StObject.set(x, "validation_method", value.asInstanceOf[js.Any])
    
    inline def setValidation_methodUndefined: Self = StObject.set(x, "validation_method", js.undefined)
  }
}
