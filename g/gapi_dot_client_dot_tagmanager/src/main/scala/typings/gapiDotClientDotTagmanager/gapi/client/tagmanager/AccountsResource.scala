package typings.gapiDotClientDotTagmanager.gapi.client.tagmanager

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotTagmanager.Anon_AltFields
import typings.gapiDotClientDotTagmanager.Anon_AltFieldsFingerprint
import typings.gapiDotClientDotTagmanager.Anon_AltFieldsKeyOauthtokenPageTokenPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountsResource extends js.Object {
  var containers: ContainersResource
  var user_permissions: User_permissionsResource
  /** Gets a GTM Account. */
  def get(request: Anon_AltFields): Request[Account]
  /** Lists all GTM Accounts that a user has access to. */
  def list(request: Anon_AltFieldsKeyOauthtokenPageTokenPrettyPrint): Request[ListAccountsResponse]
  /** Updates a GTM Account. */
  def update(request: Anon_AltFieldsFingerprint): Request[Account]
}

object AccountsResource {
  @scala.inline
  def apply(
    containers: ContainersResource,
    get: Anon_AltFields => Request[Account],
    list: Anon_AltFieldsKeyOauthtokenPageTokenPrettyPrint => Request[ListAccountsResponse],
    update: Anon_AltFieldsFingerprint => Request[Account],
    user_permissions: User_permissionsResource
  ): AccountsResource = {
    val __obj = js.Dynamic.literal(containers = containers.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update), user_permissions = user_permissions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AccountsResource]
  }
}

