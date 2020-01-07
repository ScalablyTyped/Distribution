package typings.googleapis.buildSrcApisClassroomV1Mod.classroom_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response when listing course work.
  */
@js.native
trait Schema$ListAnnouncementsResponse extends js.Object {
  /**
    * Announcement items that match the request.
    */
  var announcements: js.UndefOr[js.Array[Schema$Announcement]] = js.native
  /**
    * Token identifying the next page of results to return. If empty, no
    * further results are available.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$ListAnnouncementsResponse {
  @scala.inline
  def apply(announcements: js.Array[Schema$Announcement] = null, nextPageToken: String = null): Schema$ListAnnouncementsResponse = {
    val __obj = js.Dynamic.literal()
    if (announcements != null) __obj.updateDynamic("announcements")(announcements.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListAnnouncementsResponse]
  }
}

