package typings.gapiDotClientDotFirebaserules.gapiNs.clientNs

import typings.gapiDotClientDotFirebaserules.gapiDotClientDotFirebaserulesStrings.firebaserules
import typings.gapiDotClientDotFirebaserules.gapiDotClientDotFirebaserulesStrings.v1
import typings.gapiDotClientDotFirebaserules.gapiNs.clientNs.firebaserulesNs.ProjectsResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val projects: ProjectsResource = js.native
  /** Load Firebase Rules API v1 */
  def load(name: firebaserules, version: v1): js.Thenable[Unit] = js.native
  def load(name: firebaserules, version: v1, callback: js.Function0[_]): Unit = js.native
}

