package typings.googleapis.buildSrcApisDriveV3Mod.drive_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of Team Drives.
  */
@js.native
trait Schema$TeamDriveList extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;drive#teamDriveList&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The page token for the next page of Team Drives. This will be absent if
    * the end of the Team Drives list has been reached. If the token is
    * rejected for any reason, it should be discarded, and pagination should be
    * restarted from the first page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The list of Team Drives. If nextPageToken is populated, then this list
    * may be incomplete and an additional page of results should be fetched.
    */
  var teamDrives: js.UndefOr[js.Array[Schema$TeamDrive]] = js.native
}

object Schema$TeamDriveList {
  @scala.inline
  def apply(kind: String = null, nextPageToken: String = null, teamDrives: js.Array[Schema$TeamDrive] = null): Schema$TeamDriveList = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (teamDrives != null) __obj.updateDynamic("teamDrives")(teamDrives.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TeamDriveList]
  }
}

