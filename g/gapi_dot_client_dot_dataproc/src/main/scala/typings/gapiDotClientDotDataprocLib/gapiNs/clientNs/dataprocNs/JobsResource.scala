package typings
package gapiDotClientDotDataprocLib.gapiNs.clientNs.dataprocNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobsResource extends js.Object {
  /** Starts a job cancellation request. To access the job resource after cancellation, call regions/{region}/jobs.list or regions/{region}/jobs.get. */
  def cancel(request: gapiDotClientDotDataprocLib.Anon_AccesstokenAltBearertokenCallbackFields): gapiDotClientLib.gapiNs.clientNs.Request[Job]
  /** Deletes the job from the project. If the job is active, the delete fails, and the response returns FAILED_PRECONDITION. */
  def delete(request: gapiDotClientDotDataprocLib.Anon_AccesstokenAltBearertokenCallbackFields): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /** Gets the resource representation for a job in a project. */
  def get(request: gapiDotClientDotDataprocLib.Anon_AccesstokenAltBearertokenCallbackFields): gapiDotClientLib.gapiNs.clientNs.Request[Job]
  /** Lists regions/{region}/jobs in a project. */
  def list(request: gapiDotClientDotDataprocLib.Anon_AccesstokenAltBearertokenCallbackClusterName): gapiDotClientLib.gapiNs.clientNs.Request[ListJobsResponse]
  /** Updates a job in a project. */
  def patch(request: gapiDotClientDotDataprocLib.Anon_AccesstokenAltBearertokenCallbackFieldsJobId): gapiDotClientLib.gapiNs.clientNs.Request[Job]
  /** Submits a job to a cluster. */
  def submit(request: gapiDotClientDotDataprocLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[Job]
}

object JobsResource {
  @scala.inline
  def apply(
    cancel: gapiDotClientDotDataprocLib.Anon_AccesstokenAltBearertokenCallbackFields => gapiDotClientLib.gapiNs.clientNs.Request[Job],
    delete: gapiDotClientDotDataprocLib.Anon_AccesstokenAltBearertokenCallbackFields => gapiDotClientLib.gapiNs.clientNs.Request[js.Object],
    get: gapiDotClientDotDataprocLib.Anon_AccesstokenAltBearertokenCallbackFields => gapiDotClientLib.gapiNs.clientNs.Request[Job],
    list: gapiDotClientDotDataprocLib.Anon_AccesstokenAltBearertokenCallbackClusterName => gapiDotClientLib.gapiNs.clientNs.Request[ListJobsResponse],
    patch: gapiDotClientDotDataprocLib.Anon_AccesstokenAltBearertokenCallbackFieldsJobId => gapiDotClientLib.gapiNs.clientNs.Request[Job],
    submit: gapiDotClientDotDataprocLib.Anon_Accesstoken => gapiDotClientLib.gapiNs.clientNs.Request[Job]
  ): JobsResource = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), submit = js.Any.fromFunction1(submit))
  
    __obj.asInstanceOf[JobsResource]
  }
}

