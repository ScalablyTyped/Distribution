package typings.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MlCloseJob[T] extends Generic {
  var allow_no_jobs: js.UndefOr[Boolean] = js.native
  var body: js.UndefOr[T] = js.native
  var force: js.UndefOr[Boolean] = js.native
  var job_id: String = js.native
  var timeout: js.UndefOr[String] = js.native
}

object MlCloseJob {
  @scala.inline
  def apply[T](job_id: String): MlCloseJob[T] = {
    val __obj = js.Dynamic.literal(job_id = job_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlCloseJob[T]]
  }
  @scala.inline
  implicit class MlCloseJobOps[Self <: MlCloseJob[_], T] (val x: Self with MlCloseJob[T]) extends AnyVal {
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
    def setAllow_no_jobs(value: Boolean): Self = this.set("allow_no_jobs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllow_no_jobs: Self = this.set("allow_no_jobs", js.undefined)
    @scala.inline
    def setBody(value: T): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setForce(value: Boolean): Self = this.set("force", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForce: Self = this.set("force", js.undefined)
    @scala.inline
    def setTimeout(value: String): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

