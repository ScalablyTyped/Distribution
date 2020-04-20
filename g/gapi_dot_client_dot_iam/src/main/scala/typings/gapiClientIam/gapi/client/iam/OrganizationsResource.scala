package typings.gapiClientIam.gapi.client.iam

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrganizationsResource extends js.Object {
  var roles: RolesResource
}

object OrganizationsResource {
  @scala.inline
  def apply(roles: RolesResource): OrganizationsResource = {
    val __obj = js.Dynamic.literal(roles = roles.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationsResource]
  }
}

