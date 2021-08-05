package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlDeleteForecast
  extends StObject
     with Generic {
  
  var allow_no_forecasts: js.UndefOr[Boolean] = js.undefined
  
  var forecast_id: js.UndefOr[String] = js.undefined
  
  var job_id: String
  
  var timeout: js.UndefOr[String] = js.undefined
}
object MlDeleteForecast {
  
  inline def apply(job_id: String): MlDeleteForecast = {
    val __obj = js.Dynamic.literal(job_id = job_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlDeleteForecast]
  }
  
  extension [Self <: MlDeleteForecast](x: Self) {
    
    inline def setAllow_no_forecasts(value: Boolean): Self = StObject.set(x, "allow_no_forecasts", value.asInstanceOf[js.Any])
    
    inline def setAllow_no_forecastsUndefined: Self = StObject.set(x, "allow_no_forecasts", js.undefined)
    
    inline def setForecast_id(value: String): Self = StObject.set(x, "forecast_id", value.asInstanceOf[js.Any])
    
    inline def setForecast_idUndefined: Self = StObject.set(x, "forecast_id", js.undefined)
    
    inline def setJob_id(value: String): Self = StObject.set(x, "job_id", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
