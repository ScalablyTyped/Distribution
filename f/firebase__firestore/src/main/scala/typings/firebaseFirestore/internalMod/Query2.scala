package typings.firebaseFirestore.internalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Query interface defines all external properties of a query.
  *
  * QueryImpl implements this interface to provide memoization for `queryOrderBy`
  * and `queryToTarget`.
  */
trait Query2 extends StObject {
  
  val collectionGroup: String | Null
  
  val endAt: Bound | Null
  
  val explicitOrderBy: js.Array[OrderBy_]
  
  val filters: js.Array[Filter]
  
  val limit: Double | Null
  
  val limitType: LimitType
  
  val path: ResourcePath
  
  val startAt: Bound | Null
}
object Query2 {
  
  inline def apply(
    explicitOrderBy: js.Array[OrderBy_],
    filters: js.Array[Filter],
    limitType: LimitType,
    path: ResourcePath
  ): Query2 = {
    val __obj = js.Dynamic.literal(explicitOrderBy = explicitOrderBy.asInstanceOf[js.Any], filters = filters.asInstanceOf[js.Any], limitType = limitType.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], collectionGroup = null, endAt = null, limit = null, startAt = null)
    __obj.asInstanceOf[Query2]
  }
  
  extension [Self <: Query2](x: Self) {
    
    inline def setCollectionGroup(value: String): Self = StObject.set(x, "collectionGroup", value.asInstanceOf[js.Any])
    
    inline def setCollectionGroupNull: Self = StObject.set(x, "collectionGroup", null)
    
    inline def setEndAt(value: Bound): Self = StObject.set(x, "endAt", value.asInstanceOf[js.Any])
    
    inline def setEndAtNull: Self = StObject.set(x, "endAt", null)
    
    inline def setExplicitOrderBy(value: js.Array[OrderBy_]): Self = StObject.set(x, "explicitOrderBy", value.asInstanceOf[js.Any])
    
    inline def setExplicitOrderByVarargs(value: OrderBy_ *): Self = StObject.set(x, "explicitOrderBy", js.Array(value*))
    
    inline def setFilters(value: js.Array[Filter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "filters", js.Array(value*))
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitNull: Self = StObject.set(x, "limit", null)
    
    inline def setLimitType(value: LimitType): Self = StObject.set(x, "limitType", value.asInstanceOf[js.Any])
    
    inline def setPath(value: ResourcePath): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setStartAt(value: Bound): Self = StObject.set(x, "startAt", value.asInstanceOf[js.Any])
    
    inline def setStartAtNull: Self = StObject.set(x, "startAt", null)
  }
}
