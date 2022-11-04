package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlClearTrainedModelDeploymentCacheRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var model_id: Id
}
object MlClearTrainedModelDeploymentCacheRequest {
  
  inline def apply(model_id: Id): MlClearTrainedModelDeploymentCacheRequest = {
    val __obj = js.Dynamic.literal(model_id = model_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlClearTrainedModelDeploymentCacheRequest]
  }
  
  extension [Self <: MlClearTrainedModelDeploymentCacheRequest](x: Self) {
    
    inline def setModel_id(value: Id): Self = StObject.set(x, "model_id", value.asInstanceOf[js.Any])
  }
}
