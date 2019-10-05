package typings.gapiDotClientDotDataproc.gapi.client.dataproc

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotDataproc.Anon_Accesstoken
import typings.gapiDotClientDotDataproc.Anon_AccesstokenAltBearertokenCallbackClusterName
import typings.gapiDotClientDotDataproc.Anon_AccesstokenAltBearertokenCallbackFields
import typings.gapiDotClientDotDataproc.Anon_AccesstokenAltBearertokenCallbackFieldsJobId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobsResource extends js.Object {
  /** Starts a job cancellation request. To access the job resource after cancellation, call regions/{region}/jobs.list or regions/{region}/jobs.get. */
  def cancel(request: Anon_AccesstokenAltBearertokenCallbackFields): Request[Job]
  /** Deletes the job from the project. If the job is active, the delete fails, and the response returns FAILED_PRECONDITION. */
  def delete(request: Anon_AccesstokenAltBearertokenCallbackFields): Request[js.Object]
  /** Gets the resource representation for a job in a project. */
  def get(request: Anon_AccesstokenAltBearertokenCallbackFields): Request[Job]
  /** Lists regions/{region}/jobs in a project. */
  def list(request: Anon_AccesstokenAltBearertokenCallbackClusterName): Request[ListJobsResponse]
  /** Updates a job in a project. */
  def patch(request: Anon_AccesstokenAltBearertokenCallbackFieldsJobId): Request[Job]
  /** Submits a job to a cluster. */
  def submit(request: Anon_Accesstoken): Request[Job]
}

object JobsResource {
  @scala.inline
  def apply(
    cancel: Anon_AccesstokenAltBearertokenCallbackFields => Request[Job],
    delete: Anon_AccesstokenAltBearertokenCallbackFields => Request[js.Object],
    get: Anon_AccesstokenAltBearertokenCallbackFields => Request[Job],
    list: Anon_AccesstokenAltBearertokenCallbackClusterName => Request[ListJobsResponse],
    patch: Anon_AccesstokenAltBearertokenCallbackFieldsJobId => Request[Job],
    submit: Anon_Accesstoken => Request[Job]
  ): JobsResource = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), submit = js.Any.fromFunction1(submit))
  
    __obj.asInstanceOf[JobsResource]
  }
}

