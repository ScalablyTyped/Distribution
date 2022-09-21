package typings.firebaseFirestore.unitSpecsSpecTestRunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpecQuery extends StObject {
  
  var collectionGroup: js.UndefOr[String] = js.undefined
  
  var filters: js.UndefOr[js.Array[SpecQueryFilter]] = js.undefined
  
  var limit: js.UndefOr[Double] = js.undefined
  
  var limitType: js.UndefOr[SpecLimitType] = js.undefined
  
  var orderBys: js.UndefOr[js.Array[SpecQueryOrderBy]] = js.undefined
  
  var path: String
}
object SpecQuery {
  
  inline def apply(path: String): SpecQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpecQuery]
  }
  
  extension [Self <: SpecQuery](x: Self) {
    
    inline def setCollectionGroup(value: String): Self = StObject.set(x, "collectionGroup", value.asInstanceOf[js.Any])
    
    inline def setCollectionGroupUndefined: Self = StObject.set(x, "collectionGroup", js.undefined)
    
    inline def setFilters(value: js.Array[SpecQueryFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: SpecQueryFilter*): Self = StObject.set(x, "filters", js.Array(value*))
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitType(value: SpecLimitType): Self = StObject.set(x, "limitType", value.asInstanceOf[js.Any])
    
    inline def setLimitTypeUndefined: Self = StObject.set(x, "limitType", js.undefined)
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setOrderBys(value: js.Array[SpecQueryOrderBy]): Self = StObject.set(x, "orderBys", value.asInstanceOf[js.Any])
    
    inline def setOrderBysUndefined: Self = StObject.set(x, "orderBys", js.undefined)
    
    inline def setOrderBysVarargs(value: SpecQueryOrderBy*): Self = StObject.set(x, "orderBys", js.Array(value*))
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
