package typings.googleapis.buildSrcApisClassroomV1Mod.classroom_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Drive file that is used as material for course work.
  */
@js.native
trait Schema$SharedDriveFile extends js.Object {
  /**
    * Drive file details.
    */
  var driveFile: js.UndefOr[Schema$DriveFile] = js.native
  /**
    * Mechanism by which students access the Drive item.
    */
  var shareMode: js.UndefOr[String] = js.native
}

object Schema$SharedDriveFile {
  @scala.inline
  def apply(driveFile: Schema$DriveFile = null, shareMode: String = null): Schema$SharedDriveFile = {
    val __obj = js.Dynamic.literal()
    if (driveFile != null) __obj.updateDynamic("driveFile")(driveFile.asInstanceOf[js.Any])
    if (shareMode != null) __obj.updateDynamic("shareMode")(shareMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SharedDriveFile]
  }
}

