package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlTrainedModelStats extends StObject {
  
  var deployment_stats: js.UndefOr[MlTrainedModelDeploymentStats] = js.undefined
  
  var inference_stats: js.UndefOr[MlTrainedModelInferenceStats] = js.undefined
  
  var ingest: js.UndefOr[Record[String, Any]] = js.undefined
  
  var model_id: Id
  
  var model_size_stats: MlTrainedModelSizeStats
  
  var pipeline_count: integer
}
object MlTrainedModelStats {
  
  inline def apply(model_id: Id, model_size_stats: MlTrainedModelSizeStats, pipeline_count: integer): MlTrainedModelStats = {
    val __obj = js.Dynamic.literal(model_id = model_id.asInstanceOf[js.Any], model_size_stats = model_size_stats.asInstanceOf[js.Any], pipeline_count = pipeline_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlTrainedModelStats]
  }
  
  extension [Self <: MlTrainedModelStats](x: Self) {
    
    inline def setDeployment_stats(value: MlTrainedModelDeploymentStats): Self = StObject.set(x, "deployment_stats", value.asInstanceOf[js.Any])
    
    inline def setDeployment_statsUndefined: Self = StObject.set(x, "deployment_stats", js.undefined)
    
    inline def setInference_stats(value: MlTrainedModelInferenceStats): Self = StObject.set(x, "inference_stats", value.asInstanceOf[js.Any])
    
    inline def setInference_statsUndefined: Self = StObject.set(x, "inference_stats", js.undefined)
    
    inline def setIngest(value: Record[String, Any]): Self = StObject.set(x, "ingest", value.asInstanceOf[js.Any])
    
    inline def setIngestUndefined: Self = StObject.set(x, "ingest", js.undefined)
    
    inline def setModel_id(value: Id): Self = StObject.set(x, "model_id", value.asInstanceOf[js.Any])
    
    inline def setModel_size_stats(value: MlTrainedModelSizeStats): Self = StObject.set(x, "model_size_stats", value.asInstanceOf[js.Any])
    
    inline def setPipeline_count(value: integer): Self = StObject.set(x, "pipeline_count", value.asInstanceOf[js.Any])
  }
}
