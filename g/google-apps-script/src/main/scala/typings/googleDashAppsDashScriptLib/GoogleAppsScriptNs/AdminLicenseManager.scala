package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminLicenseManager extends js.Object {
  var LicenseAssignments: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminLicenseManagerNs.CollectionNs.LicenseAssignmentsCollection
  ] = js.undefined
  // Create a new instance of LicenseAssignment
  def newLicenseAssignment(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminLicenseManagerNs.SchemaNs.LicenseAssignment
  // Create a new instance of LicenseAssignmentInsert
  def newLicenseAssignmentInsert(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminLicenseManagerNs.SchemaNs.LicenseAssignmentInsert
}

object AdminLicenseManager {
  @scala.inline
  def apply(
    newLicenseAssignment: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminLicenseManagerNs.SchemaNs.LicenseAssignment,
    newLicenseAssignmentInsert: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminLicenseManagerNs.SchemaNs.LicenseAssignmentInsert,
    LicenseAssignments: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminLicenseManagerNs.CollectionNs.LicenseAssignmentsCollection = null
  ): AdminLicenseManager = {
    val __obj = js.Dynamic.literal(newLicenseAssignment = js.Any.fromFunction0(newLicenseAssignment), newLicenseAssignmentInsert = js.Any.fromFunction0(newLicenseAssignmentInsert))
    if (LicenseAssignments != null) __obj.updateDynamic("LicenseAssignments")(LicenseAssignments)
    __obj.asInstanceOf[AdminLicenseManager]
  }
}

