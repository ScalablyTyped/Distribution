package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotDfareporting.Anon_AccountUserRoleOnly
import typings.gapiDotClientDotDfareporting.Anon_AltFields
import typings.gapiDotClientDotDfareporting.Anon_AltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserRolesResource extends js.Object {
  /** Deletes an existing user role. */
  def delete(request: Anon_AltFields): Request[Unit]
  /** Gets one user role by ID. */
  def get(request: Anon_AltFields): Request[UserRole]
  /** Inserts a new user role. */
  def insert(request: Anon_AltFieldsKey): Request[UserRole]
  /** Retrieves a list of user roles, possibly filtered. This method supports paging. */
  def list(request: Anon_AccountUserRoleOnly): Request[UserRolesListResponse]
  /** Updates an existing user role. This method supports patch semantics. */
  def patch(request: Anon_AltFields): Request[UserRole]
  /** Updates an existing user role. */
  def update(request: Anon_AltFieldsKey): Request[UserRole]
}

object UserRolesResource {
  @scala.inline
  def apply(
    delete: Anon_AltFields => Request[Unit],
    get: Anon_AltFields => Request[UserRole],
    insert: Anon_AltFieldsKey => Request[UserRole],
    list: Anon_AccountUserRoleOnly => Request[UserRolesListResponse],
    patch: Anon_AltFields => Request[UserRole],
    update: Anon_AltFieldsKey => Request[UserRole]
  ): UserRolesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[UserRolesResource]
  }
}

