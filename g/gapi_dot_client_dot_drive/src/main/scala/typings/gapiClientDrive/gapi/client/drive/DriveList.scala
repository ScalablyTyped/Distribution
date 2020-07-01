package typings.gapiClientDrive.gapi.client.drive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DriveList extends js.Object {
  /** The list of shared drives. If nextPageToken is populated, then this list may be incomplete and an additional page of results should be fetched. */
  var drives: js.UndefOr[js.Array[Drive]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "drive#driveList". */
  var kind: js.UndefOr[String] = js.undefined
  /**
    * The page token for the next page of shared drives. This will be absent if the end of the list has been reached. If the token is rejected for any
    * reason, it should be discarded, and pagination should be restarted from the first page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object DriveList {
  @scala.inline
  def apply(drives: js.Array[Drive] = null, kind: String = null, nextPageToken: String = null): DriveList = {
    val __obj = js.Dynamic.literal()
    if (drives != null) __obj.updateDynamic("drives")(drives.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DriveList]
  }
}

