package typings
package gapiDotClientDotIamLib.gapiNs.clientNs.iamNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("roles")(roles)
    __obj.updateDynamic("serviceAccounts")(serviceAccounts)
    __obj.asInstanceOf[ProjectsResource]
  }
}

