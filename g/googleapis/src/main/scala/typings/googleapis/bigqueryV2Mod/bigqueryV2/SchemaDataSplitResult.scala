package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDataSplitResult extends StObject {
  
  /**
    * Table reference of the evaluation data after split.
    */
  var evaluationTable: js.UndefOr[SchemaTableReference] = js.undefined
  
  /**
    * Table reference of the test data after split.
    */
  var testTable: js.UndefOr[SchemaTableReference] = js.undefined
  
  /**
    * Table reference of the training data after split.
    */
  var trainingTable: js.UndefOr[SchemaTableReference] = js.undefined
}
object SchemaDataSplitResult {
  
  inline def apply(): SchemaDataSplitResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDataSplitResult]
  }
  
  extension [Self <: SchemaDataSplitResult](x: Self) {
    
    inline def setEvaluationTable(value: SchemaTableReference): Self = StObject.set(x, "evaluationTable", value.asInstanceOf[js.Any])
    
    inline def setEvaluationTableUndefined: Self = StObject.set(x, "evaluationTable", js.undefined)
    
    inline def setTestTable(value: SchemaTableReference): Self = StObject.set(x, "testTable", value.asInstanceOf[js.Any])
    
    inline def setTestTableUndefined: Self = StObject.set(x, "testTable", js.undefined)
    
    inline def setTrainingTable(value: SchemaTableReference): Self = StObject.set(x, "trainingTable", value.asInstanceOf[js.Any])
    
    inline def setTrainingTableUndefined: Self = StObject.set(x, "trainingTable", js.undefined)
  }
}
