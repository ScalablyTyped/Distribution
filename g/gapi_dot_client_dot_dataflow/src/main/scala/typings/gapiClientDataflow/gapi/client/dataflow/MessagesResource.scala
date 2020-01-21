package typings.gapiClientDataflow.gapi.client.dataflow

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDataflow.AnonAccesstokenAltBearertoken
import typings.gapiClientDataflow.AnonAccesstokenAltBearertokenCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessagesResource extends js.Object {
  /** Request the job status. */
  def list(request: AnonAccesstokenAltBearertoken): Request_[ListJobMessagesResponse] = js.native
  /** Request the job status. */
  def list(request: AnonAccesstokenAltBearertokenCallback): Request_[ListJobMessagesResponse] = js.native
}

