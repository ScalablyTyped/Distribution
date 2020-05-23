package typings.gapiClientDataflow.gapi.client.dataflow

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDataflow.anon.Accesstoken
import typings.gapiClientDataflow.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DebugResource extends js.Object {
  /** Get encoded debug configuration for component. Not cacheable. */
  def getConfig(request: Accesstoken): Request[GetDebugConfigResponse] = js.native
  /** Get encoded debug configuration for component. Not cacheable. */
  def getConfig(request: Alt): Request[GetDebugConfigResponse] = js.native
  /** Send encoded debug capture data for component. */
  def sendCapture(request: Accesstoken): Request[js.Object] = js.native
  /** Send encoded debug capture data for component. */
  def sendCapture(request: Alt): Request[js.Object] = js.native
}

