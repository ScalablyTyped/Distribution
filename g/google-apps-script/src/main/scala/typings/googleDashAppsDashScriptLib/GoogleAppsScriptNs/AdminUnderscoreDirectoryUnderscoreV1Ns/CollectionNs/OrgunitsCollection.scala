package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminUnderscoreDirectoryUnderscoreV1Ns.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrgunitsCollection extends js.Object {
  // Retrieve organizational unit
  def get(customerId: java.lang.String, orgUnitPath: js.Array[java.lang.String]): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminUnderscoreDirectoryUnderscoreV1Ns.SchemaNs.OrgUnit = js.native
  // Add organizational unit
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminUnderscoreDirectoryUnderscoreV1Ns.SchemaNs.OrgUnit,
    customerId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminUnderscoreDirectoryUnderscoreV1Ns.SchemaNs.OrgUnit = js.native
  // Retrieve all organizational units
  def list(customerId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminUnderscoreDirectoryUnderscoreV1Ns.SchemaNs.OrgUnits = js.native
  // Retrieve all organizational units
  def list(customerId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminUnderscoreDirectoryUnderscoreV1Ns.SchemaNs.OrgUnits = js.native
  // Update organizational unit. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminUnderscoreDirectoryUnderscoreV1Ns.SchemaNs.OrgUnit,
    customerId: java.lang.String,
    orgUnitPath: js.Array[java.lang.String]
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminUnderscoreDirectoryUnderscoreV1Ns.SchemaNs.OrgUnit = js.native
  // Remove organizational unit
  def remove(customerId: java.lang.String, orgUnitPath: js.Array[java.lang.String]): scala.Unit = js.native
  // Update organizational unit
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminUnderscoreDirectoryUnderscoreV1Ns.SchemaNs.OrgUnit,
    customerId: java.lang.String,
    orgUnitPath: js.Array[java.lang.String]
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminUnderscoreDirectoryUnderscoreV1Ns.SchemaNs.OrgUnit = js.native
}

