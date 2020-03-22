package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonAccountUserRoleOnly
import typings.gapiClientDfareporting.AnonFields
import typings.gapiClientDfareporting.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserRolesResource extends js.Object {
  /** Deletes an existing user role. */
  def delete(request: AnonFields): Request_[Unit]
  /** Gets one user role by ID. */
  def get(request: AnonFields): Request_[UserRole]
  /** Inserts a new user role. */
  def insert(request: AnonKey): Request_[UserRole]
  /** Retrieves a list of user roles, possibly filtered. This method supports paging. */
  def list(request: AnonAccountUserRoleOnly): Request_[UserRolesListResponse]
  /** Updates an existing user role. This method supports patch semantics. */
  def patch(request: AnonFields): Request_[UserRole]
  /** Updates an existing user role. */
  def update(request: AnonKey): Request_[UserRole]
}

object UserRolesResource {
  @scala.inline
  def apply(
    delete: AnonFields => Request_[Unit],
    get: AnonFields => Request_[UserRole],
    insert: AnonKey => Request_[UserRole],
    list: AnonAccountUserRoleOnly => Request_[UserRolesListResponse],
    patch: AnonFields => Request_[UserRole],
    update: AnonKey => Request_[UserRole]
  ): UserRolesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[UserRolesResource]
  }
}

