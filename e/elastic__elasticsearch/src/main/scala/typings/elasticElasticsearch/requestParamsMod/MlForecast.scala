package typings.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MlForecast extends Generic {
  var duration: js.UndefOr[String] = js.native
  var expires_in: js.UndefOr[String] = js.native
  var job_id: String = js.native
}

object MlForecast {
  @scala.inline
  def apply(job_id: String): MlForecast = {
    val __obj = js.Dynamic.literal(job_id = job_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlForecast]
  }
  @scala.inline
  implicit class MlForecastOps[Self <: MlForecast] (val x: Self) extends AnyVal {
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
    def setDuration(value: String): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setExpires_in(value: String): Self = this.set("expires_in", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpires_in: Self = this.set("expires_in", js.undefined)
  }
  
}

