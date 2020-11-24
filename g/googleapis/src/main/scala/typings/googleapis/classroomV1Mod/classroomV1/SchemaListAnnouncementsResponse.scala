package typings.googleapis.classroomV1Mod.classroomV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): SchemaListAnnouncementsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListAnnouncementsResponse]
  }
  
  @scala.inline
  implicit class SchemaListAnnouncementsResponseOps[Self <: SchemaListAnnouncementsResponse] (val x: Self) extends AnyVal {
    
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
    def setAnnouncementsVarargs(value: SchemaAnnouncement*): Self = this.set("announcements", js.Array(value :_*))
    
    @scala.inline
    def setAnnouncements(value: js.Array[SchemaAnnouncement]): Self = this.set("announcements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnouncements: Self = this.set("announcements", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
