package typings.googleapis.bigqueryV2Mod.bigqueryV2

import typings.googleapis.anon.EarlyStop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBqmlTrainingRun extends StObject {
  
  /**
    * [Output-only, Beta] List of each iteration results.
    */
  var iterationResults: js.UndefOr[js.Array[SchemaBqmlIterationResult]] = js.undefined
  
  /**
    * [Output-only, Beta] Training run start time in milliseconds since the epoch.
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output-only, Beta] Different state applicable for a training run. IN PROGRESS: Training run is in progress. FAILED: Training run ended due to a non-retryable failure. SUCCEEDED: Training run successfully completed. CANCELLED: Training run cancelled by the user.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output-only, Beta] Training options used by this training run. These options are mutable for subsequent training runs. Default values are explicitly stored for options not specified in the input query of the first training run. For subsequent training runs, any option not explicitly specified in the input query will be copied from the previous training run.
    */
  var trainingOptions: js.UndefOr[EarlyStop | Null] = js.undefined
}
object SchemaBqmlTrainingRun {
  
  inline def apply(): SchemaBqmlTrainingRun = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBqmlTrainingRun]
  }
  
  extension [Self <: SchemaBqmlTrainingRun](x: Self) {
    
    inline def setIterationResults(value: js.Array[SchemaBqmlIterationResult]): Self = StObject.set(x, "iterationResults", value.asInstanceOf[js.Any])
    
    inline def setIterationResultsUndefined: Self = StObject.set(x, "iterationResults", js.undefined)
    
    inline def setIterationResultsVarargs(value: SchemaBqmlIterationResult*): Self = StObject.set(x, "iterationResults", js.Array(value*))
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTrainingOptions(value: EarlyStop): Self = StObject.set(x, "trainingOptions", value.asInstanceOf[js.Any])
    
    inline def setTrainingOptionsNull: Self = StObject.set(x, "trainingOptions", null)
    
    inline def setTrainingOptionsUndefined: Self = StObject.set(x, "trainingOptions", js.undefined)
  }
}
