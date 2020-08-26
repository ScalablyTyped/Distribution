package typings.googleAppsScript.GoogleAppsScript.Classroom.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAnnouncementsResponse extends js.Object {
  var announcements: js.UndefOr[js.Array[Announcement]] = js.native
  var nextPageToken: js.UndefOr[String] = js.native
}

object ListAnnouncementsResponse {
  @scala.inline
  def apply(): ListAnnouncementsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAnnouncementsResponse]
  }
  @scala.inline
  implicit class ListAnnouncementsResponseOps[Self <: ListAnnouncementsResponse] (val x: Self) extends AnyVal {
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
    def setAnnouncementsVarargs(value: Announcement*): Self = this.set("announcements", js.Array(value :_*))
    @scala.inline
    def setAnnouncements(value: js.Array[Announcement]): Self = this.set("announcements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnnouncements: Self = this.set("announcements", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

