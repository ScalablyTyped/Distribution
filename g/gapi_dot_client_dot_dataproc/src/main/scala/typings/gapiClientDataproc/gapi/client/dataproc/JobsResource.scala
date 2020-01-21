package typings.gapiClientDataproc.gapi.client.dataproc

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDataproc.AnonAccesstoken
import typings.gapiClientDataproc.AnonAccesstokenAltBearertokenCallbackClusterName
import typings.gapiClientDataproc.AnonAccesstokenAltBearertokenCallbackFields
import typings.gapiClientDataproc.AnonAccesstokenAltBearertokenCallbackFieldsJobId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobsResource extends js.Object {
  /** Starts a job cancellation request. To access the job resource after cancellation, call regions/{region}/jobs.list or regions/{region}/jobs.get. */
  def cancel(request: AnonAccesstokenAltBearertokenCallbackFields): Request_[Job]
  /** Deletes the job from the project. If the job is active, the delete fails, and the response returns FAILED_PRECONDITION. */
  def delete(request: AnonAccesstokenAltBearertokenCallbackFields): Request_[js.Object]
  /** Gets the resource representation for a job in a project. */
  def get(request: AnonAccesstokenAltBearertokenCallbackFields): Request_[Job]
  /** Lists regions/{region}/jobs in a project. */
  def list(request: AnonAccesstokenAltBearertokenCallbackClusterName): Request_[ListJobsResponse]
  /** Updates a job in a project. */
  def patch(request: AnonAccesstokenAltBearertokenCallbackFieldsJobId): Request_[Job]
  /** Submits a job to a cluster. */
  def submit(request: AnonAccesstoken): Request_[Job]
}

object JobsResource {
  @scala.inline
  def apply(
    cancel: AnonAccesstokenAltBearertokenCallbackFields => Request_[Job],
    delete: AnonAccesstokenAltBearertokenCallbackFields => Request_[js.Object],
    get: AnonAccesstokenAltBearertokenCallbackFields => Request_[Job],
    list: AnonAccesstokenAltBearertokenCallbackClusterName => Request_[ListJobsResponse],
    patch: AnonAccesstokenAltBearertokenCallbackFieldsJobId => Request_[Job],
    submit: AnonAccesstoken => Request_[Job]
  ): JobsResource = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), submit = js.Any.fromFunction1(submit))
  
    __obj.asInstanceOf[JobsResource]
  }
}

