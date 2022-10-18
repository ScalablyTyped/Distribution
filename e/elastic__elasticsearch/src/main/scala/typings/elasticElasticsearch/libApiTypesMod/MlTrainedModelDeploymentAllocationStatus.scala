package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlTrainedModelDeploymentAllocationStatus extends StObject {
  
  var allocation_count: integer
  
  var state: MlDeploymentAllocationState
  
  var target_allocation_count: integer
}
object MlTrainedModelDeploymentAllocationStatus {
  
  inline def apply(allocation_count: integer, state: MlDeploymentAllocationState, target_allocation_count: integer): MlTrainedModelDeploymentAllocationStatus = {
    val __obj = js.Dynamic.literal(allocation_count = allocation_count.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], target_allocation_count = target_allocation_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlTrainedModelDeploymentAllocationStatus]
  }
  
  extension [Self <: MlTrainedModelDeploymentAllocationStatus](x: Self) {
    
    inline def setAllocation_count(value: integer): Self = StObject.set(x, "allocation_count", value.asInstanceOf[js.Any])
    
    inline def setState(value: MlDeploymentAllocationState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setTarget_allocation_count(value: integer): Self = StObject.set(x, "target_allocation_count", value.asInstanceOf[js.Any])
  }
}
