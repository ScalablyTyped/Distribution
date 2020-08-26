package typings.googleAppsScript.GoogleAppsScript.Drive.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Change extends js.Object {
  var deleted: js.UndefOr[Boolean] = js.native
  var drive: js.UndefOr[Drive] = js.native
  var driveId: js.UndefOr[String] = js.native
  var file: js.UndefOr[File] = js.native
  var fileId: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
  var modificationDate: js.UndefOr[String] = js.native
  var selfLink: js.UndefOr[String] = js.native
  var teamDrive: js.UndefOr[TeamDrive] = js.native
  var teamDriveId: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object Change {
  @scala.inline
  def apply(): Change = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Change]
  }
  @scala.inline
  implicit class ChangeOps[Self <: Change] (val x: Self) extends AnyVal {
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
    def setDeleted(value: Boolean): Self = this.set("deleted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleted: Self = this.set("deleted", js.undefined)
    @scala.inline
    def setDrive(value: Drive): Self = this.set("drive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrive: Self = this.set("drive", js.undefined)
    @scala.inline
    def setDriveId(value: String): Self = this.set("driveId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDriveId: Self = this.set("driveId", js.undefined)
    @scala.inline
    def setFile(value: File): Self = this.set("file", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFile: Self = this.set("file", js.undefined)
    @scala.inline
    def setFileId(value: String): Self = this.set("fileId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileId: Self = this.set("fileId", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setModificationDate(value: String): Self = this.set("modificationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModificationDate: Self = this.set("modificationDate", js.undefined)
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    @scala.inline
    def setTeamDrive(value: TeamDrive): Self = this.set("teamDrive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTeamDrive: Self = this.set("teamDrive", js.undefined)
    @scala.inline
    def setTeamDriveId(value: String): Self = this.set("teamDriveId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTeamDriveId: Self = this.set("teamDriveId", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

