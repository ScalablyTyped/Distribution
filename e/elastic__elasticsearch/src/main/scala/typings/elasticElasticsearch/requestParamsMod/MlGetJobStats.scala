package typings.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MlGetJobStats extends Generic {
  var allow_no_jobs: js.UndefOr[Boolean] = js.native
  var job_id: js.UndefOr[String] = js.native
}

object MlGetJobStats {
  @scala.inline
  def apply(): MlGetJobStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlGetJobStats]
  }
  @scala.inline
  implicit class MlGetJobStatsOps[Self <: MlGetJobStats] (val x: Self) extends AnyVal {
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
    def setAllow_no_jobs(value: Boolean): Self = this.set("allow_no_jobs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllow_no_jobs: Self = this.set("allow_no_jobs", js.undefined)
    @scala.inline
    def setJob_id(value: String): Self = this.set("job_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJob_id: Self = this.set("job_id", js.undefined)
  }
  
}

