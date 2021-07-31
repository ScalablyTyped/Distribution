package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response when listing course work.
  */
trait SchemaListAnnouncementsResponse extends StObject {
  
  /**
    * Announcement items that match the request.
    */
  var announcements: js.UndefOr[js.Array[SchemaAnnouncement]] = js.undefined
  
  /**
    * Token identifying the next page of results to return. If empty, no
    * further results are available.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaListAnnouncementsResponse {
  
  @scala.inline
  def apply(): SchemaListAnnouncementsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListAnnouncementsResponse]
  }
  
  @scala.inline
  implicit class SchemaListAnnouncementsResponseMutableBuilder[Self <: SchemaListAnnouncementsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnouncements(value: js.Array[SchemaAnnouncement]): Self = StObject.set(x, "announcements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnouncementsUndefined: Self = StObject.set(x, "announcements", js.undefined)
    
    @scala.inline
    def setAnnouncementsVarargs(value: SchemaAnnouncement*): Self = StObject.set(x, "announcements", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
