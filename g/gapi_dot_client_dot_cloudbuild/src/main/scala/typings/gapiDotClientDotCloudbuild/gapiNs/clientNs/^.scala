package typings.gapiDotClientDotCloudbuild.gapiNs.clientNs

import typings.gapiDotClientDotCloudbuild.gapiDotClientDotCloudbuildStrings.cloudbuild
import typings.gapiDotClientDotCloudbuild.gapiDotClientDotCloudbuildStrings.v1
import typings.gapiDotClientDotCloudbuild.gapiNs.clientNs.cloudbuildNs.OperationsResource
import typings.gapiDotClientDotCloudbuild.gapiNs.clientNs.cloudbuildNs.ProjectsResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val operations: OperationsResource = js.native
  val projects: ProjectsResource = js.native
  /** Load Google Cloud Container Builder API v1 */
  def load(name: cloudbuild, version: v1): js.Thenable[Unit] = js.native
  def load(name: cloudbuild, version: v1, callback: js.Function0[_]): Unit = js.native
}

