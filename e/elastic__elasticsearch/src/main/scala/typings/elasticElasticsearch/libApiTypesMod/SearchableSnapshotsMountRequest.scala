package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchableSnapshotsMountRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var ignore_index_settings: js.UndefOr[js.Array[String]] = js.undefined
  
  var index: IndexName
  
  var index_settings: js.UndefOr[Record[String, Any]] = js.undefined
  
  var master_timeout: js.UndefOr[Duration] = js.undefined
  
  var renamed_index: js.UndefOr[IndexName] = js.undefined
  
  var repository: Name
  
  var snapshot: Name
  
  var storage: js.UndefOr[String] = js.undefined
  
  var wait_for_completion: js.UndefOr[Boolean] = js.undefined
}
object SearchableSnapshotsMountRequest {
  
  inline def apply(index: IndexName, repository: Name, snapshot: Name): SearchableSnapshotsMountRequest = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], snapshot = snapshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchableSnapshotsMountRequest]
  }
  
  extension [Self <: SearchableSnapshotsMountRequest](x: Self) {
    
    inline def setIgnore_index_settings(value: js.Array[String]): Self = StObject.set(x, "ignore_index_settings", value.asInstanceOf[js.Any])
    
    inline def setIgnore_index_settingsUndefined: Self = StObject.set(x, "ignore_index_settings", js.undefined)
    
    inline def setIgnore_index_settingsVarargs(value: String*): Self = StObject.set(x, "ignore_index_settings", js.Array(value*))
    
    inline def setIndex(value: IndexName): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndex_settings(value: Record[String, Any]): Self = StObject.set(x, "index_settings", value.asInstanceOf[js.Any])
    
    inline def setIndex_settingsUndefined: Self = StObject.set(x, "index_settings", js.undefined)
    
    inline def setMaster_timeout(value: Duration): Self = StObject.set(x, "master_timeout", value.asInstanceOf[js.Any])
    
    inline def setMaster_timeoutUndefined: Self = StObject.set(x, "master_timeout", js.undefined)
    
    inline def setRenamed_index(value: IndexName): Self = StObject.set(x, "renamed_index", value.asInstanceOf[js.Any])
    
    inline def setRenamed_indexUndefined: Self = StObject.set(x, "renamed_index", js.undefined)
    
    inline def setRepository(value: Name): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setSnapshot(value: Name): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
    
    inline def setStorage(value: String): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
    
    inline def setStorageUndefined: Self = StObject.set(x, "storage", js.undefined)
    
    inline def setWait_for_completion(value: Boolean): Self = StObject.set(x, "wait_for_completion", value.asInstanceOf[js.Any])
    
    inline def setWait_for_completionUndefined: Self = StObject.set(x, "wait_for_completion", js.undefined)
  }
}
