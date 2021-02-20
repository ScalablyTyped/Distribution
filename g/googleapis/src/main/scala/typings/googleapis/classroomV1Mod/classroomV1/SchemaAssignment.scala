package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Additional details for assignments.
  */
@js.native
trait SchemaAssignment extends StObject {
  
  /**
    * Drive folder where attachments from student submissions are placed. This
    * is only populated for course teachers and administrators.
    */
  var studentWorkFolder: js.UndefOr[SchemaDriveFolder] = js.native
}
object SchemaAssignment {
  
  @scala.inline
  def apply(): SchemaAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAssignment]
  }
  
  @scala.inline
  implicit class SchemaAssignmentMutableBuilder[Self <: SchemaAssignment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStudentWorkFolder(value: SchemaDriveFolder): Self = StObject.set(x, "studentWorkFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStudentWorkFolderUndefined: Self = StObject.set(x, "studentWorkFolder", js.undefined)
  }
}
