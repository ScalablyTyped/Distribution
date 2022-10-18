package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapshotCloneRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var indices: String
  
  var master_timeout: js.UndefOr[Duration] = js.undefined
  
  var repository: Name
  
  var snapshot: Name
  
  var target_snapshot: Name
  
  var timeout: js.UndefOr[Duration] = js.undefined
}
object SnapshotCloneRequest {
  
  inline def apply(indices: String, repository: Name, snapshot: Name, target_snapshot: Name): SnapshotCloneRequest = {
    val __obj = js.Dynamic.literal(indices = indices.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], snapshot = snapshot.asInstanceOf[js.Any], target_snapshot = target_snapshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotCloneRequest]
  }
  
  extension [Self <: SnapshotCloneRequest](x: Self) {
    
    inline def setIndices(value: String): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    inline def setMaster_timeout(value: Duration): Self = StObject.set(x, "master_timeout", value.asInstanceOf[js.Any])
    
    inline def setMaster_timeoutUndefined: Self = StObject.set(x, "master_timeout", js.undefined)
    
    inline def setRepository(value: Name): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setSnapshot(value: Name): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
    
    inline def setTarget_snapshot(value: Name): Self = StObject.set(x, "target_snapshot", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: Duration): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
