package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlDeleteTrainedModelRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var force: js.UndefOr[Boolean] = js.undefined
  
  var model_id: Id
}
object MlDeleteTrainedModelRequest {
  
  inline def apply(model_id: Id): MlDeleteTrainedModelRequest = {
    val __obj = js.Dynamic.literal(model_id = model_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlDeleteTrainedModelRequest]
  }
  
  extension [Self <: MlDeleteTrainedModelRequest](x: Self) {
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    inline def setModel_id(value: Id): Self = StObject.set(x, "model_id", value.asInstanceOf[js.Any])
  }
}
