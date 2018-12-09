package typings
package gapiDotClientDotMlLib.gapiNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object clientNsMembers extends js.Object {
  val projects: gapiDotClientDotMlLib.gapiNs.clientNs.mlNs.ProjectsResource = js.native
  /** Load Google Cloud Machine Learning Engine v1 */
  def load(
    name: gapiDotClientDotMlLib.gapiDotClientDotMlLibStrings.ml,
    version: gapiDotClientDotMlLib.gapiDotClientDotMlLibStrings.v1
  ): js.Thenable[scala.Unit] = js.native
  def load(
    name: gapiDotClientDotMlLib.gapiDotClientDotMlLibStrings.ml,
    version: gapiDotClientDotMlLib.gapiDotClientDotMlLibStrings.v1,
    callback: js.Function0[_]
  ): scala.Unit = js.native
}

