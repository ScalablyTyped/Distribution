package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains fields to add or remove students from a course work or
  * announcement where the `assigneeMode` is set to `INDIVIDUAL_STUDENTS`.
  */
@js.native
trait SchemaModifyIndividualStudentsOptions extends StObject {
  
  /**
    * Ids of students to be added as having access to this
    * coursework/announcement.
    */
  var addStudentIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Ids of students to be removed from having access to this
    * coursework/announcement.
    */
  var removeStudentIds: js.UndefOr[js.Array[String]] = js.native
}
object SchemaModifyIndividualStudentsOptions {
  
  @scala.inline
  def apply(): SchemaModifyIndividualStudentsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaModifyIndividualStudentsOptions]
  }
  
  @scala.inline
  implicit class SchemaModifyIndividualStudentsOptionsMutableBuilder[Self <: SchemaModifyIndividualStudentsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddStudentIds(value: js.Array[String]): Self = StObject.set(x, "addStudentIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddStudentIdsUndefined: Self = StObject.set(x, "addStudentIds", js.undefined)
    
    @scala.inline
    def setAddStudentIdsVarargs(value: String*): Self = StObject.set(x, "addStudentIds", js.Array(value :_*))
    
    @scala.inline
    def setRemoveStudentIds(value: js.Array[String]): Self = StObject.set(x, "removeStudentIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveStudentIdsUndefined: Self = StObject.set(x, "removeStudentIds", js.undefined)
    
    @scala.inline
    def setRemoveStudentIdsVarargs(value: String*): Self = StObject.set(x, "removeStudentIds", js.Array(value :_*))
  }
}
