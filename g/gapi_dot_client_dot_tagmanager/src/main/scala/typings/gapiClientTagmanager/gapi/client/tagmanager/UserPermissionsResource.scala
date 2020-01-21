package typings.gapiClientTagmanager.gapi.client.tagmanager

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientTagmanager.AnonAlt
import typings.gapiClientTagmanager.AnonAltFields
import typings.gapiClientTagmanager.AnonAltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserPermissionsResource extends js.Object {
  /** Creates a user's Account & Container access. */
  def create(request: AnonAlt): Request_[UserPermission]
  /** Removes a user from the account, revoking access to it and all of its containers. */
  def delete(request: AnonAltFields): Request_[Unit]
  /** Gets a user's Account & Container access. */
  def get(request: AnonAltFields): Request_[UserPermission]
  /** List all users that have access to the account along with Account and Container user access granted to each of them. */
  def list(request: AnonAltFieldsKey): Request_[ListUserPermissionsResponse]
  /** Updates a user's Account & Container access. */
  def update(request: AnonAltFields): Request_[UserPermission]
}

object UserPermissionsResource {
  @scala.inline
  def apply(
    create: AnonAlt => Request_[UserPermission],
    delete: AnonAltFields => Request_[Unit],
    get: AnonAltFields => Request_[UserPermission],
    list: AnonAltFieldsKey => Request_[ListUserPermissionsResponse],
    update: AnonAltFields => Request_[UserPermission]
  ): UserPermissionsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[UserPermissionsResource]
  }
}

