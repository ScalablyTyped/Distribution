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
  def apply(driveFile: SchemaDriveFile = null, shareMode: String = null): SchemaSharedDriveFile = {
    val __obj = js.Dynamic.literal()
    if (driveFile != null) __obj.updateDynamic("driveFile")(driveFile.asInstanceOf[js.Any])
    if (shareMode != null) __obj.updateDynamic("shareMode")(shareMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSharedDriveFile]
  }
}

