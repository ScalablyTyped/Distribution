package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModelDefinition extends StObject {
  
  var modelOptions: js.UndefOr[ModelDefinitionModelOptions] = js.native
  
  var trainingRuns: js.UndefOr[js.Array[BqmlTrainingRun]] = js.native
}
object ModelDefinition {
  
  @scala.inline
  def apply(): ModelDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelDefinition]
  }
  
  @scala.inline
  implicit class ModelDefinitionMutableBuilder[Self <: ModelDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModelOptions(value: ModelDefinitionModelOptions): Self = StObject.set(x, "modelOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelOptionsUndefined: Self = StObject.set(x, "modelOptions", js.undefined)
    
    @scala.inline
    def setTrainingRuns(value: js.Array[BqmlTrainingRun]): Self = StObject.set(x, "trainingRuns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrainingRunsUndefined: Self = StObject.set(x, "trainingRuns", js.undefined)
    
    @scala.inline
    def setTrainingRunsVarargs(value: BqmlTrainingRun*): Self = StObject.set(x, "trainingRuns", js.Array(value :_*))
  }
}
