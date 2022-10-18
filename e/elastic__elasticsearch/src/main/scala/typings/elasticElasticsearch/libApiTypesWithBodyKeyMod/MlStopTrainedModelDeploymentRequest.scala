package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlStopTrainedModelDeploymentRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var allow_no_match: js.UndefOr[Boolean] = js.undefined
  
  var force: js.UndefOr[Boolean] = js.undefined
  
  var model_id: Id
}
object MlStopTrainedModelDeploymentRequest {
  
  inline def apply(model_id: Id): MlStopTrainedModelDeploymentRequest = {
    val __obj = js.Dynamic.literal(model_id = model_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlStopTrainedModelDeploymentRequest]
  }
  
  extension [Self <: MlStopTrainedModelDeploymentRequest](x: Self) {
    
    inline def setAllow_no_match(value: Boolean): Self = StObject.set(x, "allow_no_match", value.asInstanceOf[js.Any])
    
    inline def setAllow_no_matchUndefined: Self = StObject.set(x, "allow_no_match", js.undefined)
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    inline def setModel_id(value: Id): Self = StObject.set(x, "model_id", value.asInstanceOf[js.Any])
  }
}
