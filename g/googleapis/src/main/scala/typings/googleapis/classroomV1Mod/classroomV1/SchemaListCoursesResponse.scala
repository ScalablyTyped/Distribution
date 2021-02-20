package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response when listing courses.
  */
@js.native
trait SchemaListCoursesResponse extends StObject {
  
  /**
    * Courses that match the list request.
    */
  var courses: js.UndefOr[js.Array[SchemaCourse]] = js.native
  
  /**
    * Token identifying the next page of results to return. If empty, no
    * further results are available.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaListCoursesResponse {
  
  @scala.inline
  def apply(): SchemaListCoursesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListCoursesResponse]
  }
  
  @scala.inline
  implicit class SchemaListCoursesResponseMutableBuilder[Self <: SchemaListCoursesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCourses(value: js.Array[SchemaCourse]): Self = StObject.set(x, "courses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoursesUndefined: Self = StObject.set(x, "courses", js.undefined)
    
    @scala.inline
    def setCoursesVarargs(value: SchemaCourse*): Self = StObject.set(x, "courses", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
