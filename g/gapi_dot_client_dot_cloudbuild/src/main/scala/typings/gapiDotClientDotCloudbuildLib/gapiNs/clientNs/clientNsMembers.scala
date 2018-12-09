package typings
package gapiDotClientDotCloudbuildLib.gapiNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object clientNsMembers extends js.Object {
  val operations: gapiDotClientDotCloudbuildLib.gapiNs.clientNs.cloudbuildNs.OperationsResource = js.native
  val projects: gapiDotClientDotCloudbuildLib.gapiNs.clientNs.cloudbuildNs.ProjectsResource = js.native
  /** Load Google Cloud Container Builder API v1 */
  def load(
    name: gapiDotClientDotCloudbuildLib.gapiDotClientDotCloudbuildLibStrings.cloudbuild,
    version: gapiDotClientDotCloudbuildLib.gapiDotClientDotCloudbuildLibStrings.v1
  ): js.Thenable[scala.Unit] = js.native
  def load(
    name: gapiDotClientDotCloudbuildLib.gapiDotClientDotCloudbuildLibStrings.cloudbuild,
    version: gapiDotClientDotCloudbuildLib.gapiDotClientDotCloudbuildLibStrings.v1,
    callback: js.Function0[_]
  ): scala.Unit = js.native
}

