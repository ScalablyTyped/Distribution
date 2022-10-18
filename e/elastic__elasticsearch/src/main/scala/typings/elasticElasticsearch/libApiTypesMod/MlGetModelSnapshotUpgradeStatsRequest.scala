package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlGetModelSnapshotUpgradeStatsRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var allow_no_match: js.UndefOr[Boolean] = js.undefined
  
  var job_id: Id
  
  var snapshot_id: Id
}
object MlGetModelSnapshotUpgradeStatsRequest {
  
  inline def apply(job_id: Id, snapshot_id: Id): MlGetModelSnapshotUpgradeStatsRequest = {
    val __obj = js.Dynamic.literal(job_id = job_id.asInstanceOf[js.Any], snapshot_id = snapshot_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlGetModelSnapshotUpgradeStatsRequest]
  }
  
  extension [Self <: MlGetModelSnapshotUpgradeStatsRequest](x: Self) {
    
    inline def setAllow_no_match(value: Boolean): Self = StObject.set(x, "allow_no_match", value.asInstanceOf[js.Any])
    
    inline def setAllow_no_matchUndefined: Self = StObject.set(x, "allow_no_match", js.undefined)
    
    inline def setJob_id(value: Id): Self = StObject.set(x, "job_id", value.asInstanceOf[js.Any])
    
    inline def setSnapshot_id(value: Id): Self = StObject.set(x, "snapshot_id", value.asInstanceOf[js.Any])
  }
}
