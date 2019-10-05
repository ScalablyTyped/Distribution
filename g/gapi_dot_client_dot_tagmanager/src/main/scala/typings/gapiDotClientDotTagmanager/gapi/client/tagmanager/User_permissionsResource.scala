package typings.gapiDotClientDotTagmanager.gapi.client.tagmanager

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotTagmanager.Anon_Alt
import typings.gapiDotClientDotTagmanager.Anon_AltFields
import typings.gapiDotClientDotTagmanager.Anon_AltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait User_permissionsResource extends js.Object {
  /** Creates a user's Account & Container access. */
  def create(request: Anon_Alt): Request[UserPermission]
  /** Removes a user from the account, revoking access to it and all of its containers. */
  def delete(request: Anon_AltFields): Request[Unit]
  /** Gets a user's Account & Container access. */
  def get(request: Anon_AltFields): Request[UserPermission]
  /** List all users that have access to the account along with Account and Container user access granted to each of them. */
  def list(request: Anon_AltFieldsKey): Request[ListUserPermissionsResponse]
  /** Updates a user's Account & Container access. */
  def update(request: Anon_AltFields): Request[UserPermission]
}

object User_permissionsResource {
  @scala.inline
  def apply(
    create: Anon_Alt => Request[UserPermission],
    delete: Anon_AltFields => Request[Unit],
    get: Anon_AltFields => Request[UserPermission],
    list: Anon_AltFieldsKey => Request[ListUserPermissionsResponse],
    update: Anon_AltFields => Request[UserPermission]
  ): User_permissionsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[User_permissionsResource]
  }
}

