package typings.googleAppsScript.GoogleAppsScript.Drive.Collection

import typings.googleAppsScript.GoogleAppsScript.Drive.Schema.Permission
import typings.googleAppsScript.GoogleAppsScript.Drive.Schema.PermissionId
import typings.googleAppsScript.GoogleAppsScript.Drive.Schema.PermissionList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PermissionsCollection extends js.Object {
  
  // Gets a permission by ID.
  def get(fileId: String, permissionId: String): Permission = js.native
  // Gets a permission by ID.
  def get(fileId: String, permissionId: String, optionalArgs: js.Object): Permission = js.native
  
  // Returns the permission ID for an email address.
  def getIdForEmail(email: String): PermissionId = js.native
  
  // Inserts a permission for a file or Team Drive.
  def insert(resource: Permission, fileId: String): Permission = js.native
  // Inserts a permission for a file or Team Drive.
  def insert(resource: Permission, fileId: String, optionalArgs: js.Object): Permission = js.native
  
  // Lists a file's or Team Drive's permissions.
  def list(fileId: String): PermissionList = js.native
  // Lists a file's or Team Drive's permissions.
  def list(fileId: String, optionalArgs: js.Object): PermissionList = js.native
  
  // Updates a permission using patch semantics.
  def patch(resource: Permission, fileId: String, permissionId: String): Permission = js.native
  // Updates a permission using patch semantics.
  def patch(resource: Permission, fileId: String, permissionId: String, optionalArgs: js.Object): Permission = js.native
  
  // Deletes a permission from a file or Team Drive.
  def remove(fileId: String, permissionId: String): Unit = js.native
  // Deletes a permission from a file or Team Drive.
  def remove(fileId: String, permissionId: String, optionalArgs: js.Object): Unit = js.native
  
  // Updates a permission.
  def update(resource: Permission, fileId: String, permissionId: String): Permission = js.native
  // Updates a permission.
  def update(resource: Permission, fileId: String, permissionId: String, optionalArgs: js.Object): Permission = js.native
}
