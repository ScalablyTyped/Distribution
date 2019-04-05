package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoleAssignmentsCollection extends js.Object {
  // Retrieve a role assignment.
  def get(customer: java.lang.String, roleAssignmentId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.RoleAssignment = js.native
  // Creates a role assignment.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.RoleAssignment,
    customer: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.RoleAssignment = js.native
  // Retrieves a paginated list of all roleAssignments.
  def list(customer: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.RoleAssignments = js.native
  // Retrieves a paginated list of all roleAssignments.
  def list(customer: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.RoleAssignments = js.native
  // Deletes a role assignment.
  def remove(customer: java.lang.String, roleAssignmentId: java.lang.String): scala.Unit = js.native
}

