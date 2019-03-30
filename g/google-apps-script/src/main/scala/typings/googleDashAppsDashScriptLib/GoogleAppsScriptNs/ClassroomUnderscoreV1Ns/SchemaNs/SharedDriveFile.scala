package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ClassroomUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedDriveFile extends js.Object {
  var driveFile: js.UndefOr[DriveFile] = js.undefined
  var shareMode: js.UndefOr[java.lang.String] = js.undefined
}

object SharedDriveFile {
  @scala.inline
  def apply(driveFile: DriveFile = null, shareMode: java.lang.String = null): SharedDriveFile = {
    val __obj = js.Dynamic.literal()
    if (driveFile != null) __obj.updateDynamic("driveFile")(driveFile)
    if (shareMode != null) __obj.updateDynamic("shareMode")(shareMode)
    __obj.asInstanceOf[SharedDriveFile]
  }
}

