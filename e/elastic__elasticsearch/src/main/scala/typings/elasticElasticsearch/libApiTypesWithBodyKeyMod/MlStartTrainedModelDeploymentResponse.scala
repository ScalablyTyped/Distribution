package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlStartTrainedModelDeploymentResponse extends StObject {
  
  var assignment: MlTrainedModelAssignment
}
object MlStartTrainedModelDeploymentResponse {
  
  inline def apply(assignment: MlTrainedModelAssignment): MlStartTrainedModelDeploymentResponse = {
    val __obj = js.Dynamic.literal(assignment = assignment.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlStartTrainedModelDeploymentResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlStartTrainedModelDeploymentResponse] (val x: Self) extends AnyVal {
    
    inline def setAssignment(value: MlTrainedModelAssignment): Self = StObject.set(x, "assignment", value.asInstanceOf[js.Any])
  }
}
