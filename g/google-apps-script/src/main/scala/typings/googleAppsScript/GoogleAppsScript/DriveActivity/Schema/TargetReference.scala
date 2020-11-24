package typings.googleAppsScript.GoogleAppsScript.DriveActivity.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetReference extends js.Object {
  
  var driveItem: js.UndefOr[DriveItemReference] = js.native
  
  var teamDrive: js.UndefOr[TeamDriveReference] = js.native
}
object TargetReference {
  
  @scala.inline
  def apply(): TargetReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetReference]
  }
  
  @scala.inline
  implicit class TargetReferenceOps[Self <: TargetReference] (val x: Self) extends AnyVal {
    
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
    def setDriveItem(value: DriveItemReference): Self = this.set("driveItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDriveItem: Self = this.set("driveItem", js.undefined)
    
    @scala.inline
    def setTeamDrive(value: TeamDriveReference): Self = this.set("teamDrive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTeamDrive: Self = this.set("teamDrive", js.undefined)
  }
}
