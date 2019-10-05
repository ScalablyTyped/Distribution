package typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Collection

import typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema.UserRolePermission
import typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema.UserRolePermissionsListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserRolePermissionsCollection extends js.Object {
  // Gets one user role permission by ID.
  def get(profileId: String, id: String): UserRolePermission = js.native
  // Gets a list of user role permissions, possibly filtered.
  def list(profileId: String): UserRolePermissionsListResponse = js.native
  // Gets a list of user role permissions, possibly filtered.
  def list(profileId: String, optionalArgs: js.Object): UserRolePermissionsListResponse = js.native
}

