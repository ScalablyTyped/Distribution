package typings.googleAppsScript.GoogleAppsScript.Classroom.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharedDriveFile extends js.Object {
  var driveFile: js.UndefOr[DriveFile] = js.native
  var shareMode: js.UndefOr[String] = js.native
}

object SharedDriveFile {
  @scala.inline
  def apply(): SharedDriveFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedDriveFile]
  }
  @scala.inline
  implicit class SharedDriveFileOps[Self <: SharedDriveFile] (val x: Self) extends AnyVal {
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
    def setDriveFile(value: DriveFile): Self = this.set("driveFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDriveFile: Self = this.set("driveFile", js.undefined)
    @scala.inline
    def setShareMode(value: String): Self = this.set("shareMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShareMode: Self = this.set("shareMode", js.undefined)
  }
  
}

