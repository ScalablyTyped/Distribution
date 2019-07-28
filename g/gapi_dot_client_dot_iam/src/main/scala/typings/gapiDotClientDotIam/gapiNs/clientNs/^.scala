package typings.gapiDotClientDotIam.gapiNs.clientNs

import typings.gapiDotClientDotIam.gapiDotClientDotIamStrings.iam
import typings.gapiDotClientDotIam.gapiDotClientDotIamStrings.v1
import typings.gapiDotClientDotIam.gapiNs.clientNs.iamNs.OrganizationsResource
import typings.gapiDotClientDotIam.gapiNs.clientNs.iamNs.PermissionsResource
import typings.gapiDotClientDotIam.gapiNs.clientNs.iamNs.ProjectsResource
import typings.gapiDotClientDotIam.gapiNs.clientNs.iamNs.RolesResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val organizations: OrganizationsResource = js.native
  val permissions: PermissionsResource = js.native
  val projects: ProjectsResource = js.native
  val roles: RolesResource = js.native
  /** Load Google Identity and Access Management (IAM) API v1 */
  def load(name: iam, version: v1): js.Thenable[Unit] = js.native
  def load(name: iam, version: v1, callback: js.Function0[_]): Unit = js.native
}

