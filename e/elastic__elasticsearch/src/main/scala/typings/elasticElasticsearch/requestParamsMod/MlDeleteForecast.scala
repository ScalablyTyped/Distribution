package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MlDeleteForecast extends Generic {
  
  var allow_no_forecasts: js.UndefOr[Boolean] = js.native
  
  var forecast_id: js.UndefOr[String] = js.native
  
  var job_id: String = js.native
  
  var timeout: js.UndefOr[String] = js.native
}
object MlDeleteForecast {
  
  @scala.inline
  def apply(job_id: String): MlDeleteForecast = {
    val __obj = js.Dynamic.literal(job_id = job_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlDeleteForecast]
  }
  
  @scala.inline
  implicit class MlDeleteForecastMutableBuilder[Self <: MlDeleteForecast] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllow_no_forecasts(value: Boolean): Self = StObject.set(x, "allow_no_forecasts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllow_no_forecastsUndefined: Self = StObject.set(x, "allow_no_forecasts", js.undefined)
    
    @scala.inline
    def setForecast_id(value: String): Self = StObject.set(x, "forecast_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForecast_idUndefined: Self = StObject.set(x, "forecast_id", js.undefined)
    
    @scala.inline
    def setJob_id(value: String): Self = StObject.set(x, "job_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
