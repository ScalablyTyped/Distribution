package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlInfoLimits extends StObject {
  
  var effective_max_model_memory_limit: String
  
  var max_model_memory_limit: js.UndefOr[String] = js.undefined
  
  var total_ml_memory: String
}
object MlInfoLimits {
  
  inline def apply(effective_max_model_memory_limit: String, total_ml_memory: String): MlInfoLimits = {
    val __obj = js.Dynamic.literal(effective_max_model_memory_limit = effective_max_model_memory_limit.asInstanceOf[js.Any], total_ml_memory = total_ml_memory.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlInfoLimits]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlInfoLimits] (val x: Self) extends AnyVal {
    
    inline def setEffective_max_model_memory_limit(value: String): Self = StObject.set(x, "effective_max_model_memory_limit", value.asInstanceOf[js.Any])
    
    inline def setMax_model_memory_limit(value: String): Self = StObject.set(x, "max_model_memory_limit", value.asInstanceOf[js.Any])
    
    inline def setMax_model_memory_limitUndefined: Self = StObject.set(x, "max_model_memory_limit", js.undefined)
    
    inline def setTotal_ml_memory(value: String): Self = StObject.set(x, "total_ml_memory", value.asInstanceOf[js.Any])
  }
}
