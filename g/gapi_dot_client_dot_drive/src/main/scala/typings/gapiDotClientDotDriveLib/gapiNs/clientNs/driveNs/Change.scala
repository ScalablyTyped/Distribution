package typings
package gapiDotClientDotDriveLib.gapiNs.clientNs.driveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Change extends js.Object {
  /** The updated state of the file. Present if the type is file and the file has not been removed from this list of changes. */
  var file: js.UndefOr[File] = js.undefined
  /** The ID of the file which has changed. */
  var fileId: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "drive#change". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Whether the file or Team Drive has been removed from this list of changes, for example by deletion or loss of access. */
  var removed: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The updated state of the Team Drive. Present if the type is teamDrive, the user is still a member of the Team Drive, and the Team Drive has not been
    * removed.
    */
  var teamDrive: js.UndefOr[TeamDrive] = js.undefined
  /** The ID of the Team Drive associated with this change. */
  var teamDriveId: js.UndefOr[java.lang.String] = js.undefined
  /** The time of this change (RFC 3339 date-time). */
  var time: js.UndefOr[java.lang.String] = js.undefined
  /** The type of the change. Possible values are file and teamDrive. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Change {
  @scala.inline
  def apply(
    file: File = null,
    fileId: java.lang.String = null,
    kind: java.lang.String = null,
    removed: js.UndefOr[scala.Boolean] = js.undefined,
    teamDrive: TeamDrive = null,
    teamDriveId: java.lang.String = null,
    time: java.lang.String = null,
    `type`: java.lang.String = null
  ): Change = {
    val __obj = js.Dynamic.literal()
    if (file != null) __obj.updateDynamic("file")(file)
    if (fileId != null) __obj.updateDynamic("fileId")(fileId)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (!js.isUndefined(removed)) __obj.updateDynamic("removed")(removed)
    if (teamDrive != null) __obj.updateDynamic("teamDrive")(teamDrive)
    if (teamDriveId != null) __obj.updateDynamic("teamDriveId")(teamDriveId)
    if (time != null) __obj.updateDynamic("time")(time)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Change]
  }
}

