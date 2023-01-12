package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlUpgradeJobSnapshotRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var job_id: Id
  
  var snapshot_id: Id
  
  var timeout: js.UndefOr[Duration] = js.undefined
  
  var wait_for_completion: js.UndefOr[Boolean] = js.undefined
}
object MlUpgradeJobSnapshotRequest {
  
  inline def apply(job_id: Id, snapshot_id: Id): MlUpgradeJobSnapshotRequest = {
    val __obj = js.Dynamic.literal(job_id = job_id.asInstanceOf[js.Any], snapshot_id = snapshot_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlUpgradeJobSnapshotRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlUpgradeJobSnapshotRequest] (val x: Self) extends AnyVal {
    
    inline def setJob_id(value: Id): Self = StObject.set(x, "job_id", value.asInstanceOf[js.Any])
    
    inline def setSnapshot_id(value: Id): Self = StObject.set(x, "snapshot_id", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: Duration): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setWait_for_completion(value: Boolean): Self = StObject.set(x, "wait_for_completion", value.asInstanceOf[js.Any])
    
    inline def setWait_for_completionUndefined: Self = StObject.set(x, "wait_for_completion", js.undefined)
  }
}
