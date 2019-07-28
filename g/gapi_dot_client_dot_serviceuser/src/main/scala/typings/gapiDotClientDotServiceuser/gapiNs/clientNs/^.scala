package typings.gapiDotClientDotServiceuser.gapiNs.clientNs

import typings.gapiDotClientDotServiceuser.gapiDotClientDotServiceuserStrings.serviceuser
import typings.gapiDotClientDotServiceuser.gapiDotClientDotServiceuserStrings.v1
import typings.gapiDotClientDotServiceuser.gapiNs.clientNs.serviceuserNs.ProjectsResource
import typings.gapiDotClientDotServiceuser.gapiNs.clientNs.serviceuserNs.ServicesResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val projects: ProjectsResource = js.native
  val services: ServicesResource = js.native
  /** Load Google Service User API v1 */
  def load(name: serviceuser, version: v1): js.Thenable[Unit] = js.native
  def load(name: serviceuser, version: v1, callback: js.Function0[_]): Unit = js.native
}

