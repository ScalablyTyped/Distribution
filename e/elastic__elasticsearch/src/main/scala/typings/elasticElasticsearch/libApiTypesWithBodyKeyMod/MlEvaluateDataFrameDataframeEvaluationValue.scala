package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlEvaluateDataFrameDataframeEvaluationValue extends StObject {
  
  var value: double
}
object MlEvaluateDataFrameDataframeEvaluationValue {
  
  inline def apply(value: double): MlEvaluateDataFrameDataframeEvaluationValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlEvaluateDataFrameDataframeEvaluationValue]
  }
  
  extension [Self <: MlEvaluateDataFrameDataframeEvaluationValue](x: Self) {
    
    inline def setValue(value: double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
