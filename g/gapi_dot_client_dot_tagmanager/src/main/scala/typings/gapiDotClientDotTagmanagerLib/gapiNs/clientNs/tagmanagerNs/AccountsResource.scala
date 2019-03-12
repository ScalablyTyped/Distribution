package typings
package gapiDotClientDotTagmanagerLib.gapiNs.clientNs.tagmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountsResource extends js.Object {
  var containers: ContainersResource
  var user_permissions: User_permissionsResource
  /** Gets a GTM Account. */
  def get(request: gapiDotClientDotTagmanagerLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[Account]
  /** Lists all GTM Accounts that a user has access to. */
  def list(request: gapiDotClientDotTagmanagerLib.Anon_AltFieldsKeyOauthtokenPageTokenPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[ListAccountsResponse]
  /** Updates a GTM Account. */
  def update(request: gapiDotClientDotTagmanagerLib.Anon_AltFieldsFingerprint): gapiDotClientLib.gapiNs.clientNs.Request[Account]
}

object AccountsResource {
  @scala.inline
  def apply(
    containers: ContainersResource,
    get: gapiDotClientDotTagmanagerLib.Anon_AltFields => gapiDotClientLib.gapiNs.clientNs.Request[Account],
    list: gapiDotClientDotTagmanagerLib.Anon_AltFieldsKeyOauthtokenPageTokenPrettyPrint => gapiDotClientLib.gapiNs.clientNs.Request[ListAccountsResponse],
    update: gapiDotClientDotTagmanagerLib.Anon_AltFieldsFingerprint => gapiDotClientLib.gapiNs.clientNs.Request[Account],
    user_permissions: User_permissionsResource
  ): AccountsResource = {
    val __obj = js.Dynamic.literal(containers = containers, get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update), user_permissions = user_permissions)
  
    __obj.asInstanceOf[AccountsResource]
  }
}

