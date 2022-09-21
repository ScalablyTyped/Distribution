package typings.googleapis.cloudassetV1Mod.cloudassetV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConditionEvaluation extends StObject {
  
  /**
    * The evaluation result.
    */
  var evaluationValue: js.UndefOr[String | Null] = js.undefined
}
object SchemaConditionEvaluation {
  
  inline def apply(): SchemaConditionEvaluation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConditionEvaluation]
  }
  
  extension [Self <: SchemaConditionEvaluation](x: Self) {
    
    inline def setEvaluationValue(value: String): Self = StObject.set(x, "evaluationValue", value.asInstanceOf[js.Any])
    
    inline def setEvaluationValueNull: Self = StObject.set(x, "evaluationValue", null)
    
    inline def setEvaluationValueUndefined: Self = StObject.set(x, "evaluationValue", js.undefined)
  }
}
