package typings.firebaseFirestore.distInternalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Target represents the WatchTarget representation of a Query, which is used
  * by the LocalStore and the RemoteStore to keep track of and to execute
  * backend queries. While a Query can represent multiple Targets, each Targets
  * maps to a single WatchTarget in RemoteStore and a single TargetData entry
  * in persistence.
  */
trait Target extends StObject {
  
  val collectionGroup: String | Null
  
  val endAt: Bound | Null
  
  val filters: js.Array[Filter]
  
  val limit: Double | Null
  
  val orderBy: js.Array[OrderBy_]
  
  val path: ResourcePath
  
  val startAt: Bound | Null
}
object Target {
  
  inline def apply(filters: js.Array[Filter], orderBy: js.Array[OrderBy_], path: ResourcePath): Target = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any], orderBy = orderBy.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], collectionGroup = null, endAt = null, limit = null, startAt = null)
    __obj.asInstanceOf[Target]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Target] (val x: Self) extends AnyVal {
    
    inline def setCollectionGroup(value: String): Self = StObject.set(x, "collectionGroup", value.asInstanceOf[js.Any])
    
    inline def setCollectionGroupNull: Self = StObject.set(x, "collectionGroup", null)
    
    inline def setEndAt(value: Bound): Self = StObject.set(x, "endAt", value.asInstanceOf[js.Any])
    
    inline def setEndAtNull: Self = StObject.set(x, "endAt", null)
    
    inline def setFilters(value: js.Array[Filter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "filters", js.Array(value*))
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitNull: Self = StObject.set(x, "limit", null)
    
    inline def setOrderBy(value: js.Array[OrderBy_]): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    inline def setOrderByVarargs(value: OrderBy_ *): Self = StObject.set(x, "orderBy", js.Array(value*))
    
    inline def setPath(value: ResourcePath): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setStartAt(value: Bound): Self = StObject.set(x, "startAt", value.asInstanceOf[js.Any])
    
    inline def setStartAtNull: Self = StObject.set(x, "startAt", null)
  }
}
