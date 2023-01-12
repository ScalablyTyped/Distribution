package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlGetTrainedModelsStatsResponse extends StObject {
  
  var count: integer
  
  var trained_model_stats: js.Array[MlTrainedModelStats]
}
object MlGetTrainedModelsStatsResponse {
  
  inline def apply(count: integer, trained_model_stats: js.Array[MlTrainedModelStats]): MlGetTrainedModelsStatsResponse = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], trained_model_stats = trained_model_stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlGetTrainedModelsStatsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlGetTrainedModelsStatsResponse] (val x: Self) extends AnyVal {
    
    inline def setCount(value: integer): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setTrained_model_stats(value: js.Array[MlTrainedModelStats]): Self = StObject.set(x, "trained_model_stats", value.asInstanceOf[js.Any])
    
    inline def setTrained_model_statsVarargs(value: MlTrainedModelStats*): Self = StObject.set(x, "trained_model_stats", js.Array(value*))
  }
}
