package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about a single training query run for the model.
  */
trait SchemaTrainingRun extends StObject {
  
  /**
    * The evaluation metrics over training/eval data that were computed at the
    * end of training.
    */
  var evaluationMetrics: js.UndefOr[SchemaEvaluationMetrics] = js.undefined
  
  /**
    * Output of each iteration run, results.size() &lt;= max_iterations.
    */
  var results: js.UndefOr[js.Array[SchemaIterationResult]] = js.undefined
  
  /**
    * The start time of this training run.
    */
  var startTime: js.UndefOr[String] = js.undefined
  
  /**
    * Options that were used for this training run, includes user specified and
    * default options that were used.
    */
  var trainingOptions: js.UndefOr[SchemaTrainingOptions] = js.undefined
}
object SchemaTrainingRun {
  
  @scala.inline
  def apply(): SchemaTrainingRun = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTrainingRun]
  }
  
  @scala.inline
  implicit class SchemaTrainingRunMutableBuilder[Self <: SchemaTrainingRun] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvaluationMetrics(value: SchemaEvaluationMetrics): Self = StObject.set(x, "evaluationMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvaluationMetricsUndefined: Self = StObject.set(x, "evaluationMetrics", js.undefined)
    
    @scala.inline
    def setResults(value: js.Array[SchemaIterationResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    @scala.inline
    def setResultsVarargs(value: SchemaIterationResult*): Self = StObject.set(x, "results", js.Array(value :_*))
    
    @scala.inline
    def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    @scala.inline
    def setTrainingOptions(value: SchemaTrainingOptions): Self = StObject.set(x, "trainingOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrainingOptionsUndefined: Self = StObject.set(x, "trainingOptions", js.undefined)
  }
}
