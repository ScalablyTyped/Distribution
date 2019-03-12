package typings
package gapiDotClientDotIamLib.gapiNs.clientNs.iamNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermissionsResource extends js.Object {
  /**
    * Lists the permissions testable on a resource.
    * A permission is testable if it can be tested for an identity on a resource.
    */
  def queryTestablePermissions(request: gapiDotClientDotIamLib.Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[QueryTestablePermissionsResponse]
}

object PermissionsResource {
  @scala.inline
  def apply(
    queryTestablePermissions: gapiDotClientDotIamLib.Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtoken => gapiDotClientLib.gapiNs.clientNs.Request[QueryTestablePermissionsResponse]
  ): PermissionsResource = {
    val __obj = js.Dynamic.literal(queryTestablePermissions = js.Any.fromFunction1(queryTestablePermissions))
  
    __obj.asInstanceOf[PermissionsResource]
  }
}

