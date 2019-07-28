package typings.gapiDotClientDotContainer.gapiNs.clientNs

import typings.gapiDotClientDotContainer.gapiDotClientDotContainerStrings.container
import typings.gapiDotClientDotContainer.gapiDotClientDotContainerStrings.v1
import typings.gapiDotClientDotContainer.gapiNs.clientNs.containerNs.ProjectsResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val projects: ProjectsResource = js.native
  /** Load Google Container Engine API v1 */
  def load(name: container, version: v1): js.Thenable[Unit] = js.native
  def load(name: container, version: v1, callback: js.Function0[_]): Unit = js.native
}

