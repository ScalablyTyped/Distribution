package typings.gapiDotClientDotFirebaseremoteconfig.gapiNs.clientNs

import typings.gapiDotClientDotFirebaseremoteconfig.gapiDotClientDotFirebaseremoteconfigStrings.firebaseremoteconfig
import typings.gapiDotClientDotFirebaseremoteconfig.gapiDotClientDotFirebaseremoteconfigStrings.v1
import typings.gapiDotClientDotFirebaseremoteconfig.gapiNs.clientNs.firebaseremoteconfigNs.ProjectsResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val projects: ProjectsResource = js.native
  /** Load Firebase Remote Config API v1 */
  def load(name: firebaseremoteconfig, version: v1): js.Thenable[Unit] = js.native
  def load(name: firebaseremoteconfig, version: v1, callback: js.Function0[_]): Unit = js.native
}

