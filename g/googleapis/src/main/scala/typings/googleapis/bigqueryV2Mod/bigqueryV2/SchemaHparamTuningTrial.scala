package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHparamTuningTrial extends StObject {
  
  /**
    * Ending time of the trial.
    */
  var endTimeMs: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Error message for FAILED and INFEASIBLE trial.
    */
  var errorMessage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Loss computed on the eval data at the end of trial.
    */
  var evalLoss: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Evaluation metrics of this trial calculated on the test data. Empty in Job API.
    */
  var evaluationMetrics: js.UndefOr[SchemaEvaluationMetrics] = js.undefined
  
  /**
    * Hyperparameter tuning evaluation metrics of this trial calculated on the eval data. Unlike evaluation_metrics, only the fields corresponding to the hparam_tuning_objectives are set.
    */
  var hparamTuningEvaluationMetrics: js.UndefOr[SchemaEvaluationMetrics] = js.undefined
  
  /**
    * The hyperprameters selected for this trial.
    */
  var hparams: js.UndefOr[SchemaTrainingOptions] = js.undefined
  
  /**
    * Starting time of the trial.
    */
  var startTimeMs: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The status of the trial.
    */
  var status: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Loss computed on the training data at the end of trial.
    */
  var trainingLoss: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * 1-based index of the trial.
    */
  var trialId: js.UndefOr[String | Null] = js.undefined
}
object SchemaHparamTuningTrial {
  
  inline def apply(): SchemaHparamTuningTrial = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHparamTuningTrial]
  }
  
  extension [Self <: SchemaHparamTuningTrial](x: Self) {
    
    inline def setEndTimeMs(value: String): Self = StObject.set(x, "endTimeMs", value.asInstanceOf[js.Any])
    
    inline def setEndTimeMsNull: Self = StObject.set(x, "endTimeMs", null)
    
    inline def setEndTimeMsUndefined: Self = StObject.set(x, "endTimeMs", js.undefined)
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageNull: Self = StObject.set(x, "errorMessage", null)
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setEvalLoss(value: Double): Self = StObject.set(x, "evalLoss", value.asInstanceOf[js.Any])
    
    inline def setEvalLossNull: Self = StObject.set(x, "evalLoss", null)
    
    inline def setEvalLossUndefined: Self = StObject.set(x, "evalLoss", js.undefined)
    
    inline def setEvaluationMetrics(value: SchemaEvaluationMetrics): Self = StObject.set(x, "evaluationMetrics", value.asInstanceOf[js.Any])
    
    inline def setEvaluationMetricsUndefined: Self = StObject.set(x, "evaluationMetrics", js.undefined)
    
    inline def setHparamTuningEvaluationMetrics(value: SchemaEvaluationMetrics): Self = StObject.set(x, "hparamTuningEvaluationMetrics", value.asInstanceOf[js.Any])
    
    inline def setHparamTuningEvaluationMetricsUndefined: Self = StObject.set(x, "hparamTuningEvaluationMetrics", js.undefined)
    
    inline def setHparams(value: SchemaTrainingOptions): Self = StObject.set(x, "hparams", value.asInstanceOf[js.Any])
    
    inline def setHparamsUndefined: Self = StObject.set(x, "hparams", js.undefined)
    
    inline def setStartTimeMs(value: String): Self = StObject.set(x, "startTimeMs", value.asInstanceOf[js.Any])
    
    inline def setStartTimeMsNull: Self = StObject.set(x, "startTimeMs", null)
    
    inline def setStartTimeMsUndefined: Self = StObject.set(x, "startTimeMs", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTrainingLoss(value: Double): Self = StObject.set(x, "trainingLoss", value.asInstanceOf[js.Any])
    
    inline def setTrainingLossNull: Self = StObject.set(x, "trainingLoss", null)
    
    inline def setTrainingLossUndefined: Self = StObject.set(x, "trainingLoss", js.undefined)
    
    inline def setTrialId(value: String): Self = StObject.set(x, "trialId", value.asInstanceOf[js.Any])
    
    inline def setTrialIdNull: Self = StObject.set(x, "trialId", null)
    
    inline def setTrialIdUndefined: Self = StObject.set(x, "trialId", js.undefined)
  }
}
