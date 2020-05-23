package typings.gapiClientDataflow.gapi.client.dataflow

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDataflow.anon.Bearertoken
import typings.gapiClientDataflow.anon.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessagesResource extends js.Object {
  /** Request the job status. */
  def list(request: Bearertoken): Request[ListJobMessagesResponse] = js.native
  /** Request the job status. */
  def list(request: Callback): Request[ListJobMessagesResponse] = js.native
}

