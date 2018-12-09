package typings
package gapiDotClientDotServicemanagementLib.gapiNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object clientNsMembers extends js.Object {
  val operations: gapiDotClientDotServicemanagementLib.gapiNs.clientNs.servicemanagementNs.OperationsResource = js.native
  val services: gapiDotClientDotServicemanagementLib.gapiNs.clientNs.servicemanagementNs.ServicesResource = js.native
  /** Load Google Service Management API v1 */
  def load(
    name: gapiDotClientDotServicemanagementLib.gapiDotClientDotServicemanagementLibStrings.servicemanagement,
    version: gapiDotClientDotServicemanagementLib.gapiDotClientDotServicemanagementLibStrings.v1
  ): js.Thenable[scala.Unit] = js.native
  def load(
    name: gapiDotClientDotServicemanagementLib.gapiDotClientDotServicemanagementLibStrings.servicemanagement,
    version: gapiDotClientDotServicemanagementLib.gapiDotClientDotServicemanagementLibStrings.v1,
    callback: js.Function0[_]
  ): scala.Unit = js.native
}

