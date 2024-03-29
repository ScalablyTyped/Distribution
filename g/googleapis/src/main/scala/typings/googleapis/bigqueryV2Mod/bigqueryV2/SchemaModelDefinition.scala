package typings.googleapis.bigqueryV2Mod.bigqueryV2

import typings.googleapis.anon.Labels
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaModelDefinition extends StObject {
  
  /**
    * [Output-only, Beta] Model options used for the first training run. These options are immutable for subsequent training runs. Default values are used for any options not specified in the input query.
    */
  var modelOptions: js.UndefOr[Labels | Null] = js.undefined
  
  /**
    * [Output-only, Beta] Information about ml training runs, each training run comprises of multiple iterations and there may be multiple training runs for the model if warm start is used or if a user decides to continue a previously cancelled query.
    */
  var trainingRuns: js.UndefOr[js.Array[SchemaBqmlTrainingRun]] = js.undefined
}
object SchemaModelDefinition {
  
  inline def apply(): SchemaModelDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaModelDefinition]
  }
  
  extension [Self <: SchemaModelDefinition](x: Self) {
    
    inline def setModelOptions(value: Labels): Self = StObject.set(x, "modelOptions", value.asInstanceOf[js.Any])
    
    inline def setModelOptionsNull: Self = StObject.set(x, "modelOptions", null)
    
    inline def setModelOptionsUndefined: Self = StObject.set(x, "modelOptions", js.undefined)
    
    inline def setTrainingRuns(value: js.Array[SchemaBqmlTrainingRun]): Self = StObject.set(x, "trainingRuns", value.asInstanceOf[js.Any])
    
    inline def setTrainingRunsUndefined: Self = StObject.set(x, "trainingRuns", js.undefined)
    
    inline def setTrainingRunsVarargs(value: SchemaBqmlTrainingRun*): Self = StObject.set(x, "trainingRuns", js.Array(value*))
  }
}
