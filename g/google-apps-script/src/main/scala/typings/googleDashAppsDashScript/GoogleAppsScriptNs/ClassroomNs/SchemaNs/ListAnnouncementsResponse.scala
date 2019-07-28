package typings.googleDashAppsDashScript.GoogleAppsScriptNs.ClassroomNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListAnnouncementsResponse extends js.Object {
  var announcements: js.UndefOr[js.Array[Announcement]] = js.undefined
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object ListAnnouncementsResponse {
  @scala.inline
  def apply(announcements: js.Array[Announcement] = null, nextPageToken: String = null): ListAnnouncementsResponse = {
    val __obj = js.Dynamic.literal()
    if (announcements != null) __obj.updateDynamic("announcements")(announcements)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[ListAnnouncementsResponse]
  }
}

