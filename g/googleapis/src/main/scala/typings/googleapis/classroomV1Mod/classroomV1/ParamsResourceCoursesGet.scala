package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCoursesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Identifier of the course to return. This identifier can be either the Classroom-assigned identifier or an alias.
    */
  var id: js.UndefOr[String] = js.undefined
}
object ParamsResourceCoursesGet {
  
  inline def apply(): ParamsResourceCoursesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCoursesGet]
  }
  
  extension [Self <: ParamsResourceCoursesGet](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
