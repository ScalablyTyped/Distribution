package typings.googleAppsScript.GoogleAppsScript

import typings.googleAppsScript.GoogleAppsScript.AdminLicenseManager.Collection.LicenseAssignmentsCollection
import typings.googleAppsScript.GoogleAppsScript.AdminLicenseManager.Schema.LicenseAssignment
import typings.googleAppsScript.GoogleAppsScript.AdminLicenseManager.Schema.LicenseAssignmentInsert
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminLicenseManager_ extends js.Object {
  var LicenseAssignments: js.UndefOr[LicenseAssignmentsCollection] = js.undefined
  // Create a new instance of LicenseAssignment
  def newLicenseAssignment(): LicenseAssignment
  // Create a new instance of LicenseAssignmentInsert
  def newLicenseAssignmentInsert(): LicenseAssignmentInsert
}

object AdminLicenseManager_ {
  @scala.inline
  def apply(
    newLicenseAssignment: () => LicenseAssignment,
    newLicenseAssignmentInsert: () => LicenseAssignmentInsert,
    LicenseAssignments: LicenseAssignmentsCollection = null
  ): AdminLicenseManager_ = {
    val __obj = js.Dynamic.literal(newLicenseAssignment = js.Any.fromFunction0(newLicenseAssignment), newLicenseAssignmentInsert = js.Any.fromFunction0(newLicenseAssignmentInsert))
    if (LicenseAssignments != null) __obj.updateDynamic("LicenseAssignments")(LicenseAssignments.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminLicenseManager_]
  }
}

