package typings.gapiDotClientDotDataproc.gapiNs.clientNs

import typings.gapiDotClientDotDataproc.gapiDotClientDotDataprocStrings.dataproc
import typings.gapiDotClientDotDataproc.gapiDotClientDotDataprocStrings.v1
import typings.gapiDotClientDotDataproc.gapiNs.clientNs.dataprocNs.ProjectsResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val projects: ProjectsResource = js.native
  /** Load Google Cloud Dataproc API v1 */
  def load(name: dataproc, version: v1): js.Thenable[Unit] = js.native
  def load(name: dataproc, version: v1, callback: js.Function0[_]): Unit = js.native
}

