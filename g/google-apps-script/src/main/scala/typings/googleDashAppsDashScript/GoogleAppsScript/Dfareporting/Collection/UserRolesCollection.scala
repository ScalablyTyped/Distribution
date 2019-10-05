package typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Collection

import typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema.UserRole
import typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema.UserRolesListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserRolesCollection extends js.Object {
  // Gets one user role by ID.
  def get(profileId: String, id: String): UserRole = js.native
  // Inserts a new user role.
  def insert(resource: UserRole, profileId: String): UserRole = js.native
  // Retrieves a list of user roles, possibly filtered. This method supports paging.
  def list(profileId: String): UserRolesListResponse = js.native
  // Retrieves a list of user roles, possibly filtered. This method supports paging.
  def list(profileId: String, optionalArgs: js.Object): UserRolesListResponse = js.native
  // Updates an existing user role. This method supports patch semantics.
  def patch(resource: UserRole, profileId: String, id: String): UserRole = js.native
  // Deletes an existing user role.
  def remove(profileId: String, id: String): Unit = js.native
  // Updates an existing user role.
  def update(resource: UserRole, profileId: String): UserRole = js.native
}

