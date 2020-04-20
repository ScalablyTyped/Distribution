package typings.gapiClientTagmanager.gapi.client.tagmanager

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientTagmanager.AnonAlt
import typings.gapiClientTagmanager.AnonFields
import typings.gapiClientTagmanager.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserPermissionsResource extends js.Object {
  /** Creates a user's Account & Container access. */
  def create(request: AnonAlt): Request_[UserPermission]
  /** Removes a user from the account, revoking access to it and all of its containers. */
  def delete(request: AnonFields): Request_[Unit]
  /** Gets a user's Account & Container access. */
  def get(request: AnonFields): Request_[UserPermission]
  /** List all users that have access to the account along with Account and Container user access granted to each of them. */
  def list(request: AnonKey): Request_[ListUserPermissionsResponse]
  /** Updates a user's Account & Container access. */
  def update(request: AnonFields): Request_[UserPermission]
}

object UserPermissionsResource {
  @scala.inline
  def apply(
    create: AnonAlt => Request_[UserPermission],
    delete: AnonFields => Request_[Unit],
    get: AnonFields => Request_[UserPermission],
    list: AnonKey => Request_[ListUserPermissionsResponse],
    update: AnonFields => Request_[UserPermission]
  ): UserPermissionsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[UserPermissionsResource]
  }
}

