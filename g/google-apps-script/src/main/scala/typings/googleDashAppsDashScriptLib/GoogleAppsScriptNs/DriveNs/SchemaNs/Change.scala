package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Change extends js.Object {
  var deleted: js.UndefOr[scala.Boolean] = js.undefined
  var drive: js.UndefOr[Drive] = js.undefined
  var driveId: js.UndefOr[java.lang.String] = js.undefined
  var file: js.UndefOr[File] = js.undefined
  var fileId: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var modificationDate: js.UndefOr[java.lang.String] = js.undefined
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  var teamDrive: js.UndefOr[TeamDrive] = js.undefined
  var teamDriveId: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Change {
  @scala.inline
  def apply(
    deleted: js.UndefOr[scala.Boolean] = js.undefined,
    drive: Drive = null,
    driveId: java.lang.String = null,
    file: File = null,
    fileId: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    modificationDate: java.lang.String = null,
    selfLink: java.lang.String = null,
    teamDrive: TeamDrive = null,
    teamDriveId: java.lang.String = null,
    `type`: java.lang.String = null
  ): Change = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deleted)) __obj.updateDynamic("deleted")(deleted)
    if (drive != null) __obj.updateDynamic("drive")(drive)
    if (driveId != null) __obj.updateDynamic("driveId")(driveId)
    if (file != null) __obj.updateDynamic("file")(file)
    if (fileId != null) __obj.updateDynamic("fileId")(fileId)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (modificationDate != null) __obj.updateDynamic("modificationDate")(modificationDate)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    if (teamDrive != null) __obj.updateDynamic("teamDrive")(teamDrive)
    if (teamDriveId != null) __obj.updateDynamic("teamDriveId")(teamDriveId)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Change]
  }
}

