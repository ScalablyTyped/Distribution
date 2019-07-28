package typings.gapiDotClientDotDataflow.gapiNs.clientNs

import typings.gapiDotClientDotDataflow.gapiDotClientDotDataflowStrings.dataflow
import typings.gapiDotClientDotDataflow.gapiDotClientDotDataflowStrings.v1b3
import typings.gapiDotClientDotDataflow.gapiNs.clientNs.dataflowNs.ProjectsResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val projects: ProjectsResource = js.native
  /** Load Google Dataflow API v1b3 */
  def load(name: dataflow, version: v1b3): js.Thenable[Unit] = js.native
  def load(name: dataflow, version: v1b3, callback: js.Function0[_]): Unit = js.native
}

