package typings.gapiClientDataflow.gapi.client.dataflow

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDataflow.AnonAccesstoken
import typings.gapiClientDataflow.AnonAccesstokenAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DebugResource extends js.Object {
  /** Get encoded debug configuration for component. Not cacheable. */
  def getConfig(request: AnonAccesstoken): Request_[GetDebugConfigResponse] = js.native
  /** Get encoded debug configuration for component. Not cacheable. */
  def getConfig(request: AnonAccesstokenAlt): Request_[GetDebugConfigResponse] = js.native
  /** Send encoded debug capture data for component. */
  def sendCapture(request: AnonAccesstoken): Request_[js.Object] = js.native
  /** Send encoded debug capture data for component. */
  def sendCapture(request: AnonAccesstokenAlt): Request_[js.Object] = js.native
}

