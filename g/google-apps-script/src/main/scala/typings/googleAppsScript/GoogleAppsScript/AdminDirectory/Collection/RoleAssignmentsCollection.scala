package typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection

import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.RoleAssignment
import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.RoleAssignments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoleAssignmentsCollection extends js.Object {
  
  // Retrieve a role assignment.
  def get(customer: String, roleAssignmentId: String): RoleAssignment = js.native
  
  // Creates a role assignment.
  def insert(resource: RoleAssignment, customer: String): RoleAssignment = js.native
  
  // Retrieves a paginated list of all roleAssignments.
  def list(customer: String): RoleAssignments = js.native
  // Retrieves a paginated list of all roleAssignments.
  def list(customer: String, optionalArgs: js.Object): RoleAssignments = js.native
  
  // Deletes a role assignment.
  def remove(customer: String, roleAssignmentId: String): Unit = js.native
}
