package typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Collection

import typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.PermissionId
import typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.PermissionList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PermissionsCollection extends js.Object {
  // Gets a permission by ID.
  def get(fileId: String, permissionId: String): typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.Permission = js.native
  // Gets a permission by ID.
  def get(fileId: String, permissionId: String, optionalArgs: js.Object): typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.Permission = js.native
  // Returns the permission ID for an email address.
  def getIdForEmail(email: String): PermissionId = js.native
  // Inserts a permission for a file or Team Drive.
  def insert(
    resource: typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.Permission,
    fileId: String
  ): typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.Permission = js.native
  // Inserts a permission for a file or Team Drive.
  def insert(
    resource: typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.Permission,
    fileId: String,
    optionalArgs: js.Object
  ): typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.Permission = js.native
  // Lists a file's or Team Drive's permissions.
  def list(fileId: String): PermissionList = js.native
  // Lists a file's or Team Drive's permissions.
  def list(fileId: String, optionalArgs: js.Object): PermissionList = js.native
  // Updates a permission using patch semantics.
  def patch(
    resource: typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.Permission,
    fileId: String,
    permissionId: String
  ): typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.Permission = js.native
  // Updates a permission using patch semantics.
  def patch(
    resource: typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.Permission,
    fileId: String,
    permissionId: String,
    optionalArgs: js.Object
  ): typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.Permission = js.native
  // Deletes a permission from a file or Team Drive.
  def remove(fileId: String, permissionId: String): Unit = js.native
  // Deletes a permission from a file or Team Drive.
  def remove(fileId: String, permissionId: String, optionalArgs: js.Object): Unit = js.native
  // Updates a permission.
  def update(
    resource: typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.Permission,
    fileId: String,
    permissionId: String
  ): typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.Permission = js.native
  // Updates a permission.
  def update(
    resource: typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.Permission,
    fileId: String,
    permissionId: String,
    optionalArgs: js.Object
  ): typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.Permission = js.native
}

