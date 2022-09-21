package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCoursesTopicsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Identifier of the course.
    */
  var courseId: js.UndefOr[String] = js.undefined
  
  /**
    * Identifier of the topic.
    */
  var id: js.UndefOr[String] = js.undefined
}
object ParamsResourceCoursesTopicsGet {
  
  inline def apply(): ParamsResourceCoursesTopicsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCoursesTopicsGet]
  }
  
  extension [Self <: ParamsResourceCoursesTopicsGet](x: Self) {
    
    inline def setCourseId(value: String): Self = StObject.set(x, "courseId", value.asInstanceOf[js.Any])
    
    inline def setCourseIdUndefined: Self = StObject.set(x, "courseId", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
