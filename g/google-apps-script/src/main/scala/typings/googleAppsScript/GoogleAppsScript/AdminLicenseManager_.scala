package typings.googleAppsScript.GoogleAppsScript

import typings.googleAppsScript.GoogleAppsScript.AdminLicenseManager.Collection.LicenseAssignmentsCollection
import typings.googleAppsScript.GoogleAppsScript.AdminLicenseManager.Schema.LicenseAssignment
import typings.googleAppsScript.GoogleAppsScript.AdminLicenseManager.Schema.LicenseAssignmentInsert
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdminLicenseManager_ extends js.Object {
  
  var LicenseAssignments: js.UndefOr[LicenseAssignmentsCollection] = js.native
  
  // Create a new instance of LicenseAssignment
  def newLicenseAssignment(): LicenseAssignment = js.native
  
  // Create a new instance of LicenseAssignmentInsert
  def newLicenseAssignmentInsert(): LicenseAssignmentInsert = js.native
}
object AdminLicenseManager_ {
  
  @scala.inline
  def apply(
    newLicenseAssignment: () => LicenseAssignment,
    newLicenseAssignmentInsert: () => LicenseAssignmentInsert
  ): AdminLicenseManager_ = {
    val __obj = js.Dynamic.literal(newLicenseAssignment = js.Any.fromFunction0(newLicenseAssignment), newLicenseAssignmentInsert = js.Any.fromFunction0(newLicenseAssignmentInsert))
    __obj.asInstanceOf[AdminLicenseManager_]
  }
  
  @scala.inline
  implicit class AdminLicenseManager_Ops[Self <: AdminLicenseManager_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNewLicenseAssignment(value: () => LicenseAssignment): Self = this.set("newLicenseAssignment", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewLicenseAssignmentInsert(value: () => LicenseAssignmentInsert): Self = this.set("newLicenseAssignmentInsert", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLicenseAssignments(value: LicenseAssignmentsCollection): Self = this.set("LicenseAssignments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLicenseAssignments: Self = this.set("LicenseAssignments", js.undefined)
  }
}
