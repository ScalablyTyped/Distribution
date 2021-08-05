package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BqmlTrainingRun extends StObject {
  
  var iterationResults: js.UndefOr[js.Array[BqmlIterationResult]] = js.undefined
  
  var startTime: js.UndefOr[String] = js.undefined
  
  var state: js.UndefOr[String] = js.undefined
  
  var trainingOptions: js.UndefOr[BqmlTrainingRunTrainingOptions] = js.undefined
}
object BqmlTrainingRun {
  
  inline def apply(): BqmlTrainingRun = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BqmlTrainingRun]
  }
  
  extension [Self <: BqmlTrainingRun](x: Self) {
    
    inline def setIterationResults(value: js.Array[BqmlIterationResult]): Self = StObject.set(x, "iterationResults", value.asInstanceOf[js.Any])
    
    inline def setIterationResultsUndefined: Self = StObject.set(x, "iterationResults", js.undefined)
    
    inline def setIterationResultsVarargs(value: BqmlIterationResult*): Self = StObject.set(x, "iterationResults", js.Array(value :_*))
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTrainingOptions(value: BqmlTrainingRunTrainingOptions): Self = StObject.set(x, "trainingOptions", value.asInstanceOf[js.Any])
    
    inline def setTrainingOptionsUndefined: Self = StObject.set(x, "trainingOptions", js.undefined)
  }
}
