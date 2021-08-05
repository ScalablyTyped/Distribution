package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response when listing courses.
  */
trait SchemaListCoursesResponse extends StObject {
  
  /**
    * Courses that match the list request.
    */
  var courses: js.UndefOr[js.Array[SchemaCourse]] = js.undefined
  
  /**
    * Token identifying the next page of results to return. If empty, no
    * further results are available.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaListCoursesResponse {
  
  inline def apply(): SchemaListCoursesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListCoursesResponse]
  }
  
  extension [Self <: SchemaListCoursesResponse](x: Self) {
    
    inline def setCourses(value: js.Array[SchemaCourse]): Self = StObject.set(x, "courses", value.asInstanceOf[js.Any])
    
    inline def setCoursesUndefined: Self = StObject.set(x, "courses", js.undefined)
    
    inline def setCoursesVarargs(value: SchemaCourse*): Self = StObject.set(x, "courses", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
