package typings.gapiDotClientDotCloudiot.gapiNs.clientNs

import typings.gapiDotClientDotCloudiot.gapiDotClientDotCloudiotStrings.cloudiot
import typings.gapiDotClientDotCloudiot.gapiDotClientDotCloudiotStrings.v1
import typings.gapiDotClientDotCloudiot.gapiNs.clientNs.cloudiotNs.ProjectsResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val projects: ProjectsResource = js.native
  /** Load Google Cloud IoT API v1 */
  def load(name: cloudiot, version: v1): js.Thenable[Unit] = js.native
  def load(name: cloudiot, version: v1, callback: js.Function0[_]): Unit = js.native
}

