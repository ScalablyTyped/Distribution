package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapshotCreateRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var feature_states: js.UndefOr[js.Array[String]] = js.undefined
  
  var ignore_unavailable: js.UndefOr[Boolean] = js.undefined
  
  var include_global_state: js.UndefOr[Boolean] = js.undefined
  
  var indices: js.UndefOr[Indices] = js.undefined
  
  var master_timeout: js.UndefOr[Duration] = js.undefined
  
  var metadata: js.UndefOr[Metadata] = js.undefined
  
  var partial: js.UndefOr[Boolean] = js.undefined
  
  var repository: Name
  
  var snapshot: Name
  
  var wait_for_completion: js.UndefOr[Boolean] = js.undefined
}
object SnapshotCreateRequest {
  
  inline def apply(repository: Name, snapshot: Name): SnapshotCreateRequest = {
    val __obj = js.Dynamic.literal(repository = repository.asInstanceOf[js.Any], snapshot = snapshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotCreateRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SnapshotCreateRequest] (val x: Self) extends AnyVal {
    
    inline def setFeature_states(value: js.Array[String]): Self = StObject.set(x, "feature_states", value.asInstanceOf[js.Any])
    
    inline def setFeature_statesUndefined: Self = StObject.set(x, "feature_states", js.undefined)
    
    inline def setFeature_statesVarargs(value: String*): Self = StObject.set(x, "feature_states", js.Array(value*))
    
    inline def setIgnore_unavailable(value: Boolean): Self = StObject.set(x, "ignore_unavailable", value.asInstanceOf[js.Any])
    
    inline def setIgnore_unavailableUndefined: Self = StObject.set(x, "ignore_unavailable", js.undefined)
    
    inline def setInclude_global_state(value: Boolean): Self = StObject.set(x, "include_global_state", value.asInstanceOf[js.Any])
    
    inline def setInclude_global_stateUndefined: Self = StObject.set(x, "include_global_state", js.undefined)
    
    inline def setIndices(value: Indices): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    inline def setIndicesUndefined: Self = StObject.set(x, "indices", js.undefined)
    
    inline def setIndicesVarargs(value: IndexName*): Self = StObject.set(x, "indices", js.Array(value*))
    
    inline def setMaster_timeout(value: Duration): Self = StObject.set(x, "master_timeout", value.asInstanceOf[js.Any])
    
    inline def setMaster_timeoutUndefined: Self = StObject.set(x, "master_timeout", js.undefined)
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setPartial(value: Boolean): Self = StObject.set(x, "partial", value.asInstanceOf[js.Any])
    
    inline def setPartialUndefined: Self = StObject.set(x, "partial", js.undefined)
    
    inline def setRepository(value: Name): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setSnapshot(value: Name): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
    
    inline def setWait_for_completion(value: Boolean): Self = StObject.set(x, "wait_for_completion", value.asInstanceOf[js.Any])
    
    inline def setWait_for_completionUndefined: Self = StObject.set(x, "wait_for_completion", js.undefined)
  }
}
