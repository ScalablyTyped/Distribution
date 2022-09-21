package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTrainingRun extends StObject {
  
  /**
    * Global explanation contains the explanation of top features on the class level. Applies to classification models only.
    */
  var classLevelGlobalExplanations: js.UndefOr[js.Array[SchemaGlobalExplanation]] = js.undefined
  
  /**
    * Data split result of the training run. Only set when the input data is actually split.
    */
  var dataSplitResult: js.UndefOr[SchemaDataSplitResult] = js.undefined
  
  /**
    * The evaluation metrics over training/eval data that were computed at the end of training.
    */
  var evaluationMetrics: js.UndefOr[SchemaEvaluationMetrics] = js.undefined
  
  /**
    * Global explanation contains the explanation of top features on the model level. Applies to both regression and classification models.
    */
  var modelLevelGlobalExplanation: js.UndefOr[SchemaGlobalExplanation] = js.undefined
  
  /**
    * Output of each iteration run, results.size() <= max_iterations.
    */
  var results: js.UndefOr[js.Array[SchemaIterationResult]] = js.undefined
  
  /**
    * The start time of this training run.
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Options that were used for this training run, includes user specified and default options that were used.
    */
  var trainingOptions: js.UndefOr[SchemaTrainingOptions] = js.undefined
  
  /**
    * The start time of this training run, in milliseconds since epoch.
    */
  var trainingStartTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The model id in Vertex AI Model Registry for this training run
    */
  var vertexAiModelId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The model version in Vertex AI Model Registry for this training run
    */
  var vertexAiModelVersion: js.UndefOr[String | Null] = js.undefined
}
object SchemaTrainingRun {
  
  inline def apply(): SchemaTrainingRun = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTrainingRun]
  }
  
  extension [Self <: SchemaTrainingRun](x: Self) {
    
    inline def setClassLevelGlobalExplanations(value: js.Array[SchemaGlobalExplanation]): Self = StObject.set(x, "classLevelGlobalExplanations", value.asInstanceOf[js.Any])
    
    inline def setClassLevelGlobalExplanationsUndefined: Self = StObject.set(x, "classLevelGlobalExplanations", js.undefined)
    
    inline def setClassLevelGlobalExplanationsVarargs(value: SchemaGlobalExplanation*): Self = StObject.set(x, "classLevelGlobalExplanations", js.Array(value*))
    
    inline def setDataSplitResult(value: SchemaDataSplitResult): Self = StObject.set(x, "dataSplitResult", value.asInstanceOf[js.Any])
    
    inline def setDataSplitResultUndefined: Self = StObject.set(x, "dataSplitResult", js.undefined)
    
    inline def setEvaluationMetrics(value: SchemaEvaluationMetrics): Self = StObject.set(x, "evaluationMetrics", value.asInstanceOf[js.Any])
    
    inline def setEvaluationMetricsUndefined: Self = StObject.set(x, "evaluationMetrics", js.undefined)
    
    inline def setModelLevelGlobalExplanation(value: SchemaGlobalExplanation): Self = StObject.set(x, "modelLevelGlobalExplanation", value.asInstanceOf[js.Any])
    
    inline def setModelLevelGlobalExplanationUndefined: Self = StObject.set(x, "modelLevelGlobalExplanation", js.undefined)
    
    inline def setResults(value: js.Array[SchemaIterationResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    inline def setResultsVarargs(value: SchemaIterationResult*): Self = StObject.set(x, "results", js.Array(value*))
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setTrainingOptions(value: SchemaTrainingOptions): Self = StObject.set(x, "trainingOptions", value.asInstanceOf[js.Any])
    
    inline def setTrainingOptionsUndefined: Self = StObject.set(x, "trainingOptions", js.undefined)
    
    inline def setTrainingStartTime(value: String): Self = StObject.set(x, "trainingStartTime", value.asInstanceOf[js.Any])
    
    inline def setTrainingStartTimeNull: Self = StObject.set(x, "trainingStartTime", null)
    
    inline def setTrainingStartTimeUndefined: Self = StObject.set(x, "trainingStartTime", js.undefined)
    
    inline def setVertexAiModelId(value: String): Self = StObject.set(x, "vertexAiModelId", value.asInstanceOf[js.Any])
    
    inline def setVertexAiModelIdNull: Self = StObject.set(x, "vertexAiModelId", null)
    
    inline def setVertexAiModelIdUndefined: Self = StObject.set(x, "vertexAiModelId", js.undefined)
    
    inline def setVertexAiModelVersion(value: String): Self = StObject.set(x, "vertexAiModelVersion", value.asInstanceOf[js.Any])
    
    inline def setVertexAiModelVersionNull: Self = StObject.set(x, "vertexAiModelVersion", null)
    
    inline def setVertexAiModelVersionUndefined: Self = StObject.set(x, "vertexAiModelVersion", js.undefined)
  }
}
