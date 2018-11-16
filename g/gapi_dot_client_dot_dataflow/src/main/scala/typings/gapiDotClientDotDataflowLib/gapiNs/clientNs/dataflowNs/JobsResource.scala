package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobsResource extends js.Object {
  var debug: DebugResource = js.native
  var messages: MessagesResource = js.native
  var workItems: WorkItemsResource = js.native
  /** List the jobs of a project across all regions. */
  def aggregated(request: gapiDotClientDotDataflowLib.Anon_AccesstokenLocationPageSize): gapiDotClientLib.gapiNs.clientNs.Request[ListJobsResponse] = js.native
  /** Creates a Cloud Dataflow job. */
  def create(request: gapiDotClientDotDataflowLib.Anon_AccesstokenLocationPrettyPrintBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[Job] = js.native
  /** Creates a Cloud Dataflow job. */
  def create(request: gapiDotClientDotDataflowLib.Anon_AccesstokenLocationPrettyPrintBearertokenProjectId): gapiDotClientLib.gapiNs.clientNs.Request[Job] = js.native
  /** Gets the state of the specified Cloud Dataflow job. */
  def get(
    request: gapiDotClientDotDataflowLib.Anon_AccesstokenLocationPrettyPrintBearertokenProjectIdCallback
  ): gapiDotClientLib.gapiNs.clientNs.Request[Job] = js.native
  /** Gets the state of the specified Cloud Dataflow job. */
  def get(
    request: gapiDotClientDotDataflowLib.Anon_AccesstokenLocationPrettyPrintBearertokenProjectIdCallbackQuotaUser
  ): gapiDotClientLib.gapiNs.clientNs.Request[Job] = js.native
  /** Request the job status. */
  def getMetrics(request: gapiDotClientDotDataflowLib.Anon_AccesstokenStartTime): gapiDotClientLib.gapiNs.clientNs.Request[JobMetrics] = js.native
  /** Request the job status. */
  def getMetrics(request: gapiDotClientDotDataflowLib.Anon_AccesstokenStartTimeLocation): gapiDotClientLib.gapiNs.clientNs.Request[JobMetrics] = js.native
  /** List the jobs of a project in a given region. */
  def list(request: gapiDotClientDotDataflowLib.Anon_AccesstokenLocationPageSize): gapiDotClientLib.gapiNs.clientNs.Request[ListJobsResponse] = js.native
  /** List the jobs of a project in a given region. */
  def list(request: gapiDotClientDotDataflowLib.Anon_AccesstokenLocationPageSizePrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[ListJobsResponse] = js.native
  /** Updates the state of an existing Cloud Dataflow job. */
  def update(request: gapiDotClientDotDataflowLib.Anon_AccesstokenLocation): gapiDotClientLib.gapiNs.clientNs.Request[Job] = js.native
  /** Updates the state of an existing Cloud Dataflow job. */
  def update(
    request: gapiDotClientDotDataflowLib.Anon_AccesstokenLocationPrettyPrintBearertokenProjectIdCallbackQuotaUserKey
  ): gapiDotClientLib.gapiNs.clientNs.Request[Job] = js.native
}

