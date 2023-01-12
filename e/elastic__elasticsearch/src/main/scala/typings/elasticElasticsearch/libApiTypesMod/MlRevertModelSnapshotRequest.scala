package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlRevertModelSnapshotRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var delete_intervening_results: js.UndefOr[Boolean] = js.undefined
  
  var job_id: Id
  
  var snapshot_id: Id
}
object MlRevertModelSnapshotRequest {
  
  inline def apply(job_id: Id, snapshot_id: Id): MlRevertModelSnapshotRequest = {
    val __obj = js.Dynamic.literal(job_id = job_id.asInstanceOf[js.Any], snapshot_id = snapshot_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlRevertModelSnapshotRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlRevertModelSnapshotRequest] (val x: Self) extends AnyVal {
    
    inline def setDelete_intervening_results(value: Boolean): Self = StObject.set(x, "delete_intervening_results", value.asInstanceOf[js.Any])
    
    inline def setDelete_intervening_resultsUndefined: Self = StObject.set(x, "delete_intervening_results", js.undefined)
    
    inline def setJob_id(value: Id): Self = StObject.set(x, "job_id", value.asInstanceOf[js.Any])
    
    inline def setSnapshot_id(value: Id): Self = StObject.set(x, "snapshot_id", value.asInstanceOf[js.Any])
  }
}
