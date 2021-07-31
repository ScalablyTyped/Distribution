package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlForecast
  extends StObject
     with Generic {
  
  var duration: js.UndefOr[String] = js.undefined
  
  var expires_in: js.UndefOr[String] = js.undefined
  
  var job_id: String
  
  var max_model_memory: js.UndefOr[String] = js.undefined
}
object MlForecast {
  
  @scala.inline
  def apply(job_id: String): MlForecast = {
    val __obj = js.Dynamic.literal(job_id = job_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlForecast]
  }
  
  @scala.inline
  implicit class MlForecastMutableBuilder[Self <: MlForecast] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setExpires_in(value: String): Self = StObject.set(x, "expires_in", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpires_inUndefined: Self = StObject.set(x, "expires_in", js.undefined)
    
    @scala.inline
    def setJob_id(value: String): Self = StObject.set(x, "job_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax_model_memory(value: String): Self = StObject.set(x, "max_model_memory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax_model_memoryUndefined: Self = StObject.set(x, "max_model_memory", js.undefined)
  }
}
