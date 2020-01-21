package typings.googleAppsScript.GoogleAppsScript.Drive.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Change extends js.Object {
  var deleted: js.UndefOr[Boolean] = js.undefined
  var drive: js.UndefOr[Drive] = js.undefined
  var driveId: js.UndefOr[String] = js.undefined
  var file: js.UndefOr[File] = js.undefined
  var fileId: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var modificationDate: js.UndefOr[String] = js.undefined
  var selfLink: js.UndefOr[String] = js.undefined
  var teamDrive: js.UndefOr[TeamDrive] = js.undefined
  var teamDriveId: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object Change {
  @scala.inline
  def apply(
    deleted: js.UndefOr[Boolean] = js.undefined,
    drive: Drive = null,
    driveId: String = null,
    file: File = null,
    fileId: String = null,
    id: String = null,
    kind: String = null,
    modificationDate: String = null,
    selfLink: String = null,
    teamDrive: TeamDrive = null,
    teamDriveId: String = null,
    `type`: String = null
  ): Change = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deleted)) __obj.updateDynamic("deleted")(deleted.asInstanceOf[js.Any])
    if (drive != null) __obj.updateDynamic("drive")(drive.asInstanceOf[js.Any])
    if (driveId != null) __obj.updateDynamic("driveId")(driveId.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (fileId != null) __obj.updateDynamic("fileId")(fileId.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (modificationDate != null) __obj.updateDynamic("modificationDate")(modificationDate.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (teamDrive != null) __obj.updateDynamic("teamDrive")(teamDrive.asInstanceOf[js.Any])
    if (teamDriveId != null) __obj.updateDynamic("teamDriveId")(teamDriveId.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Change]
  }
}

