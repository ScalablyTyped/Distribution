package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCoursesAliasesDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Alias to delete. This may not be the Classroom-assigned identifier.
    */
  var alias: js.UndefOr[String] = js.undefined
  
  /**
    * Identifier of the course whose alias should be deleted. This identifier can be either the Classroom-assigned identifier or an alias.
    */
  var courseId: js.UndefOr[String] = js.undefined
}
object ParamsResourceCoursesAliasesDelete {
  
  inline def apply(): ParamsResourceCoursesAliasesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCoursesAliasesDelete]
  }
  
  extension [Self <: ParamsResourceCoursesAliasesDelete](x: Self) {
    
    inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    inline def setCourseId(value: String): Self = StObject.set(x, "courseId", value.asInstanceOf[js.Any])
    
    inline def setCourseIdUndefined: Self = StObject.set(x, "courseId", js.undefined)
  }
}
