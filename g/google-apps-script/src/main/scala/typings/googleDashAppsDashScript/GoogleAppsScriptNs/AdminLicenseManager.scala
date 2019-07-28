package typings.googleDashAppsDashScript.GoogleAppsScriptNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminLicenseManagerNs.CollectionNs.LicenseAssignmentsCollection
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminLicenseManagerNs.SchemaNs.LicenseAssignment
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminLicenseManagerNs.SchemaNs.LicenseAssignmentInsert
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminLicenseManager extends js.Object {
  var LicenseAssignments: js.UndefOr[LicenseAssignmentsCollection] = js.undefined
  // Create a new instance of LicenseAssignment
  def newLicenseAssignment(): LicenseAssignment
  // Create a new instance of LicenseAssignmentInsert
  def newLicenseAssignmentInsert(): LicenseAssignmentInsert
}

object AdminLicenseManager {
  @scala.inline
  def apply(
    newLicenseAssignment: () => LicenseAssignment,
    newLicenseAssignmentInsert: () => LicenseAssignmentInsert,
    LicenseAssignments: LicenseAssignmentsCollection = null
  ): AdminLicenseManager = {
    val __obj = js.Dynamic.literal(newLicenseAssignment = js.Any.fromFunction0(newLicenseAssignment), newLicenseAssignmentInsert = js.Any.fromFunction0(newLicenseAssignmentInsert))
    if (LicenseAssignments != null) __obj.updateDynamic("LicenseAssignments")(LicenseAssignments)
    __obj.asInstanceOf[AdminLicenseManager]
  }
}

