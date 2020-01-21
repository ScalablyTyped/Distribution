package typings.gapiClientIam.gapi.client.iam

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsResource extends js.Object {
  var roles: RolesResource
  var serviceAccounts: ServiceAccountsResource
}

object ProjectsResource {
  @scala.inline
  def apply(roles: RolesResource, serviceAccounts: ServiceAccountsResource): ProjectsResource = {
    val __obj = js.Dynamic.literal(roles = roles.asInstanceOf[js.Any], serviceAccounts = serviceAccounts.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProjectsResource]
  }
}

