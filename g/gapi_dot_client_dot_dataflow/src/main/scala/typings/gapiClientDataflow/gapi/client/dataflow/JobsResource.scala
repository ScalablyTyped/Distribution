package typings.gapiClientDataflow.gapi.client.dataflow

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDataflow.AnonAlt
import typings.gapiClientDataflow.AnonFields
import typings.gapiClientDataflow.AnonFilter
import typings.gapiClientDataflow.AnonJobId
import typings.gapiClientDataflow.AnonKey
import typings.gapiClientDataflow.AnonLocation
import typings.gapiClientDataflow.AnonOauthtoken
import typings.gapiClientDataflow.AnonPp
import typings.gapiClientDataflow.AnonPrettyPrint
import typings.gapiClientDataflow.AnonProjectId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobsResource extends js.Object {
  var debug: DebugResource = js.native
  var messages: MessagesResource = js.native
  var workItems: WorkItemsResource = js.native
  /** List the jobs of a project across all regions. */
  def aggregated(request: AnonFields): Request_[ListJobsResponse] = js.native
  /** Creates a Cloud Dataflow job. */
  def create(request: AnonKey): Request_[Job] = js.native
  /** Creates a Cloud Dataflow job. */
  def create(request: AnonPp): Request_[Job] = js.native
  /** Gets the state of the specified Cloud Dataflow job. */
  def get(request: AnonJobId): Request_[Job] = js.native
  /** Gets the state of the specified Cloud Dataflow job. */
  def get(request: AnonPrettyPrint): Request_[Job] = js.native
  /** Request the job status. */
  def getMetrics(request: AnonLocation): Request_[JobMetrics] = js.native
  /** Request the job status. */
  def getMetrics(request: AnonProjectId): Request_[JobMetrics] = js.native
  /** List the jobs of a project in a given region. */
  def list(request: AnonFields): Request_[ListJobsResponse] = js.native
  /** List the jobs of a project in a given region. */
  def list(request: AnonFilter): Request_[ListJobsResponse] = js.native
  /** Updates the state of an existing Cloud Dataflow job. */
  def update(request: AnonAlt): Request_[Job] = js.native
  /** Updates the state of an existing Cloud Dataflow job. */
  def update(request: AnonOauthtoken): Request_[Job] = js.native
}

