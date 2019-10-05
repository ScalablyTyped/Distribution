package typings.gapiDotClientDotDrive.gapi.client.drive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamDriveList extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "drive#teamDriveList". */
  var kind: js.UndefOr[String] = js.undefined
  /**
    * The page token for the next page of Team Drives. This will be absent if the end of the Team Drives list has been reached. If the token is rejected for
    * any reason, it should be discarded, and pagination should be restarted from the first page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** The list of Team Drives. If nextPageToken is populated, then this list may be incomplete and an additional page of results should be fetched. */
  var teamDrives: js.UndefOr[js.Array[TeamDrive]] = js.undefined
}

object TeamDriveList {
  @scala.inline
  def apply(kind: String = null, nextPageToken: String = null, teamDrives: js.Array[TeamDrive] = null): TeamDriveList = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (teamDrives != null) __obj.updateDynamic("teamDrives")(teamDrives)
    __obj.asInstanceOf[TeamDriveList]
  }
}

