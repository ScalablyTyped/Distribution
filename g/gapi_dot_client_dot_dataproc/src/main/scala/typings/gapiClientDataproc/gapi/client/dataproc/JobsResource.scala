package typings.gapiClientDataproc.gapi.client.dataproc

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDataproc.anon.Accesstoken
import typings.gapiClientDataproc.anon.ClusterName
import typings.gapiClientDataproc.anon.Fields
import typings.gapiClientDataproc.anon.JobId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobsResource extends js.Object {
  /** Starts a job cancellation request. To access the job resource after cancellation, call regions/{region}/jobs.list or regions/{region}/jobs.get. */
  def cancel(request: Fields): Request[Job]
  /** Deletes the job from the project. If the job is active, the delete fails, and the response returns FAILED_PRECONDITION. */
  def delete(request: Fields): Request[js.Object]
  /** Gets the resource representation for a job in a project. */
  def get(request: Fields): Request[Job]
  /** Lists regions/{region}/jobs in a project. */
  def list(request: ClusterName): Request[ListJobsResponse]
  /** Updates a job in a project. */
  def patch(request: JobId): Request[Job]
  /** Submits a job to a cluster. */
  def submit(request: Accesstoken): Request[Job]
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
}

