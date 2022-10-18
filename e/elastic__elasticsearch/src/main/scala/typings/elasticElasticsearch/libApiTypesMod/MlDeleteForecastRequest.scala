package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlDeleteForecastRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var allow_no_forecasts: js.UndefOr[Boolean] = js.undefined
  
  var forecast_id: js.UndefOr[Id] = js.undefined
  
  var job_id: Id
  
  var timeout: js.UndefOr[Duration] = js.undefined
}
object MlDeleteForecastRequest {
  
  inline def apply(job_id: Id): MlDeleteForecastRequest = {
    val __obj = js.Dynamic.literal(job_id = job_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlDeleteForecastRequest]
  }
  
  extension [Self <: MlDeleteForecastRequest](x: Self) {
    
    inline def setAllow_no_forecasts(value: Boolean): Self = StObject.set(x, "allow_no_forecasts", value.asInstanceOf[js.Any])
    
    inline def setAllow_no_forecastsUndefined: Self = StObject.set(x, "allow_no_forecasts", js.undefined)
    
    inline def setForecast_id(value: Id): Self = StObject.set(x, "forecast_id", value.asInstanceOf[js.Any])
    
    inline def setForecast_idUndefined: Self = StObject.set(x, "forecast_id", js.undefined)
    
    inline def setJob_id(value: Id): Self = StObject.set(x, "job_id", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: Duration): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
