package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlGetTrainedModelsResponse extends StObject {
  
  var count: integer
  
  var trained_model_configs: js.Array[MlTrainedModelConfig]
}
object MlGetTrainedModelsResponse {
  
  inline def apply(count: integer, trained_model_configs: js.Array[MlTrainedModelConfig]): MlGetTrainedModelsResponse = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], trained_model_configs = trained_model_configs.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlGetTrainedModelsResponse]
  }
  
  extension [Self <: MlGetTrainedModelsResponse](x: Self) {
    
    inline def setCount(value: integer): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setTrained_model_configs(value: js.Array[MlTrainedModelConfig]): Self = StObject.set(x, "trained_model_configs", value.asInstanceOf[js.Any])
    
    inline def setTrained_model_configsVarargs(value: MlTrainedModelConfig*): Self = StObject.set(x, "trained_model_configs", js.Array(value*))
  }
}
