package typings.gapiDotClientDotCloudtasks.gapiNs.clientNs

import typings.gapiDotClientDotCloudtasks.gapiDotClientDotCloudtasksStrings.cloudtasks
import typings.gapiDotClientDotCloudtasks.gapiDotClientDotCloudtasksStrings.v2beta2
import typings.gapiDotClientDotCloudtasks.gapiNs.clientNs.cloudtasksNs.ProjectsResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val projects: ProjectsResource = js.native
  /** Load Cloud Tasks API v2beta2 */
  def load(name: cloudtasks, version: v2beta2): js.Thenable[Unit] = js.native
  def load(name: cloudtasks, version: v2beta2, callback: js.Function0[_]): Unit = js.native
}

