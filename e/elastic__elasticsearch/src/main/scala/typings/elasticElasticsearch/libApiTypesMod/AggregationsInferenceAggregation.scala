package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsInferenceAggregation
  extends StObject
     with AggregationsPipelineAggregationBase {
  
  var inference_config: js.UndefOr[AggregationsInferenceConfigContainer] = js.undefined
  
  var model_id: Name
}
object AggregationsInferenceAggregation {
  
  inline def apply(model_id: Name): AggregationsInferenceAggregation = {
    val __obj = js.Dynamic.literal(model_id = model_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsInferenceAggregation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationsInferenceAggregation] (val x: Self) extends AnyVal {
    
    inline def setInference_config(value: AggregationsInferenceConfigContainer): Self = StObject.set(x, "inference_config", value.asInstanceOf[js.Any])
    
    inline def setInference_configUndefined: Self = StObject.set(x, "inference_config", js.undefined)
    
    inline def setModel_id(value: Name): Self = StObject.set(x, "model_id", value.asInstanceOf[js.Any])
  }
}
