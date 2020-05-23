package typings.gapiClientDataflow.gapi.client.dataflow

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDataflow.anon.Alt
import typings.gapiClientDataflow.anon.Fields
import typings.gapiClientDataflow.anon.Filter
import typings.gapiClientDataflow.anon.JobId
import typings.gapiClientDataflow.anon.Key
import typings.gapiClientDataflow.anon.Location
import typings.gapiClientDataflow.anon.Oauthtoken
import typings.gapiClientDataflow.anon.Pp
import typings.gapiClientDataflow.anon.PrettyPrint
import typings.gapiClientDataflow.anon.ProjectId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobsResource extends js.Object {
  var debug: DebugResource = js.native
  var messages: MessagesResource = js.native
  var workItems: WorkItemsResource = js.native
  /** List the jobs of a project across all regions. */
  def aggregated(request: Fields): Request[ListJobsResponse] = js.native
  /** Creates a Cloud Dataflow job. */
  def create(request: Key): Request[Job] = js.native
  /** Creates a Cloud Dataflow job. */
  def create(request: Pp): Request[Job] = js.native
  /** Gets the state of the specified Cloud Dataflow job. */
  def get(request: JobId): Request[Job] = js.native
  /** Gets the state of the specified Cloud Dataflow job. */
  def get(request: PrettyPrint): Request[Job] = js.native
  /** Request the job status. */
  def getMetrics(request: Location): Request[JobMetrics] = js.native
  /** Request the job status. */
  def getMetrics(request: ProjectId): Request[JobMetrics] = js.native
  /** List the jobs of a project in a given region. */
  def list(request: Fields): Request[ListJobsResponse] = js.native
  /** List the jobs of a project in a given region. */
  def list(request: Filter): Request[ListJobsResponse] = js.native
  /** Updates the state of an existing Cloud Dataflow job. */
  def update(request: Alt): Request[Job] = js.native
  /** Updates the state of an existing Cloud Dataflow job. */
  def update(request: Oauthtoken): Request[Job] = js.native
}

