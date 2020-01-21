package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonAccountUserRoleOnly
import typings.gapiClientDfareporting.AnonAltFields
import typings.gapiClientDfareporting.AnonAltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserRolesResource extends js.Object {
  /** Deletes an existing user role. */
  def delete(request: AnonAltFields): Request_[Unit]
  /** Gets one user role by ID. */
  def get(request: AnonAltFields): Request_[UserRole]
  /** Inserts a new user role. */
  def insert(request: AnonAltFieldsKey): Request_[UserRole]
  /** Retrieves a list of user roles, possibly filtered. This method supports paging. */
  def list(request: AnonAccountUserRoleOnly): Request_[UserRolesListResponse]
  /** Updates an existing user role. This method supports patch semantics. */
  def patch(request: AnonAltFields): Request_[UserRole]
  /** Updates an existing user role. */
  def update(request: AnonAltFieldsKey): Request_[UserRole]
}

object UserRolesResource {
  @scala.inline
  def apply(
    delete: AnonAltFields => Request_[Unit],
    get: AnonAltFields => Request_[UserRole],
    insert: AnonAltFieldsKey => Request_[UserRole],
    list: AnonAccountUserRoleOnly => Request_[UserRolesListResponse],
    patch: AnonAltFields => Request_[UserRole],
    update: AnonAltFieldsKey => Request_[UserRole]
  ): UserRolesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[UserRolesResource]
  }
}

