package typings.gapiClientDataproc.gapi.client.dataproc

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDataproc.anon.Accesstoken
import typings.gapiClientDataproc.anon.ClusterName
import typings.gapiClientDataproc.anon.Fields
import typings.gapiClientDataproc.anon.JobId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobsResource extends js.Object {
  /** Starts a job cancellation request. To access the job resource after cancellation, call regions/{region}/jobs.list or regions/{region}/jobs.get. */
  def cancel(request: Fields): Request[Job] = js.native
  /** Deletes the job from the project. If the job is active, the delete fails, and the response returns FAILED_PRECONDITION. */
  def delete(request: Fields): Request[js.Object] = js.native
  /** Gets the resource representation for a job in a project. */
  def get(request: Fields): Request[Job] = js.native
  /** Lists regions/{region}/jobs in a project. */
  def list(request: ClusterName): Request[ListJobsResponse] = js.native
  /** Updates a job in a project. */
  def patch(request: JobId): Request[Job] = js.native
  /** Submits a job to a cluster. */
  def submit(request: Accesstoken): Request[Job] = js.native
}

object JobsResource {
  @scala.inline
  def apply(
    cancel: Fields => Request[Job],
    delete: Fields => Request[js.Object],
    get: Fields => Request[Job],
    list: ClusterName => Request[ListJobsResponse],
    patch: JobId => Request[Job],
    submit: Accesstoken => Request[Job]
  ): JobsResource = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), submit = js.Any.fromFunction1(submit))
    __obj.asInstanceOf[JobsResource]
  }
  @scala.inline
  implicit class JobsResourceOps[Self <: JobsResource] (val x: Self) extends AnyVal {
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
    def setCancel(value: Fields => Request[Job]): Self = this.set("cancel", js.Any.fromFunction1(value))
    @scala.inline
    def setDelete(value: Fields => Request[js.Object]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Fields => Request[Job]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: ClusterName => Request[ListJobsResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: JobId => Request[Job]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setSubmit(value: Accesstoken => Request[Job]): Self = this.set("submit", js.Any.fromFunction1(value))
  }
  
}

