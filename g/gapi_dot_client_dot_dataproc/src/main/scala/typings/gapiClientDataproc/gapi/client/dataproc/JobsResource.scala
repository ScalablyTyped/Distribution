package typings.gapiClientDataproc.gapi.client.dataproc

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDataproc.AnonAccesstoken
import typings.gapiClientDataproc.AnonClusterName
import typings.gapiClientDataproc.AnonFields
import typings.gapiClientDataproc.AnonJobId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobsResource extends js.Object {
  /** Starts a job cancellation request. To access the job resource after cancellation, call regions/{region}/jobs.list or regions/{region}/jobs.get. */
  def cancel(request: AnonFields): Request_[Job]
  /** Deletes the job from the project. If the job is active, the delete fails, and the response returns FAILED_PRECONDITION. */
  def delete(request: AnonFields): Request_[js.Object]
  /** Gets the resource representation for a job in a project. */
  def get(request: AnonFields): Request_[Job]
  /** Lists regions/{region}/jobs in a project. */
  def list(request: AnonClusterName): Request_[ListJobsResponse]
  /** Updates a job in a project. */
  def patch(request: AnonJobId): Request_[Job]
  /** Submits a job to a cluster. */
  def submit(request: AnonAccesstoken): Request_[Job]
}

object JobsResource {
  @scala.inline
  def apply(
    cancel: AnonFields => Request_[Job],
    delete: AnonFields => Request_[js.Object],
    get: AnonFields => Request_[Job],
    list: AnonClusterName => Request_[ListJobsResponse],
    patch: AnonJobId => Request_[Job],
    submit: AnonAccesstoken => Request_[Job]
  ): JobsResource = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), submit = js.Any.fromFunction1(submit))
  
    __obj.asInstanceOf[JobsResource]
  }
}

