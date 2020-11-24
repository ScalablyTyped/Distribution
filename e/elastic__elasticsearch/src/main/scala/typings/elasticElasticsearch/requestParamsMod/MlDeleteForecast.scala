package typings.elasticElasticsearch.requestParamsMod

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
  implicit class MlDeleteForecastOps[Self <: MlDeleteForecast] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setJob_id(value: String): Self = this.set("job_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllow_no_forecasts(value: Boolean): Self = this.set("allow_no_forecasts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllow_no_forecasts: Self = this.set("allow_no_forecasts", js.undefined)
    
    @scala.inline
    def setForecast_id(value: String): Self = this.set("forecast_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForecast_id: Self = this.set("forecast_id", js.undefined)
    
    @scala.inline
    def setTimeout(value: String): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
