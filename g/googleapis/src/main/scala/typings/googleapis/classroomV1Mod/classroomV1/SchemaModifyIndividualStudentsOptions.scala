package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaModifyIndividualStudentsOptions extends StObject {
  
  /**
    * IDs of students to be added as having access to this coursework/announcement.
    */
  var addStudentIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * IDs of students to be removed from having access to this coursework/announcement.
    */
  var removeStudentIds: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaModifyIndividualStudentsOptions {
  
  inline def apply(): SchemaModifyIndividualStudentsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaModifyIndividualStudentsOptions]
  }
  
  extension [Self <: SchemaModifyIndividualStudentsOptions](x: Self) {
    
    inline def setAddStudentIds(value: js.Array[String]): Self = StObject.set(x, "addStudentIds", value.asInstanceOf[js.Any])
    
    inline def setAddStudentIdsNull: Self = StObject.set(x, "addStudentIds", null)
    
    inline def setAddStudentIdsUndefined: Self = StObject.set(x, "addStudentIds", js.undefined)
    
    inline def setAddStudentIdsVarargs(value: String*): Self = StObject.set(x, "addStudentIds", js.Array(value*))
    
    inline def setRemoveStudentIds(value: js.Array[String]): Self = StObject.set(x, "removeStudentIds", value.asInstanceOf[js.Any])
    
    inline def setRemoveStudentIdsNull: Self = StObject.set(x, "removeStudentIds", null)
    
    inline def setRemoveStudentIdsUndefined: Self = StObject.set(x, "removeStudentIds", js.undefined)
    
    inline def setRemoveStudentIdsVarargs(value: String*): Self = StObject.set(x, "removeStudentIds", js.Array(value*))
  }
}
