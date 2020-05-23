package typings.gapiClientTagmanager.gapi.client.tagmanager

import typings.gapiClient.gapi.client.Request
import typings.gapiClientTagmanager.anon.Fields
import typings.gapiClientTagmanager.anon.Fingerprint
import typings.gapiClientTagmanager.anon.QuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountsResource extends js.Object {
  var containers: ContainersResource
  var user_permissions: UserPermissionsResource
  /** Gets a GTM Account. */
  def get(request: Fields): Request[Account]
  /** Lists all GTM Accounts that a user has access to. */
  def list(request: QuotaUser): Request[ListAccountsResponse]
  /** Updates a GTM Account. */
  def update(request: Fingerprint): Request[Account]
}

object AccountsResource {
  @scala.inline
  def apply(
    containers: ContainersResource,
    get: Fields => Request[Account],
    list: QuotaUser => Request[ListAccountsResponse],
    update: Fingerprint => Request[Account],
    user_permissions: UserPermissionsResource
  ): AccountsResource = {
    val __obj = js.Dynamic.literal(containers = containers.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update), user_permissions = user_permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountsResource]
  }
}

