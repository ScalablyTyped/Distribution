package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapshotGetRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var after: js.UndefOr[String] = js.undefined
  
  var from_sort_value: js.UndefOr[String] = js.undefined
  
  var ignore_unavailable: js.UndefOr[Boolean] = js.undefined
  
  var include_repository: js.UndefOr[Boolean] = js.undefined
  
  var index_details: js.UndefOr[Boolean] = js.undefined
  
  var index_names: js.UndefOr[Boolean] = js.undefined
  
  var master_timeout: js.UndefOr[Duration] = js.undefined
  
  var offset: js.UndefOr[integer] = js.undefined
  
  var order: js.UndefOr[SortOrder] = js.undefined
  
  var repository: Name
  
  var size: js.UndefOr[integer] = js.undefined
  
  var slm_policy_filter: js.UndefOr[Name] = js.undefined
  
  var snapshot: Names
  
  var sort: js.UndefOr[SnapshotSnapshotSort] = js.undefined
  
  var verbose: js.UndefOr[Boolean] = js.undefined
}
object SnapshotGetRequest {
  
  inline def apply(repository: Name, snapshot: Names): SnapshotGetRequest = {
    val __obj = js.Dynamic.literal(repository = repository.asInstanceOf[js.Any], snapshot = snapshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotGetRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SnapshotGetRequest] (val x: Self) extends AnyVal {
    
    inline def setAfter(value: String): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    
    inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
    
    inline def setFrom_sort_value(value: String): Self = StObject.set(x, "from_sort_value", value.asInstanceOf[js.Any])
    
    inline def setFrom_sort_valueUndefined: Self = StObject.set(x, "from_sort_value", js.undefined)
    
    inline def setIgnore_unavailable(value: Boolean): Self = StObject.set(x, "ignore_unavailable", value.asInstanceOf[js.Any])
    
    inline def setIgnore_unavailableUndefined: Self = StObject.set(x, "ignore_unavailable", js.undefined)
    
    inline def setInclude_repository(value: Boolean): Self = StObject.set(x, "include_repository", value.asInstanceOf[js.Any])
    
    inline def setInclude_repositoryUndefined: Self = StObject.set(x, "include_repository", js.undefined)
    
    inline def setIndex_details(value: Boolean): Self = StObject.set(x, "index_details", value.asInstanceOf[js.Any])
    
    inline def setIndex_detailsUndefined: Self = StObject.set(x, "index_details", js.undefined)
    
    inline def setIndex_names(value: Boolean): Self = StObject.set(x, "index_names", value.asInstanceOf[js.Any])
    
    inline def setIndex_namesUndefined: Self = StObject.set(x, "index_names", js.undefined)
    
    inline def setMaster_timeout(value: Duration): Self = StObject.set(x, "master_timeout", value.asInstanceOf[js.Any])
    
    inline def setMaster_timeoutUndefined: Self = StObject.set(x, "master_timeout", js.undefined)
    
    inline def setOffset(value: integer): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setOrder(value: SortOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setRepository(value: Name): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setSize(value: integer): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSlm_policy_filter(value: Name): Self = StObject.set(x, "slm_policy_filter", value.asInstanceOf[js.Any])
    
    inline def setSlm_policy_filterUndefined: Self = StObject.set(x, "slm_policy_filter", js.undefined)
    
    inline def setSnapshot(value: Names): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
    
    inline def setSnapshotVarargs(value: Name*): Self = StObject.set(x, "snapshot", js.Array(value*))
    
    inline def setSort(value: SnapshotSnapshotSort): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    
    inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
  }
}
