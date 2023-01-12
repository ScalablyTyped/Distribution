package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlEvaluateDataFrameConfusionMatrixPrediction extends StObject {
  
  var count: integer
  
  var predicted_class: Name
}
object MlEvaluateDataFrameConfusionMatrixPrediction {
  
  inline def apply(count: integer, predicted_class: Name): MlEvaluateDataFrameConfusionMatrixPrediction = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], predicted_class = predicted_class.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlEvaluateDataFrameConfusionMatrixPrediction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlEvaluateDataFrameConfusionMatrixPrediction] (val x: Self) extends AnyVal {
    
    inline def setCount(value: integer): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setPredicted_class(value: Name): Self = StObject.set(x, "predicted_class", value.asInstanceOf[js.Any])
  }
}
