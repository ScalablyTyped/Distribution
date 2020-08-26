package typings.gapiClientDrive.gapi.client.drive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DriveList extends js.Object {
  /** The list of shared drives. If nextPageToken is populated, then this list may be incomplete and an additional page of results should be fetched. */
  var drives: js.UndefOr[js.Array[Drive]] = js.native
  /** Identifies what kind of resource this is. Value: the fixed string "drive#driveList". */
  var kind: js.UndefOr[String] = js.native
  /**
    * The page token for the next page of shared drives. This will be absent if the end of the list has been reached. If the token is rejected for any
    * reason, it should be discarded, and pagination should be restarted from the first page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object DriveList {
  @scala.inline
  def apply(): DriveList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DriveList]
  }
  @scala.inline
  implicit class DriveListOps[Self <: DriveList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDrivesVarargs(value: Drive*): Self = this.set("drives", js.Array(value :_*))
    @scala.inline
    def setDrives(value: js.Array[Drive]): Self = this.set("drives", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrives: Self = this.set("drives", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

