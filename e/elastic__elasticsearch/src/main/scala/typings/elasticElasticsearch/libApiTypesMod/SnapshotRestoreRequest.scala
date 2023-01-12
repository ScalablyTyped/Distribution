package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapshotRestoreRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var ignore_index_settings: js.UndefOr[js.Array[String]] = js.undefined
  
  var ignore_unavailable: js.UndefOr[Boolean] = js.undefined
  
  var include_aliases: js.UndefOr[Boolean] = js.undefined
  
  var include_global_state: js.UndefOr[Boolean] = js.undefined
  
  var index_settings: js.UndefOr[IndicesIndexSettings] = js.undefined
  
  var indices: js.UndefOr[Indices] = js.undefined
  
  var master_timeout: js.UndefOr[Duration] = js.undefined
  
  var partial: js.UndefOr[Boolean] = js.undefined
  
  var rename_pattern: js.UndefOr[String] = js.undefined
  
  var rename_replacement: js.UndefOr[String] = js.undefined
  
  var repository: Name
  
  var snapshot: Name
  
  var wait_for_completion: js.UndefOr[Boolean] = js.undefined
}
object SnapshotRestoreRequest {
  
  inline def apply(repository: Name, snapshot: Name): SnapshotRestoreRequest = {
    val __obj = js.Dynamic.literal(repository = repository.asInstanceOf[js.Any], snapshot = snapshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotRestoreRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SnapshotRestoreRequest] (val x: Self) extends AnyVal {
    
    inline def setIgnore_index_settings(value: js.Array[String]): Self = StObject.set(x, "ignore_index_settings", value.asInstanceOf[js.Any])
    
    inline def setIgnore_index_settingsUndefined: Self = StObject.set(x, "ignore_index_settings", js.undefined)
    
    inline def setIgnore_index_settingsVarargs(value: String*): Self = StObject.set(x, "ignore_index_settings", js.Array(value*))
    
    inline def setIgnore_unavailable(value: Boolean): Self = StObject.set(x, "ignore_unavailable", value.asInstanceOf[js.Any])
    
    inline def setIgnore_unavailableUndefined: Self = StObject.set(x, "ignore_unavailable", js.undefined)
    
    inline def setInclude_aliases(value: Boolean): Self = StObject.set(x, "include_aliases", value.asInstanceOf[js.Any])
    
    inline def setInclude_aliasesUndefined: Self = StObject.set(x, "include_aliases", js.undefined)
    
    inline def setInclude_global_state(value: Boolean): Self = StObject.set(x, "include_global_state", value.asInstanceOf[js.Any])
    
    inline def setInclude_global_stateUndefined: Self = StObject.set(x, "include_global_state", js.undefined)
    
    inline def setIndex_settings(value: IndicesIndexSettings): Self = StObject.set(x, "index_settings", value.asInstanceOf[js.Any])
    
    inline def setIndex_settingsUndefined: Self = StObject.set(x, "index_settings", js.undefined)
    
    inline def setIndices(value: Indices): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    inline def setIndicesUndefined: Self = StObject.set(x, "indices", js.undefined)
    
    inline def setIndicesVarargs(value: IndexName*): Self = StObject.set(x, "indices", js.Array(value*))
    
    inline def setMaster_timeout(value: Duration): Self = StObject.set(x, "master_timeout", value.asInstanceOf[js.Any])
    
    inline def setMaster_timeoutUndefined: Self = StObject.set(x, "master_timeout", js.undefined)
    
    inline def setPartial(value: Boolean): Self = StObject.set(x, "partial", value.asInstanceOf[js.Any])
    
    inline def setPartialUndefined: Self = StObject.set(x, "partial", js.undefined)
    
    inline def setRename_pattern(value: String): Self = StObject.set(x, "rename_pattern", value.asInstanceOf[js.Any])
    
    inline def setRename_patternUndefined: Self = StObject.set(x, "rename_pattern", js.undefined)
    
    inline def setRename_replacement(value: String): Self = StObject.set(x, "rename_replacement", value.asInstanceOf[js.Any])
    
    inline def setRename_replacementUndefined: Self = StObject.set(x, "rename_replacement", js.undefined)
    
    inline def setRepository(value: Name): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setSnapshot(value: Name): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
    
    inline def setWait_for_completion(value: Boolean): Self = StObject.set(x, "wait_for_completion", value.asInstanceOf[js.Any])
    
    inline def setWait_for_completionUndefined: Self = StObject.set(x, "wait_for_completion", js.undefined)
  }
}
