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
  
  @scala.inline
  def apply(): BqmlTrainingRun = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BqmlTrainingRun]
  }
  
  @scala.inline
  implicit class BqmlTrainingRunMutableBuilder[Self <: BqmlTrainingRun] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIterationResults(value: js.Array[BqmlIterationResult]): Self = StObject.set(x, "iterationResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIterationResultsUndefined: Self = StObject.set(x, "iterationResults", js.undefined)
    
    @scala.inline
    def setIterationResultsVarargs(value: BqmlIterationResult*): Self = StObject.set(x, "iterationResults", js.Array(value :_*))
    
    @scala.inline
    def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setTrainingOptions(value: BqmlTrainingRunTrainingOptions): Self = StObject.set(x, "trainingOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrainingOptionsUndefined: Self = StObject.set(x, "trainingOptions", js.undefined)
  }
}
