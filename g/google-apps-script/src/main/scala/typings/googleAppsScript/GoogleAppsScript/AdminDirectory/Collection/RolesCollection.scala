package typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection

import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Role
import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Roles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RolesCollection extends js.Object {
  
  // Retrieves a role.
  def get(customer: String, roleId: String): Role = js.native
  
  // Creates a role.
  def insert(resource: Role, customer: String): Role = js.native
  
  // Retrieves a paginated list of all the roles in a domain.
  def list(customer: String): Roles = js.native
  // Retrieves a paginated list of all the roles in a domain.
  def list(customer: String, optionalArgs: js.Object): Roles = js.native
  
  // Updates a role. This method supports patch semantics.
  def patch(resource: Role, customer: String, roleId: String): Role = js.native
  
  // Deletes a role.
  def remove(customer: String, roleId: String): Unit = js.native
  
  // Updates a role.
  def update(resource: Role, customer: String, roleId: String): Role = js.native
}
