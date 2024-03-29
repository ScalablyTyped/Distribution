package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCoursesTeachersCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Identifier of the course. This identifier can be either the Classroom-assigned identifier or an alias.
    */
  var courseId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaTeacher] = js.undefined
}
object ParamsResourceCoursesTeachersCreate {
  
  inline def apply(): ParamsResourceCoursesTeachersCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCoursesTeachersCreate]
  }
  
  extension [Self <: ParamsResourceCoursesTeachersCreate](x: Self) {
    
    inline def setCourseId(value: String): Self = StObject.set(x, "courseId", value.asInstanceOf[js.Any])
    
    inline def setCourseIdUndefined: Self = StObject.set(x, "courseId", js.undefined)
    
    inline def setRequestBody(value: SchemaTeacher): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
