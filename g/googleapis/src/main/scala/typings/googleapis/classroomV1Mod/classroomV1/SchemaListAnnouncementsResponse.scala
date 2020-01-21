package typings.googleapis.classroomV1Mod.classroomV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response when listing course work.
  */
@js.native
trait SchemaListAnnouncementsResponse extends js.Object {
  /**
    * Announcement items that match the request.
    */
  var announcements: js.UndefOr[js.Array[SchemaAnnouncement]] = js.native
  /**
    * Token identifying the next page of results to return. If empty, no
    * further results are available.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListAnnouncementsResponse {
  @scala.inline
  def apply(announcements: js.Array[SchemaAnnouncement] = null, nextPageToken: String = null): SchemaListAnnouncementsResponse = {
    val __obj = js.Dynamic.literal()
    if (announcements != null) __obj.updateDynamic("announcements")(announcements.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListAnnouncementsResponse]
  }
}

