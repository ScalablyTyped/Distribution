package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlForecastRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var duration: js.UndefOr[Duration] = js.undefined
  
  var expires_in: js.UndefOr[Duration] = js.undefined
  
  var job_id: Id
  
  var max_model_memory: js.UndefOr[String] = js.undefined
}
object MlForecastRequest {
  
  inline def apply(job_id: Id): MlForecastRequest = {
    val __obj = js.Dynamic.literal(job_id = job_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlForecastRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlForecastRequest] (val x: Self) extends AnyVal {
    
    inline def setDuration(value: Duration): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setExpires_in(value: Duration): Self = StObject.set(x, "expires_in", value.asInstanceOf[js.Any])
    
    inline def setExpires_inUndefined: Self = StObject.set(x, "expires_in", js.undefined)
    
    inline def setJob_id(value: Id): Self = StObject.set(x, "job_id", value.asInstanceOf[js.Any])
    
    inline def setMax_model_memory(value: String): Self = StObject.set(x, "max_model_memory", value.asInstanceOf[js.Any])
    
    inline def setMax_model_memoryUndefined: Self = StObject.set(x, "max_model_memory", js.undefined)
  }
}
