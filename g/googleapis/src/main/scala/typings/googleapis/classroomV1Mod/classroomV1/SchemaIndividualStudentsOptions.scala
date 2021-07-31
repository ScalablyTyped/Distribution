package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Assignee details about a coursework/announcement. This field is set if and
  * only if `assigneeMode` is `INDIVIDUAL_STUDENTS`.
  */
trait SchemaIndividualStudentsOptions extends StObject {
  
  /**
    * Identifiers for the students that have access to the
    * coursework/announcement.
    */
  var studentIds: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaIndividualStudentsOptions {
  
  @scala.inline
  def apply(): SchemaIndividualStudentsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIndividualStudentsOptions]
  }
  
  @scala.inline
  implicit class SchemaIndividualStudentsOptionsMutableBuilder[Self <: SchemaIndividualStudentsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStudentIds(value: js.Array[String]): Self = StObject.set(x, "studentIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStudentIdsUndefined: Self = StObject.set(x, "studentIds", js.undefined)
    
    @scala.inline
    def setStudentIdsVarargs(value: String*): Self = StObject.set(x, "studentIds", js.Array(value :_*))
  }
}
