package typings
package gapiDotClientDotCloudfunctionsLib.gapiNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object clientNsMembers extends js.Object {
  val operations: gapiDotClientDotCloudfunctionsLib.gapiNs.clientNs.cloudfunctionsNs.OperationsResource = js.native
  val projects: gapiDotClientDotCloudfunctionsLib.gapiNs.clientNs.cloudfunctionsNs.ProjectsResource = js.native
  /** Load Google Cloud Functions API v1 */
  def load(
    name: gapiDotClientDotCloudfunctionsLib.gapiDotClientDotCloudfunctionsLibStrings.cloudfunctions,
    version: gapiDotClientDotCloudfunctionsLib.gapiDotClientDotCloudfunctionsLibStrings.v1
  ): js.Thenable[scala.Unit] = js.native
  def load(
    name: gapiDotClientDotCloudfunctionsLib.gapiDotClientDotCloudfunctionsLibStrings.cloudfunctions,
    version: gapiDotClientDotCloudfunctionsLib.gapiDotClientDotCloudfunctionsLibStrings.v1,
    callback: js.Function0[_]
  ): scala.Unit = js.native
}

