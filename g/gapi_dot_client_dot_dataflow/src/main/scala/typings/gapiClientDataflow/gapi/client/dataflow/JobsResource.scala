package typings.gapiClientDataflow.gapi.client.dataflow

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDataflow.AnonAccesstokenAlt
import typings.gapiClientDataflow.AnonAccesstokenAltBearertokenCallbackFields
import typings.gapiClientDataflow.AnonAccesstokenAltBearertokenCallbackFieldsFilter
import typings.gapiClientDataflow.AnonAccesstokenAltBearertokenCallbackFieldsJobId
import typings.gapiClientDataflow.AnonAccesstokenAltBearertokenCallbackFieldsJobIdKey
import typings.gapiClientDataflow.AnonAccesstokenAltBearertokenCallbackFieldsJobIdKeyLocation
import typings.gapiClientDataflow.AnonAccesstokenAltBearertokenCallbackFieldsJobIdKeyLocationOauthtoken
import typings.gapiClientDataflow.AnonAccesstokenAltBearertokenCallbackFieldsJobIdKeyLocationOauthtokenPp
import typings.gapiClientDataflow.AnonAccesstokenAltBearertokenCallbackFieldsKey
import typings.gapiClientDataflow.AnonAccesstokenAltBearertokenCallbackFieldsKeyLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobsResource extends js.Object {
  var debug: DebugResource = js.native
  var messages: MessagesResource = js.native
  var workItems: WorkItemsResource = js.native
  /** List the jobs of a project across all regions. */
  def aggregated(request: AnonAccesstokenAltBearertokenCallbackFields): Request_[ListJobsResponse] = js.native
  /** Creates a Cloud Dataflow job. */
  def create(request: AnonAccesstokenAltBearertokenCallbackFieldsKey): Request_[Job] = js.native
  /** Creates a Cloud Dataflow job. */
  def create(request: AnonAccesstokenAltBearertokenCallbackFieldsKeyLocation): Request_[Job] = js.native
  /** Gets the state of the specified Cloud Dataflow job. */
  def get(request: AnonAccesstokenAltBearertokenCallbackFieldsJobId): Request_[Job] = js.native
  /** Gets the state of the specified Cloud Dataflow job. */
  def get(request: AnonAccesstokenAltBearertokenCallbackFieldsJobIdKeyLocationOauthtoken): Request_[Job] = js.native
  /** Request the job status. */
  def getMetrics(request: AnonAccesstokenAltBearertokenCallbackFieldsJobIdKey): Request_[JobMetrics] = js.native
  /** Request the job status. */
  def getMetrics(request: AnonAccesstokenAltBearertokenCallbackFieldsJobIdKeyLocationOauthtokenPp): Request_[JobMetrics] = js.native
  /** List the jobs of a project in a given region. */
  def list(request: AnonAccesstokenAltBearertokenCallbackFields): Request_[ListJobsResponse] = js.native
  /** List the jobs of a project in a given region. */
  def list(request: AnonAccesstokenAltBearertokenCallbackFieldsFilter): Request_[ListJobsResponse] = js.native
  /** Updates the state of an existing Cloud Dataflow job. */
  def update(request: AnonAccesstokenAlt): Request_[Job] = js.native
  /** Updates the state of an existing Cloud Dataflow job. */
  def update(request: AnonAccesstokenAltBearertokenCallbackFieldsJobIdKeyLocation): Request_[Job] = js.native
}

