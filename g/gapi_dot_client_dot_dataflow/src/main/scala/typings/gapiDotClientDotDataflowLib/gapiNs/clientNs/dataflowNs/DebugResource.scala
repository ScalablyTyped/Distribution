package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DebugResource extends js.Object {
  /** Get encoded debug configuration for component. Not cacheable. */
  def getConfig(request: gapiDotClientDotDataflowLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[GetDebugConfigResponse] = js.native
  /** Get encoded debug configuration for component. Not cacheable. */
  def getConfig(request: gapiDotClientDotDataflowLib.Anon_AccesstokenLocation): gapiDotClientLib.gapiNs.clientNs.Request[GetDebugConfigResponse] = js.native
  /** Send encoded debug capture data for component. */
  def sendCapture(request: gapiDotClientDotDataflowLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[js.Object] = js.native
  /** Send encoded debug capture data for component. */
  def sendCapture(request: gapiDotClientDotDataflowLib.Anon_AccesstokenLocation): gapiDotClientLib.gapiNs.clientNs.Request[js.Object] = js.native
}

