package typings.gapiDotClientDotDataflow.gapi.client.dataflow

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotDataflow.Anon_AccesstokenAlt
import typings.gapiDotClientDotDataflow.Anon_AccesstokenAltBearertokenCallbackFields
import typings.gapiDotClientDotDataflow.Anon_AccesstokenAltBearertokenCallbackFieldsFilter
import typings.gapiDotClientDotDataflow.Anon_AccesstokenAltBearertokenCallbackFieldsJobId
import typings.gapiDotClientDotDataflow.Anon_AccesstokenAltBearertokenCallbackFieldsJobIdKey
import typings.gapiDotClientDotDataflow.Anon_AccesstokenAltBearertokenCallbackFieldsJobIdKeyLocation
import typings.gapiDotClientDotDataflow.Anon_AccesstokenAltBearertokenCallbackFieldsJobIdKeyLocationOauthtoken
import typings.gapiDotClientDotDataflow.Anon_AccesstokenAltBearertokenCallbackFieldsJobIdKeyLocationOauthtokenPp
import typings.gapiDotClientDotDataflow.Anon_AccesstokenAltBearertokenCallbackFieldsKey
import typings.gapiDotClientDotDataflow.Anon_AccesstokenAltBearertokenCallbackFieldsKeyLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobsResource extends js.Object {
  var debug: DebugResource = js.native
  var messages: MessagesResource = js.native
  var workItems: WorkItemsResource = js.native
  /** List the jobs of a project across all regions. */
  def aggregated(request: Anon_AccesstokenAltBearertokenCallbackFields): Request[ListJobsResponse] = js.native
  /** Creates a Cloud Dataflow job. */
  def create(request: Anon_AccesstokenAltBearertokenCallbackFieldsKey): Request[Job] = js.native
  /** Creates a Cloud Dataflow job. */
  def create(request: Anon_AccesstokenAltBearertokenCallbackFieldsKeyLocation): Request[Job] = js.native
  /** Gets the state of the specified Cloud Dataflow job. */
  def get(request: Anon_AccesstokenAltBearertokenCallbackFieldsJobId): Request[Job] = js.native
  /** Gets the state of the specified Cloud Dataflow job. */
  def get(request: Anon_AccesstokenAltBearertokenCallbackFieldsJobIdKeyLocationOauthtoken): Request[Job] = js.native
  /** Request the job status. */
  def getMetrics(request: Anon_AccesstokenAltBearertokenCallbackFieldsJobIdKey): Request[JobMetrics] = js.native
  /** Request the job status. */
  def getMetrics(request: Anon_AccesstokenAltBearertokenCallbackFieldsJobIdKeyLocationOauthtokenPp): Request[JobMetrics] = js.native
  /** List the jobs of a project in a given region. */
  def list(request: Anon_AccesstokenAltBearertokenCallbackFields): Request[ListJobsResponse] = js.native
  /** List the jobs of a project in a given region. */
  def list(request: Anon_AccesstokenAltBearertokenCallbackFieldsFilter): Request[ListJobsResponse] = js.native
  /** Updates the state of an existing Cloud Dataflow job. */
  def update(request: Anon_AccesstokenAlt): Request[Job] = js.native
  /** Updates the state of an existing Cloud Dataflow job. */
  def update(request: Anon_AccesstokenAltBearertokenCallbackFieldsJobIdKeyLocation): Request[Job] = js.native
}

