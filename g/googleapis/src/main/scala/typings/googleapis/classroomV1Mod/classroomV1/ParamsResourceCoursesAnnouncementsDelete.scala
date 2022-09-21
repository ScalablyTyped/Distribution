package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCoursesAnnouncementsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Identifier of the course. This identifier can be either the Classroom-assigned identifier or an alias.
    */
  var courseId: js.UndefOr[String] = js.undefined
  
  /**
    * Identifier of the announcement to delete. This identifier is a Classroom-assigned identifier.
    */
  var id: js.UndefOr[String] = js.undefined
}
object ParamsResourceCoursesAnnouncementsDelete {
  
  inline def apply(): ParamsResourceCoursesAnnouncementsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCoursesAnnouncementsDelete]
  }
  
  extension [Self <: ParamsResourceCoursesAnnouncementsDelete](x: Self) {
    
    inline def setCourseId(value: String): Self = StObject.set(x, "courseId", value.asInstanceOf[js.Any])
    
    inline def setCourseIdUndefined: Self = StObject.set(x, "courseId", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
