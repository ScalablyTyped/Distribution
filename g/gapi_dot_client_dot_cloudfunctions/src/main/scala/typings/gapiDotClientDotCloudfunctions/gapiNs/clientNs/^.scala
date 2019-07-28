package typings.gapiDotClientDotCloudfunctions.gapiNs.clientNs

import typings.gapiDotClientDotCloudfunctions.gapiDotClientDotCloudfunctionsStrings.cloudfunctions
import typings.gapiDotClientDotCloudfunctions.gapiDotClientDotCloudfunctionsStrings.v1
import typings.gapiDotClientDotCloudfunctions.gapiNs.clientNs.cloudfunctionsNs.OperationsResource
import typings.gapiDotClientDotCloudfunctions.gapiNs.clientNs.cloudfunctionsNs.ProjectsResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val operations: OperationsResource = js.native
  val projects: ProjectsResource = js.native
  /** Load Google Cloud Functions API v1 */
  def load(name: cloudfunctions, version: v1): js.Thenable[Unit] = js.native
  def load(name: cloudfunctions, version: v1, callback: js.Function0[_]): Unit = js.native
}

