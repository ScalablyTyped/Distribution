package typings.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MlOpenJob extends Generic {
  var job_id: String = js.native
}

object MlOpenJob {
  @scala.inline
  def apply(job_id: String): MlOpenJob = {
    val __obj = js.Dynamic.literal(job_id = job_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlOpenJob]
  }
  @scala.inline
  implicit class MlOpenJobOps[Self <: MlOpenJob] (val x: Self) extends AnyVal {
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
  }
  
}

