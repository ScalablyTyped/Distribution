package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request to modify assignee mode and options of an announcement.
  */
@js.native
trait SchemaModifyAnnouncementAssigneesRequest extends StObject {
  
  /**
    * Mode of the announcement describing whether it will be accessible by all
    * students or specified individual students.
    */
  var assigneeMode: js.UndefOr[String] = js.native
  
  /**
    * Set which students can view or cannot view the announcement. Must be
    * specified only when `assigneeMode` is `INDIVIDUAL_STUDENTS`.
    */
  var modifyIndividualStudentsOptions: js.UndefOr[SchemaModifyIndividualStudentsOptions] = js.native
}
object SchemaModifyAnnouncementAssigneesRequest {
  
  @scala.inline
  def apply(): SchemaModifyAnnouncementAssigneesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaModifyAnnouncementAssigneesRequest]
  }
  
  @scala.inline
  implicit class SchemaModifyAnnouncementAssigneesRequestMutableBuilder[Self <: SchemaModifyAnnouncementAssigneesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssigneeMode(value: String): Self = StObject.set(x, "assigneeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssigneeModeUndefined: Self = StObject.set(x, "assigneeMode", js.undefined)
    
    @scala.inline
    def setModifyIndividualStudentsOptions(value: SchemaModifyIndividualStudentsOptions): Self = StObject.set(x, "modifyIndividualStudentsOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifyIndividualStudentsOptionsUndefined: Self = StObject.set(x, "modifyIndividualStudentsOptions", js.undefined)
  }
}
