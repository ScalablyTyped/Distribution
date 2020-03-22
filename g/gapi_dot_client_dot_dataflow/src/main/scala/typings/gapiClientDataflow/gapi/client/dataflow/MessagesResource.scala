package typings.gapiClientDataflow.gapi.client.dataflow

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDataflow.AnonBearertoken
import typings.gapiClientDataflow.AnonCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessagesResource extends js.Object {
  /** Request the job status. */
  def list(request: AnonBearertoken): Request_[ListJobMessagesResponse] = js.native
  /** Request the job status. */
  def list(request: AnonCallback): Request_[ListJobMessagesResponse] = js.native
}

