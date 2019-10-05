package typings.gapiDotClientDotDrive.gapi.client.drive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermissionList extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "drive#permissionList". */
  var kind: js.UndefOr[String] = js.undefined
  /**
    * The page token for the next page of permissions. This field will be absent if the end of the permissions list has been reached. If the token is
    * rejected for any reason, it should be discarded, and pagination should be restarted from the first page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** The list of permissions. If nextPageToken is populated, then this list may be incomplete and an additional page of results should be fetched. */
  var permissions: js.UndefOr[js.Array[Permission]] = js.undefined
}

object PermissionList {
  @scala.inline
  def apply(kind: String = null, nextPageToken: String = null, permissions: js.Array[Permission] = null): PermissionList = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (permissions != null) __obj.updateDynamic("permissions")(permissions)
    __obj.asInstanceOf[PermissionList]
  }
}

