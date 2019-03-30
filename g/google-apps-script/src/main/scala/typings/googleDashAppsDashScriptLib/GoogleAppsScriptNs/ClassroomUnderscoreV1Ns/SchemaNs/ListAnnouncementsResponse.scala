package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ClassroomUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListAnnouncementsResponse extends js.Object {
  var announcements: js.UndefOr[js.Array[Announcement]] = js.undefined
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object ListAnnouncementsResponse {
  @scala.inline
  def apply(announcements: js.Array[Announcement] = null, nextPageToken: java.lang.String = null): ListAnnouncementsResponse = {
    val __obj = js.Dynamic.literal()
    if (announcements != null) __obj.updateDynamic("announcements")(announcements)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[ListAnnouncementsResponse]
  }
}

