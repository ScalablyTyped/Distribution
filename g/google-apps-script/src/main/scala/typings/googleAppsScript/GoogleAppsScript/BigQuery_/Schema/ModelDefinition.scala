package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelDefinition extends StObject {
  
  var modelOptions: js.UndefOr[ModelDefinitionModelOptions] = js.undefined
  
  var trainingRuns: js.UndefOr[js.Array[BqmlTrainingRun]] = js.undefined
}
object ModelDefinition {
  
  inline def apply(): ModelDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelDefinition]
  }
  
  extension [Self <: ModelDefinition](x: Self) {
    
    inline def setModelOptions(value: ModelDefinitionModelOptions): Self = StObject.set(x, "modelOptions", value.asInstanceOf[js.Any])
    
    inline def setModelOptionsUndefined: Self = StObject.set(x, "modelOptions", js.undefined)
    
    inline def setTrainingRuns(value: js.Array[BqmlTrainingRun]): Self = StObject.set(x, "trainingRuns", value.asInstanceOf[js.Any])
    
    inline def setTrainingRunsUndefined: Self = StObject.set(x, "trainingRuns", js.undefined)
    
    inline def setTrainingRunsVarargs(value: BqmlTrainingRun*): Self = StObject.set(x, "trainingRuns", js.Array(value :_*))
  }
}
