package typings
package gapiDotClientDotContainerLib.gapiNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val projects: gapiDotClientDotContainerLib.gapiNs.clientNs.containerNs.ProjectsResource = js.native
  /** Load Google Container Engine API v1 */
  def load(
    name: gapiDotClientDotContainerLib.gapiDotClientDotContainerLibStrings.container,
    version: gapiDotClientDotContainerLib.gapiDotClientDotContainerLibStrings.v1
  ): js.Thenable[scala.Unit] = js.native
  def load(
    name: gapiDotClientDotContainerLib.gapiDotClientDotContainerLibStrings.container,
    version: gapiDotClientDotContainerLib.gapiDotClientDotContainerLibStrings.v1,
    callback: js.Function0[_]
  ): scala.Unit = js.native
}

