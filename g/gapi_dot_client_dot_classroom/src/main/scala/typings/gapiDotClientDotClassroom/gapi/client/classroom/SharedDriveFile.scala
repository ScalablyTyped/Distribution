package typings.gapiDotClientDotClassroom.gapi.client.classroom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedDriveFile extends js.Object {
  /** Drive file details. */
  var driveFile: js.UndefOr[DriveFile] = js.undefined
  /** Mechanism by which students access the Drive item. */
  var shareMode: js.UndefOr[String] = js.undefined
}

object SharedDriveFile {
  @scala.inline
  def apply(driveFile: DriveFile = null, shareMode: String = null): SharedDriveFile = {
    val __obj = js.Dynamic.literal()
    if (driveFile != null) __obj.updateDynamic("driveFile")(driveFile.asInstanceOf[js.Any])
    if (shareMode != null) __obj.updateDynamic("shareMode")(shareMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedDriveFile]
  }
}

