package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlPutTrainedModelDefinition extends StObject {
  
  var preprocessors: js.UndefOr[js.Array[MlPutTrainedModelPreprocessor]] = js.undefined
  
  var trained_model: MlPutTrainedModelTrainedModel
}
object MlPutTrainedModelDefinition {
  
  inline def apply(trained_model: MlPutTrainedModelTrainedModel): MlPutTrainedModelDefinition = {
    val __obj = js.Dynamic.literal(trained_model = trained_model.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlPutTrainedModelDefinition]
  }
  
  extension [Self <: MlPutTrainedModelDefinition](x: Self) {
    
    inline def setPreprocessors(value: js.Array[MlPutTrainedModelPreprocessor]): Self = StObject.set(x, "preprocessors", value.asInstanceOf[js.Any])
    
    inline def setPreprocessorsUndefined: Self = StObject.set(x, "preprocessors", js.undefined)
    
    inline def setPreprocessorsVarargs(value: MlPutTrainedModelPreprocessor*): Self = StObject.set(x, "preprocessors", js.Array(value*))
    
    inline def setTrained_model(value: MlPutTrainedModelTrainedModel): Self = StObject.set(x, "trained_model", value.asInstanceOf[js.Any])
  }
}
