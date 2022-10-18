package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlPutTrainedModelWeights extends StObject {
  
  var weights: double
}
object MlPutTrainedModelWeights {
  
  inline def apply(weights: double): MlPutTrainedModelWeights = {
    val __obj = js.Dynamic.literal(weights = weights.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlPutTrainedModelWeights]
  }
  
  extension [Self <: MlPutTrainedModelWeights](x: Self) {
    
    inline def setWeights(value: double): Self = StObject.set(x, "weights", value.asInstanceOf[js.Any])
  }
}
