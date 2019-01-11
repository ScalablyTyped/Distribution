package typings
package gapiDotClientDotIamLib.gapiNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val organizations: gapiDotClientDotIamLib.gapiNs.clientNs.iamNs.OrganizationsResource = js.native
  val permissions: gapiDotClientDotIamLib.gapiNs.clientNs.iamNs.PermissionsResource = js.native
  val projects: gapiDotClientDotIamLib.gapiNs.clientNs.iamNs.ProjectsResource = js.native
  val roles: gapiDotClientDotIamLib.gapiNs.clientNs.iamNs.RolesResource = js.native
  /** Load Google Identity and Access Management (IAM) API v1 */
  def load(
    name: gapiDotClientDotIamLib.gapiDotClientDotIamLibStrings.iam,
    version: gapiDotClientDotIamLib.gapiDotClientDotIamLibStrings.v1
  ): js.Thenable[scala.Unit] = js.native
  def load(
    name: gapiDotClientDotIamLib.gapiDotClientDotIamLibStrings.iam,
    version: gapiDotClientDotIamLib.gapiDotClientDotIamLibStrings.v1,
    callback: js.Function0[_]
  ): scala.Unit = js.native
}

