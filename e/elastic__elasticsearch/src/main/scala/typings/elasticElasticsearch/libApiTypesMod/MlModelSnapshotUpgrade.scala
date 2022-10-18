package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlModelSnapshotUpgrade extends StObject {
  
  var assignment_explanation: String
  
  var job_id: Id
  
  var node: MlDiscoveryNode
  
  var snapshot_id: Id
  
  var state: MlSnapshotUpgradeState
}
object MlModelSnapshotUpgrade {
  
  inline def apply(
    assignment_explanation: String,
    job_id: Id,
    node: MlDiscoveryNode,
    snapshot_id: Id,
    state: MlSnapshotUpgradeState
  ): MlModelSnapshotUpgrade = {
    val __obj = js.Dynamic.literal(assignment_explanation = assignment_explanation.asInstanceOf[js.Any], job_id = job_id.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], snapshot_id = snapshot_id.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlModelSnapshotUpgrade]
  }
  
  extension [Self <: MlModelSnapshotUpgrade](x: Self) {
    
    inline def setAssignment_explanation(value: String): Self = StObject.set(x, "assignment_explanation", value.asInstanceOf[js.Any])
    
    inline def setJob_id(value: Id): Self = StObject.set(x, "job_id", value.asInstanceOf[js.Any])
    
    inline def setNode(value: MlDiscoveryNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setSnapshot_id(value: Id): Self = StObject.set(x, "snapshot_id", value.asInstanceOf[js.Any])
    
    inline def setState(value: MlSnapshotUpgradeState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
