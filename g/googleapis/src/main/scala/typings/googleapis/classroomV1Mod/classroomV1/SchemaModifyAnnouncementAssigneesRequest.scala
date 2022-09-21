package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaModifyAnnouncementAssigneesRequest extends StObject {
  
  /**
    * Mode of the announcement describing whether it is accessible by all students or specified individual students.
    */
  var assigneeMode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Set which students can view or cannot view the announcement. Must be specified only when `assigneeMode` is `INDIVIDUAL_STUDENTS`.
    */
  var modifyIndividualStudentsOptions: js.UndefOr[SchemaModifyIndividualStudentsOptions] = js.undefined
}
object SchemaModifyAnnouncementAssigneesRequest {
  
  inline def apply(): SchemaModifyAnnouncementAssigneesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaModifyAnnouncementAssigneesRequest]
  }
  
  extension [Self <: SchemaModifyAnnouncementAssigneesRequest](x: Self) {
    
    inline def setAssigneeMode(value: String): Self = StObject.set(x, "assigneeMode", value.asInstanceOf[js.Any])
    
    inline def setAssigneeModeNull: Self = StObject.set(x, "assigneeMode", null)
    
    inline def setAssigneeModeUndefined: Self = StObject.set(x, "assigneeMode", js.undefined)
    
    inline def setModifyIndividualStudentsOptions(value: SchemaModifyIndividualStudentsOptions): Self = StObject.set(x, "modifyIndividualStudentsOptions", value.asInstanceOf[js.Any])
    
    inline def setModifyIndividualStudentsOptionsUndefined: Self = StObject.set(x, "modifyIndividualStudentsOptions", js.undefined)
  }
}
