package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIndividualStudentsOptions extends StObject {
  
  /**
    * Identifiers for the students that have access to the coursework/announcement.
    */
  var studentIds: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaIndividualStudentsOptions {
  
  inline def apply(): SchemaIndividualStudentsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIndividualStudentsOptions]
  }
  
  extension [Self <: SchemaIndividualStudentsOptions](x: Self) {
    
    inline def setStudentIds(value: js.Array[String]): Self = StObject.set(x, "studentIds", value.asInstanceOf[js.Any])
    
    inline def setStudentIdsNull: Self = StObject.set(x, "studentIds", null)
    
    inline def setStudentIdsUndefined: Self = StObject.set(x, "studentIds", js.undefined)
    
    inline def setStudentIdsVarargs(value: String*): Self = StObject.set(x, "studentIds", js.Array(value*))
  }
}
