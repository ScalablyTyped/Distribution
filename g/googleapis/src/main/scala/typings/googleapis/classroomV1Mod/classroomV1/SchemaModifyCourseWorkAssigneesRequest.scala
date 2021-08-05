package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request to modify assignee mode and options of a coursework.
  */
trait SchemaModifyCourseWorkAssigneesRequest extends StObject {
  
  /**
    * Mode of the coursework describing whether it will be assigned to all
    * students or specified individual students.
    */
  var assigneeMode: js.UndefOr[String] = js.undefined
  
  /**
    * Set which students are assigned or not assigned to the coursework. Must
    * be specified only when `assigneeMode` is `INDIVIDUAL_STUDENTS`.
    */
  var modifyIndividualStudentsOptions: js.UndefOr[SchemaModifyIndividualStudentsOptions] = js.undefined
}
object SchemaModifyCourseWorkAssigneesRequest {
  
  inline def apply(): SchemaModifyCourseWorkAssigneesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaModifyCourseWorkAssigneesRequest]
  }
  
  extension [Self <: SchemaModifyCourseWorkAssigneesRequest](x: Self) {
    
    inline def setAssigneeMode(value: String): Self = StObject.set(x, "assigneeMode", value.asInstanceOf[js.Any])
    
    inline def setAssigneeModeUndefined: Self = StObject.set(x, "assigneeMode", js.undefined)
    
    inline def setModifyIndividualStudentsOptions(value: SchemaModifyIndividualStudentsOptions): Self = StObject.set(x, "modifyIndividualStudentsOptions", value.asInstanceOf[js.Any])
    
    inline def setModifyIndividualStudentsOptionsUndefined: Self = StObject.set(x, "modifyIndividualStudentsOptions", js.undefined)
  }
}
