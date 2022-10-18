package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlDeleteModelSnapshotRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var job_id: Id
  
  var snapshot_id: Id
}
object MlDeleteModelSnapshotRequest {
  
  inline def apply(job_id: Id, snapshot_id: Id): MlDeleteModelSnapshotRequest = {
    val __obj = js.Dynamic.literal(job_id = job_id.asInstanceOf[js.Any], snapshot_id = snapshot_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlDeleteModelSnapshotRequest]
  }
  
  extension [Self <: MlDeleteModelSnapshotRequest](x: Self) {
    
    inline def setJob_id(value: Id): Self = StObject.set(x, "job_id", value.asInstanceOf[js.Any])
    
    inline def setSnapshot_id(value: Id): Self = StObject.set(x, "snapshot_id", value.asInstanceOf[js.Any])
  }
}
