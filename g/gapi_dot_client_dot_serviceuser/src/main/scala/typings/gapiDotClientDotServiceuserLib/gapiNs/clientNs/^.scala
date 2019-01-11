package typings
package gapiDotClientDotServiceuserLib.gapiNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val projects: gapiDotClientDotServiceuserLib.gapiNs.clientNs.serviceuserNs.ProjectsResource = js.native
  val services: gapiDotClientDotServiceuserLib.gapiNs.clientNs.serviceuserNs.ServicesResource = js.native
  /** Load Google Service User API v1 */
  def load(
    name: gapiDotClientDotServiceuserLib.gapiDotClientDotServiceuserLibStrings.serviceuser,
    version: gapiDotClientDotServiceuserLib.gapiDotClientDotServiceuserLibStrings.v1
  ): js.Thenable[scala.Unit] = js.native
  def load(
    name: gapiDotClientDotServiceuserLib.gapiDotClientDotServiceuserLibStrings.serviceuser,
    version: gapiDotClientDotServiceuserLib.gapiDotClientDotServiceuserLibStrings.v1,
    callback: js.Function0[_]
  ): scala.Unit = js.native
}

