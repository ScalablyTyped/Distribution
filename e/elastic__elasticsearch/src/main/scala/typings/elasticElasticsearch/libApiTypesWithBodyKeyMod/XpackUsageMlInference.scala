package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XpackUsageMlInference extends StObject {
  
  var deployments: js.UndefOr[XpackUsageMlInferenceDeployments] = js.undefined
  
  var ingest_processors: Record[String, XpackUsageMlInferenceIngestProcessor]
  
  var trained_models: XpackUsageMlInferenceTrainedModels
}
object XpackUsageMlInference {
  
  inline def apply(
    ingest_processors: Record[String, XpackUsageMlInferenceIngestProcessor],
    trained_models: XpackUsageMlInferenceTrainedModels
  ): XpackUsageMlInference = {
    val __obj = js.Dynamic.literal(ingest_processors = ingest_processors.asInstanceOf[js.Any], trained_models = trained_models.asInstanceOf[js.Any])
    __obj.asInstanceOf[XpackUsageMlInference]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XpackUsageMlInference] (val x: Self) extends AnyVal {
    
    inline def setDeployments(value: XpackUsageMlInferenceDeployments): Self = StObject.set(x, "deployments", value.asInstanceOf[js.Any])
    
    inline def setDeploymentsUndefined: Self = StObject.set(x, "deployments", js.undefined)
    
    inline def setIngest_processors(value: Record[String, XpackUsageMlInferenceIngestProcessor]): Self = StObject.set(x, "ingest_processors", value.asInstanceOf[js.Any])
    
    inline def setTrained_models(value: XpackUsageMlInferenceTrainedModels): Self = StObject.set(x, "trained_models", value.asInstanceOf[js.Any])
  }
}
