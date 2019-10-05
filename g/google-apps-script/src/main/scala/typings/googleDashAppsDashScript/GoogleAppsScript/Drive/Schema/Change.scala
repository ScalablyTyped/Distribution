package typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Change extends js.Object {
  var deleted: js.UndefOr[Boolean] = js.undefined
  var drive: js.UndefOr[typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.Drive] = js.undefined
  var driveId: js.UndefOr[String] = js.undefined
  var file: js.UndefOr[typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.File] = js.undefined
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
    drive: typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.Drive = null,
    driveId: String = null,
    file: typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.File = null,
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

