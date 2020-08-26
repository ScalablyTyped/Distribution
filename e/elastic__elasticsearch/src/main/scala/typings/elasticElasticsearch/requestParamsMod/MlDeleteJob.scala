package typings.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MlDeleteJob extends Generic {
  var force: js.UndefOr[Boolean] = js.native
  var job_id: String = js.native
  var wait_for_completion: js.UndefOr[Boolean] = js.native
}

object MlDeleteJob {
  @scala.inline
  def apply(job_id: String): MlDeleteJob = {
    val __obj = js.Dynamic.literal(job_id = job_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlDeleteJob]
  }
  @scala.inline
  implicit class MlDeleteJobOps[Self <: MlDeleteJob] (val x: Self) extends AnyVal {
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
    def setForce(value: Boolean): Self = this.set("force", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForce: Self = this.set("force", js.undefined)
    @scala.inline
    def setWait_for_completion(value: Boolean): Self = this.set("wait_for_completion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWait_for_completion: Self = this.set("wait_for_completion", js.undefined)
  }
  
}

