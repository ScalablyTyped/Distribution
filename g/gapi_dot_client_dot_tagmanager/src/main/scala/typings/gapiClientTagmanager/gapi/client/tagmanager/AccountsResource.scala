package typings.gapiClientTagmanager.gapi.client.tagmanager

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientTagmanager.AnonAltFields
import typings.gapiClientTagmanager.AnonAltFieldsFingerprint
import typings.gapiClientTagmanager.AnonAltFieldsKeyOauthtokenPageTokenPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountsResource extends js.Object {
  var containers: ContainersResource
  var user_permissions: UserPermissionsResource
  /** Gets a GTM Account. */
  def get(request: AnonAltFields): Request_[Account]
  /** Lists all GTM Accounts that a user has access to. */
  def list(request: AnonAltFieldsKeyOauthtokenPageTokenPrettyPrint): Request_[ListAccountsResponse]
  /** Updates a GTM Account. */
  def update(request: AnonAltFieldsFingerprint): Request_[Account]
}

object AccountsResource {
  @scala.inline
  def apply(
    containers: ContainersResource,
    get: AnonAltFields => Request_[Account],
    list: AnonAltFieldsKeyOauthtokenPageTokenPrettyPrint => Request_[ListAccountsResponse],
    update: AnonAltFieldsFingerprint => Request_[Account],
    user_permissions: UserPermissionsResource
  ): AccountsResource = {
    val __obj = js.Dynamic.literal(containers = containers.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update), user_permissions = user_permissions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AccountsResource]
  }
}

