package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Additional details for assignments.
  */
trait SchemaAssignment extends StObject {
  
  /**
    * Drive folder where attachments from student submissions are placed. This
    * is only populated for course teachers and administrators.
    */
  var studentWorkFolder: js.UndefOr[SchemaDriveFolder] = js.undefined
}
object SchemaAssignment {
  
  inline def apply(): SchemaAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAssignment]
  }
  
  extension [Self <: SchemaAssignment](x: Self) {
    
    inline def setStudentWorkFolder(value: SchemaDriveFolder): Self = StObject.set(x, "studentWorkFolder", value.asInstanceOf[js.Any])
    
    inline def setStudentWorkFolderUndefined: Self = StObject.set(x, "studentWorkFolder", js.undefined)
  }
}
