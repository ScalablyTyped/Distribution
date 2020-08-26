package typings.googleapis.classroomV1Mod.classroomV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Drive file that is used as material for course work.
  */
@js.native
trait SchemaSharedDriveFile extends js.Object {
  /**
    * Drive file details.
    */
  var driveFile: js.UndefOr[SchemaDriveFile] = js.native
  /**
    * Mechanism by which students access the Drive item.
    */
  var shareMode: js.UndefOr[String] = js.native
}

object SchemaSharedDriveFile {
  @scala.inline
  def apply(): SchemaSharedDriveFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSharedDriveFile]
  }
  @scala.inline
  implicit class SchemaSharedDriveFileOps[Self <: SchemaSharedDriveFile] (val x: Self) extends AnyVal {
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
    def setDriveFile(value: SchemaDriveFile): Self = this.set("driveFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDriveFile: Self = this.set("driveFile", js.undefined)
    @scala.inline
    def setShareMode(value: String): Self = this.set("shareMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShareMode: Self = this.set("shareMode", js.undefined)
  }
  
}

