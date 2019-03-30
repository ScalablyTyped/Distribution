package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Licensing_v1 extends js.Object {
  var LicenseAssignments: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.LicensingUnderscoreV1Ns.CollectionNs.LicenseAssignmentsCollection
  ] = js.undefined
  // Create a new instance of LicenseAssignment
  def newLicenseAssignment(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.LicensingUnderscoreV1Ns.SchemaNs.LicenseAssignment
  // Create a new instance of LicenseAssignmentInsert
  def newLicenseAssignmentInsert(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.LicensingUnderscoreV1Ns.SchemaNs.LicenseAssignmentInsert
}

object Licensing_v1 {
  @scala.inline
  def apply(
    newLicenseAssignment: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.LicensingUnderscoreV1Ns.SchemaNs.LicenseAssignment,
    newLicenseAssignmentInsert: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.LicensingUnderscoreV1Ns.SchemaNs.LicenseAssignmentInsert,
    LicenseAssignments: googleDashAppsDashScriptLib.GoogleAppsScriptNs.LicensingUnderscoreV1Ns.CollectionNs.LicenseAssignmentsCollection = null
  ): Licensing_v1 = {
    val __obj = js.Dynamic.literal(newLicenseAssignment = js.Any.fromFunction0(newLicenseAssignment), newLicenseAssignmentInsert = js.Any.fromFunction0(newLicenseAssignmentInsert))
    if (LicenseAssignments != null) __obj.updateDynamic("LicenseAssignments")(LicenseAssignments)
    __obj.asInstanceOf[Licensing_v1]
  }
}

