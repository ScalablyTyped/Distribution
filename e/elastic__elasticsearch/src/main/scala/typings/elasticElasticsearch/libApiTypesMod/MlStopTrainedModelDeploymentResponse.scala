package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlStopTrainedModelDeploymentResponse extends StObject {
  
  var stopped: Boolean
}
object MlStopTrainedModelDeploymentResponse {
  
  inline def apply(stopped: Boolean): MlStopTrainedModelDeploymentResponse = {
    val __obj = js.Dynamic.literal(stopped = stopped.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlStopTrainedModelDeploymentResponse]
  }
  
  extension [Self <: MlStopTrainedModelDeploymentResponse](x: Self) {
    
    inline def setStopped(value: Boolean): Self = StObject.set(x, "stopped", value.asInstanceOf[js.Any])
  }
}
