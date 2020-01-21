package typings.gapiClientIam.gapi.client.iam

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientIam.AnonAccesstoken
import typings.gapiClientIam.AnonAccesstokenAlt
import typings.gapiClientIam.AnonAccesstokenAltBearertoken
import typings.gapiClientIam.AnonAccesstokenAltBearertokenCallback
import typings.gapiClientIam.AnonAccesstokenAltBearertokenCallbackFields
import typings.gapiClientIam.AnonAccesstokenAltBearertokenCallbackFieldsKey
import typings.gapiClientIam.AnonAccesstokenAltBearertokenCallbackFieldsKeyOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RolesResource extends js.Object {
  /** Creates a new Role. */
  def create(request: AnonAccesstoken): Request_[Role] = js.native
  /**
    * Soft deletes a role. The role is suspended and cannot be used to create new
    * IAM Policy Bindings.
    * The Role will not be included in `ListRoles()` unless `show_deleted` is set
    * in the `ListRolesRequest`. The Role contains the deleted boolean set.
    * Existing Bindings remains, but are inactive. The Role can be undeleted
    * within 7 days. After 7 days the Role is deleted and all Bindings associated
    * with the role are removed.
    */
  def delete(request: AnonAccesstokenAlt): Request_[Role] = js.native
  /** Gets a Role definition. */
  def get(request: AnonAccesstokenAltBearertoken): Request_[Role] = js.native
  /** Lists the Roles defined on a resource. */
  def list(request: AnonAccesstokenAltBearertokenCallback): Request_[ListRolesResponse] = js.native
  /** Lists the Roles defined on a resource. */
  def list(request: AnonAccesstokenAltBearertokenCallbackFieldsKey): Request_[ListRolesResponse] = js.native
  /** Updates a Role definition. */
  def patch(request: AnonAccesstokenAltBearertokenCallbackFields): Request_[Role] = js.native
  /**
    * Queries roles that can be granted on a particular resource.
    * A role is grantable if it can be used as the role in a binding for a policy
    * for that resource.
    */
  def queryGrantableRoles(request: AnonAccesstokenAltBearertokenCallbackFieldsKeyOauthtoken): Request_[QueryGrantableRolesResponse] = js.native
  /** Undelete a Role, bringing it back in its previous state. */
  def undelete(request: AnonAccesstokenAltBearertoken): Request_[Role] = js.native
}

